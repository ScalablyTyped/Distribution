package typings
package chessDotJsLib.chessDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chess.js", "Chess")
@js.native
/**
  * The Chess() constructor takes an optional parameter which specifies
  * the board configuration in Forsyth-Edwards Notation.
  * @param fen specifies the board configuration in Forsyth-Edwards Notation.
  */
class Chess () extends ChessInstance {
  def this(fen: java.lang.String) = this()
}

