package typings.codemirrorLanguage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Align extends StObject {
    
    var align: js.UndefOr[Boolean] = js.undefined
    
    var closing: String
    
    var units: js.UndefOr[Double] = js.undefined
  }
  object Align {
    
    inline def apply(closing: String): Align = {
      val __obj = js.Dynamic.literal(closing = closing.asInstanceOf[js.Any])
      __obj.asInstanceOf[Align]
    }
    
    extension [Self <: Align](x: Self) {
      
      inline def setAlign(value: Boolean): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setClosing(value: String): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
      
      inline def setUnits(value: Double): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    }
  }
  
  trait Except extends StObject {
    
    var except: js.UndefOr[js.RegExp] = js.undefined
    
    var units: js.UndefOr[Double] = js.undefined
  }
  object Except {
    
    inline def apply(): Except = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Except]
    }
    
    extension [Self <: Except](x: Self) {
      
      inline def setExcept(value: js.RegExp): Self = StObject.set(x, "except", value.asInstanceOf[js.Any])
      
      inline def setExceptUndefined: Self = StObject.set(x, "except", js.undefined)
      
      inline def setUnits(value: Double): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    }
  }
  
  trait Fallback extends StObject {
    
    /**
      When enabled, this marks the highlighter as a fallback, which
      only takes effect if no other highlighters are registered.
      */
    var fallback: Boolean
  }
  object Fallback {
    
    inline def apply(fallback: Boolean): Fallback = {
      val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fallback]
    }
    
    extension [Self <: Fallback](x: Self) {
      
      inline def setFallback(value: Boolean): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    }
  }
  
  trait From extends StObject {
    
    var from: Double
    
    var text: String
  }
  object From {
    
    inline def apply(from: Double, text: String): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    extension [Self <: From](x: Self) {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait OverrideIndentation extends StObject {
    
    /**
      Override line indentations provided to the indentation
      helper function, which is useful when implementing region
      indentation, where indentation for later lines needs to refer
      to previous lines, which may have been reindented compared to
      the original start state. If given, this function should
      return -1 for lines (given by start position) that didn't
      change, and an updated indentation otherwise.
      */
    var overrideIndentation: js.UndefOr[js.Function1[/* pos */ Double, Double]] = js.undefined
    
    /**
      Make it look, to the indent logic, like a line break was
      added at the given position (which is mostly just useful for
      implementing something like
      [`insertNewlineAndIndent`](https://codemirror.net/6/docs/ref/#commands.insertNewlineAndIndent)).
      */
    var simulateBreak: js.UndefOr[Double] = js.undefined
    
    /**
      When `simulateBreak` is given, this can be used to make the
      simulate break behave like a double line break.
      */
    var simulateDoubleBreak: js.UndefOr[Boolean] = js.undefined
  }
  object OverrideIndentation {
    
    inline def apply(): OverrideIndentation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverrideIndentation]
    }
    
    extension [Self <: OverrideIndentation](x: Self) {
      
      inline def setOverrideIndentation(value: /* pos */ Double => Double): Self = StObject.set(x, "overrideIndentation", js.Any.fromFunction1(value))
      
      inline def setOverrideIndentationUndefined: Self = StObject.set(x, "overrideIndentation", js.undefined)
      
      inline def setSimulateBreak(value: Double): Self = StObject.set(x, "simulateBreak", value.asInstanceOf[js.Any])
      
      inline def setSimulateBreakUndefined: Self = StObject.set(x, "simulateBreak", js.undefined)
      
      inline def setSimulateDoubleBreak(value: Boolean): Self = StObject.set(x, "simulateDoubleBreak", value.asInstanceOf[js.Any])
      
      inline def setSimulateDoubleBreakUndefined: Self = StObject.set(x, "simulateDoubleBreak", js.undefined)
    }
  }
  
  trait To extends StObject {
    
    var from: Double
    
    var to: Double
  }
  object To {
    
    inline def apply(from: Double, to: Double): To = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[To]
    }
    
    extension [Self <: To](x: Self) {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
}
