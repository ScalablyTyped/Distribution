package typings.chessJs

import org.scalablytyped.runtime.StringDictionary
import typings.chessJs.anon.Color
import typings.chessJs.anon.Error
import typings.chessJs.anon.Legal
import typings.chessJs.anon.Maxwidth
import typings.chessJs.anon.Newlinechar
import typings.chessJs.anon.Sloppy
import typings.chessJs.anon.Verbose
import typings.chessJs.anon.`0`
import typings.chessJs.anon.`1`
import typings.chessJs.chessJsStrings.b
import typings.chessJs.chessJsStrings.c
import typings.chessJs.chessJsStrings.e
import typings.chessJs.chessJsStrings.k
import typings.chessJs.chessJsStrings.n
import typings.chessJs.chessJsStrings.p
import typings.chessJs.chessJsStrings.q
import typings.chessJs.chessJsStrings.r
import typings.chessJs.chessJsStrings.w
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("chess.js", "BISHOP")
  @js.native
  val BISHOP: b = js.native
  
  @JSImport("chess.js", "BLACK")
  @js.native
  val BLACK: b = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("chess.js", "Chess")
  @js.native
  /**
    * The Chess() constructor takes an optional parameter which specifies
    * the board configuration in Forsyth-Edwards Notation.
    * @param fen specifies the board configuration in Forsyth-Edwards Notation.
    */
  open class Chess ()
    extends StObject
       with ChessInstance {
    def this(fen: String) = this()
  }
  object Chess {
    
    /**
      * The Chess() constructor takes an optional parameter which specifies
      * the board configuration in Forsyth-Edwards Notation.
      * @param fen specifies the board configuration in Forsyth-Edwards Notation.
      */
    @JSImport("chess.js", "Chess")
    @js.native
    def apply(): ChessInstance = js.native
    @JSImport("chess.js", "Chess")
    @js.native
    def apply(fen: String): ChessInstance = js.native
  }
  
  @JSImport("chess.js", "EMPTY")
  @js.native
  val EMPTY: Double = js.native
  
  object FLAGS {
    
    @JSImport("chess.js", "FLAGS")
    @js.native
    val ^ : js.Any = js.native
    
    /** a pawn push of two squares */
    @JSImport("chess.js", "FLAGS.BIG_PAWN")
    @js.native
    def BIG_PAWN: b = js.native
    inline def BIG_PAWN_=(x: b): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BIG_PAWN")(x.asInstanceOf[js.Any])
    
    /** a standard capture */
    @JSImport("chess.js", "FLAGS.CAPTURE")
    @js.native
    def CAPTURE: c = js.native
    inline def CAPTURE_=(x: c): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CAPTURE")(x.asInstanceOf[js.Any])
    
    /** an en passant capture */
    @JSImport("chess.js", "FLAGS.EP_CAPTURE")
    @js.native
    def EP_CAPTURE: e = js.native
    inline def EP_CAPTURE_=(x: e): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EP_CAPTURE")(x.asInstanceOf[js.Any])
    
    /** kingside castling */
    @JSImport("chess.js", "FLAGS.KSIDE_CASTLE")
    @js.native
    def KSIDE_CASTLE: k = js.native
    inline def KSIDE_CASTLE_=(x: k): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KSIDE_CASTLE")(x.asInstanceOf[js.Any])
    
    /** a non-capture */
    @JSImport("chess.js", "FLAGS.NORMAL")
    @js.native
    def NORMAL: n = js.native
    inline def NORMAL_=(x: n): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NORMAL")(x.asInstanceOf[js.Any])
    
    /** a promotion */
    @JSImport("chess.js", "FLAGS.PROMOTION")
    @js.native
    def PROMOTION: p = js.native
    inline def PROMOTION_=(x: p): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROMOTION")(x.asInstanceOf[js.Any])
    
    /** queenside castling */
    @JSImport("chess.js", "FLAGS.QSIDE_CASTLE")
    @js.native
    def QSIDE_CASTLE: q = js.native
    inline def QSIDE_CASTLE_=(x: q): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QSIDE_CASTLE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("chess.js", "KING")
  @js.native
  val KING: k = js.native
  
  @JSImport("chess.js", "KNIGHT")
  @js.native
  val KNIGHT: n = js.native
  
  @JSImport("chess.js", "PAWN")
  @js.native
  val PAWN: p = js.native
  
  @JSImport("chess.js", "QUEEN")
  @js.native
  val QUEEN: q = js.native
  
  @JSImport("chess.js", "ROOK")
  @js.native
  val ROOK: r = js.native
  
  @JSImport("chess.js", "SQUARES")
  @js.native
  val SQUARES: js.Array[Any] = js.native
  
  @JSImport("chess.js", "WHITE")
  @js.native
  val WHITE: w = js.native
  
  @js.native
  trait ChessInstance extends StObject {
    
    /**
      * Returns a string containing an ASCII diagram of the current position.
      * @returns A string containing an ASCII diagram of the current position.
      */
    def ascii(): String = js.native
    
    def board(): js.Array[js.Array[Color | Null]] = js.native
    
    /**
      * Clears the board of all pieces.
      */
    def clear(): Unit = js.native
    
    def delete_comment(): js.UndefOr[String] = js.native
    
    def delete_comments(): js.Array[Comment] = js.native
    
    /**
      * Returns the FEN string for the current position.
      * @returns the FEN string for the current position.
      */
    def fen(): String = js.native
    
    /**
      * Returns true if the game has ended via checkmate, stalemate, draw,
      * threefold repetition, or insufficient material.
      * Otherwise, returns false.
      * @returns True if the game has ended via checkmate, stalemate, draw,
      * threefold repetition, or insufficient material. Otherwise, returns
      * false.
      */
    def game_over(): Boolean = js.native
    
    /**
      * Returns the piece on the square
      * @param square the square to get the piece on.
      * @returns null if no piece is on that square, or it is not a valid
      * square. Otherwise a piece object.
      */
    def get(square: Square): Piece | Null = js.native
    
    def get_comment(): js.UndefOr[String] = js.native
    
    def get_comments(): js.Array[Comment] = js.native
    
    /**
      * Allows header information to be added to PGN output.
      * Any number of key/value pairs can be passed to .header(), with each
      * first arg being treated as a header key, and each second as the value.
      * @param args (optional) Header pairs to store in the header.
      * @returns The current header information after storing any values.
      */
    def header(args: String*): StringDictionary[js.UndefOr[String]] = js.native
    
    /**
      * Returns a list containing the moves of the current game.
      * Options is an optional parameter which may contain a 'verbose' flag.
      * See .moves() for a description of the verbose move fields.
      * @param options an optional parameter which may contain a 'verbose' flag.
      * @returns a list of all moves of the current game. They will be strings
      * if not passed the verbose flag.
      */
    def history(): js.Array[String] = js.native
    def history(options: Verbose): js.Array[String] = js.native
    /**
      * Returns a list containing the moves of the current game.
      * Options is an optional parameter which may contain a 'verbose' flag.
      * See .moves() for a description of the verbose move fields.
      * @param options an optional parameter which may contain a 'verbose' flag.
      * @returns a list of all moves of the current game. They will be strings
      * if not passed the verbose flag.
      */
    def history(options: `0`): js.Array[Move] = js.native
    def history(options: `1`): js.Array[Move | String] = js.native
    
    /**
      * Returns true or false if the side to move is in check.
      * @returns true or false if the side to move is in check.
      */
    def in_check(): Boolean = js.native
    
    /**
      * Returns true or false if the side to move has been checkmated.
      * @returns true or false if the side to move has been checkmated.
      */
    def in_checkmate(): Boolean = js.native
    
    /**
      * Returns true or false if the game is drawn (50-move rule or
      * insufficient material).
      * @returns true or false if the game is drawn (50-move rule or
      * insufficient material).
      */
    def in_draw(): Boolean = js.native
    
    /**
      * Returns true or false if the side to move has been stalemated.
      * @returns true or false if the side to move has been stalemated.
      */
    def in_stalemate(): Boolean = js.native
    
    /**
      * Returns true or false if the current board position has occurred three
      * or more times.
      * @returns true or false if the current board position has occurred three
      * or more times.
      */
    def in_threefold_repetition(): Boolean = js.native
    
    /**
      * Returns true if the game is drawn due to insufficient material
      * (K vs. K, K vs. KB, or K vs. KN); otherwise false.
      * @returns True if the game is drawn due to insufficient material
      * (K vs. K, K vs. KB, or K vs. KN); otherwise false.
      */
    def insufficient_material(): Boolean = js.native
    
    /**
      * The board is cleared, and the FEN string is loaded.
      * Returns true if the position was successfully loaded, otherwise false
      * @param fen the fen formatted string to load
      * @returns true if the position was successfully loaded, otherwise
      * false
      */
    def load(fen: String): Boolean = js.native
    
    /**
      * Load the moves of a game stored in Portable Game Notation.
      * @param pgn the pgn should be a string in Portable Game Notation.
      * @param options An optional object which may contain a string
      * newline_char and a boolean sloppy.
      * @returns The method will return true if the PGN was parsed successfully,
      * otherwise false.
      */
    def load_pgn(pgn: String): Boolean = js.native
    def load_pgn(pgn: String, options: Newlinechar): Boolean = js.native
    
    /**
      * Attempts to make a move on the board, returning a move object if the
      * move was legal, otherwise null.
      * The .move function can be called two ways, by passing a string in
      * Standard Algebraic Notation (SAN),
      * Or by passing .move() a move object (only the 'to', 'from', and when
      * necessary 'promotion', fields are needed).
      * @param move Must be either a string in Standard Algebraic Notation
      * (SAN), or a move object (only the 'to', 'from', and when necessary
      * 'promotion', fields are needed)
      * @param options An optional sloppy flag can be used to parse a variety of
      * non-standard move notations:
      * @returns The move as a full object is returned if the move was valid,
      * and the chess board's state changes.
      * If the move was invalid, null is returned and the state does not update.
      */
    def move(move: String): Move | Null = js.native
    def move(move: String, options: Sloppy): Move | Null = js.native
    def move(move: ShortMove): Move | Null = js.native
    def move(move: ShortMove, options: Sloppy): Move | Null = js.native
    
    /**
      * Returns a list of legal moves from the current position.
      * The function takes an optional parameter which controls the
      * single-square move generation and verbosity.
      * @param options an optional parameter which controls the single-square
      * move generation and verbosity.
      * @returns The list of all valid moves, either in SAN format, or as
      * verbose objects.
      */
    def moves(): js.Array[String] = js.native
    /**
      * Returns a list of legal moves from the current position.
      * The function takes an optional parameter which controls the
      * single-square move generation and verbosity.
      * @param options an optional parameter which controls the single-square
      * move generation and verbosity.
      * @returns The list of all valid moves, either in SAN format, or as
      * verbose objects.
      */
    def moves(options: Legal): js.Array[Move] = js.native
    def moves(options: typings.chessJs.anon.Piece): js.Array[String] = js.native
    def moves(options: typings.chessJs.anon.Square): js.Array[Move | String] = js.native
    
    /**
      * Returns the game in PGN format.
      * Options is an optional parameter which may include max width and/or a
      * newline character settings.
      * @param options optional object which may include max width and/or a
      * newline character settings.
      * @returns the current game state in PGN format.
      */
    def pgn(): String = js.native
    def pgn(options: Maxwidth): String = js.native
    
    /**
      * Place a piece on the square where piece is an object with the form
      * { type: ..., color: ... }.
      * put() will fail when passed an invalid piece or square, or when two
      * or more kings of the same color are placed.
      * @param piece the piece to put somewhere on the game board.
      * @param square the square on the chess board to place the piece at.
      * @returns true if the piece was successfully placed, otherwise, the
      * board remains unchanged and false is returned.
      */
    def put(piece: Piece, square: Square): Boolean = js.native
    
    /**
      * Remove and return the piece on square.
      * @param square the square to remove the piece from, e.g. "b6"
      * @returns null if no piece was removed, otherwise an object with the
      * removed piece's type and color.
      */
    def remove(square: Square): Piece | Null = js.native
    
    /**
      * Reset the board to the initial starting position.
      */
    def reset(): Unit = js.native
    
    def set_comment(comment: String): Unit = js.native
    
    /**
      * Returns the color of the square ('light' or 'dark').
      * @param square the square to check if it is light or dark.
      * @returns "light" if a light square, "dark" if a dark square, or null if
      * not a valid square.
      */
    def square_color(square: String): SquareColor | Null = js.native
    // This is a debugging utility, and is not documented in their readme.
    // So it is not included in these type definitions.
    // perft(depth: number): number,
    /**
      * Returns the color of the square ('light' or 'dark').
      * @param square the square to check if it is light or dark.
      * @returns "light" if a light square, "dark" if a dark square, or null if
      * not a valid square.
      */
    def square_color(square: Square): SquareColor = js.native
    
    /**
      * Returns the current side to move.
      * @returns "b" if Black is the side to move, otherwise "w" for White.
      */
    def turn(): PieceColor = js.native
    
    /**
      * Take back the last half-move, returning a move object if successful,
      * otherwise null.
      * @returns the move object that was undone if successful, otherwise null.
      */
    def undo(): Move | Null = js.native
    
    /**
      * Returns a validation object specifying validity or the errors found
      * within the FEN string.
      * @param fen the fen formatted string to validate
      */
    def validate_fen(fen: String): Error = js.native
  }
  
  trait Comment extends StObject {
    
    var comment: String
    
    var fen: String
  }
  object Comment {
    
    inline def apply(comment: String, fen: String): Comment = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], fen = fen.asInstanceOf[js.Any])
      __obj.asInstanceOf[Comment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setFen(value: String): Self = StObject.set(x, "fen", value.asInstanceOf[js.Any])
    }
  }
  
  trait Move
    extends StObject
       with ShortMove {
    
    /**
      * If an enemy piece was captured this is their type
      */
    var captured: js.UndefOr[Exclude[PieceType, k]] = js.undefined
    
    /**
      * The color of the piece that moved
      * - "b" for Black
      * - "w" for White
      */
    var color: PieceColor
    
    /** Flags indicating what occurred, combined into one string */
    var flags: String
    
    /**
      * The type of the piece that moved
      */
    var piece: PieceType
    
    /** The Standard Algebraic Notation (SAN) representation of the move */
    var san: String
  }
  object Move {
    
    inline def apply(color: PieceColor, flags: String, from: Square, piece: PieceType, san: String, to: Square): Move = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], piece = piece.asInstanceOf[js.Any], san = san.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[Move]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Move] (val x: Self) extends AnyVal {
      
      inline def setCaptured(value: Exclude[PieceType, k]): Self = StObject.set(x, "captured", value.asInstanceOf[js.Any])
      
      inline def setCapturedUndefined: Self = StObject.set(x, "captured", js.undefined)
      
      inline def setColor(value: PieceColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setPiece(value: PieceType): Self = StObject.set(x, "piece", value.asInstanceOf[js.Any])
      
      inline def setSan(value: String): Self = StObject.set(x, "san", value.asInstanceOf[js.Any])
    }
  }
  
  trait Piece extends StObject {
    
    /**
      * The color of the piece
      * - "b" for Black
      * - "w" for White
      */
    var color: PieceColor
    
    /**
      * The type of the piece to place
      */
    var `type`: PieceType
  }
  object Piece {
    
    inline def apply(color: PieceColor, `type`: PieceType): Piece = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Piece]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Piece] (val x: Self) extends AnyVal {
      
      inline def setColor(value: PieceColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setType(value: PieceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chessJs.chessJsStrings.b
    - typings.chessJs.chessJsStrings.w
  */
  trait PieceColor extends StObject
  object PieceColor {
    
    inline def b: typings.chessJs.chessJsStrings.b = "b".asInstanceOf[typings.chessJs.chessJsStrings.b]
    
    inline def w: typings.chessJs.chessJsStrings.w = "w".asInstanceOf[typings.chessJs.chessJsStrings.w]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chessJs.chessJsStrings.p
    - typings.chessJs.chessJsStrings.n
    - typings.chessJs.chessJsStrings.b
    - typings.chessJs.chessJsStrings.r
    - typings.chessJs.chessJsStrings.q
    - typings.chessJs.chessJsStrings.k
  */
  trait PieceType extends StObject
  object PieceType {
    
    inline def b: typings.chessJs.chessJsStrings.b = "b".asInstanceOf[typings.chessJs.chessJsStrings.b]
    
    inline def k: typings.chessJs.chessJsStrings.k = "k".asInstanceOf[typings.chessJs.chessJsStrings.k]
    
    inline def n: typings.chessJs.chessJsStrings.n = "n".asInstanceOf[typings.chessJs.chessJsStrings.n]
    
    inline def p: typings.chessJs.chessJsStrings.p = "p".asInstanceOf[typings.chessJs.chessJsStrings.p]
    
    inline def q: typings.chessJs.chessJsStrings.q = "q".asInstanceOf[typings.chessJs.chessJsStrings.q]
    
    inline def r: typings.chessJs.chessJsStrings.r = "r".asInstanceOf[typings.chessJs.chessJsStrings.r]
  }
  
  trait ShortMove extends StObject {
    
    /**
      * The location the piece is moving from.
      * Must be in san format, e.g "h8"
      */
    var from: Square
    
    /**
      * If this move results in a promotion, this will have the unit promotion.
      */
    var promotion: js.UndefOr[Exclude[PieceType, p | k]] = js.undefined
    
    /**
      * The location the piece is moving to.
      * Must be in san format, e.g "a1"
      */
    var to: Square
  }
  object ShortMove {
    
    inline def apply(from: Square, to: Square): ShortMove = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShortMove]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShortMove] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: Square): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setPromotion(value: Exclude[PieceType, p | k]): Self = StObject.set(x, "promotion", value.asInstanceOf[js.Any])
      
      inline def setPromotionUndefined: Self = StObject.set(x, "promotion", js.undefined)
      
      inline def setTo(value: Square): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chessJs.chessJsStrings.a8
    - typings.chessJs.chessJsStrings.b8
    - typings.chessJs.chessJsStrings.c8
    - typings.chessJs.chessJsStrings.d8
    - typings.chessJs.chessJsStrings.e8
    - typings.chessJs.chessJsStrings.f8
    - typings.chessJs.chessJsStrings.g8
    - typings.chessJs.chessJsStrings.h8
    - typings.chessJs.chessJsStrings.a7
    - typings.chessJs.chessJsStrings.b7
    - typings.chessJs.chessJsStrings.c7
    - typings.chessJs.chessJsStrings.d7
    - typings.chessJs.chessJsStrings.e7
    - typings.chessJs.chessJsStrings.f7
    - typings.chessJs.chessJsStrings.g7
    - typings.chessJs.chessJsStrings.h7
    - typings.chessJs.chessJsStrings.a6
    - typings.chessJs.chessJsStrings.b6
    - typings.chessJs.chessJsStrings.c6
    - typings.chessJs.chessJsStrings.d6
    - typings.chessJs.chessJsStrings.e6
    - typings.chessJs.chessJsStrings.f6
    - typings.chessJs.chessJsStrings.g6
    - typings.chessJs.chessJsStrings.h6
    - typings.chessJs.chessJsStrings.a5
    - typings.chessJs.chessJsStrings.b5
    - typings.chessJs.chessJsStrings.c5
    - typings.chessJs.chessJsStrings.d5
    - typings.chessJs.chessJsStrings.e5
    - typings.chessJs.chessJsStrings.f5
    - typings.chessJs.chessJsStrings.g5
    - typings.chessJs.chessJsStrings.h5
    - typings.chessJs.chessJsStrings.a4
    - typings.chessJs.chessJsStrings.b4
    - typings.chessJs.chessJsStrings.c4
    - typings.chessJs.chessJsStrings.d4
    - typings.chessJs.chessJsStrings.e4
    - typings.chessJs.chessJsStrings.f4
    - typings.chessJs.chessJsStrings.g4
    - typings.chessJs.chessJsStrings.h4
    - typings.chessJs.chessJsStrings.a3
    - typings.chessJs.chessJsStrings.b3
    - typings.chessJs.chessJsStrings.c3
    - typings.chessJs.chessJsStrings.d3
    - typings.chessJs.chessJsStrings.e3
    - typings.chessJs.chessJsStrings.f3
    - typings.chessJs.chessJsStrings.g3
    - typings.chessJs.chessJsStrings.h3
    - typings.chessJs.chessJsStrings.a2
    - typings.chessJs.chessJsStrings.b2
    - typings.chessJs.chessJsStrings.c2
    - typings.chessJs.chessJsStrings.d2
    - typings.chessJs.chessJsStrings.e2
    - typings.chessJs.chessJsStrings.f2
    - typings.chessJs.chessJsStrings.g2
    - typings.chessJs.chessJsStrings.h2
    - typings.chessJs.chessJsStrings.a1
    - typings.chessJs.chessJsStrings.b1
    - typings.chessJs.chessJsStrings.c1
    - typings.chessJs.chessJsStrings.d1
    - typings.chessJs.chessJsStrings.e1
    - typings.chessJs.chessJsStrings.f1
    - typings.chessJs.chessJsStrings.g1
    - typings.chessJs.chessJsStrings.h1
  */
  trait Square extends StObject
  object Square {
    
    inline def a1: typings.chessJs.chessJsStrings.a1 = "a1".asInstanceOf[typings.chessJs.chessJsStrings.a1]
    
    inline def a2: typings.chessJs.chessJsStrings.a2 = "a2".asInstanceOf[typings.chessJs.chessJsStrings.a2]
    
    inline def a3: typings.chessJs.chessJsStrings.a3 = "a3".asInstanceOf[typings.chessJs.chessJsStrings.a3]
    
    inline def a4: typings.chessJs.chessJsStrings.a4 = "a4".asInstanceOf[typings.chessJs.chessJsStrings.a4]
    
    inline def a5: typings.chessJs.chessJsStrings.a5 = "a5".asInstanceOf[typings.chessJs.chessJsStrings.a5]
    
    inline def a6: typings.chessJs.chessJsStrings.a6 = "a6".asInstanceOf[typings.chessJs.chessJsStrings.a6]
    
    inline def a7: typings.chessJs.chessJsStrings.a7 = "a7".asInstanceOf[typings.chessJs.chessJsStrings.a7]
    
    inline def a8: typings.chessJs.chessJsStrings.a8 = "a8".asInstanceOf[typings.chessJs.chessJsStrings.a8]
    
    inline def b1: typings.chessJs.chessJsStrings.b1 = "b1".asInstanceOf[typings.chessJs.chessJsStrings.b1]
    
    inline def b2: typings.chessJs.chessJsStrings.b2 = "b2".asInstanceOf[typings.chessJs.chessJsStrings.b2]
    
    inline def b3: typings.chessJs.chessJsStrings.b3 = "b3".asInstanceOf[typings.chessJs.chessJsStrings.b3]
    
    inline def b4: typings.chessJs.chessJsStrings.b4 = "b4".asInstanceOf[typings.chessJs.chessJsStrings.b4]
    
    inline def b5: typings.chessJs.chessJsStrings.b5 = "b5".asInstanceOf[typings.chessJs.chessJsStrings.b5]
    
    inline def b6: typings.chessJs.chessJsStrings.b6 = "b6".asInstanceOf[typings.chessJs.chessJsStrings.b6]
    
    inline def b7: typings.chessJs.chessJsStrings.b7 = "b7".asInstanceOf[typings.chessJs.chessJsStrings.b7]
    
    inline def b8: typings.chessJs.chessJsStrings.b8 = "b8".asInstanceOf[typings.chessJs.chessJsStrings.b8]
    
    inline def c1: typings.chessJs.chessJsStrings.c1 = "c1".asInstanceOf[typings.chessJs.chessJsStrings.c1]
    
    inline def c2: typings.chessJs.chessJsStrings.c2 = "c2".asInstanceOf[typings.chessJs.chessJsStrings.c2]
    
    inline def c3: typings.chessJs.chessJsStrings.c3 = "c3".asInstanceOf[typings.chessJs.chessJsStrings.c3]
    
    inline def c4: typings.chessJs.chessJsStrings.c4 = "c4".asInstanceOf[typings.chessJs.chessJsStrings.c4]
    
    inline def c5: typings.chessJs.chessJsStrings.c5 = "c5".asInstanceOf[typings.chessJs.chessJsStrings.c5]
    
    inline def c6: typings.chessJs.chessJsStrings.c6 = "c6".asInstanceOf[typings.chessJs.chessJsStrings.c6]
    
    inline def c7: typings.chessJs.chessJsStrings.c7 = "c7".asInstanceOf[typings.chessJs.chessJsStrings.c7]
    
    inline def c8: typings.chessJs.chessJsStrings.c8 = "c8".asInstanceOf[typings.chessJs.chessJsStrings.c8]
    
    inline def d1: typings.chessJs.chessJsStrings.d1 = "d1".asInstanceOf[typings.chessJs.chessJsStrings.d1]
    
    inline def d2: typings.chessJs.chessJsStrings.d2 = "d2".asInstanceOf[typings.chessJs.chessJsStrings.d2]
    
    inline def d3: typings.chessJs.chessJsStrings.d3 = "d3".asInstanceOf[typings.chessJs.chessJsStrings.d3]
    
    inline def d4: typings.chessJs.chessJsStrings.d4 = "d4".asInstanceOf[typings.chessJs.chessJsStrings.d4]
    
    inline def d5: typings.chessJs.chessJsStrings.d5 = "d5".asInstanceOf[typings.chessJs.chessJsStrings.d5]
    
    inline def d6: typings.chessJs.chessJsStrings.d6 = "d6".asInstanceOf[typings.chessJs.chessJsStrings.d6]
    
    inline def d7: typings.chessJs.chessJsStrings.d7 = "d7".asInstanceOf[typings.chessJs.chessJsStrings.d7]
    
    inline def d8: typings.chessJs.chessJsStrings.d8 = "d8".asInstanceOf[typings.chessJs.chessJsStrings.d8]
    
    inline def e1: typings.chessJs.chessJsStrings.e1 = "e1".asInstanceOf[typings.chessJs.chessJsStrings.e1]
    
    inline def e2: typings.chessJs.chessJsStrings.e2 = "e2".asInstanceOf[typings.chessJs.chessJsStrings.e2]
    
    inline def e3: typings.chessJs.chessJsStrings.e3 = "e3".asInstanceOf[typings.chessJs.chessJsStrings.e3]
    
    inline def e4: typings.chessJs.chessJsStrings.e4 = "e4".asInstanceOf[typings.chessJs.chessJsStrings.e4]
    
    inline def e5: typings.chessJs.chessJsStrings.e5 = "e5".asInstanceOf[typings.chessJs.chessJsStrings.e5]
    
    inline def e6: typings.chessJs.chessJsStrings.e6 = "e6".asInstanceOf[typings.chessJs.chessJsStrings.e6]
    
    inline def e7: typings.chessJs.chessJsStrings.e7 = "e7".asInstanceOf[typings.chessJs.chessJsStrings.e7]
    
    inline def e8: typings.chessJs.chessJsStrings.e8 = "e8".asInstanceOf[typings.chessJs.chessJsStrings.e8]
    
    inline def f1: typings.chessJs.chessJsStrings.f1 = "f1".asInstanceOf[typings.chessJs.chessJsStrings.f1]
    
    inline def f2: typings.chessJs.chessJsStrings.f2 = "f2".asInstanceOf[typings.chessJs.chessJsStrings.f2]
    
    inline def f3: typings.chessJs.chessJsStrings.f3 = "f3".asInstanceOf[typings.chessJs.chessJsStrings.f3]
    
    inline def f4: typings.chessJs.chessJsStrings.f4 = "f4".asInstanceOf[typings.chessJs.chessJsStrings.f4]
    
    inline def f5: typings.chessJs.chessJsStrings.f5 = "f5".asInstanceOf[typings.chessJs.chessJsStrings.f5]
    
    inline def f6: typings.chessJs.chessJsStrings.f6 = "f6".asInstanceOf[typings.chessJs.chessJsStrings.f6]
    
    inline def f7: typings.chessJs.chessJsStrings.f7 = "f7".asInstanceOf[typings.chessJs.chessJsStrings.f7]
    
    inline def f8: typings.chessJs.chessJsStrings.f8 = "f8".asInstanceOf[typings.chessJs.chessJsStrings.f8]
    
    inline def g1: typings.chessJs.chessJsStrings.g1 = "g1".asInstanceOf[typings.chessJs.chessJsStrings.g1]
    
    inline def g2: typings.chessJs.chessJsStrings.g2 = "g2".asInstanceOf[typings.chessJs.chessJsStrings.g2]
    
    inline def g3: typings.chessJs.chessJsStrings.g3 = "g3".asInstanceOf[typings.chessJs.chessJsStrings.g3]
    
    inline def g4: typings.chessJs.chessJsStrings.g4 = "g4".asInstanceOf[typings.chessJs.chessJsStrings.g4]
    
    inline def g5: typings.chessJs.chessJsStrings.g5 = "g5".asInstanceOf[typings.chessJs.chessJsStrings.g5]
    
    inline def g6: typings.chessJs.chessJsStrings.g6 = "g6".asInstanceOf[typings.chessJs.chessJsStrings.g6]
    
    inline def g7: typings.chessJs.chessJsStrings.g7 = "g7".asInstanceOf[typings.chessJs.chessJsStrings.g7]
    
    inline def g8: typings.chessJs.chessJsStrings.g8 = "g8".asInstanceOf[typings.chessJs.chessJsStrings.g8]
    
    inline def h1: typings.chessJs.chessJsStrings.h1 = "h1".asInstanceOf[typings.chessJs.chessJsStrings.h1]
    
    inline def h2: typings.chessJs.chessJsStrings.h2 = "h2".asInstanceOf[typings.chessJs.chessJsStrings.h2]
    
    inline def h3: typings.chessJs.chessJsStrings.h3 = "h3".asInstanceOf[typings.chessJs.chessJsStrings.h3]
    
    inline def h4: typings.chessJs.chessJsStrings.h4 = "h4".asInstanceOf[typings.chessJs.chessJsStrings.h4]
    
    inline def h5: typings.chessJs.chessJsStrings.h5 = "h5".asInstanceOf[typings.chessJs.chessJsStrings.h5]
    
    inline def h6: typings.chessJs.chessJsStrings.h6 = "h6".asInstanceOf[typings.chessJs.chessJsStrings.h6]
    
    inline def h7: typings.chessJs.chessJsStrings.h7 = "h7".asInstanceOf[typings.chessJs.chessJsStrings.h7]
    
    inline def h8: typings.chessJs.chessJsStrings.h8 = "h8".asInstanceOf[typings.chessJs.chessJsStrings.h8]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chessJs.chessJsStrings.light
    - typings.chessJs.chessJsStrings.dark
  */
  trait SquareColor extends StObject
  object SquareColor {
    
    inline def dark: typings.chessJs.chessJsStrings.dark = "dark".asInstanceOf[typings.chessJs.chessJsStrings.dark]
    
    inline def light: typings.chessJs.chessJsStrings.light = "light".asInstanceOf[typings.chessJs.chessJsStrings.light]
  }
}
