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
  def this(line: Double, ch: js.UndefOr[scala.Nothing], sticky: String) = this()
  def this(line: Double, ch: Double, sticky: String) = this()
}

@JSImport("codemirror", "Pos")
@js.native
object Pos extends TopLevel[PositionConstructor]

