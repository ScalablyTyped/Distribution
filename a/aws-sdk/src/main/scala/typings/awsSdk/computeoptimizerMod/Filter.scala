package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  /**
    * The name of the filter. Specify Finding to return recommendations with a specific findings classification (e.g., Overprovisioned). Specify RecommendationSourceType to return recommendations of a specific resource type (e.g., AutoScalingGroup).
    */
  var name: js.UndefOr[FilterName] = js.undefined
  
  /**
    * The value of the filter. If you specify the name parameter as Finding, and you request recommendations for an instance, then the valid values are Underprovisioned, Overprovisioned, NotOptimized, or Optimized. If you specify the name parameter as Finding, and you request recommendations for an Auto Scaling group, then the valid values are Optimized, or NotOptimized. If you specify the name parameter as RecommendationSourceType, then the valid values are Ec2Instance, or AutoScalingGroup.
    */
  var values: js.UndefOr[FilterValues] = js.undefined
}
object Filter {
  
  inline def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  
  extension [Self <: Filter](x: Self) {
    
    inline def setName(value: FilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValues(value: FilterValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
