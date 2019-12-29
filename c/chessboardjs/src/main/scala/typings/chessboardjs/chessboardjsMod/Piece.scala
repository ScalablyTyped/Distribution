package typings.chessboardjs.chessboardjsMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Piece with String] = js.native
  /* "bB" */ @js.native
  object bB extends TopLevel[bB with String]
  
  /* "bK" */ @js.native
  object bK extends TopLevel[bK with String]
  
  /* "bN" */ @js.native
  object bN extends TopLevel[bN with String]
  
  /* "bP" */ @js.native
  object bP extends TopLevel[bP with String]
  
  /* "bQ" */ @js.native
  object bQ extends TopLevel[bQ with String]
  
  /* "bR" */ @js.native
  object bR extends TopLevel[bR with String]
  
  /* "wB" */ @js.native
  object wB extends TopLevel[wB with String]
  
  /* "wK" */ @js.native
  object wK extends TopLevel[wK with String]
  
  /* "wN" */ @js.native
  object wN extends TopLevel[wN with String]
  
  /* "wP" */ @js.native
  object wP extends TopLevel[wP with String]
  
  /* "wQ" */ @js.native
  object wQ extends TopLevel[wQ with String]
  
  /* "wR" */ @js.native
  object wR extends TopLevel[wR with String]
  
}

