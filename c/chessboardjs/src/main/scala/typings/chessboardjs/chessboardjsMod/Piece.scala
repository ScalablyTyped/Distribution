package typings.chessboardjs.chessboardjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Piece extends js.Object

@JSImport("chessboardjs", "Piece")
@js.native
object Piece extends js.Object {
  @js.native
  sealed trait bB extends Piece
  
  @js.native
  sealed trait bK extends Piece
  
  @js.native
  sealed trait bN extends Piece
  
  @js.native
  sealed trait bP extends Piece
  
  @js.native
  sealed trait bQ extends Piece
  
  @js.native
  sealed trait bR extends Piece
  
  @js.native
  sealed trait wB extends Piece
  
  @js.native
  sealed trait wK extends Piece
  
  @js.native
  sealed trait wN extends Piece
  
  @js.native
  sealed trait wP extends Piece
  
  @js.native
  sealed trait wQ extends Piece
  
  @js.native
  sealed trait wR extends Piece
  
  /* "bB" */ val bB: typings.chessboardjs.chessboardjsMod.Piece.bB with String = js.native
  /* "bK" */ val bK: typings.chessboardjs.chessboardjsMod.Piece.bK with String = js.native
  /* "bN" */ val bN: typings.chessboardjs.chessboardjsMod.Piece.bN with String = js.native
  /* "bP" */ val bP: typings.chessboardjs.chessboardjsMod.Piece.bP with String = js.native
  /* "bQ" */ val bQ: typings.chessboardjs.chessboardjsMod.Piece.bQ with String = js.native
  /* "bR" */ val bR: typings.chessboardjs.chessboardjsMod.Piece.bR with String = js.native
  /* "wB" */ val wB: typings.chessboardjs.chessboardjsMod.Piece.wB with String = js.native
  /* "wK" */ val wK: typings.chessboardjs.chessboardjsMod.Piece.wK with String = js.native
  /* "wN" */ val wN: typings.chessboardjs.chessboardjsMod.Piece.wN with String = js.native
  /* "wP" */ val wP: typings.chessboardjs.chessboardjsMod.Piece.wP with String = js.native
  /* "wQ" */ val wQ: typings.chessboardjs.chessboardjsMod.Piece.wQ with String = js.native
  /* "wR" */ val wR: typings.chessboardjs.chessboardjsMod.Piece.wR with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Piece with String] = js.native
}

