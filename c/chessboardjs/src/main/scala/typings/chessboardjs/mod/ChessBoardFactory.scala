package typings.chessboardjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChessBoardFactory extends StObject {
  
  def apply(containerElOrId: Any): ChessBoardInstance = js.native
  def apply(containerElOrId: Any, config: BoardConfig): ChessBoardInstance = js.native
  def apply(containerElOrId: Any, position: String): ChessBoardInstance = js.native
  def apply(containerElOrId: Any, position: BoardPositionType): ChessBoardInstance = js.native
  
  def fenToObj(fen: String): Boolean | BoardPositionType = js.native
  
  def objToFen(obj: BoardPositionType): Boolean | String = js.native
}
