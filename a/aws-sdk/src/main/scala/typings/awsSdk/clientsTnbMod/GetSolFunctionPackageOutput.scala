package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSolFunctionPackageOutput extends StObject {
  
  /**
    * Function package ARN.
    */
  var arn: VnfPkgArn
  
  /**
    * Function package ID.
    */
  var id: VnfPkgId
  
  var metadata: js.UndefOr[GetSolFunctionPackageMetadata] = js.undefined
  
  /**
    * Function package onboarding state.
    */
  var onboardingState: OnboardingState
  
  /**
    * Function package operational state.
    */
  var operationalState: OperationalState
  
  /**
    * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * Function package usage state.
    */
  var usageState: UsageState
  
  /**
    * Network function product name.
    */
  var vnfProductName: js.UndefOr[String] = js.undefined
  
  /**
    * Network function provider.
    */
  var vnfProvider: js.UndefOr[String] = js.undefined
  
  /**
    * Function package descriptor ID.
    */
  var vnfdId: js.UndefOr[String] = js.undefined
  
  /**
    * Function package descriptor version.
    */
  var vnfdVersion: js.UndefOr[String] = js.undefined
}
object GetSolFunctionPackageOutput {
  
  inline def apply(
    arn: VnfPkgArn,
    id: VnfPkgId,
    onboardingState: OnboardingState,
    operationalState: OperationalState,
    usageState: UsageState
  ): GetSolFunctionPackageOutput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onboardingState = onboardingState.asInstanceOf[js.Any], operationalState = operationalState.asInstanceOf[js.Any], usageState = usageState.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSolFunctionPackageOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSolFunctionPackageOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: VnfPkgArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setId(value: VnfPkgId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: GetSolFunctionPackageMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setOnboardingState(value: OnboardingState): Self = StObject.set(x, "onboardingState", value.asInstanceOf[js.Any])
    
    inline def setOperationalState(value: OperationalState): Self = StObject.set(x, "operationalState", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
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
