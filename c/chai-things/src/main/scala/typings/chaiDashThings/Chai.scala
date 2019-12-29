package typings.chaiDashThings

import typings.chai.Chai.Assertion
import typings.chai.Chai.Equal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Chai")
@js.native
object Chai extends js.Object {
  @js.native
  trait Anything extends Assertion {
    def apply(): js.Any = js.native
  }
  
  @js.native
  trait ArrayAssertion extends js.Object {
    @JSName("all")
    var all_Original: Assertion = js.native
    @JSName("contain")
    var contain_Original: ArrayInclude = js.native
    @JSName("include")
    var include_Original: ArrayInclude = js.native
    var not: ArrayAssertion = js.native
    def all(`type`: String): Assertion = js.native
    def all(`type`: String, message: String): Assertion = js.native
    def contain(item: js.Any): js.Any = js.native
    def include(item: js.Any): js.Any = js.native
  }
  
  @js.native
  trait ArrayInclude extends js.Object {
    var a: Item = js.native
    var an: Item = js.native
    @JSName("any")
    var any_Original: Anything = js.native
    @JSName("one")
    var one_Original: Something = js.native
    @JSName("some")
    var some_Original: Something = js.native
    @JSName("something")
    var something_Original: Something = js.native
    def apply(item: js.Any): js.Any = js.native
    def any(): js.Any = js.native
    def any(`type`: String): Assertion = js.native
    def any(`type`: String, message: String): Assertion = js.native
    def one(): js.Any = js.native
    def one(`type`: String): Assertion = js.native
    def one(`type`: String, message: String): Assertion = js.native
    def some(): js.Any = js.native
    def some(`type`: String): Assertion = js.native
    def some(`type`: String, message: String): Assertion = js.native
    def something(): js.Any = js.native
    def something(`type`: String): Assertion = js.native
    def something(`type`: String, message: String): Assertion = js.native
  }
  
  @js.native
  trait Deep extends js.Object {
    @JSName("equals")
    var equals_Original: Equal = js.native
    def equals(value: js.Any): Assertion = js.native
    def equals(value: js.Any, message: String): Assertion = js.native
  }
  
  @js.native
  trait Include extends js.Object {
    var a: Item = js.native
    var an: Item = js.native
    @JSName("one")
    var one_Original: Something = js.native
    @JSName("some")
    var some_Original: Something = js.native
    @JSName("something")
    var something_Original: Something = js.native
    def apply(item: js.Any): js.Any = js.native
    def one(): js.Any = js.native
    def one(`type`: String): Assertion = js.native
    def one(`type`: String, message: String): Assertion = js.native
    def some(): js.Any = js.native
    def some(`type`: String): Assertion = js.native
    def some(`type`: String, message: String): Assertion = js.native
    def something(): js.Any = js.native
    def something(`type`: String): Assertion = js.native
    def something(`type`: String, message: String): Assertion = js.native
  }
  
  @js.native
  trait Item extends js.Object {
    @JSName("item")
    var item_Original: Something = js.native
    @JSName("thing")
    var thing_Original: Something = js.native
    def item(): js.Any = js.native
    def item(`type`: String): Assertion = js.native
    def item(`type`: String, message: String): Assertion = js.native
    def thing(): js.Any = js.native
    def thing(`type`: String): Assertion = js.native
    def thing(`type`: String, message: String): Assertion = js.native
  }
  
  @js.native
  trait Something extends Assertion {
    def apply(): js.Any = js.native
  }
  
}

