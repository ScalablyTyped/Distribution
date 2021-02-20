package typings.babelCodeFrame

import typings.babelCodeFrame.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@babel/code-frame", JSImport.Default)
  @js.native
  def default(rawLines: String, lineNumber: Double, colNumber: Double): String = js.native
  @JSImport("@babel/code-frame", JSImport.Default)
  @js.native
  def default(rawLines: String, lineNumber: Double, colNumber: Double, options: BabelCodeFrameOptions): String = js.native
  
  @JSImport("@babel/code-frame", "codeFrameColumns")
  @js.native
  def codeFrameColumns(rawLines: String, location: SourceLocation): String = js.native
  @JSImport("@babel/code-frame", "codeFrameColumns")
  @js.native
  def codeFrameColumns(rawLines: String, location: SourceLocation, options: BabelCodeFrameOptions): String = js.native
  
  @js.native
  trait BabelCodeFrameOptions extends StObject {
    
    /**
      * Forcibly syntax highlight the code as JavaScript (for non-terminals);
      * overrides highlightCode.
      * default: false
      */
    var forceColor: js.UndefOr[Boolean] = js.native
    
    /** Syntax highlight the code as JavaScript for terminals. default: false */
    var highlightCode: js.UndefOr[Boolean] = js.native
    
    /**  The number of lines to show above the error. default: 2 */
    var linesAbove: js.UndefOr[Double] = js.native
    
    /**  The number of lines to show below the error. default: 3 */
    var linesBelow: js.UndefOr[Double] = js.native
    
    /**
      * Pass in a string to be displayed inline (if possible) next to the
      * highlighted location in the code. If it can't be positioned inline,
      * it will be placed above the code frame.
      * default: nothing
      */
    var message: js.UndefOr[String] = js.native
  }
  object BabelCodeFrameOptions {
    
    @scala.inline
    def apply(): BabelCodeFrameOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BabelCodeFrameOptions]
    }
    
    @scala.inline
    implicit class BabelCodeFrameOptionsMutableBuilder[Self <: BabelCodeFrameOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForceColor(value: Boolean): Self = StObject.set(x, "forceColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceColorUndefined: Self = StObject.set(x, "forceColor", js.undefined)
      
      @scala.inline
      def setHighlightCode(value: Boolean): Self = StObject.set(x, "highlightCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightCodeUndefined: Self = StObject.set(x, "highlightCode", js.undefined)
      
      @scala.inline
      def setLinesAbove(value: Double): Self = StObject.set(x, "linesAbove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinesAboveUndefined: Self = StObject.set(x, "linesAbove", js.undefined)
      
      @scala.inline
      def setLinesBelow(value: Double): Self = StObject.set(x, "linesBelow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinesBelowUndefined: Self = StObject.set(x, "linesBelow", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  @js.native
  trait SourceLocation extends StObject {
    
    var end: js.UndefOr[Column] = js.native
    
    var start: Column = js.native
  }
  object SourceLocation {
    
    @scala.inline
    def apply(start: Column): SourceLocation = {
      val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceLocation]
    }
    
    @scala.inline
    implicit class SourceLocationMutableBuilder[Self <: SourceLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Column): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setStart(value: Column): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
