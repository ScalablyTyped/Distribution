package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetInstance extends StObject {
  
  /**
    *  The currency code that AWS used to calculate the costs for this instance.
    */
  var CurrencyCode: js.UndefOr[GenericString] = js.native
  
  /**
    *  Indicates whether this recommendation is the defaulted AWS recommendation.
    */
  var DefaultTargetInstance: js.UndefOr[GenericBoolean] = js.native
  
  /**
    *  Expected cost to operate this instance type on a monthly basis.
    */
  var EstimatedMonthlyCost: js.UndefOr[GenericString] = js.native
  
  /**
    *  Estimated savings resulting from modification, on a monthly basis.
    */
  var EstimatedMonthlySavings: js.UndefOr[GenericString] = js.native
  
  /**
    *  Expected utilization metrics for target instance type.
    */
  var ExpectedResourceUtilization: js.UndefOr[ResourceUtilization] = js.native
  
  /**
    *  Details on the target instance type. 
    */
  var ResourceDetails: js.UndefOr[typings.awsSdk.costexplorerMod.ResourceDetails] = js.native
}
object TargetInstance {
  
  @scala.inline
  def apply(): TargetInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetInstance]
  }
  
  @scala.inline
  implicit class TargetInstanceMutableBuilder[Self <: TargetInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrencyCode(value: GenericString): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    @scala.inline
    def setDefaultTargetInstance(value: GenericBoolean): Self = StObject.set(x, "DefaultTargetInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTargetInstanceUndefined: Self = StObject.set(x, "DefaultTargetInstance", js.undefined)
    
    @scala.inline
    def setEstimatedMonthlyCost(value: GenericString): Self = StObject.set(x, "EstimatedMonthlyCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedMonthlyCostUndefined: Self = StObject.set(x, "EstimatedMonthlyCost", js.undefined)
    
    @scala.inline
    def setEstimatedMonthlySavings(value: GenericString): Self = StObject.set(x, "EstimatedMonthlySavings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedMonthlySavingsUndefined: Self = StObject.set(x, "EstimatedMonthlySavings", js.undefined)
    
    @scala.inline
    def setExpectedResourceUtilization(value: ResourceUtilization): Self = StObject.set(x, "ExpectedResourceUtilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedResourceUtilizationUndefined: Self = StObject.set(x, "ExpectedResourceUtilization", js.undefined)
    
    @scala.inline
    def setResourceDetails(value: ResourceDetails): Self = StObject.set(x, "ResourceDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceDetailsUndefined: Self = StObject.set(x, "ResourceDetails", js.undefined)
  }
}
