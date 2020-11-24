package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCSVHeaderResponse extends js.Object {
  
  /**
    * The header information for the .csv file for the user import job.
    */
  var CSVHeader: js.UndefOr[ListOfStringTypes] = js.native
  
  /**
    * The user pool ID for the user pool that the users are to be imported into.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.native
}
object GetCSVHeaderResponse {
  
  @scala.inline
  def apply(): GetCSVHeaderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCSVHeaderResponse]
  }
  
  @scala.inline
  implicit class GetCSVHeaderResponseOps[Self <: GetCSVHeaderResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCSVHeaderVarargs(value: StringType*): Self = this.set("CSVHeader", js.Array(value :_*))
    
    @scala.inline
    def setCSVHeader(value: ListOfStringTypes): Self = this.set("CSVHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCSVHeader: Self = this.set("CSVHeader", js.undefined)
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserPoolId: Self = this.set("UserPoolId", js.undefined)
  }
}
