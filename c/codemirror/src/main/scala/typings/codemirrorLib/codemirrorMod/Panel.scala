package typings
package codemirrorLib.codemirrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Panel extends js.Object {
  /**Notifies panel that height of DOM node has changed */
  def changed(): scala.Unit = js.native
  def changed(height: scala.Double): scala.Unit = js.native
  /**Removes the panel from the editor */
  def clear(): scala.Unit = js.native
}

