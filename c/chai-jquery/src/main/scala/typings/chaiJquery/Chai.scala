package typings.chaiJquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Chai")
@js.native
object Chai extends js.Object {
  @js.native
  trait Assertion extends js.Object {
    def apply(selector: String): Assertion = js.native
    def attr(name: String): Assertion = js.native
    def attr(name: String, value: String): Assertion = js.native
    def checked(): Assertion = js.native
    def `class`(className: String): Assertion = js.native
    def css(name: String): Assertion = js.native
    def css(name: String, value: String): Assertion = js.native
    def data(name: String): Assertion = js.native
    def data(name: String, value: String): Assertion = js.native
    def descendants(selector: String): Assertion = js.native
    def disabled(): Assertion = js.native
    def enabled(): Assertion = js.native
    def hidden(): Assertion = js.native
    def html(html: String): Assertion = js.native
    def id(id: String): Assertion = js.native
    def prop(name: String): Assertion = js.native
    def prop(name: String, value: js.Any): Assertion = js.native
    def selected(): Assertion = js.native
    def text(text: String): Assertion = js.native
    def value(text: String): Assertion = js.native
    def visible(): Assertion = js.native
  }
  
  type Match = js.Function1[/* selector */ String, Assertion]
}

