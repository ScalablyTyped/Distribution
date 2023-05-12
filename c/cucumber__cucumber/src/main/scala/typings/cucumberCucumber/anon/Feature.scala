package typings.cucumberCucumber.anon

import typings.cucumberMessages.mod.Pickle
import typings.cucumberMessages.mod.Scenario
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Feature extends StObject {
  
  var feature: typings.cucumberMessages.mod.Feature
  
  var gherkinScenarioMap: Record[String, Scenario]
  
  var pickle: Pickle
}
object Feature {
  
  inline def apply(
    feature: typings.cucumberMessages.mod.Feature,
    gherkinScenarioMap: Record[String, Scenario],
    pickle: Pickle
  ): Feature = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], gherkinScenarioMap = gherkinScenarioMap.asInstanceOf[js.Any], pickle = pickle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Feature] (val x: Self) extends AnyVal {
    
    inline def setFeature(value: typings.cucumberMessages.mod.Feature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setGherkinScenarioMap(value: Record[String, Scenario]): Self = StObject.set(x, "gherkinScenarioMap", value.asInstanceOf[js.Any])
    
    inline def setPickle(value: Pickle): Self = StObject.set(x, "pickle", value.asInstanceOf[js.Any])
  }
}
