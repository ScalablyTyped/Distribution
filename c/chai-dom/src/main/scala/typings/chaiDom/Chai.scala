package typings.chaiDom

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Chai")
@js.native
object Chai extends js.Object {
  @js.native
  trait Assertion extends js.Object {
    var displayed: Assertion = js.native
    var empty: Assertion = js.native
    var trimmed: Assertion = js.native
    var visible: Assertion = js.native
    def attr(name: String): Assertion = js.native
    def attr(name: String, value: String): Assertion = js.native
    def attribute(name: String): Assertion = js.native
    def attribute(name: String, value: String): Assertion = js.native
    def `class`(className: String): Assertion = js.native
    // exist, length, and contain are already defined in @types/chai and have the
    // same type or a more general type, so don't need to be re-declared even though
    // the implementation is different
    def descendant(element: String): Assertion = js.native
    def descendant(element: HTMLElement): Assertion = js.native
    def descendants(selector: String): Assertion = js.native
    def html(html: String): Assertion = js.native
    def id(id: String): Assertion = js.native
    def text(text: String): Assertion = js.native
    def text(text: js.Array[String]): Assertion = js.native
    def value(text: String): Assertion = js.native
  }
  
  @js.native
  trait Include extends js.Object {
    def html(text: String): Assertion = js.native
    def html(text: js.Array[String]): Assertion = js.native
    def text(text: String): Assertion = js.native
    def text(text: js.Array[String]): Assertion = js.native
  }
  
  type Match = js.Function1[/* selector */ String, Assertion]
}

