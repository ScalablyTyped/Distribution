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

@JSImport("chess.js", "Chess")
@js.native
object Chess
  extends /**
  * The Chess() constructor takes an optional parameter which specifies
  * the board configuration in Forsyth-Edwards Notation.
  * @param fen specifies the board configuration in Forsyth-Edwards Notation.
  */
org.scalablytyped.runtime.Instantiable0[ChessInstance]
     with org.scalablytyped.runtime.Instantiable1[/* fen */ java.lang.String, ChessInstance] {
  /**
    * The Chess() constructor takes an optional parameter which specifies
    * the board configuration in Forsyth-Edwards Notation.
    * @param fen specifies the board configuration in Forsyth-Edwards Notation.
    */
  def apply(): chessDotJsLib.chessDotJsMod.ChessInstance = js.native
  def apply(fen: java.lang.String): chessDotJsLib.chessDotJsMod.ChessInstance = js.native
}

