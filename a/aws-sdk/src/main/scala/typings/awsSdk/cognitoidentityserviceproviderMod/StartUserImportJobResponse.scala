package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartUserImportJobResponse extends StObject {
  
  /**
    * The job object that represents the user import job.
    */
  var UserImportJob: js.UndefOr[UserImportJobType] = js.undefined
}
object StartUserImportJobResponse {
  
  @scala.inline
  def apply(): StartUserImportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartUserImportJobResponse]
  }
  
  @scala.inline
  implicit class StartUserImportJobResponseMutableBuilder[Self <: StartUserImportJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserImportJob(value: UserImportJobType): Self = StObject.set(x, "UserImportJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserImportJobUndefined: Self = StObject.set(x, "UserImportJob", js.undefined)
  }
}
