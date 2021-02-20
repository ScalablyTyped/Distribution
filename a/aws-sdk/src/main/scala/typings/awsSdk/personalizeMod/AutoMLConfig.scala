package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoMLConfig extends StObject {
  
  /**
    * The metric to optimize.
    */
  var metricName: js.UndefOr[MetricName] = js.native
  
  /**
    * The list of candidate recipes.
    */
  var recipeList: js.UndefOr[ArnList] = js.native
}
object AutoMLConfig {
  
  @scala.inline
  def apply(): AutoMLConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoMLConfig]
  }
  
  @scala.inline
  implicit class AutoMLConfigMutableBuilder[Self <: AutoMLConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricName(value: MetricName): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
    
    @scala.inline
    def setRecipeList(value: ArnList): Self = StObject.set(x, "recipeList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipeListUndefined: Self = StObject.set(x, "recipeList", js.undefined)
    
    @scala.inline
    def setRecipeListVarargs(value: Arn*): Self = StObject.set(x, "recipeList", js.Array(value :_*))
  }
}
