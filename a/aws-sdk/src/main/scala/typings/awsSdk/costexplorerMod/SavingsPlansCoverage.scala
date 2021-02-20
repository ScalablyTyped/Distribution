package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavingsPlansCoverage extends StObject {
  
  /**
    * The attribute that applies to a specific Dimension.
    */
  var Attributes: js.UndefOr[typings.awsSdk.costexplorerMod.Attributes] = js.native
  
  /**
    * The amount of Savings Plans eligible usage that the Savings Plans covered.
    */
  var Coverage: js.UndefOr[SavingsPlansCoverageData] = js.native
  
  var TimePeriod: js.UndefOr[DateInterval] = js.native
}
object SavingsPlansCoverage {
  
  @scala.inline
  def apply(): SavingsPlansCoverage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansCoverage]
  }
  
  @scala.inline
  implicit class SavingsPlansCoverageMutableBuilder[Self <: SavingsPlansCoverage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: Attributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setCoverage(value: SavingsPlansCoverageData): Self = StObject.set(x, "Coverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverageUndefined: Self = StObject.set(x, "Coverage", js.undefined)
    
    @scala.inline
    def setTimePeriod(value: DateInterval): Self = StObject.set(x, "TimePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePeriodUndefined: Self = StObject.set(x, "TimePeriod", js.undefined)
  }
}
