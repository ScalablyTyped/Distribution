package typings.chessboardjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Piece extends StObject
@JSImport("chessboardjs", "Piece")
@js.native
object Piece extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Piece with String] = js.native
  
  @js.native
  sealed trait bB extends Piece
  /* "bB" */ val bB: typings.chessboardjs.mod.Piece.bB with String = js.native
  
  @js.native
  sealed trait bK extends Piece
  /* "bK" */ val bK: typings.chessboardjs.mod.Piece.bK with String = js.native
  
  @js.native
  sealed trait bN extends Piece
  /* "bN" */ val bN: typings.chessboardjs.mod.Piece.bN with String = js.native
  
  @js.native
  sealed trait bP extends Piece
  /* "bP" */ val bP: typings.chessboardjs.mod.Piece.bP with String = js.native
  
  @js.native
  sealed trait bQ extends Piece
  /* "bQ" */ val bQ: typings.chessboardjs.mod.Piece.bQ with String = js.native
  
  @js.native
  sealed trait bR extends Piece
  /* "bR" */ val bR: typings.chessboardjs.mod.Piece.bR with String = js.native
  
  @js.native
  sealed trait wB extends Piece
  /* "wB" */ val wB: typings.chessboardjs.mod.Piece.wB with String = js.native
  
  @js.native
  sealed trait wK extends Piece
  /* "wK" */ val wK: typings.chessboardjs.mod.Piece.wK with String = js.native
  
  @js.native
  sealed trait wN extends Piece
  /* "wN" */ val wN: typings.chessboardjs.mod.Piece.wN with String = js.native
  
  @js.native
  sealed trait wP extends Piece
  /* "wP" */ val wP: typings.chessboardjs.mod.Piece.wP with String = js.native
  
  @js.native
  sealed trait wQ extends Piece
  /* "wQ" */ val wQ: typings.chessboardjs.mod.Piece.wQ with String = js.native
  
  @js.native
  sealed trait wR extends Piece
  /* "wR" */ val wR: typings.chessboardjs.mod.Piece.wR with String = js.native
}
