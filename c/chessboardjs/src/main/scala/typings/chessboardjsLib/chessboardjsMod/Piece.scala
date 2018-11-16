package typings
package chessboardjsLib.chessboardjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Piece extends js.Object

@JSImport("chessboardjs", "Piece")
@js.native
object Piece extends js.Object {
  @js.native
  sealed trait bB
    extends chessboardjsLib.chessboardjsMod.Piece
  
  @js.native
  sealed trait bK
    extends chessboardjsLib.chessboardjsMod.Piece
  
  @js.native
  sealed trait bN
    extends chessboardjsLib.chessboardjsMod.Piece
  
  @js.native
  sealed trait bP
    extends chessboardjsLib.chessboardjsMod.Piece
  
  @js.native
  sealed trait bQ
    extends chessboardjsLib.chessboardjsMod.Piece
  
  @js.native
  sealed trait bR
    extends chessboardjsLib.chessboardjsMod.Piece
  
  @js.native
  sealed trait wB
    extends chessboardjsLib.chessboardjsMod.Piece
  
  @js.native
  sealed trait wK
    extends chessboardjsLib.chessboardjsMod.Piece
  
  @js.native
  sealed trait wN
    extends chessboardjsLib.chessboardjsMod.Piece
  
  @js.native
  sealed trait wP
    extends chessboardjsLib.chessboardjsMod.Piece
  
  @js.native
  sealed trait wQ
    extends chessboardjsLib.chessboardjsMod.Piece
  
  @js.native
  sealed trait wR
    extends chessboardjsLib.chessboardjsMod.Piece
  
  /* "bB" */ val bB: bB with java.lang.String = js.native
  /* "bK" */ val bK: bK with java.lang.String = js.native
  /* "bN" */ val bN: bN with java.lang.String = js.native
  /* "bP" */ val bP: bP with java.lang.String = js.native
  /* "bQ" */ val bQ: bQ with java.lang.String = js.native
  /* "bR" */ val bR: bR with java.lang.String = js.native
  /* "wB" */ val wB: wB with java.lang.String = js.native
  /* "wK" */ val wK: wK with java.lang.String = js.native
  /* "wN" */ val wN: wN with java.lang.String = js.native
  /* "wP" */ val wP: wP with java.lang.String = js.native
  /* "wQ" */ val wQ: wQ with java.lang.String = js.native
  /* "wR" */ val wR: wR with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[chessboardjsLib.chessboardjsMod.Piece with java.lang.String] = js.native
}

