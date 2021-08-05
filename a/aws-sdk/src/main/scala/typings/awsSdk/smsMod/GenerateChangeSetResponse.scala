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
  
  inline def apply(): GenerateChangeSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateChangeSetResponse]
  }
  
  extension [Self <: GenerateChangeSetResponse](x: Self) {
    
    inline def setS3Location(value: S3Location): Self = StObject.set(x, "s3Location", value.asInstanceOf[js.Any])
    
    inline def setS3LocationUndefined: Self = StObject.set(x, "s3Location", js.undefined)
  }
}
