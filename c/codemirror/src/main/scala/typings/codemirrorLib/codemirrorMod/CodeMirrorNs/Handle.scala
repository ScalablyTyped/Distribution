package typings
package codemirrorLib.codemirrorMod.CodeMirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The Handle used to interact with the autocomplete dialog box.*/
trait Handle extends js.Object {
  var data: js.Any
  var length: scala.Double
  def close(): scala.Unit
  def menuSize(): scala.Double
  def moveFocus(n: scala.Double, avoidWrap: scala.Boolean): scala.Unit
  def pick(): scala.Unit
  def setFocus(n: scala.Double): scala.Unit
}

