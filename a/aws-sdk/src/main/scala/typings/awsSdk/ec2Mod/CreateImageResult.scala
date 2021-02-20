package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateImageResult extends StObject {
  
  /**
    * The ID of the new AMI.
    */
  var ImageId: js.UndefOr[String] = js.native
}
object CreateImageResult {
  
  @scala.inline
  def apply(): CreateImageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateImageResult]
  }
  
  @scala.inline
  implicit class CreateImageResultMutableBuilder[Self <: CreateImageResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageId(value: String): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
  }
}
