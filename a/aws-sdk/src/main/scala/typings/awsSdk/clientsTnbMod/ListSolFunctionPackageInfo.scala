package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSolFunctionPackageInfo extends StObject {
  
  /**
    * Function package ARN.
    */
  var arn: VnfPkgArn
  
  /**
    * ID of the function package.
    */
  var id: VnfPkgId
  
  /**
    * The metadata of the function package.
    */
  var metadata: js.UndefOr[ListSolFunctionPackageMetadata] = js.undefined
  
  /**
    * Onboarding state of the function package.
    */
  var onboardingState: OnboardingState
  
  /**
    * Operational state of the function package.
    */
  var operationalState: OperationalState
  
  /**
    * Usage state of the function package.
    */
  var usageState: UsageState
  
  /**
    * The product name for the network function.
    */
  var vnfProductName: js.UndefOr[String] = js.undefined
  
  /**
    * Provider of the function package and the function package descriptor.
    */
  var vnfProvider: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the function package and the function package descriptor.
    */
  var vnfdId: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the version of the function package descriptor.
    */
  var vnfdVersion: js.UndefOr[String] = js.undefined
}
object ListSolFunctionPackageInfo {
  
  inline def apply(
    arn: VnfPkgArn,
    id: VnfPkgId,
    onboardingState: OnboardingState,
    operationalState: OperationalState,
    usageState: UsageState
  ): ListSolFunctionPackageInfo = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onboardingState = onboardingState.asInstanceOf[js.Any], operationalState = operationalState.asInstanceOf[js.Any], usageState = usageState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSolFunctionPackageInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSolFunctionPackageInfo] (val x: Self) extends AnyVal {
    
    inline def setArn(value: VnfPkgArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setId(value: VnfPkgId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ListSolFunctionPackageMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setOnboardingState(value: OnboardingState): Self = StObject.set(x, "onboardingState", value.asInstanceOf[js.Any])
    
    inline def setOperationalState(value: OperationalState): Self = StObject.set(x, "operationalState", value.asInstanceOf[js.Any])
    
    inline def setUsageState(value: UsageState): Self = StObject.set(x, "usageState", value.asInstanceOf[js.Any])
    
    inline def setVnfProductName(value: String): Self = StObject.set(x, "vnfProductName", value.asInstanceOf[js.Any])
    
    inline def setVnfProductNameUndefined: Self = StObject.set(x, "vnfProductName", js.undefined)
    
    inline def setVnfProvider(value: String): Self = StObject.set(x, "vnfProvider", value.asInstanceOf[js.Any])
    
    inline def setVnfProviderUndefined: Self = StObject.set(x, "vnfProvider", js.undefined)
    
    inline def setVnfdId(value: String): Self = StObject.set(x, "vnfdId", value.asInstanceOf[js.Any])
    
    inline def setVnfdIdUndefined: Self = StObject.set(x, "vnfdId", js.undefined)
    
    inline def setVnfdVersion(value: String): Self = StObject.set(x, "vnfdVersion", value.asInstanceOf[js.Any])
    
    inline def setVnfdVersionUndefined: Self = StObject.set(x, "vnfdVersion", js.undefined)
  }
}
