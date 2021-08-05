package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProvisioningPreferences extends StObject {
  
  /**
    * One or more AWS accounts that will have access to the provisioned product. Applicable only to a CFN_STACKSET provisioned product type. The AWS accounts specified should be within the list of accounts in the STACKSET constraint. To get the list of accounts in the STACKSET constraint, use the DescribeProvisioningParameters operation. If no values are specified, the default value is all accounts from the STACKSET constraint.
    */
  var StackSetAccounts: js.UndefOr[typings.awsSdk.servicecatalogMod.StackSetAccounts] = js.undefined
  
  /**
    * The number of accounts, per region, for which this operation can fail before AWS Service Catalog stops the operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn't attempt the operation in any subsequent regions. Applicable only to a CFN_STACKSET provisioned product type. Conditional: You must specify either StackSetFailureToleranceCount or StackSetFailureTolerancePercentage, but not both. The default value is 0 if no value is specified.
    */
  var StackSetFailureToleranceCount: js.UndefOr[typings.awsSdk.servicecatalogMod.StackSetFailureToleranceCount] = js.undefined
  
  /**
    * The percentage of accounts, per region, for which this stack operation can fail before AWS Service Catalog stops the operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn't attempt the operation in any subsequent regions. When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds down to the next whole number. Applicable only to a CFN_STACKSET provisioned product type. Conditional: You must specify either StackSetFailureToleranceCount or StackSetFailureTolerancePercentage, but not both.
    */
  var StackSetFailureTolerancePercentage: js.UndefOr[typings.awsSdk.servicecatalogMod.StackSetFailureTolerancePercentage] = js.undefined
  
  /**
    * The maximum number of accounts in which to perform this operation at one time. This is dependent on the value of StackSetFailureToleranceCount. StackSetMaxConcurrentCount is at most one more than the StackSetFailureToleranceCount. Note that this setting lets you specify the maximum for operations. For large deployments, under certain circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling. Applicable only to a CFN_STACKSET provisioned product type. Conditional: You must specify either StackSetMaxConcurrentCount or StackSetMaxConcurrentPercentage, but not both.
    */
  var StackSetMaxConcurrencyCount: js.UndefOr[typings.awsSdk.servicecatalogMod.StackSetMaxConcurrencyCount] = js.undefined
  
  /**
    * The maximum percentage of accounts in which to perform this operation at one time. When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds down to the next whole number. This is true except in cases where rounding down would result is zero. In this case, AWS Service Catalog sets the number as 1 instead. Note that this setting lets you specify the maximum for operations. For large deployments, under certain circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling. Applicable only to a CFN_STACKSET provisioned product type. Conditional: You must specify either StackSetMaxConcurrentCount or StackSetMaxConcurrentPercentage, but not both.
    */
  var StackSetMaxConcurrencyPercentage: js.UndefOr[typings.awsSdk.servicecatalogMod.StackSetMaxConcurrencyPercentage] = js.undefined
  
  /**
    * Determines what action AWS Service Catalog performs to a stack set or a stack instance represented by the provisioned product. The default value is UPDATE if nothing is specified. Applicable only to a CFN_STACKSET provisioned product type.  CREATE  Creates a new stack instance in the stack set represented by the provisioned product. In this case, only new stack instances are created based on accounts and regions; if new ProductId or ProvisioningArtifactID are passed, they will be ignored.  UPDATE  Updates the stack set represented by the provisioned product and also its stack instances.  DELETE  Deletes a stack instance in the stack set represented by the provisioned product.  
    */
  var StackSetOperationType: js.UndefOr[typings.awsSdk.servicecatalogMod.StackSetOperationType] = js.undefined
  
  /**
    * One or more AWS Regions where the provisioned product will be available. Applicable only to a CFN_STACKSET provisioned product type. The specified regions should be within the list of regions from the STACKSET constraint. To get the list of regions in the STACKSET constraint, use the DescribeProvisioningParameters operation. If no values are specified, the default value is all regions from the STACKSET constraint.
    */
  var StackSetRegions: js.UndefOr[typings.awsSdk.servicecatalogMod.StackSetRegions] = js.undefined
}
object UpdateProvisioningPreferences {
  
  inline def apply(): UpdateProvisioningPreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProvisioningPreferences]
  }
  
  extension [Self <: UpdateProvisioningPreferences](x: Self) {
    
    inline def setStackSetAccounts(value: StackSetAccounts): Self = StObject.set(x, "StackSetAccounts", value.asInstanceOf[js.Any])
    
    inline def setStackSetAccountsUndefined: Self = StObject.set(x, "StackSetAccounts", js.undefined)
    
    inline def setStackSetAccountsVarargs(value: AccountId*): Self = StObject.set(x, "StackSetAccounts", js.Array(value :_*))
    
    inline def setStackSetFailureToleranceCount(value: StackSetFailureToleranceCount): Self = StObject.set(x, "StackSetFailureToleranceCount", value.asInstanceOf[js.Any])
    
    inline def setStackSetFailureToleranceCountUndefined: Self = StObject.set(x, "StackSetFailureToleranceCount", js.undefined)
    
    inline def setStackSetFailureTolerancePercentage(value: StackSetFailureTolerancePercentage): Self = StObject.set(x, "StackSetFailureTolerancePercentage", value.asInstanceOf[js.Any])
    
    inline def setStackSetFailureTolerancePercentageUndefined: Self = StObject.set(x, "StackSetFailureTolerancePercentage", js.undefined)
    
    inline def setStackSetMaxConcurrencyCount(value: StackSetMaxConcurrencyCount): Self = StObject.set(x, "StackSetMaxConcurrencyCount", value.asInstanceOf[js.Any])
    
    inline def setStackSetMaxConcurrencyCountUndefined: Self = StObject.set(x, "StackSetMaxConcurrencyCount", js.undefined)
    
    inline def setStackSetMaxConcurrencyPercentage(value: StackSetMaxConcurrencyPercentage): Self = StObject.set(x, "StackSetMaxConcurrencyPercentage", value.asInstanceOf[js.Any])
    
    inline def setStackSetMaxConcurrencyPercentageUndefined: Self = StObject.set(x, "StackSetMaxConcurrencyPercentage", js.undefined)
    
    inline def setStackSetOperationType(value: StackSetOperationType): Self = StObject.set(x, "StackSetOperationType", value.asInstanceOf[js.Any])
    
    inline def setStackSetOperationTypeUndefined: Self = StObject.set(x, "StackSetOperationType", js.undefined)
    
    inline def setStackSetRegions(value: StackSetRegions): Self = StObject.set(x, "StackSetRegions", value.asInstanceOf[js.Any])
    
    inline def setStackSetRegionsUndefined: Self = StObject.set(x, "StackSetRegions", js.undefined)
    
    inline def setStackSetRegionsVarargs(value: Region*): Self = StObject.set(x, "StackSetRegions", js.Array(value :_*))
  }
}
