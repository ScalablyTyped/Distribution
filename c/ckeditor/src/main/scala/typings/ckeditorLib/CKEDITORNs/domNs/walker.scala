package typings
package ckeditorLib.CKEDITORNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.dom.walker")
@js.native
class walker protected () extends js.Object {
  def this(range: range) = this()
  def checkBackward(): scala.Boolean = js.native
  def checkForward(): scala.Boolean = js.native
  def end(): scala.Unit = js.native
  def evaluator(node: node): scala.Boolean = js.native
  def guard(node: node): scala.Boolean = js.native
  def guard(node: node, movingOut: scala.Boolean): scala.Boolean = js.native
  def lastBackward(): node = js.native
  def lastForward(): node = js.native
  def next(): node = js.native
  def previous(): node = js.native
  def reset(): scala.Unit = js.native
}

@JSGlobal("CKEDITOR.dom.walker")
@js.native
object walker extends js.Object {
  var validEmptyBlockContainers: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def blockBoundary(customNodeNames: js.Any): js.Function1[/* node */ ckeditorLib.CKEDITORNs.domNs.node, scala.Boolean] = js.native
  def bogus(): js.Function1[/* node */ ckeditorLib.CKEDITORNs.domNs.node, scala.Boolean] = js.native
  def bogus(isReject: scala.Boolean): js.Function1[/* node */ ckeditorLib.CKEDITORNs.domNs.node, scala.Boolean] = js.native
  def bookmark(): js.Function1[/* node */ ckeditorLib.CKEDITORNs.domNs.node, scala.Boolean] = js.native
  def bookmark(contentOnly: scala.Boolean): js.Function1[/* node */ ckeditorLib.CKEDITORNs.domNs.node, scala.Boolean] = js.native
  def bookmark(contentOnly: scala.Boolean, isReject: scala.Boolean): js.Function1[/* node */ ckeditorLib.CKEDITORNs.domNs.node, scala.Boolean] = js.native
  def editable(): js.Function1[/* node */ ckeditorLib.CKEDITORNs.domNs.node, scala.Boolean] = js.native
  def editable(isReject: scala.Boolean): js.Function1[/* node */ ckeditorLib.CKEDITORNs.domNs.node, scala.Boolean] = js.native
  def empty(): js.Function1[/* node */ ckeditorLib.CKEDITORNs.domNs.node, scala.Boolean] = js.native
  def empty(isReject: scala.Boolean): js.Function1[/* node */ ckeditorLib.CKEDITORNs.domNs.node, scala.Boolean] = js.native
  def ignored(): js.Function1[/* node */ ckeditorLib.CKEDITORNs.domNs.node, scala.Boolean] = js.native
  def ignored(isReject: scala.Boolean): js.Function1[/* node */ ckeditorLib.CKEDITORNs.domNs.node, scala.Boolean] = js.native
  def invisible(): js.Function1[/* node */ ckeditorLib.CKEDITORNs.domNs.node, scala.Boolean] = js.native
  def invisible(isReject: scala.Boolean): js.Function1[/* node */ ckeditorLib.CKEDITORNs.domNs.node, scala.Boolean] = js.native
  def listItemBoundary(): js.Function1[/* node */ ckeditorLib.CKEDITORNs.domNs.node, scala.Boolean] = js.native
  def nodeType(`type`: scala.Double): js.Function1[/* node */ ckeditorLib.CKEDITORNs.domNs.node, scala.Boolean] = js.native
  def nodeType(`type`: scala.Double, isReject: scala.Boolean): js.Function1[/* node */ ckeditorLib.CKEDITORNs.domNs.node, scala.Boolean] = js.native
  def temp(): js.Function1[/* node */ ckeditorLib.CKEDITORNs.domNs.node, scala.Boolean] = js.native
  def temp(isReject: scala.Boolean): js.Function1[/* node */ ckeditorLib.CKEDITORNs.domNs.node, scala.Boolean] = js.native
  def whitespaces(): js.Function1[/* node */ ckeditorLib.CKEDITORNs.domNs.node, scala.Boolean] = js.native
  def whitespaces(isReject: scala.Boolean): js.Function1[/* node */ ckeditorLib.CKEDITORNs.domNs.node, scala.Boolean] = js.native
}

