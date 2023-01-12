package typings.cucumberGherkin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDialectMod {
  
  trait Dialect extends StObject {
    
    val and: js.Array[String]
    
    val background: js.Array[String]
    
    val but: js.Array[String]
    
    val examples: js.Array[String]
    
    val feature: js.Array[String]
    
    val `given`: js.Array[String]
    
    val name: String
    
    val native: String
    
    val rule: js.Array[String]
    
    val scenario: js.Array[String]
    
    val scenarioOutline: js.Array[String]
    
    val `then`: js.Array[String]
    
    val when: js.Array[String]
  }
  object Dialect {
    
    inline def apply(
      and: js.Array[String],
      background: js.Array[String],
      but: js.Array[String],
      examples: js.Array[String],
      feature: js.Array[String],
      `given`: js.Array[String],
      name: String,
      native: String,
      rule: js.Array[String],
      scenario: js.Array[String],
      scenarioOutline: js.Array[String],
      `then`: js.Array[String],
      when: js.Array[String]
    ): Dialect = {
      val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], but = but.asInstanceOf[js.Any], examples = examples.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], scenario = scenario.asInstanceOf[js.Any], scenarioOutline = scenarioOutline.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any])
      __obj.updateDynamic("given")(`given`.asInstanceOf[js.Any])
      __obj.updateDynamic("then")(`then`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dialect]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dialect] (val x: Self) extends AnyVal {
      
      inline def setAnd(value: js.Array[String]): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
      
      inline def setAndVarargs(value: String*): Self = StObject.set(x, "and", js.Array(value*))
      
      inline def setBackground(value: js.Array[String]): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundVarargs(value: String*): Self = StObject.set(x, "background", js.Array(value*))
      
      inline def setBut(value: js.Array[String]): Self = StObject.set(x, "but", value.asInstanceOf[js.Any])
      
      inline def setButVarargs(value: String*): Self = StObject.set(x, "but", js.Array(value*))
      
      inline def setExamples(value: js.Array[String]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
      
      inline def setExamplesVarargs(value: String*): Self = StObject.set(x, "examples", js.Array(value*))
      
      inline def setFeature(value: js.Array[String]): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      inline def setFeatureVarargs(value: String*): Self = StObject.set(x, "feature", js.Array(value*))
      
      inline def setGiven(value: js.Array[String]): Self = StObject.set(x, "given", value.asInstanceOf[js.Any])
      
      inline def setGivenVarargs(value: String*): Self = StObject.set(x, "given", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNative(value: String): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
      
      inline def setRule(value: js.Array[String]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      inline def setRuleVarargs(value: String*): Self = StObject.set(x, "rule", js.Array(value*))
      
      inline def setScenario(value: js.Array[String]): Self = StObject.set(x, "scenario", value.asInstanceOf[js.Any])
      
      inline def setScenarioOutline(value: js.Array[String]): Self = StObject.set(x, "scenarioOutline", value.asInstanceOf[js.Any])
      
      inline def setScenarioOutlineVarargs(value: String*): Self = StObject.set(x, "scenarioOutline", js.Array(value*))
      
      inline def setScenarioVarargs(value: String*): Self = StObject.set(x, "scenario", js.Array(value*))
      
      inline def setThen(value: js.Array[String]): Self = StObject.set(x, "then", value.asInstanceOf[js.Any])
      
      inline def setThenVarargs(value: String*): Self = StObject.set(x, "then", js.Array(value*))
      
      inline def setWhen(value: js.Array[String]): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
      
      inline def setWhenVarargs(value: String*): Self = StObject.set(x, "when", js.Array(value*))
    }
  }
}
