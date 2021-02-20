package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAccountAttributesResponse extends StObject {
  
  /**
    * Account quota information.
    */
  var AccountQuotas: js.UndefOr[AccountQuotaList] = js.native
  
  /**
    * A unique AWS DMS identifier for an account in a particular AWS Region. The value of this identifier has the following format: c99999999999. DMS uses this identifier to name artifacts. For example, DMS uses this identifier to name the default Amazon S3 bucket for storing task assessment reports in a given AWS Region. The format of this S3 bucket name is the following: dms-AccountNumber-UniqueAccountIdentifier. Here is an example name for this default S3 bucket: dms-111122223333-c44445555666.  AWS DMS supports the UniqueAccountIdentifier parameter in versions 3.1.4 and later. 
    */
  var UniqueAccountIdentifier: js.UndefOr[String] = js.native
}
object DescribeAccountAttributesResponse {
  
  @scala.inline
  def apply(): DescribeAccountAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountAttributesResponse]
  }
  
  @scala.inline
  implicit class DescribeAccountAttributesResponseMutableBuilder[Self <: DescribeAccountAttributesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountQuotas(value: AccountQuotaList): Self = StObject.set(x, "AccountQuotas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountQuotasUndefined: Self = StObject.set(x, "AccountQuotas", js.undefined)
    
    @scala.inline
    def setAccountQuotasVarargs(value: AccountQuota*): Self = StObject.set(x, "AccountQuotas", js.Array(value :_*))
    
    @scala.inline
    def setUniqueAccountIdentifier(value: String): Self = StObject.set(x, "UniqueAccountIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueAccountIdentifierUndefined: Self = StObject.set(x, "UniqueAccountIdentifier", js.undefined)
  }
}
