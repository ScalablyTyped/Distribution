package typings.chessboardjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Piece extends StObject
@JSImport("chessboardjs", "Piece")
@js.native
object Piece extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Piece & String] = js.native
  
  @js.native
  sealed trait bB
    extends StObject
       with Piece
  /* "bB" */ val bB: typings.chessboardjs.mod.Piece.bB & String = js.native
  
  @js.native
  sealed trait bK
    extends StObject
       with Piece
  /* "bK" */ val bK: typings.chessboardjs.mod.Piece.bK & String = js.native
  
  @js.native
  sealed trait bN
    extends StObject
       with Piece
  /* "bN" */ val bN: typings.chessboardjs.mod.Piece.bN & String = js.native
  
  @js.native
  sealed trait bP
    extends StObject
       with Piece
  /* "bP" */ val bP: typings.chessboardjs.mod.Piece.bP & String = js.native
  
  @js.native
  sealed trait bQ
    extends StObject
       with Piece
  /* "bQ" */ val bQ: typings.chessboardjs.mod.Piece.bQ & String = js.native
  
  @js.native
  sealed trait bR
    extends StObject
       with Piece
  /* "bR" */ val bR: typings.chessboardjs.mod.Piece.bR & String = js.native
  
  @js.native
  sealed trait wB
    extends StObject
       with Piece
  /* "wB" */ val wB: typings.chessboardjs.mod.Piece.wB & String = js.native
  
  @js.native
  sealed trait wK
    extends StObject
       with Piece
  /* "wK" */ val wK: typings.chessboardjs.mod.Piece.wK & String = js.native
  
  @js.native
  sealed trait wN
    extends StObject
       with Piece
  /* "wN" */ val wN: typings.chessboardjs.mod.Piece.wN & String = js.native
  
  @js.native
  sealed trait wP
    extends StObject
       with Piece
  /* "wP" */ val wP: typings.chessboardjs.mod.Piece.wP & String = js.native
  
  @js.native
  sealed trait wQ
    extends StObject
       with Piece
  /* "wQ" */ val wQ: typings.chessboardjs.mod.Piece.wQ & String = js.native
  
  @js.native
  sealed trait wR
    extends StObject
       with Piece
  /* "wR" */ val wR: typings.chessboardjs.mod.Piece.wR & String = js.native
}
