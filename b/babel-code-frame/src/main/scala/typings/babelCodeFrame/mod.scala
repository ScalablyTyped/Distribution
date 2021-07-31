package typings.babelCodeFrame

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Generate errors that contain a code frame that point to source locations.
    *
    * @param rawLines Raw lines to frame
    * @param lineNumber Line number (1 indexed)
    * @param colNumber Column number
    * @param options Additional options
    *
    * @returns Framed code
    */
  @scala.inline
  def apply(rawLines: String, lineNumber: Double, colNumber: Double): String = (^.asInstanceOf[js.Dynamic].apply(rawLines.asInstanceOf[js.Any], lineNumber.asInstanceOf[js.Any], colNumber.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(rawLines: String, lineNumber: Double, colNumber: Double, options: BabelCodeFrameOptions): String = (^.asInstanceOf[js.Dynamic].apply(rawLines.asInstanceOf[js.Any], lineNumber.asInstanceOf[js.Any], colNumber.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("babel-code-frame", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait BabelCodeFrameOptions extends StObject {
    
    /**
      * Forcibly syntax highlight the code as JavaScript (for non-terminals);
      * overrides highlightCode.
      * default: false
      */
    var forceColor: js.UndefOr[Boolean] = js.undefined
    
    /** Syntax highlight the code as JavaScript for terminals. default: false */
    var highlightCode: js.UndefOr[Boolean] = js.undefined
    
    /**  The number of lines to show below the error. default: 3 */
    var linesAbove: js.UndefOr[Double] = js.undefined
    
    /**  The number of lines to show above the error. default: 2 */
    var linesBelow: js.UndefOr[Double] = js.undefined
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
    }
  }
}
