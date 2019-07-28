package typings.chessDotJs.chessDotJsMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
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
  def this(fen: String) = this()
}

@JSImport("chess.js", "Chess")
@js.native
object Chess
  extends /**
  * The Chess() constructor takes an optional parameter which specifies
  * the board configuration in Forsyth-Edwards Notation.
  * @param fen specifies the board configuration in Forsyth-Edwards Notation.
  */
Instantiable0[ChessInstance]
     with Instantiable1[/* fen */ String, ChessInstance] {
  /**
    * The Chess() constructor takes an optional parameter which specifies
    * the board configuration in Forsyth-Edwards Notation.
    * @param fen specifies the board configuration in Forsyth-Edwards Notation.
    */
  def apply(): ChessInstance = js.native
  def apply(fen: String): ChessInstance = js.native
}

