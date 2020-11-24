package typings.chessboardjs.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Piece extends js.Object
@JSImport("chessboardjs", "Piece")
@js.native
object Piece extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Piece with String] = js.native
  
  @js.native
  sealed trait bB extends Piece
  /* "bB" */ @js.native
  object bB extends TopLevel[bB with String]
  
  @js.native
  sealed trait bK extends Piece
  /* "bK" */ @js.native
  object bK extends TopLevel[bK with String]
  
  @js.native
  sealed trait bN extends Piece
  /* "bN" */ @js.native
  object bN extends TopLevel[bN with String]
  
  @js.native
  sealed trait bP extends Piece
  /* "bP" */ @js.native
  object bP extends TopLevel[bP with String]
  
  @js.native
  sealed trait bQ extends Piece
  /* "bQ" */ @js.native
  object bQ extends TopLevel[bQ with String]
  
  @js.native
  sealed trait bR extends Piece
  /* "bR" */ @js.native
  object bR extends TopLevel[bR with String]
  
  @js.native
  sealed trait wB extends Piece
  /* "wB" */ @js.native
  object wB extends TopLevel[wB with String]
  
  @js.native
  sealed trait wK extends Piece
  /* "wK" */ @js.native
  object wK extends TopLevel[wK with String]
  
  @js.native
  sealed trait wN extends Piece
  /* "wN" */ @js.native
  object wN extends TopLevel[wN with String]
  
  @js.native
  sealed trait wP extends Piece
  /* "wP" */ @js.native
  object wP extends TopLevel[wP with String]
  
  @js.native
  sealed trait wQ extends Piece
  /* "wQ" */ @js.native
  object wQ extends TopLevel[wQ with String]
  
  @js.native
  sealed trait wR extends Piece
  /* "wR" */ @js.native
  object wR extends TopLevel[wR with String]
}
