package typings.chessJs

import typings.chessJs.chessJsBooleans.`false`
import typings.chessJs.chessJsBooleans.`true`
import typings.chessJs.mod.PieceColor
import typings.chessJs.mod.PieceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    /**
      * Pass true if you want this function to output verbose objects
      * instead of strings.
      */
    var verbose: `true`
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(verbose = true)
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setVerbose(value: `true`): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
  
  trait `1` extends StObject {
    
    /**
      * Pass true if you want this function to output verbose objects
      * instead of strings.
      */
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object `1` {
    
    inline def apply(): `1` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  trait Color extends StObject {
    
    var color: PieceColor
    
    var square: typings.chessJs.mod.Square
    
    var `type`: PieceType
  }
  object Color {
    
    inline def apply(color: PieceColor, square: typings.chessJs.mod.Square, `type`: PieceType): Color = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], square = square.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
      
      inline def setColor(value: PieceColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setSquare(value: typings.chessJs.mod.Square): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
      
      inline def setType(value: PieceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    /**
      * The string "No errors." if valid. Otherwise a string explaining why
      * it is not valid.
      */
    var error: String
    
    /**
      * If not valid, then this will a type of error used internally in
      * chess.js. Otherwise 0.
      */
    var error_number: Double
    
    /** Indicates if the fen is valid or not. */
    var valid: Boolean
  }
  object Error {
    
    inline def apply(error: String, error_number: Double, valid: Boolean): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], error_number = error_number.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setError_number(value: Double): Self = StObject.set(x, "error_number", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
  trait Legal extends StObject {
    
    /**
      * Set to true to return return pseudo-legal moves (this includes moves that allow the king
      * to be captured)
      */
    var legal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Only return moves of given piece
      */
    var piece: js.UndefOr[PieceType] = js.undefined
    
    /**
      * The string to test if it is a valid move, if it is not then an
      * empty array is returned
      */
    var square: js.UndefOr[String] = js.undefined
    
    /** Set to true to return verbose move objects instead of strings */
    var verbose: `true`
  }
  object Legal {
    
    inline def apply(): Legal = {
      val __obj = js.Dynamic.literal(verbose = true)
      __obj.asInstanceOf[Legal]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Legal] (val x: Self) extends AnyVal {
      
      inline def setLegal(value: Boolean): Self = StObject.set(x, "legal", value.asInstanceOf[js.Any])
      
      inline def setLegalUndefined: Self = StObject.set(x, "legal", js.undefined)
      
      inline def setPiece(value: PieceType): Self = StObject.set(x, "piece", value.asInstanceOf[js.Any])
      
      inline def setPieceUndefined: Self = StObject.set(x, "piece", js.undefined)
      
      inline def setSquare(value: String): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
      
      inline def setSquareUndefined: Self = StObject.set(x, "square", js.undefined)
      
      inline def setVerbose(value: `true`): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
  
  trait Maxwidth extends StObject {
    
    /** the maximum width of a line */
    var max_width: js.UndefOr[Double] = js.undefined
    
    /** Specific newline character */
    var newline_char: js.UndefOr[String] = js.undefined
  }
  object Maxwidth {
    
    inline def apply(): Maxwidth = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Maxwidth]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Maxwidth] (val x: Self) extends AnyVal {
      
      inline def setMax_width(value: Double): Self = StObject.set(x, "max_width", value.asInstanceOf[js.Any])
      
      inline def setMax_widthUndefined: Self = StObject.set(x, "max_width", js.undefined)
      
      inline def setNewline_char(value: String): Self = StObject.set(x, "newline_char", value.asInstanceOf[js.Any])
      
      inline def setNewline_charUndefined: Self = StObject.set(x, "newline_char", js.undefined)
    }
  }
  
  trait Newlinechar extends StObject {
    
    /**
      * The newline_char is a string representation of a valid RegExp
      * fragment and is used to process the PGN.
      * It defaults to \r?\n.
      * Special characters should not be pre-escaped, but any literal
      * special characters should be escaped as is normal for a RegExp.
      * Keep in mind that backslashes in JavaScript strings must
      * themselves be escaped.
      * Avoid using a newline_char that may occur elsewhere in a PGN,
      * such as . or x, as this will result in unexpected behavior.
      */
    var newline_char: js.UndefOr[String] = js.undefined
    
    /**
      * The sloppy flag is a boolean that permits chess.js to parse moves in
      * non-standard notations.
      * See .move documentation for more information about non-SAN
      * notations.
      */
    var sloppy: js.UndefOr[Boolean] = js.undefined
  }
  object Newlinechar {
    
    inline def apply(): Newlinechar = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Newlinechar]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Newlinechar] (val x: Self) extends AnyVal {
      
      inline def setNewline_char(value: String): Self = StObject.set(x, "newline_char", value.asInstanceOf[js.Any])
      
      inline def setNewline_charUndefined: Self = StObject.set(x, "newline_char", js.undefined)
      
      inline def setSloppy(value: Boolean): Self = StObject.set(x, "sloppy", value.asInstanceOf[js.Any])
      
      inline def setSloppyUndefined: Self = StObject.set(x, "sloppy", js.undefined)
    }
  }
  
  trait Piece extends StObject {
    
    /**
      * Set to true to return return pseudo-legal moves (this includes moves that allow the king
      * to be captured)
      */
    var legal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Only return moves of given piece
      */
    var piece: js.UndefOr[PieceType] = js.undefined
    
    /**
      * The string to test if it is a valid move, if it is not then an
      * empty array is returned
      */
    var square: js.UndefOr[String] = js.undefined
    
    /** Set to true to return verbose move objects instead of strings */
    var verbose: js.UndefOr[`false`] = js.undefined
  }
  object Piece {
    
    inline def apply(): Piece = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Piece]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Piece] (val x: Self) extends AnyVal {
      
      inline def setLegal(value: Boolean): Self = StObject.set(x, "legal", value.asInstanceOf[js.Any])
      
      inline def setLegalUndefined: Self = StObject.set(x, "legal", js.undefined)
      
      inline def setPiece(value: PieceType): Self = StObject.set(x, "piece", value.asInstanceOf[js.Any])
      
      inline def setPieceUndefined: Self = StObject.set(x, "piece", js.undefined)
      
      inline def setSquare(value: String): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
      
      inline def setSquareUndefined: Self = StObject.set(x, "square", js.undefined)
      
      inline def setVerbose(value: `false`): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  trait Sloppy extends StObject {
    
    /**
      * An optional sloppy flag can be used to parse a variety of
      * non-standard move notations.
      */
    var sloppy: js.UndefOr[Boolean] = js.undefined
  }
  object Sloppy {
    
    inline def apply(): Sloppy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Sloppy]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Sloppy] (val x: Self) extends AnyVal {
      
      inline def setSloppy(value: Boolean): Self = StObject.set(x, "sloppy", value.asInstanceOf[js.Any])
      
      inline def setSloppyUndefined: Self = StObject.set(x, "sloppy", js.undefined)
    }
  }
  
  trait Square extends StObject {
    
    /**
      * Set to true to return return pseudo-legal moves (this includes moves that allow the king
      * to be captured)
      */
    var legal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Only return moves of given piece
      */
    var piece: js.UndefOr[PieceType] = js.undefined
    
    /**
      * The string to test if it is a valid move, if it is not then an
      * empty array is returned
      */
    var square: js.UndefOr[String] = js.undefined
    
    /** Set to true to return verbose move objects instead of strings */
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object Square {
    
    inline def apply(): Square = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Square]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Square] (val x: Self) extends AnyVal {
      
      inline def setLegal(value: Boolean): Self = StObject.set(x, "legal", value.asInstanceOf[js.Any])
      
      inline def setLegalUndefined: Self = StObject.set(x, "legal", js.undefined)
      
      inline def setPiece(value: PieceType): Self = StObject.set(x, "piece", value.asInstanceOf[js.Any])
      
      inline def setPieceUndefined: Self = StObject.set(x, "piece", js.undefined)
      
      inline def setSquare(value: String): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
      
      inline def setSquareUndefined: Self = StObject.set(x, "square", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  trait Verbose extends StObject {
    
    /**
      * Pass true if you want this function to output verbose objects
      * instead of strings.
      */
    var verbose: js.UndefOr[`false`] = js.undefined
  }
  object Verbose {
    
    inline def apply(): Verbose = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Verbose]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Verbose] (val x: Self) extends AnyVal {
      
      inline def setVerbose(value: `false`): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
