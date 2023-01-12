package typings.chaiThings

import typings.chai.Chai.Assertion
import typings.chai.Chai.Equal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Chai {
  
  @js.native
  trait Anything
    extends StObject
       with Assertion {
    
    def apply(): Any = js.native
  }
  
  trait ArrayAssertion extends StObject {
    
    def all(`type`: String): Assertion
    def all(`type`: String, message: String): Assertion
    @JSName("all")
    var all_Original: Assertion
    
    def contain(item: Any): Any
    @JSName("contain")
    var contain_Original: ArrayInclude
    
    def include(item: Any): Any
    @JSName("include")
    var include_Original: ArrayInclude
    
    var not: ArrayAssertion
  }
  object ArrayAssertion {
    
    inline def apply(all: Assertion, contain: ArrayInclude, include: ArrayInclude, not: ArrayAssertion): ArrayAssertion = {
      val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], contain = contain.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any], not = not.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrayAssertion]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArrayAssertion] (val x: Self) extends AnyVal {
      
      inline def setAll(value: Assertion): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setContain(value: ArrayInclude): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
      
      inline def setInclude(value: ArrayInclude): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setNot(value: ArrayAssertion): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ArrayInclude extends StObject {
    
    def apply(item: Any): Any = js.native
    
    var a: Item = js.native
    
    var an: Item = js.native
    
    def any(): Any = js.native
    def any(`type`: String): Assertion = js.native
    def any(`type`: String, message: String): Assertion = js.native
    @JSName("any")
    var any_Original: Anything = js.native
    
    def one(): Any = js.native
    def one(`type`: String): Assertion = js.native
    def one(`type`: String, message: String): Assertion = js.native
    @JSName("one")
    var one_Original: Something = js.native
    
    def some(): Any = js.native
    def some(`type`: String): Assertion = js.native
    def some(`type`: String, message: String): Assertion = js.native
    @JSName("some")
    var some_Original: Something = js.native
    
    def something(): Any = js.native
    def something(`type`: String): Assertion = js.native
    def something(`type`: String, message: String): Assertion = js.native
    @JSName("something")
    var something_Original: Something = js.native
  }
  
  trait Deep extends StObject {
    
    def equals(value: Any, message: String): Assertion
    @JSName("equals")
    var equals_Original: Equal
  }
  object Deep {
    
    inline def apply(equals_ : (/* value */ Any, /* message */ js.UndefOr[String]) => Assertion): Deep = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("equals")(js.Any.fromFunction2(equals_))
      __obj.asInstanceOf[Deep]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Deep] (val x: Self) extends AnyVal {
      
      inline def setEquals_(value: (/* value */ Any, /* message */ js.UndefOr[String]) => Assertion): Self = StObject.set(x, "equals", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Include extends StObject {
    
    def apply(item: Any): Any = js.native
    
    var a: Item = js.native
    
    var an: Item = js.native
    
    def one(): Any = js.native
    def one(`type`: String): Assertion = js.native
    def one(`type`: String, message: String): Assertion = js.native
    @JSName("one")
    var one_Original: Something = js.native
    
    def some(): Any = js.native
    def some(`type`: String): Assertion = js.native
    def some(`type`: String, message: String): Assertion = js.native
    @JSName("some")
    var some_Original: Something = js.native
    
    def something(): Any = js.native
    def something(`type`: String): Assertion = js.native
    def something(`type`: String, message: String): Assertion = js.native
    @JSName("something")
    var something_Original: Something = js.native
  }
  
  trait Item extends StObject {
    
    def item(): Any
    def item(`type`: String): Assertion
    def item(`type`: String, message: String): Assertion
    @JSName("item")
    var item_Original: Something
    
    def thing(): Any
    def thing(`type`: String): Assertion
    def thing(`type`: String, message: String): Assertion
    @JSName("thing")
    var thing_Original: Something
  }
  object Item {
    
    inline def apply(item: Something, thing: Something): Item = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], thing = thing.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      inline def setItem(value: Something): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setThing(value: Something): Self = StObject.set(x, "thing", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Something
    extends StObject
       with Assertion {
    
    def apply(): Any = js.native
  }
}
