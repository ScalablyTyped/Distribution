package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateImageVersionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the image version.
    */
  var ImageVersionArn: js.UndefOr[typings.awsSdk.sagemakerMod.ImageVersionArn] = js.native
}
object CreateImageVersionResponse {
  
  @scala.inline
  def apply(): CreateImageVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateImageVersionResponse]
  }
  
  @scala.inline
  implicit class CreateImageVersionResponseMutableBuilder[Self <: CreateImageVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageVersionArn(value: ImageVersionArn): Self = StObject.set(x, "ImageVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageVersionArnUndefined: Self = StObject.set(x, "ImageVersionArn", js.undefined)
  }
}
