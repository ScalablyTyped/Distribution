package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOrganizationHealthRequest extends StObject {
  
  /**
    * The ID of the Amazon Web Services account.
    */
  var AccountIds: js.UndefOr[AccountIdList] = js.undefined
  
  /**
    * The ID of the organizational unit.
    */
  var OrganizationalUnitIds: js.UndefOr[OrganizationalUnitIdList] = js.undefined
}
object DescribeOrganizationHealthRequest {
  
  inline def apply(): DescribeOrganizationHealthRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOrganizationHealthRequest]
  }
  
  extension [Self <: DescribeOrganizationHealthRequest](x: Self) {
    
    inline def setAccountIds(value: AccountIdList): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "AccountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: AwsAccountId*): Self = StObject.set(x, "AccountIds", js.Array(value*))
    
    inline def setOrganizationalUnitIds(value: OrganizationalUnitIdList): Self = StObject.set(x, "OrganizationalUnitIds", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitIdsUndefined: Self = StObject.set(x, "OrganizationalUnitIds", js.undefined)
    
    inline def setOrganizationalUnitIdsVarargs(value: OrganizationalUnitId*): Self = StObject.set(x, "OrganizationalUnitIds", js.Array(value*))
  }
}
