package typings
package chessDotJsLib.chessDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChessInstance extends js.Object {
  /** The string that represents a Bishop */
  val BISHOP: chessDotJsLib.chessDotJsLibStrings.b = js.native
  /** The string that represents the Black color side */
  val BLACK: chessDotJsLib.chessDotJsLibStrings.b = js.native
  /** Flags used to build flag strings for moves */
  val FLAGS: chessDotJsLib.Anon_CAPTURE = js.native
  /** The string that represents a King */
  val KING: chessDotJsLib.chessDotJsLibStrings.k = js.native
  /** The string that represents a Knight */
  val KNIGHT: chessDotJsLib.chessDotJsLibStrings.n = js.native
  /** The string that represents a Pawn */
  val PAWN: chessDotJsLib.chessDotJsLibStrings.p = js.native
  /** The string that represents a Queen */
  val QUEEN: chessDotJsLib.chessDotJsLibStrings.q = js.native
  /** The string that represents a Rook */
  val ROOK: chessDotJsLib.chessDotJsLibStrings.r = js.native
  /** A list of all the squares in the game, from "a1" to "h8" */
  val SQUARES: js.Array[js.Any] = js.native
  /** The string that represents the White color side */
  val WHITE: chessDotJsLib.chessDotJsLibStrings.w = js.native
  /**
       * Returns a string containing an ASCII diagram of the current position.
       * @returns A string containing an ASCII diagram of the current position.
       */
  def ascii(): java.lang.String = js.native
  /**
       * Clears the board of all pieces.
       */
  def clear(): scala.Unit = js.native
  /**
       * Returns the FEN string for the current position.
       * @returns the FEN string for the current position.
       */
  def fen(): java.lang.String = js.native
  /**
       * Returns true if the game has ended via checkmate, stalemate, draw,
       * threefold repetition, or insufficient material.
       * Otherwise, returns false.
       * @returns True if the game has ended via checkmate, stalemate, draw,
       * threefold repetition, or insufficient material. Otherwise, returns
       * false.
       */
  def game_over(): scala.Boolean = js.native
  /**
       * Returns the piece on the square
       * @param square the square to get the piece on.
       * @returns null if no piece is on that square, or it is not a valid
       * square. Otherwise a piece object.
       */
  def get(square: Square): Piece | scala.Null = js.native
  /**
       * Allows header information to be added to PGN output.
       * Any number of key/value pairs can be passed to .header(), with each
       * first arg being treated as a header key, and each second as the value.
       * @param args (optional) Header pairs to store in the header.
       * @returns The current header information after storing any values.
       */
  def header(args: java.lang.String*): ScalablyTyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] = js.native
  /**
       * Returns a list containing the moves of the current game.
       * Options is an optional parameter which may contain a 'verbose' flag.
       * See .moves() for a description of the verbose move fields.
       * @param options an optional parameter which may contain a 'verbose' flag.
       * @returns a list of all moves of the current game. They will be strings
       * if not passed the verbose flag.
       */
  def history(): js.Array[java.lang.String] = js.native
  /**
       * Returns a list containing the moves of the current game.
       * Options is an optional parameter which may contain a 'verbose' flag.
       * See .moves() for a description of the verbose move fields.
       * @param options an optional parameter which may contain a 'verbose' flag.
       * @returns a list of all moves of the current game. They will be strings
       * if not passed the verbose flag.
       */
  def history(options: chessDotJsLib.Anon_Verbose): js.Array[java.lang.String] = js.native
  /**
       * Returns a list containing the moves of the current game.
       * Options is an optional parameter which may contain a 'verbose' flag.
       * See .moves() for a description of the verbose move fields.
       * @param options an optional parameter which may contain a 'verbose' flag.
       * @returns a list of all moves of the current game. They will be strings
       * if not passed the verbose flag.
       */
  def history(options: chessDotJsLib.Anon_VerboseBoolean): js.Array[java.lang.String] | js.Array[Move] = js.native
  /**
       * Returns a list containing the moves of the current game.
       * Options is an optional parameter which may contain a 'verbose' flag.
       * See .moves() for a description of the verbose move fields.
       * @param options an optional parameter which may contain a 'verbose' flag.
       * @returns a list of all moves of the current game. They will be strings
       * if not passed the verbose flag.
       */
  def history(options: chessDotJsLib.Anon_VerboseTrue): js.Array[Move] = js.native
  /**
       * Returns a list containing the moves of the current game.
       * Options is an optional parameter which may contain a 'verbose' flag.
       * See .moves() for a description of the verbose move fields.
       * @param options an optional parameter which may contain a 'verbose' flag.
       * @returns a list of all moves of the current game. They will be strings
       * if not passed the verbose flag.
       */
  @JSName("history")
  def `history_<union>`(): js.Array[java.lang.String] | js.Array[Move] = js.native
  /**
       * Returns true or false if the side to move is in check.
       * @returns true or false if the side to move is in check.
       */
  def in_check(): scala.Boolean = js.native
  /**
       * Returns true or false if the side to move has been checkmated.
       * @returns true or false if the side to move has been checkmated.
       */
  def in_checkmate(): scala.Boolean = js.native
  /**
       * Returns true or false if the game is drawn (50-move rule or
       * insufficient material).
       * @returns true or false if the game is drawn (50-move rule or
       * insufficient material).
       */
  def in_draw(): scala.Boolean = js.native
  /**
       * Returns true or false if the side to move has been stalemated.
       * @returns true or false if the side to move has been stalemated.
       */
  def in_stalemate(): scala.Boolean = js.native
  /**
       * Returns true or false if the current board position has occurred three
       * or more times.
       * @returns true or false if the current board position has occurred three
       * or more times.
       */
  def in_threefold_repetition(): scala.Boolean = js.native
  /**
       * Returns true if the game is drawn due to insufficient material
       * (K vs. K, K vs. KB, or K vs. KN); otherwise false.
       * @returns True if the game is drawn due to insufficient material
       * (K vs. K, K vs. KB, or K vs. KN); otherwise false.
       */
  def insufficient_material(): scala.Boolean = js.native
  /**
       * The board is cleared, and the FEN string is loaded.
       * Returns true if the position was successfully loaded, otherwise false
       * @param fen the fen formatted string to load
       * @returns true if the position was successfully loaded, otherwise
       * false
       */
  def load(fen: java.lang.String): scala.Boolean = js.native
  /**
       * Load the moves of a game stored in Portable Game Notation.
       * @param pgn the pgn should be a string in Portable Game Notation.
       * @param options An optional object which may contain a string
       * newline_char and a boolean sloppy.
       * @returns The method will return true if the PGN was parsed successfully,
       * otherwise false.
       */
  def load_pgn(pgn: java.lang.String): scala.Boolean = js.native
  /**
       * Load the moves of a game stored in Portable Game Notation.
       * @param pgn the pgn should be a string in Portable Game Notation.
       * @param options An optional object which may contain a string
       * newline_char and a boolean sloppy.
       * @returns The method will return true if the PGN was parsed successfully,
       * otherwise false.
       */
  def load_pgn(pgn: java.lang.String, options: chessDotJsLib.Anon_Newlinechar): scala.Boolean = js.native
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
  def move(move: ShortMove): Move | scala.Null = js.native
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
  def move(move: ShortMove, options: chessDotJsLib.Anon_Sloppy): Move | scala.Null = js.native
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
  def move(move: java.lang.String): Move | scala.Null = js.native
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
  def move(move: java.lang.String, options: chessDotJsLib.Anon_Sloppy): Move | scala.Null = js.native
  /**
       * Returns a list of legal moves from the current position.
       * The function takes an optional parameter which controls the
       * single-square move generation and verbosity.
       * @param options an optional parameter which controls the single-square
       * move generation and verbosity.
       * @returns The list of all valid moves, either in SAN format, or as
       * verbose objects.
       */
  def moves(): js.Array[java.lang.String] = js.native
  /**
       * Returns a list of legal moves from the current position.
       * The function takes an optional parameter which controls the
       * single-square move generation and verbosity.
       * @param options an optional parameter which controls the single-square
       * move generation and verbosity.
       * @returns The list of all valid moves, either in SAN format, or as
       * verbose objects.
       */
  def moves(options: chessDotJsLib.Anon_Square): js.Array[Move] = js.native
  /**
       * Returns a list of legal moves from the current position.
       * The function takes an optional parameter which controls the
       * single-square move generation and verbosity.
       * @param options an optional parameter which controls the single-square
       * move generation and verbosity.
       * @returns The list of all valid moves, either in SAN format, or as
       * verbose objects.
       */
  def moves(options: chessDotJsLib.Anon_SquareVerbose): js.Array[java.lang.String] = js.native
  /**
       * Returns a list of legal moves from the current position.
       * The function takes an optional parameter which controls the
       * single-square move generation and verbosity.
       * @param options an optional parameter which controls the single-square
       * move generation and verbosity.
       * @returns The list of all valid moves, either in SAN format, or as
       * verbose objects.
       */
  def moves(options: chessDotJsLib.Anon_SquareVerboseString): js.Array[java.lang.String] | js.Array[Move] = js.native
  /**
       * Returns a list of legal moves from the current position.
       * The function takes an optional parameter which controls the
       * single-square move generation and verbosity.
       * @param options an optional parameter which controls the single-square
       * move generation and verbosity.
       * @returns The list of all valid moves, either in SAN format, or as
       * verbose objects.
       */
  @JSName("moves")
  def `moves_<union>`(): js.Array[java.lang.String] | js.Array[Move] = js.native
  /**
       * Returns the game in PGN format.
       * Options is an optional parameter which may include max width and/or a
       * newline character settings.
       * @param options optional object which may include max width and/or a
       * newline character settings.
       * @returns the current game state in PGN format.
       */
  def pgn(): java.lang.String = js.native
  /**
       * Returns the game in PGN format.
       * Options is an optional parameter which may include max width and/or a
       * newline character settings.
       * @param options optional object which may include max width and/or a
       * newline character settings.
       * @returns the current game state in PGN format.
       */
  def pgn(options: chessDotJsLib.Anon_Maxwidth): java.lang.String = js.native
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
  def put(piece: Piece, square: Square): scala.Boolean = js.native
  /**
       * Remove and return the piece on square.
       * @param square the square to remove the piece from, e.g. "b6"
       * @returns null if no piece was removed, otherwise an object with the
       * removed piece's type and color.
       */
  def remove(square: Square): Piece | scala.Null = js.native
  /**
       * Reset the board to the initial starting position.
       */
  def reset(): scala.Unit = js.native
  // This is a debugging utility, and is not documented in their readme.
  // So it is not included in these type definitions.
  // perft(depth: number): number,
  /**
       * Returns the color of the square ('light' or 'dark').
       * @param square the square to check if it is light or dark.
       * @returns "light" if a light square, "dark" if a dark square, or null if
       * not a valid square.
       */
  def square_color(square: Square | java.lang.String): chessDotJsLib.chessDotJsLibStrings.light | chessDotJsLib.chessDotJsLibStrings.dark = js.native
  /**
       * Returns the current side to move.
       * @returns "b" if Black is the side to move, otherwise "w" for White.
       */
  def turn(): chessDotJsLib.chessDotJsLibStrings.b | chessDotJsLib.chessDotJsLibStrings.w = js.native
  /**
       * Take back the last half-move, returning a move object if successful,
       * otherwise null.
       * @returns the move object that was undone if successful, otherwise null.
       */
  def undo(): Move | scala.Null = js.native
  /**
       * Returns a validation object specifying validity or the errors found
       * within the FEN string.
       * @param fen the fen formatted string to validate
       */
  def validate_fen(fen: java.lang.String): chessDotJsLib.Anon_Errornumber = js.native
}

