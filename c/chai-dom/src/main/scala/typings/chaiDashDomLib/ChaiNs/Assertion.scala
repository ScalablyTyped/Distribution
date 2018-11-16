package typings
package chaiDashDomLib.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assertion extends js.Object {
  var displayed: Assertion = js.native
  var empty: Assertion = js.native
  var trimmed: Assertion = js.native
  def attr(name: java.lang.String): Assertion = js.native
  def attr(name: java.lang.String, value: java.lang.String): Assertion = js.native
  def attribute(name: java.lang.String): Assertion = js.native
  def attribute(name: java.lang.String, value: java.lang.String): Assertion = js.native
  def `class`(className: java.lang.String): Assertion = js.native
  // exist, length, and contain are already defined in @types/chai and have the
  // same type or a more general type, so don't need to be re-declared even though
  // the implementation is different
  def descendant(element: java.lang.String): Assertion = js.native
  // exist, length, and contain are already defined in @types/chai and have the
  // same type or a more general type, so don't need to be re-declared even though
  // the implementation is different
  def descendant(element: stdLib.HTMLElement): Assertion = js.native
  def descendants(selector: java.lang.String): Assertion = js.native
  def html(html: java.lang.String): Assertion = js.native
  def id(id: java.lang.String): Assertion = js.native
  def text(text: java.lang.String): Assertion = js.native
  def text(text: js.Array[java.lang.String]): Assertion = js.native
  def value(text: java.lang.String): Assertion = js.native
}

