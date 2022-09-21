package typings.awsSdk.finspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExternalDataViewAccessDetailsResponse extends StObject {
  
  /**
    * The credentials required to access the external Dataview from the S3 location.
    */
  var credentials: js.UndefOr[AwsCredentials] = js.undefined
  
  /**
    * The location where the external Dataview is stored.
    */
  var s3Location: js.UndefOr[S3Location] = js.undefined
}
object GetExternalDataViewAccessDetailsResponse {
  
  inline def apply(): GetExternalDataViewAccessDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetExternalDataViewAccessDetailsResponse]
  }
  
  extension [Self <: GetExternalDataViewAccessDetailsResponse](x: Self) {
    
    inline def setCredentials(value: AwsCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setS3Location(value: S3Location): Self = StObject.set(x, "s3Location", value.asInstanceOf[js.Any])
    
    inline def setS3LocationUndefined: Self = StObject.set(x, "s3Location", js.undefined)
  }
}
