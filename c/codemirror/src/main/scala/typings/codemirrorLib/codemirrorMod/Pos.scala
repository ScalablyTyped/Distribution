package typings
package codemirrorLib.codemirrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("codemirror", "Pos")
@js.native
class Pos protected ()
  extends codemirrorLib.codemirrorMod.CodeMirrorNs.Position {
  def this(line: scala.Double) = this()
  def this(line: scala.Double, ch: scala.Double) = this()
  def this(line: scala.Double, ch: scala.Double, sticky: java.lang.String) = this()
  /* CompleteClass */
  override var ch: scala.Double = js.native
  /* CompleteClass */
  override var line: scala.Double = js.native
}

