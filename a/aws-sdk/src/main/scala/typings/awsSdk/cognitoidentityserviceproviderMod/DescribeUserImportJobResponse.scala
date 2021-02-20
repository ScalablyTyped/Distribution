package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeUserImportJobResponse extends StObject {
  
  /**
    * The job object that represents the user import job.
    */
  var UserImportJob: js.UndefOr[UserImportJobType] = js.native
}
object DescribeUserImportJobResponse {
  
  @scala.inline
  def apply(): DescribeUserImportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserImportJobResponse]
  }
  
  @scala.inline
  implicit class DescribeUserImportJobResponseMutableBuilder[Self <: DescribeUserImportJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserImportJob(value: UserImportJobType): Self = StObject.set(x, "UserImportJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserImportJobUndefined: Self = StObject.set(x, "UserImportJob", js.undefined)
  }
}
