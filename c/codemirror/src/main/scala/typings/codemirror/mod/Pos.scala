package typings.codemirror.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("codemirror", "Pos")
@js.native
class Pos protected () extends Position {
  def this(line: Double) = this()
  def this(line: Double, ch: Double) = this()
  def this(line: Double, ch: Double, sticky: String) = this()
  /* CompleteClass */
  override var ch: Double = js.native
  /* CompleteClass */
  override var line: Double = js.native
}

@JSImport("codemirror", "Pos")
@js.native
object Pos extends TopLevel[PositionConstructor]

