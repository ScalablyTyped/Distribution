package typings.awsSdk.honeycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportJobSubmitter extends StObject {
  
  /**
    * The email id of the submitter of the import job, if available.
    */
  var email: js.UndefOr[Email] = js.undefined
  
  /**
    * The AWS user ARN of the submitter of the import job, if available.
    */
  var userArn: js.UndefOr[AwsUserArn] = js.undefined
}
object ImportJobSubmitter {
  
  inline def apply(): ImportJobSubmitter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportJobSubmitter]
  }
  
  extension [Self <: ImportJobSubmitter](x: Self) {
    
    inline def setEmail(value: Email): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setUserArn(value: AwsUserArn): Self = StObject.set(x, "userArn", value.asInstanceOf[js.Any])
    
    inline def setUserArnUndefined: Self = StObject.set(x, "userArn", js.undefined)
  }
}
