package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListModelPackagesInput extends StObject {
  
  /**
    * A filter that returns only model packages created after the specified time (timestamp).
    */
  var CreationTimeAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A filter that returns only model packages created before the specified time (timestamp).
    */
  var CreationTimeBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The maximum number of model packages to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.sagemakerMod.MaxResults] = js.undefined
  
  /**
    * A filter that returns only the model packages with the specified approval status.
    */
  var ModelApprovalStatus: js.UndefOr[typings.awsSdk.sagemakerMod.ModelApprovalStatus] = js.undefined
  
  /**
    * A filter that returns only model versions that belong to the specified model group.
    */
  var ModelPackageGroupName: js.UndefOr[ArnOrName] = js.undefined
  
  /**
    * A filter that returns only the model packages of the specified type. This can be one of the following values.    UNVERSIONED - List only unversioined models. This is the default value if no ModelPackageType is specified.    VERSIONED - List only versioned models.    BOTH - List both versioned and unversioned models.  
    */
  var ModelPackageType: js.UndefOr[typings.awsSdk.sagemakerMod.ModelPackageType] = js.undefined
  
  /**
    * A string in the model package name. This filter returns only model packages whose name contains the specified string.
    */
  var NameContains: js.UndefOr[typings.awsSdk.sagemakerMod.NameContains] = js.undefined
  
  /**
    * If the response to a previous ListModelPackages request was truncated, the response includes a NextToken. To retrieve the next set of model packages, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
  
  /**
    * The parameter by which to sort the results. The default is CreationTime.
    */
  var SortBy: js.UndefOr[ModelPackageSortBy] = js.undefined
  
  /**
    * The sort order for the results. The default is Ascending.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.sagemakerMod.SortOrder] = js.undefined
}
object ListModelPackagesInput {
  
  inline def apply(): ListModelPackagesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListModelPackagesInput]
  }
  
  extension [Self <: ListModelPackagesInput](x: Self) {
    
    inline def setCreationTimeAfter(value: js.Date): Self = StObject.set(x, "CreationTimeAfter", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeAfterUndefined: Self = StObject.set(x, "CreationTimeAfter", js.undefined)
    
    inline def setCreationTimeBefore(value: js.Date): Self = StObject.set(x, "CreationTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeBeforeUndefined: Self = StObject.set(x, "CreationTimeBefore", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setModelApprovalStatus(value: ModelApprovalStatus): Self = StObject.set(x, "ModelApprovalStatus", value.asInstanceOf[js.Any])
    
    inline def setModelApprovalStatusUndefined: Self = StObject.set(x, "ModelApprovalStatus", js.undefined)
    
    inline def setModelPackageGroupName(value: ArnOrName): Self = StObject.set(x, "ModelPackageGroupName", value.asInstanceOf[js.Any])
    
    inline def setModelPackageGroupNameUndefined: Self = StObject.set(x, "ModelPackageGroupName", js.undefined)
    
    inline def setModelPackageType(value: ModelPackageType): Self = StObject.set(x, "ModelPackageType", value.asInstanceOf[js.Any])
    
    inline def setModelPackageTypeUndefined: Self = StObject.set(x, "ModelPackageType", js.undefined)
    
    inline def setNameContains(value: NameContains): Self = StObject.set(x, "NameContains", value.asInstanceOf[js.Any])
    
    inline def setNameContainsUndefined: Self = StObject.set(x, "NameContains", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSortBy(value: ModelPackageSortBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}
