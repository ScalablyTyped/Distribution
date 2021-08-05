package typings.cucumber.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Step extends StObject {
  
  var arguments: js.Any
  
  var isBackground: Boolean
  
  var keyword: String
  
  var keywordType: String
  
  var line: Double
  
  var name: String
  
  var scenario: Scenario
  
  var uri: String
}
object Step {
  
  inline def apply(
    arguments: js.Any,
    isBackground: Boolean,
    keyword: String,
    keywordType: String,
    line: Double,
    name: String,
    scenario: Scenario,
    uri: String
  ): Step = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], isBackground = isBackground.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], keywordType = keywordType.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scenario = scenario.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Step]
  }
  
  extension [Self <: Step](x: Self) {
    
    inline def setArguments(value: js.Any): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setIsBackground(value: Boolean): Self = StObject.set(x, "isBackground", value.asInstanceOf[js.Any])
    
    inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    inline def setKeywordType(value: String): Self = StObject.set(x, "keywordType", value.asInstanceOf[js.Any])
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setScenario(value: Scenario): Self = StObject.set(x, "scenario", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
