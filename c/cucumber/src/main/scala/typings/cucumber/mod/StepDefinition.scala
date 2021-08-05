package typings.cucumber.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepDefinition extends StObject {
  
  // tslint:disable:ban-types
  var code: js.Function
  
  // tslint:enable:ban-types
  var line: Double
  
  var pattern: js.Any
  
  var unwrappedCode: js.UndefOr[js.Function] = js.undefined
  
  var uri: String
}
object StepDefinition {
  
  inline def apply(code: js.Function, line: Double, pattern: js.Any, uri: String): StepDefinition = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepDefinition]
  }
  
  extension [Self <: StepDefinition](x: Self) {
    
    inline def setCode(value: js.Function): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: js.Any): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setUnwrappedCode(value: js.Function): Self = StObject.set(x, "unwrappedCode", value.asInstanceOf[js.Any])
    
    inline def setUnwrappedCodeUndefined: Self = StObject.set(x, "unwrappedCode", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
