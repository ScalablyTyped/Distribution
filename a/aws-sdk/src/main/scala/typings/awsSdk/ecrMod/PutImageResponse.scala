package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutImageResponse extends StObject {
  
  /**
    * Details of the image uploaded.
    */
  var image: js.UndefOr[Image] = js.native
}
object PutImageResponse {
  
  @scala.inline
  def apply(): PutImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutImageResponse]
  }
  
  @scala.inline
  implicit class PutImageResponseMutableBuilder[Self <: PutImageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
