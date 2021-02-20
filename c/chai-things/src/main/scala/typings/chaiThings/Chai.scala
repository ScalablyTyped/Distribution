package typings.chaiThings

import typings.chai.Chai.Assertion
import typings.chai.Chai.Equal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Chai {
  
  @js.native
  trait Anything extends Assertion {
    
    def apply(): js.Any = js.native
  }
  
  @js.native
  trait ArrayAssertion extends StObject {
    
    def all(`type`: String): Assertion = js.native
    def all(`type`: String, message: String): Assertion = js.native
    @JSName("all")
    var all_Original: Assertion = js.native
    
    def contain(item: js.Any): js.Any = js.native
    @JSName("contain")
    var contain_Original: ArrayInclude = js.native
    
    def include(item: js.Any): js.Any = js.native
    @JSName("include")
    var include_Original: ArrayInclude = js.native
    
    var not: ArrayAssertion = js.native
  }
  
  @js.native
  trait ArrayInclude extends StObject {
    
    def apply(item: js.Any): js.Any = js.native
    
    var a: Item = js.native
    
    var an: Item = js.native
    
    def any(): js.Any = js.native
    def any(`type`: String): Assertion = js.native
    def any(`type`: String, message: String): Assertion = js.native
    @JSName("any")
    var any_Original: Anything = js.native
    
    def one(): js.Any = js.native
    def one(`type`: String): Assertion = js.native
    def one(`type`: String, message: String): Assertion = js.native
    @JSName("one")
    var one_Original: Something = js.native
    
    def some(): js.Any = js.native
    def some(`type`: String): Assertion = js.native
    def some(`type`: String, message: String): Assertion = js.native
    @JSName("some")
    var some_Original: Something = js.native
    
    def something(): js.Any = js.native
    def something(`type`: String): Assertion = js.native
    def something(`type`: String, message: String): Assertion = js.native
    @JSName("something")
    var something_Original: Something = js.native
  }
  
  @js.native
  trait Deep extends StObject {
    
    def equals(value: js.Any): Assertion = js.native
    def equals(value: js.Any, message: String): Assertion = js.native
    @JSName("equals")
    var equals_Original: Equal = js.native
  }
  
  @js.native
  trait Include extends StObject {
    
    def apply(item: js.Any): js.Any = js.native
    
    var a: Item = js.native
    
    var an: Item = js.native
    
    def one(): js.Any = js.native
    def one(`type`: String): Assertion = js.native
    def one(`type`: String, message: String): Assertion = js.native
    @JSName("one")
    var one_Original: Something = js.native
    
    def some(): js.Any = js.native
    def some(`type`: String): Assertion = js.native
    def some(`type`: String, message: String): Assertion = js.native
    @JSName("some")
    var some_Original: Something = js.native
    
    def something(): js.Any = js.native
    def something(`type`: String): Assertion = js.native
    def something(`type`: String, message: String): Assertion = js.native
    @JSName("something")
    var something_Original: Something = js.native
  }
  
  @js.native
  trait Item extends StObject {
    
    def item(): js.Any = js.native
    def item(`type`: String): Assertion = js.native
    def item(`type`: String, message: String): Assertion = js.native
    @JSName("item")
    var item_Original: Something = js.native
    
    def thing(): js.Any = js.native
    def thing(`type`: String): Assertion = js.native
    def thing(`type`: String, message: String): Assertion = js.native
    @JSName("thing")
    var thing_Original: Something = js.native
  }
  
  @js.native
  trait Something extends Assertion {
    
    def apply(): js.Any = js.native
  }
}
