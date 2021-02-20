package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateImageResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the image.
    */
  var ImageArn: js.UndefOr[typings.awsSdk.sagemakerMod.ImageArn] = js.native
}
object UpdateImageResponse {
  
  @scala.inline
  def apply(): UpdateImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateImageResponse]
  }
  
  @scala.inline
  implicit class UpdateImageResponseMutableBuilder[Self <: UpdateImageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageArn(value: ImageArn): Self = StObject.set(x, "ImageArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageArnUndefined: Self = StObject.set(x, "ImageArn", js.undefined)
  }
}
