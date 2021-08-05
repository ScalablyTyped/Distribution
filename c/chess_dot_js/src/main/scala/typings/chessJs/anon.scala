package typings.chessJs

import typings.chessJs.chessJsBooleans.`false`
import typings.chessJs.chessJsBooleans.`true`
import typings.chessJs.chessJsStrings.b
import typings.chessJs.chessJsStrings.c
import typings.chessJs.chessJsStrings.e
import typings.chessJs.chessJsStrings.k
import typings.chessJs.chessJsStrings.n
import typings.chessJs.chessJsStrings.p
import typings.chessJs.chessJsStrings.q
import typings.chessJs.chessJsStrings.w
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
    var verbose: js.UndefOr[`false`] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setVerbose(value: `false`): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  trait `1` extends StObject {
    
    /**
      * Pass true if you want this function to output verbose objects
      * instead of strings.
      */
    var verbose: `true`
  }
  object `1` {
    
    inline def apply(): `1` = {
      val __obj = js.Dynamic.literal(verbose = true)
      __obj.asInstanceOf[`1`]
    }
    
    extension [Self <: `1`](x: Self) {
      
      inline def setVerbose(value: `true`): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
  
  trait `2` extends StObject {
    
    /**
      * Pass true if you want this function to output verbose objects
      * instead of strings.
      */
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object `2` {
    
    inline def apply(): `2` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`2`]
    }
    
    extension [Self <: `2`](x: Self) {
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  trait BIGPAWN extends StObject {
    
    /** a pawn push of two squares */
    var BIG_PAWN: b
    
    /** a standard capture */
    var CAPTURE: c
    
    /** an en passant capture */
    var EP_CAPTURE: e
    
    /** kingside castling */
    var KSIDE_CASTLE: k
    
    /** a non-capture */
    var NORMAL: n
    
    /** a promotion */
    var PROMOTION: p
    
    /** queenside castling */
    var QSIDE_CASTLE: q
  }
  object BIGPAWN {
    
    inline def apply(): BIGPAWN = {
      val __obj = js.Dynamic.literal(BIG_PAWN = "b", CAPTURE = "c", EP_CAPTURE = "e", KSIDE_CASTLE = "k", NORMAL = "n", PROMOTION = "p", QSIDE_CASTLE = "q")
      __obj.asInstanceOf[BIGPAWN]
    }
    
    extension [Self <: BIGPAWN](x: Self) {
      
      inline def setBIG_PAWN(value: b): Self = StObject.set(x, "BIG_PAWN", value.asInstanceOf[js.Any])
      
      inline def setCAPTURE(value: c): Self = StObject.set(x, "CAPTURE", value.asInstanceOf[js.Any])
      
      inline def setEP_CAPTURE(value: e): Self = StObject.set(x, "EP_CAPTURE", value.asInstanceOf[js.Any])
      
      inline def setKSIDE_CASTLE(value: k): Self = StObject.set(x, "KSIDE_CASTLE", value.asInstanceOf[js.Any])
      
      inline def setNORMAL(value: n): Self = StObject.set(x, "NORMAL", value.asInstanceOf[js.Any])
      
      inline def setPROMOTION(value: p): Self = StObject.set(x, "PROMOTION", value.asInstanceOf[js.Any])
      
      inline def setQSIDE_CASTLE(value: q): Self = StObject.set(x, "QSIDE_CASTLE", value.asInstanceOf[js.Any])
    }
  }
  
  trait Color extends StObject {
    
    var color: w | b
    
    var `type`: PieceType
  }
  object Color {
    
    inline def apply(color: w | b, `type`: PieceType): Color = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color]
    }
    
    extension [Self <: Color](x: Self) {
      
      inline def setColor(value: w | b): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
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
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setError_number(value: Double): Self = StObject.set(x, "error_number", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
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
    
    extension [Self <: Maxwidth](x: Self) {
      
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
    
    extension [Self <: Newlinechar](x: Self) {
      
      inline def setNewline_char(value: String): Self = StObject.set(x, "newline_char", value.asInstanceOf[js.Any])
      
      inline def setNewline_charUndefined: Self = StObject.set(x, "newline_char", js.undefined)
      
      inline def setSloppy(value: Boolean): Self = StObject.set(x, "sloppy", value.asInstanceOf[js.Any])
      
      inline def setSloppyUndefined: Self = StObject.set(x, "sloppy", js.undefined)
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
    
    extension [Self <: Sloppy](x: Self) {
      
      inline def setSloppy(value: Boolean): Self = StObject.set(x, "sloppy", value.asInstanceOf[js.Any])
      
      inline def setSloppyUndefined: Self = StObject.set(x, "sloppy", js.undefined)
    }
  }
  
  trait Square extends StObject {
    
    /**
      * The string to test if it is a valid move, if it is not then an
      * empty array is returned
      */
    var square: js.UndefOr[String] = js.undefined
    
    /** Set to true to return verbose move objects instead of strings */
    var verbose: `true`
  }
  object Square {
    
    inline def apply(): Square = {
      val __obj = js.Dynamic.literal(verbose = true)
      __obj.asInstanceOf[Square]
    }
    
    extension [Self <: Square](x: Self) {
      
      inline def setSquare(value: String): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
      
      inline def setSquareUndefined: Self = StObject.set(x, "square", js.undefined)
      
      inline def setVerbose(value: `true`): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
  
  trait SquareVerbose extends StObject {
    
    /**
      * The string to test if it is a valid move, if it is not then an
      * empty array is returned
      */
    var square: js.UndefOr[String] = js.undefined
    
    /** Set to true to return verbose move objects instead of strings */
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object SquareVerbose {
    
    inline def apply(): SquareVerbose = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SquareVerbose]
    }
    
    extension [Self <: SquareVerbose](x: Self) {
      
      inline def setSquare(value: String): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
      
      inline def setSquareUndefined: Self = StObject.set(x, "square", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  trait Verbose extends StObject {
    
    /**
      * The string to test if it is a valid move, if it is not then an
      * empty array is returned
      */
    var square: js.UndefOr[String] = js.undefined
    
    /** Set to true to return verbose move objects instead of strings */
    var verbose: js.UndefOr[`false`] = js.undefined
  }
  object Verbose {
    
    inline def apply(): Verbose = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Verbose]
    }
    
    extension [Self <: Verbose](x: Self) {
      
      inline def setSquare(value: String): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
      
      inline def setSquareUndefined: Self = StObject.set(x, "square", js.undefined)
      
      inline def setVerbose(value: `false`): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
