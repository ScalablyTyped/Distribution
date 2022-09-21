package typings.checkMoreTypes

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("check-more-types", JSImport.Namespace)
  @js.native
  val ^ : CheckModeTypes = js.native
  
  trait CheckModeTypes
    extends StObject
       with Predicates {
    
    var not: Predicates
  }
  object CheckModeTypes {
    
    inline def apply(
      defined: /* s */ Any => Boolean,
      empty: /* s */ Any => Boolean,
      fn: /* s */ Any => Boolean,
      not: Predicates,
      number: /* s */ Any => Boolean,
      `object`: /* s */ Any => Boolean,
      oneOf: Any,
      schema: Any,
      unemptyString: /* s */ Any => Boolean,
      webUrl: /* s */ Any => Boolean
    ): CheckModeTypes = {
      val __obj = js.Dynamic.literal(defined = js.Any.fromFunction1(defined), empty = js.Any.fromFunction1(empty), fn = js.Any.fromFunction1(fn), not = not.asInstanceOf[js.Any], number = js.Any.fromFunction1(number), oneOf = oneOf.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], unemptyString = js.Any.fromFunction1(unemptyString), webUrl = js.Any.fromFunction1(webUrl))
      __obj.updateDynamic("object")(js.Any.fromFunction1(`object`))
      __obj.asInstanceOf[CheckModeTypes]
    }
    
    extension [Self <: CheckModeTypes](x: Self) {
      
      inline def setNot(value: Predicates): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    }
  }
  
  trait Predicates extends StObject {
    
    def defined(s: Any): Boolean
    @JSName("defined")
    var defined_Original: predicate
    
    def empty(s: Any): Boolean
    @JSName("empty")
    var empty_Original: predicate
    
    def fn(s: Any): Boolean
    @JSName("fn")
    var fn_Original: predicate
    
    def number(s: Any): Boolean
    @JSName("number")
    var number_Original: predicate
    
    def `object`(s: Any): Boolean
    @JSName("object")
    var object_Original: predicate
    
    // for now, should be curried functions
    var oneOf: Any
    
    var schema: Any
    
    def unemptyString(s: Any): Boolean
    @JSName("unemptyString")
    var unemptyString_Original: predicate
    
    def webUrl(s: Any): Boolean
    @JSName("webUrl")
    var webUrl_Original: predicate
  }
  object Predicates {
    
    inline def apply(
      defined: /* s */ Any => Boolean,
      empty: /* s */ Any => Boolean,
      fn: /* s */ Any => Boolean,
      number: /* s */ Any => Boolean,
      `object`: /* s */ Any => Boolean,
      oneOf: Any,
      schema: Any,
      unemptyString: /* s */ Any => Boolean,
      webUrl: /* s */ Any => Boolean
    ): Predicates = {
      val __obj = js.Dynamic.literal(defined = js.Any.fromFunction1(defined), empty = js.Any.fromFunction1(empty), fn = js.Any.fromFunction1(fn), number = js.Any.fromFunction1(number), oneOf = oneOf.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], unemptyString = js.Any.fromFunction1(unemptyString), webUrl = js.Any.fromFunction1(webUrl))
      __obj.updateDynamic("object")(js.Any.fromFunction1(`object`))
      __obj.asInstanceOf[Predicates]
    }
    
    extension [Self <: Predicates](x: Self) {
      
      inline def setDefined(value: /* s */ Any => Boolean): Self = StObject.set(x, "defined", js.Any.fromFunction1(value))
      
      inline def setEmpty(value: /* s */ Any => Boolean): Self = StObject.set(x, "empty", js.Any.fromFunction1(value))
      
      inline def setFn(value: /* s */ Any => Boolean): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
      
      inline def setNumber(value: /* s */ Any => Boolean): Self = StObject.set(x, "number", js.Any.fromFunction1(value))
      
      inline def setObject(value: /* s */ Any => Boolean): Self = StObject.set(x, "object", js.Any.fromFunction1(value))
      
      inline def setOneOf(value: Any): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
      
      inline def setSchema(value: Any): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setUnemptyString(value: /* s */ Any => Boolean): Self = StObject.set(x, "unemptyString", js.Any.fromFunction1(value))
      
      inline def setWebUrl(value: /* s */ Any => Boolean): Self = StObject.set(x, "webUrl", js.Any.fromFunction1(value))
    }
  }
  
  type _To = CheckModeTypes
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: CheckModeTypes = ^
  
  type predicate = js.Function1[/* s */ Any, Boolean]
}
