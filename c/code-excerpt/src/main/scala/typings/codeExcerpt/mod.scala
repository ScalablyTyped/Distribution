package typings.codeExcerpt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Extract code excerpts
    */
  @JSImport("code-excerpt", JSImport.Namespace)
  @js.native
  def apply(
    /**
  	 * Source code
  	 */
  source: String,
    /**
  	 * Line number to extract excerpt for.
  	 */
  line: Double
  ): js.UndefOr[js.Array[ExcerptLine]] = js.native
  @JSImport("code-excerpt", JSImport.Namespace)
  @js.native
  def apply(
    /**
  	 * Source code
  	 */
  source: String,
    /**
  	 * Line number to extract excerpt for.
  	 */
  line: Double,
    /**
  	 * Options
  	 */
  options: Options
  ): js.UndefOr[js.Array[ExcerptLine]] = js.native
  
  @js.native
  trait ExcerptLine extends StObject {
    
    /**
    		 * Line number
    		 */
    val line: Double = js.native
    
    /**
    		 * Line itself
    		 */
    val value: String = js.native
  }
  object ExcerptLine {
    
    @scala.inline
    def apply(line: Double, value: String): ExcerptLine = {
      val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExcerptLine]
    }
    
    @scala.inline
    implicit class ExcerptLineMutableBuilder[Self <: ExcerptLine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
    		 * Number of surrounding lines to extract.
    		 *
    		 * @default 3
    		 */
    val around: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAround(value: Double): Self = StObject.set(x, "around", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAroundUndefined: Self = StObject.set(x, "around", js.undefined)
    }
  }
}
