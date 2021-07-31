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
    
    @scala.inline
    def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVerbose(value: `false`): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
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
    
    @scala.inline
    def apply(): `1` = {
      val __obj = js.Dynamic.literal(verbose = true)
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVerbose(value: `true`): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(): `2` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`2`]
    }
    
    @scala.inline
    implicit class `2MutableBuilder`[Self <: `2`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
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
    
    @scala.inline
    def apply(): BIGPAWN = {
      val __obj = js.Dynamic.literal(BIG_PAWN = "b", CAPTURE = "c", EP_CAPTURE = "e", KSIDE_CASTLE = "k", NORMAL = "n", PROMOTION = "p", QSIDE_CASTLE = "q")
      __obj.asInstanceOf[BIGPAWN]
    }
    
    @scala.inline
    implicit class BIGPAWNMutableBuilder[Self <: BIGPAWN] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBIG_PAWN(value: b): Self = StObject.set(x, "BIG_PAWN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCAPTURE(value: c): Self = StObject.set(x, "CAPTURE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEP_CAPTURE(value: e): Self = StObject.set(x, "EP_CAPTURE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKSIDE_CASTLE(value: k): Self = StObject.set(x, "KSIDE_CASTLE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNORMAL(value: n): Self = StObject.set(x, "NORMAL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPROMOTION(value: p): Self = StObject.set(x, "PROMOTION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQSIDE_CASTLE(value: q): Self = StObject.set(x, "QSIDE_CASTLE", value.asInstanceOf[js.Any])
    }
  }
  
  trait Color extends StObject {
    
    var color: w | b
    
    var `type`: PieceType
  }
  object Color {
    
    @scala.inline
    def apply(color: w | b, `type`: PieceType): Color = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color]
    }
    
    @scala.inline
    implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: w | b): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: PieceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(error: String, error_number: Double, valid: Boolean): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], error_number = error_number.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError_number(value: Double): Self = StObject.set(x, "error_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
  trait Maxwidth extends StObject {
    
    /** the maximum width of a line */
    var max_width: js.UndefOr[Double] = js.undefined
    
    /** Specific newline character */
    var newline_char: js.UndefOr[String] = js.undefined
  }
  object Maxwidth {
    
    @scala.inline
    def apply(): Maxwidth = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Maxwidth]
    }
    
    @scala.inline
    implicit class MaxwidthMutableBuilder[Self <: Maxwidth] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax_width(value: Double): Self = StObject.set(x, "max_width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_widthUndefined: Self = StObject.set(x, "max_width", js.undefined)
      
      @scala.inline
      def setNewline_char(value: String): Self = StObject.set(x, "newline_char", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewline_charUndefined: Self = StObject.set(x, "newline_char", js.undefined)
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
    
    @scala.inline
    def apply(): Newlinechar = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Newlinechar]
    }
    
    @scala.inline
    implicit class NewlinecharMutableBuilder[Self <: Newlinechar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewline_char(value: String): Self = StObject.set(x, "newline_char", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewline_charUndefined: Self = StObject.set(x, "newline_char", js.undefined)
      
      @scala.inline
      def setSloppy(value: Boolean): Self = StObject.set(x, "sloppy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSloppyUndefined: Self = StObject.set(x, "sloppy", js.undefined)
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
    
    @scala.inline
    def apply(): Sloppy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Sloppy]
    }
    
    @scala.inline
    implicit class SloppyMutableBuilder[Self <: Sloppy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSloppy(value: Boolean): Self = StObject.set(x, "sloppy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSloppyUndefined: Self = StObject.set(x, "sloppy", js.undefined)
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
    
    @scala.inline
    def apply(): Square = {
      val __obj = js.Dynamic.literal(verbose = true)
      __obj.asInstanceOf[Square]
    }
    
    @scala.inline
    implicit class SquareMutableBuilder[Self <: Square] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSquare(value: String): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSquareUndefined: Self = StObject.set(x, "square", js.undefined)
      
      @scala.inline
      def setVerbose(value: `true`): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(): SquareVerbose = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SquareVerbose]
    }
    
    @scala.inline
    implicit class SquareVerboseMutableBuilder[Self <: SquareVerbose] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSquare(value: String): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSquareUndefined: Self = StObject.set(x, "square", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
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
    
    @scala.inline
    def apply(): Verbose = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Verbose]
    }
    
    @scala.inline
    implicit class VerboseMutableBuilder[Self <: Verbose] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSquare(value: String): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSquareUndefined: Self = StObject.set(x, "square", js.undefined)
      
      @scala.inline
      def setVerbose(value: `false`): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
