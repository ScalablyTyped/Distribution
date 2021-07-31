package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CostCategoryReference extends StObject {
  
  /**
    *  The unique identifier for your Cost Category. 
    */
  var CostCategoryArn: js.UndefOr[Arn] = js.undefined
  
  /**
    *  The Cost Category's effective end date.
    */
  var EffectiveEnd: js.UndefOr[ZonedDateTime] = js.undefined
  
  /**
    *  The Cost Category's effective start date.
    */
  var EffectiveStart: js.UndefOr[ZonedDateTime] = js.undefined
  
  var Name: js.UndefOr[CostCategoryName] = js.undefined
  
  /**
    *  The number of rules associated with a specific Cost Category. 
    */
  var NumberOfRules: js.UndefOr[NonNegativeInteger] = js.undefined
  
  /**
    *  The list of processing statuses for Cost Management products for a specific cost category. 
    */
  var ProcessingStatus: js.UndefOr[CostCategoryProcessingStatusList] = js.undefined
  
  /**
    *  A list of unique cost category values in a specific cost category. 
    */
  var Values: js.UndefOr[CostCategoryValuesList] = js.undefined
}
object CostCategoryReference {
  
  @scala.inline
  def apply(): CostCategoryReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CostCategoryReference]
  }
  
  @scala.inline
  implicit class CostCategoryReferenceMutableBuilder[Self <: CostCategoryReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCostCategoryArn(value: Arn): Self = StObject.set(x, "CostCategoryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCostCategoryArnUndefined: Self = StObject.set(x, "CostCategoryArn", js.undefined)
    
    @scala.inline
    def setEffectiveEnd(value: ZonedDateTime): Self = StObject.set(x, "EffectiveEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveEndUndefined: Self = StObject.set(x, "EffectiveEnd", js.undefined)
    
    @scala.inline
    def setEffectiveStart(value: ZonedDateTime): Self = StObject.set(x, "EffectiveStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveStartUndefined: Self = StObject.set(x, "EffectiveStart", js.undefined)
    
    @scala.inline
    def setName(value: CostCategoryName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setNumberOfRules(value: NonNegativeInteger): Self = StObject.set(x, "NumberOfRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfRulesUndefined: Self = StObject.set(x, "NumberOfRules", js.undefined)
    
    @scala.inline
    def setProcessingStatus(value: CostCategoryProcessingStatusList): Self = StObject.set(x, "ProcessingStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingStatusUndefined: Self = StObject.set(x, "ProcessingStatus", js.undefined)
    
    @scala.inline
    def setProcessingStatusVarargs(value: CostCategoryProcessingStatus*): Self = StObject.set(x, "ProcessingStatus", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: CostCategoryValuesList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: CostCategoryValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
