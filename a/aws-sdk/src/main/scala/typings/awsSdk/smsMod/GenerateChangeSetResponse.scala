package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateChangeSetResponse extends StObject {
  
  /**
    * The location of the Amazon S3 object.
    */
  var s3Location: js.UndefOr[S3Location] = js.undefined
}
object GenerateChangeSetResponse {
  
  @scala.inline
  def apply(): GenerateChangeSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateChangeSetResponse]
  }
  
  @scala.inline
  implicit class GenerateChangeSetResponseMutableBuilder[Self <: GenerateChangeSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3Location(value: S3Location): Self = StObject.set(x, "s3Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3LocationUndefined: Self = StObject.set(x, "s3Location", js.undefined)
  }
}
