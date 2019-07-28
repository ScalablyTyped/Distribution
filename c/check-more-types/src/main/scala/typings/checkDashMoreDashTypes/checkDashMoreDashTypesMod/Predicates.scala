package typings.checkDashMoreDashTypes.checkDashMoreDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Predicates extends js.Object {
  @JSName("defined")
  var defined_Original: predicate = js.native
  @JSName("empty")
  var empty_Original: predicate = js.native
  @JSName("fn")
  var fn_Original: predicate = js.native
  @JSName("number")
  var number_Original: predicate = js.native
  @JSName("object")
  var object_Original: predicate = js.native
  // for now, should be curried functions
  var oneOf: js.Any = js.native
  var schema: js.Any = js.native
  @JSName("unemptyString")
  var unemptyString_Original: predicate = js.native
  @JSName("webUrl")
  var webUrl_Original: predicate = js.native
  def defined(s: js.Any): Boolean = js.native
  def empty(s: js.Any): Boolean = js.native
  def fn(s: js.Any): Boolean = js.native
  def number(s: js.Any): Boolean = js.native
  def `object`(s: js.Any): Boolean = js.native
  def unemptyString(s: js.Any): Boolean = js.native
  def webUrl(s: js.Any): Boolean = js.native
}

