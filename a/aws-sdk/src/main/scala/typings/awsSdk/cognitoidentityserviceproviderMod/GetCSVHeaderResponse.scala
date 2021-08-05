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
  
  inline def apply(): GetCSVHeaderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCSVHeaderResponse]
  }
  
  extension [Self <: GetCSVHeaderResponse](x: Self) {
    
    inline def setCSVHeader(value: ListOfStringTypes): Self = StObject.set(x, "CSVHeader", value.asInstanceOf[js.Any])
    
    inline def setCSVHeaderUndefined: Self = StObject.set(x, "CSVHeader", js.undefined)
    
    inline def setCSVHeaderVarargs(value: StringType*): Self = StObject.set(x, "CSVHeader", js.Array(value :_*))
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    inline def setUserPoolIdUndefined: Self = StObject.set(x, "UserPoolId", js.undefined)
  }
}
