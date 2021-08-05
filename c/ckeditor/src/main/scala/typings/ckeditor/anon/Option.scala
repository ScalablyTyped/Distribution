package typings.ckeditor.anon

import typings.ckeditor.CKEDITOR.htmlParser.fragment
import typings.ckeditor.CKEDITOR.htmlParser.node
import typings.ckeditor.CKEDITOR.htmlParser.rule
import typings.ckeditor.CKEDITOR.htmlParser.ruleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Option extends StObject {
  
  var option: ruleOptions
  
  var priority: Double
  
  var value: rule
}
object Option {
  
  inline def apply(option: ruleOptions, priority: Double, value: rule): Option = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
  
  extension [Self <: Option](x: Self) {
    
    inline def setOption(value: ruleOptions): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setValue(value: rule): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueFunction1(value: /* value */ node | fragment | String => Boolean): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
  }
}
