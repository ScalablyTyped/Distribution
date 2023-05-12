package typings.csstoolsCssTokenizer

import typings.csstoolsCssTokenizer.distInterfacesErrorMod.ParseError
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.HashType
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.NumberType
import typings.csstoolsCssTokenizer.distTokenizerMod.Stringer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Css extends StObject {
    
    var css: Stringer
  }
  object Css {
    
    inline def apply(css: Stringer): Css = {
      val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any])
      __obj.asInstanceOf[Css]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Css] (val x: Self) extends AnyVal {
      
      inline def setCss(value: Stringer): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    }
  }
  
  trait EndOfFile extends StObject {
    
    def endOfFile(): Boolean
    
    def nextToken(): js.UndefOr[CSSToken]
  }
  object EndOfFile {
    
    inline def apply(endOfFile: () => Boolean, nextToken: () => js.UndefOr[CSSToken]): EndOfFile = {
      val __obj = js.Dynamic.literal(endOfFile = js.Any.fromFunction0(endOfFile), nextToken = js.Any.fromFunction0(nextToken))
      __obj.asInstanceOf[EndOfFile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EndOfFile] (val x: Self) extends AnyVal {
      
      inline def setEndOfFile(value: () => Boolean): Self = StObject.set(x, "endOfFile", js.Any.fromFunction0(value))
      
      inline def setNextToken(value: () => js.UndefOr[CSSToken]): Self = StObject.set(x, "nextToken", js.Any.fromFunction0(value))
    }
  }
  
  trait OnParseError extends StObject {
    
    var onParseError: js.UndefOr[js.Function1[/* error */ ParseError, Unit]] = js.undefined
  }
  object OnParseError {
    
    inline def apply(): OnParseError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnParseError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnParseError] (val x: Self) extends AnyVal {
      
      inline def setOnParseError(value: /* error */ ParseError => Unit): Self = StObject.set(x, "onParseError", js.Any.fromFunction1(value))
      
      inline def setOnParseErrorUndefined: Self = StObject.set(x, "onParseError", js.undefined)
    }
  }
  
  trait Type extends StObject {
    
    var `type`: NumberType
    
    var unit: String
    
    var value: Double
  }
  object Type {
    
    inline def apply(`type`: NumberType, unit: String, value: Double): Type = {
      val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      inline def setType(value: NumberType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeNumberType extends StObject {
    
    var `type`: NumberType
    
    var value: Double
  }
  object TypeNumberType {
    
    inline def apply(`type`: NumberType, value: Double): TypeNumberType = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeNumberType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeNumberType] (val x: Self) extends AnyVal {
      
      inline def setType(value: NumberType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeValue extends StObject {
    
    var `type`: HashType
    
    var value: String
  }
  object TypeValue {
    
    inline def apply(`type`: HashType, value: String): TypeValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeValue] (val x: Self) extends AnyVal {
      
      inline def setType(value: HashType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var value: String
  }
  object Value {
    
    inline def apply(value: String): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValueNumber extends StObject {
    
    var value: Double
  }
  object ValueNumber {
    
    inline def apply(value: Double): ValueNumber = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueNumber]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValueNumber] (val x: Self) extends AnyVal {
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
