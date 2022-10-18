package typings.cucumberCucumberExpressions

import typings.cucumberCucumberExpressions.distCjsSrcParameterTypeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSrcTypesMod {
  
  trait DefinesParameterType extends StObject {
    
    def defineParameterType[T](parameterType: default[T]): Unit
  }
  object DefinesParameterType {
    
    inline def apply(defineParameterType: default[Any] => Unit): DefinesParameterType = {
      val __obj = js.Dynamic.literal(defineParameterType = js.Any.fromFunction1(defineParameterType))
      __obj.asInstanceOf[DefinesParameterType]
    }
    
    extension [Self <: DefinesParameterType](x: Self) {
      
      inline def setDefineParameterType(value: default[Any] => Unit): Self = StObject.set(x, "defineParameterType", js.Any.fromFunction1(value))
    }
  }
  
  trait Expression extends StObject {
    
    def `match`(text: String): js.Array[typings.cucumberCucumberExpressions.distCjsSrcArgumentMod.default] | Null
    
    val source: String
  }
  object Expression {
    
    inline def apply(
      `match`: String => js.Array[typings.cucumberCucumberExpressions.distCjsSrcArgumentMod.default] | Null,
      source: String
    ): Expression = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
      __obj.asInstanceOf[Expression]
    }
    
    extension [Self <: Expression](x: Self) {
      
      inline def setMatch(
        value: String => js.Array[typings.cucumberCucumberExpressions.distCjsSrcArgumentMod.default] | Null
      ): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParameterInfo extends StObject {
    
    /**
      * The number of times this name has been used so far
      */
    var count: Double
    
    /**
      * The parameter type name
      */
    var name: String
    
    /**
      * The string representation of the original ParameterType#type property
      */
    var `type`: String | Null
  }
  object ParameterInfo {
    
    inline def apply(count: Double, name: String): ParameterInfo = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(null)
      __obj.asInstanceOf[ParameterInfo]
    }
    
    extension [Self <: ParameterInfo](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
    }
  }
}
