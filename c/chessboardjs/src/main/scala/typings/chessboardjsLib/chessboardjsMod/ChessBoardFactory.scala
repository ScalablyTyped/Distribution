package typings
package chessboardjsLib.chessboardjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChessBoardFactory extends js.Object {
  def apply(containerElOrId: js.Any): ChessBoardInstance = js.native
  def apply(containerElOrId: js.Any, config: BoardConfig): ChessBoardInstance = js.native
  def apply(containerElOrId: js.Any, position: BoardPositionType): ChessBoardInstance = js.native
  def apply(containerElOrId: js.Any, position: java.lang.String): ChessBoardInstance = js.native
  def fenToObj(fen: java.lang.String): scala.Boolean | BoardPositionType = js.native
  def objToFen(obj: BoardPositionType): scala.Boolean | java.lang.String = js.native
}

