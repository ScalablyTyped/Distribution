package typings.ckeditor.CKEDITORNs.domNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.dom.walker")
@js.native
class walker protected () extends js.Object {
  def this(range: range) = this()
  def checkBackward(): Boolean = js.native
  def checkForward(): Boolean = js.native
  def end(): Unit = js.native
  def evaluator(node: node): Boolean = js.native
  def guard(node: node): Boolean = js.native
  def guard(node: node, movingOut: Boolean): Boolean = js.native
  def lastBackward(): node = js.native
  def lastForward(): node = js.native
  def next(): node = js.native
  def previous(): node = js.native
  def reset(): Unit = js.native
}

/* static members */
@JSGlobal("CKEDITOR.dom.walker")
@js.native
object walker extends js.Object {
  var validEmptyBlockContainers: StringDictionary[js.Any] = js.native
  def blockBoundary(customNodeNames: js.Any): js.Function1[/* node */ node, Boolean] = js.native
  def bogus(): js.Function1[/* node */ node, Boolean] = js.native
  def bogus(isReject: Boolean): js.Function1[/* node */ node, Boolean] = js.native
  def bookmark(): js.Function1[/* node */ node, Boolean] = js.native
  def bookmark(contentOnly: Boolean): js.Function1[/* node */ node, Boolean] = js.native
  def bookmark(contentOnly: Boolean, isReject: Boolean): js.Function1[/* node */ node, Boolean] = js.native
  def editable(): js.Function1[/* node */ node, Boolean] = js.native
  def editable(isReject: Boolean): js.Function1[/* node */ node, Boolean] = js.native
  def empty(): js.Function1[/* node */ node, Boolean] = js.native
  def empty(isReject: Boolean): js.Function1[/* node */ node, Boolean] = js.native
  def ignored(): js.Function1[/* node */ node, Boolean] = js.native
  def ignored(isReject: Boolean): js.Function1[/* node */ node, Boolean] = js.native
  def invisible(): js.Function1[/* node */ node, Boolean] = js.native
  def invisible(isReject: Boolean): js.Function1[/* node */ node, Boolean] = js.native
  def listItemBoundary(): js.Function1[/* node */ node, Boolean] = js.native
  def nodeType(`type`: Double): js.Function1[/* node */ node, Boolean] = js.native
  def nodeType(`type`: Double, isReject: Boolean): js.Function1[/* node */ node, Boolean] = js.native
  def temp(): js.Function1[/* node */ node, Boolean] = js.native
  def temp(isReject: Boolean): js.Function1[/* node */ node, Boolean] = js.native
  def whitespaces(): js.Function1[/* node */ node, Boolean] = js.native
  def whitespaces(isReject: Boolean): js.Function1[/* node */ node, Boolean] = js.native
}

