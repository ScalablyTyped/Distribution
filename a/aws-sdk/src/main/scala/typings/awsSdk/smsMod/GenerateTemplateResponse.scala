package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateTemplateResponse extends StObject {
  
  /**
    * The location of the Amazon S3 object.
    */
  var s3Location: js.UndefOr[S3Location] = js.native
}
object GenerateTemplateResponse {
  
  @scala.inline
  def apply(): GenerateTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateTemplateResponse]
  }
  
  @scala.inline
  implicit class GenerateTemplateResponseMutableBuilder[Self <: GenerateTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3Location(value: S3Location): Self = StObject.set(x, "s3Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3LocationUndefined: Self = StObject.set(x, "s3Location", js.undefined)
  }
}
