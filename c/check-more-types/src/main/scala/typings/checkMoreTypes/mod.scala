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
      defined: /* s */ js.Any => Boolean,
      empty: /* s */ js.Any => Boolean,
      fn: /* s */ js.Any => Boolean,
      not: Predicates,
      number: /* s */ js.Any => Boolean,
      `object`: /* s */ js.Any => Boolean,
      oneOf: js.Any,
      schema: js.Any,
      unemptyString: /* s */ js.Any => Boolean,
      webUrl: /* s */ js.Any => Boolean
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
    
    def defined(s: js.Any): Boolean
    @JSName("defined")
    var defined_Original: predicate
    
    def empty(s: js.Any): Boolean
    @JSName("empty")
    var empty_Original: predicate
    
    def fn(s: js.Any): Boolean
    @JSName("fn")
    var fn_Original: predicate
    
    def number(s: js.Any): Boolean
    @JSName("number")
    var number_Original: predicate
    
    def `object`(s: js.Any): Boolean
    @JSName("object")
    var object_Original: predicate
    
    // for now, should be curried functions
    var oneOf: js.Any
    
    var schema: js.Any
    
    def unemptyString(s: js.Any): Boolean
    @JSName("unemptyString")
    var unemptyString_Original: predicate
    
    def webUrl(s: js.Any): Boolean
    @JSName("webUrl")
    var webUrl_Original: predicate
  }
  object Predicates {
    
    inline def apply(
      defined: /* s */ js.Any => Boolean,
      empty: /* s */ js.Any => Boolean,
      fn: /* s */ js.Any => Boolean,
      number: /* s */ js.Any => Boolean,
      `object`: /* s */ js.Any => Boolean,
      oneOf: js.Any,
      schema: js.Any,
      unemptyString: /* s */ js.Any => Boolean,
      webUrl: /* s */ js.Any => Boolean
    ): Predicates = {
      val __obj = js.Dynamic.literal(defined = js.Any.fromFunction1(defined), empty = js.Any.fromFunction1(empty), fn = js.Any.fromFunction1(fn), number = js.Any.fromFunction1(number), oneOf = oneOf.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], unemptyString = js.Any.fromFunction1(unemptyString), webUrl = js.Any.fromFunction1(webUrl))
      __obj.updateDynamic("object")(js.Any.fromFunction1(`object`))
      __obj.asInstanceOf[Predicates]
    }
    
    extension [Self <: Predicates](x: Self) {
      
      inline def setDefined(value: /* s */ js.Any => Boolean): Self = StObject.set(x, "defined", js.Any.fromFunction1(value))
      
      inline def setEmpty(value: /* s */ js.Any => Boolean): Self = StObject.set(x, "empty", js.Any.fromFunction1(value))
      
      inline def setFn(value: /* s */ js.Any => Boolean): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
      
      inline def setNumber(value: /* s */ js.Any => Boolean): Self = StObject.set(x, "number", js.Any.fromFunction1(value))
      
      inline def setObject(value: /* s */ js.Any => Boolean): Self = StObject.set(x, "object", js.Any.fromFunction1(value))
      
      inline def setOneOf(value: js.Any): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
      
      inline def setSchema(value: js.Any): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setUnemptyString(value: /* s */ js.Any => Boolean): Self = StObject.set(x, "unemptyString", js.Any.fromFunction1(value))
      
      inline def setWebUrl(value: /* s */ js.Any => Boolean): Self = StObject.set(x, "webUrl", js.Any.fromFunction1(value))
    }
  }
  
  type _To = CheckModeTypes
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: CheckModeTypes = ^
  
  type predicate = js.Function1[/* s */ js.Any, Boolean]
}
