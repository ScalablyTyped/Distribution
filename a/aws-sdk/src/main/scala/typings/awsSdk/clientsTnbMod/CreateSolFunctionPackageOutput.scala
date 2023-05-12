package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSolFunctionPackageOutput extends StObject {
  
  /**
    * Function package ARN.
    */
  var arn: VnfPkgArn
  
  /**
    * ID of the function package.
    */
  var id: VnfPkgId
  
  /**
    * Onboarding state of the function package.
    */
  var onboardingState: OnboardingState
  
  /**
    * Operational state of the function package.
    */
  var operationalState: OperationalState
  
  /**
    * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * Usage state of the function package.
    */
  var usageState: UsageState
}
object CreateSolFunctionPackageOutput {
  
  inline def apply(
    arn: VnfPkgArn,
    id: VnfPkgId,
    onboardingState: OnboardingState,
    operationalState: OperationalState,
    usageState: UsageState
  ): CreateSolFunctionPackageOutput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onboardingState = onboardingState.asInstanceOf[js.Any], operationalState = operationalState.asInstanceOf[js.Any], usageState = usageState.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSolFunctionPackageOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSolFunctionPackageOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: VnfPkgArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setId(value: VnfPkgId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOnboardingState(value: OnboardingState): Self = StObject.set(x, "onboardingState", value.asInstanceOf[js.Any])
    
    inline def setOperationalState(value: OperationalState): Self = StObject.set(x, "operationalState", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setUsageState(value: UsageState): Self = StObject.set(x, "usageState", value.asInstanceOf[js.Any])
  }
}
