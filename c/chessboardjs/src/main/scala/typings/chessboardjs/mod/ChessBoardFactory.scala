package typings.chessboardjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChessBoardFactory extends js.Object {
  
  def apply(containerElOrId: js.Any): ChessBoardInstance = js.native
  def apply(containerElOrId: js.Any, config: BoardConfig): ChessBoardInstance = js.native
  def apply(containerElOrId: js.Any, position: String): ChessBoardInstance = js.native
  def apply(containerElOrId: js.Any, position: BoardPositionType): ChessBoardInstance = js.native
  
  def fenToObj(fen: String): Boolean | BoardPositionType = js.native
  
  def objToFen(obj: BoardPositionType): Boolean | String = js.native
}
