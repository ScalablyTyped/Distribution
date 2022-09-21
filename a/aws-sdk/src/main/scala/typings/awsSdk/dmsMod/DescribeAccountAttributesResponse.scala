package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountAttributesResponse extends StObject {
  
  /**
    * Account quota information.
    */
  var AccountQuotas: js.UndefOr[AccountQuotaList] = js.undefined
  
  /**
    * A unique DMS identifier for an account in a particular Amazon Web Services Region. The value of this identifier has the following format: c99999999999. DMS uses this identifier to name artifacts. For example, DMS uses this identifier to name the default Amazon S3 bucket for storing task assessment reports in a given Amazon Web Services Region. The format of this S3 bucket name is the following: dms-AccountNumber-UniqueAccountIdentifier. Here is an example name for this default S3 bucket: dms-111122223333-c44445555666.  DMS supports the UniqueAccountIdentifier parameter in versions 3.1.4 and later. 
    */
  var UniqueAccountIdentifier: js.UndefOr[String] = js.undefined
}
object DescribeAccountAttributesResponse {
  
  inline def apply(): DescribeAccountAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountAttributesResponse]
  }
  
  extension [Self <: DescribeAccountAttributesResponse](x: Self) {
    
    inline def setAccountQuotas(value: AccountQuotaList): Self = StObject.set(x, "AccountQuotas", value.asInstanceOf[js.Any])
    
    inline def setAccountQuotasUndefined: Self = StObject.set(x, "AccountQuotas", js.undefined)
    
    inline def setAccountQuotasVarargs(value: AccountQuota*): Self = StObject.set(x, "AccountQuotas", js.Array(value*))
    
    inline def setUniqueAccountIdentifier(value: String): Self = StObject.set(x, "UniqueAccountIdentifier", value.asInstanceOf[js.Any])
    
    inline def setUniqueAccountIdentifierUndefined: Self = StObject.set(x, "UniqueAccountIdentifier", js.undefined)
  }
}
