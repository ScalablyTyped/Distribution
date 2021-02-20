package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountQuota extends StObject {
  
  /**
    * The name of the Amazon RDS quota for this AWS account.
    */
  var AccountQuotaName: js.UndefOr[String] = js.native
  
  /**
    * The maximum allowed value for the quota.
    */
  var Max: js.UndefOr[Long] = js.native
  
  /**
    * The amount currently used toward the quota maximum.
    */
  var Used: js.UndefOr[Long] = js.native
}
object AccountQuota {
  
  @scala.inline
  def apply(): AccountQuota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountQuota]
  }
  
  @scala.inline
  implicit class AccountQuotaMutableBuilder[Self <: AccountQuota] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountQuotaName(value: String): Self = StObject.set(x, "AccountQuotaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountQuotaNameUndefined: Self = StObject.set(x, "AccountQuotaName", js.undefined)
    
    @scala.inline
    def setMax(value: Long): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "Max", js.undefined)
    
    @scala.inline
    def setUsed(value: Long): Self = StObject.set(x, "Used", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedUndefined: Self = StObject.set(x, "Used", js.undefined)
  }
}
