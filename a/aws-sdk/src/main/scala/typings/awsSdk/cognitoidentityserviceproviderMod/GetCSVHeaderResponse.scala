package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCSVHeaderResponse extends StObject {
  
  /**
    * The header information for the .csv file for the user import job.
    */
  var CSVHeader: js.UndefOr[ListOfStringTypes] = js.undefined
  
  /**
    * The user pool ID for the user pool that the users are to be imported into.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
}
object GetCSVHeaderResponse {
  
  @scala.inline
  def apply(): GetCSVHeaderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCSVHeaderResponse]
  }
  
  @scala.inline
  implicit class GetCSVHeaderResponseMutableBuilder[Self <: GetCSVHeaderResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCSVHeader(value: ListOfStringTypes): Self = StObject.set(x, "CSVHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSVHeaderUndefined: Self = StObject.set(x, "CSVHeader", js.undefined)
    
    @scala.inline
    def setCSVHeaderVarargs(value: StringType*): Self = StObject.set(x, "CSVHeader", js.Array(value :_*))
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolIdUndefined: Self = StObject.set(x, "UserPoolId", js.undefined)
  }
}
