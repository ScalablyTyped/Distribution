package typings.csstoolsPostcssProgressiveCustomProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dimension extends StObject {
    
    var dimension: UnitString
    
    var `type`: String
    
    var value: String
  }
  object Dimension {
    
    inline def apply(dimension: UnitString, `type`: String, value: String): Dimension = {
      val __obj = js.Dynamic.literal(dimension = dimension.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dimension]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dimension] (val x: Self) extends AnyVal {
      
      inline def setDimension(value: UnitString): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsVariable extends StObject {
    
    var isVariable: scala.Unit
    
    var `type`: String
    
    var value: String
  }
  object IsVariable {
    
    inline def apply(isVariable: scala.Unit, `type`: String, value: String): IsVariable = {
      val __obj = js.Dynamic.literal(isVariable = isVariable.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsVariable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsVariable] (val x: Self) extends AnyVal {
      
      inline def setIsVariable(value: scala.Unit): Self = StObject.set(x, "isVariable", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Matchers extends StObject {
    
    var matchers: js.Array[Nodes]
    
    var property: String
    
    var sniff: String
    
    var supports: String
  }
  object Matchers {
    
    inline def apply(matchers: js.Array[Nodes], property: String, sniff: String, supports: String): Matchers = {
      val __obj = js.Dynamic.literal(matchers = matchers.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], sniff = sniff.asInstanceOf[js.Any], supports = supports.asInstanceOf[js.Any])
      __obj.asInstanceOf[Matchers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Matchers] (val x: Self) extends AnyVal {
      
      inline def setMatchers(value: js.Array[Nodes]): Self = StObject.set(x, "matchers", value.asInstanceOf[js.Any])
      
      inline def setMatchersVarargs(value: Nodes*): Self = StObject.set(x, "matchers", js.Array(value*))
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setSniff(value: String): Self = StObject.set(x, "sniff", value.asInstanceOf[js.Any])
      
      inline def setSupports(value: String): Self = StObject.set(x, "supports", value.asInstanceOf[js.Any])
    }
  }
  
  trait Nodes extends StObject {
    
    var nodes: js.Array[IsVariable | Type | Value]
    
    var `type`: String
    
    var value: String
  }
  object Nodes {
    
    inline def apply(nodes: js.Array[IsVariable | Type | Value], `type`: String, value: String): Nodes = {
      val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Nodes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Nodes] (val x: Self) extends AnyVal {
      
      inline def setNodes(value: js.Array[IsVariable | Type | Value]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: (IsVariable | Type | Value)*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Property extends StObject {
    
    var matchers: js.Array[Dimension]
    
    var property: String
    
    var sniff: String
    
    var supports: String
  }
  object Property {
    
    inline def apply(matchers: js.Array[Dimension], property: String, sniff: String, supports: String): Property = {
      val __obj = js.Dynamic.literal(matchers = matchers.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], sniff = sniff.asInstanceOf[js.Any], supports = supports.asInstanceOf[js.Any])
      __obj.asInstanceOf[Property]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Property] (val x: Self) extends AnyVal {
      
      inline def setMatchers(value: js.Array[Dimension]): Self = StObject.set(x, "matchers", value.asInstanceOf[js.Any])
      
      inline def setMatchersVarargs(value: Dimension*): Self = StObject.set(x, "matchers", js.Array(value*))
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setSniff(value: String): Self = StObject.set(x, "sniff", value.asInstanceOf[js.Any])
      
      inline def setSupports(value: String): Self = StObject.set(x, "supports", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var isVariable: scala.Unit
    
    var `type`: String
    
    var value: scala.Unit
  }
  object Type {
    
    inline def apply(isVariable: scala.Unit, `type`: String, value: scala.Unit): Type = {
      val __obj = js.Dynamic.literal(isVariable = isVariable.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      inline def setIsVariable(value: scala.Unit): Self = StObject.set(x, "isVariable", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: scala.Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Unit extends StObject {
    
    var unit: js.UndefOr[String] = js.undefined
  }
  object Unit {
    
    inline def apply(): Unit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Unit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Unit] (val x: Self) extends AnyVal {
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
  
  trait UnitString extends StObject {
    
    var unit: String
  }
  object UnitString {
    
    inline def apply(unit: String): UnitString = {
      val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnitString]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnitString] (val x: Self) extends AnyVal {
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var isVariable: Boolean
    
    var `type`: String
    
    var value: scala.Unit
  }
  object Value {
    
    inline def apply(isVariable: Boolean, `type`: String, value: scala.Unit): Value = {
      val __obj = js.Dynamic.literal(isVariable = isVariable.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      inline def setIsVariable(value: Boolean): Self = StObject.set(x, "isVariable", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: scala.Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
