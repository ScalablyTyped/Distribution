package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOrganizationResourceCollectionHealthRequest extends StObject {
  
  /**
    * The ID of the Amazon Web Services account.
    */
  var AccountIds: js.UndefOr[AccountIdList] = js.undefined
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[OrganizationResourceCollectionMaxResults] = js.undefined
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[UuidNextToken] = js.undefined
  
  /**
    *  An Amazon Web Services resource collection type. This type specifies how analyzed Amazon Web Services resources are defined. The two types of Amazon Web Services resource collections supported are Amazon Web Services CloudFormation stacks and Amazon Web Services resources that contain the same Amazon Web Services tag. DevOps Guru can be configured to analyze the Amazon Web Services resources that are defined in the stacks or that are tagged using the same tag key. You can specify up to 500 Amazon Web Services CloudFormation stacks. 
    */
  var OrganizationResourceCollectionType: typings.awsSdk.devopsguruMod.OrganizationResourceCollectionType
  
  /**
    * The ID of the organizational unit.
    */
  var OrganizationalUnitIds: js.UndefOr[OrganizationalUnitIdList] = js.undefined
}
object DescribeOrganizationResourceCollectionHealthRequest {
  
  inline def apply(OrganizationResourceCollectionType: OrganizationResourceCollectionType): DescribeOrganizationResourceCollectionHealthRequest = {
    val __obj = js.Dynamic.literal(OrganizationResourceCollectionType = OrganizationResourceCollectionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOrganizationResourceCollectionHealthRequest]
  }
  
  extension [Self <: DescribeOrganizationResourceCollectionHealthRequest](x: Self) {
    
    inline def setAccountIds(value: AccountIdList): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "AccountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: AwsAccountId*): Self = StObject.set(x, "AccountIds", js.Array(value*))
    
    inline def setMaxResults(value: OrganizationResourceCollectionMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: UuidNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOrganizationResourceCollectionType(value: OrganizationResourceCollectionType): Self = StObject.set(x, "OrganizationResourceCollectionType", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitIds(value: OrganizationalUnitIdList): Self = StObject.set(x, "OrganizationalUnitIds", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitIdsUndefined: Self = StObject.set(x, "OrganizationalUnitIds", js.undefined)
    
    inline def setOrganizationalUnitIdsVarargs(value: OrganizationalUnitId*): Self = StObject.set(x, "OrganizationalUnitIds", js.Array(value*))
  }
}
