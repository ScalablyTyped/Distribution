package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUserImportJobResponse extends StObject {
  
  /**
    * The job object that represents the user import job.
    */
  var UserImportJob: js.UndefOr[UserImportJobType] = js.undefined
}
object CreateUserImportJobResponse {
  
  inline def apply(): CreateUserImportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUserImportJobResponse]
  }
  
  extension [Self <: CreateUserImportJobResponse](x: Self) {
    
    inline def setUserImportJob(value: UserImportJobType): Self = StObject.set(x, "UserImportJob", value.asInstanceOf[js.Any])
    
    inline def setUserImportJobUndefined: Self = StObject.set(x, "UserImportJob", js.undefined)
  }
}
