package typings.cssSelectorParser

import typings.cssSelectorParser.cssSelectorParserStrings.numeric
import typings.cssSelectorParser.cssSelectorParserStrings.selector
import typings.cssSelectorParser.cssSelectorParserStrings.string
import typings.cssSelectorParser.cssSelectorParserStrings.substitute
import typings.cssSelectorParser.selectorMod.AttrValueType
import typings.cssSelectorParser.selectorMod.Selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Name extends StObject {
    
    var name: String
  }
  object Name {
    
    inline def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Operator extends StObject {
    
    var operator: String
    
    var value: String
    
    var valueType: AttrValueType
  }
  object Operator {
    
    inline def apply(operator: String, value: String, valueType: AttrValueType): Operator = {
      val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Operator]
    }
    
    extension [Self <: Operator](x: Self) {
      
      inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueType(value: AttrValueType): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var value: Selector
    
    var valueType: selector
  }
  object Value {
    
    inline def apply(value: Selector): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], valueType = "selector")
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setValue(value: Selector): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueType(value: selector): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValueType extends StObject {
    
    var value: String
    
    var valueType: string | substitute | numeric
  }
  object ValueType {
    
    inline def apply(value: String, valueType: string | substitute | numeric): ValueType = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueType]
    }
    
    extension [Self <: ValueType](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueType(value: string | substitute | numeric): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    }
  }
}
