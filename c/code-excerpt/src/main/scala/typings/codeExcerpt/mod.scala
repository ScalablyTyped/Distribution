package typings.codeExcerpt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Extract code excerpts
    */
  inline def apply(
    /**
  	 * Source code
  	 */
  source: String,
    /**
  	 * Line number to extract excerpt for.
  	 */
  line: Double
  ): js.UndefOr[js.Array[ExcerptLine]] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], line.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[ExcerptLine]]]
  inline def apply(
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
  ): js.UndefOr[js.Array[ExcerptLine]] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], line.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[ExcerptLine]]]
  
  @JSImport("code-excerpt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ExcerptLine extends StObject {
    
    /**
    		 * Line number
    		 */
    val line: Double
    
    /**
    		 * Line itself
    		 */
    val value: String
  }
  object ExcerptLine {
    
    inline def apply(line: Double, value: String): ExcerptLine = {
      val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExcerptLine]
    }
    
    extension [Self <: ExcerptLine](x: Self) {
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
    		 * Number of surrounding lines to extract.
    		 *
    		 * @default 3
    		 */
    val around: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAround(value: Double): Self = StObject.set(x, "around", value.asInstanceOf[js.Any])
      
      inline def setAroundUndefined: Self = StObject.set(x, "around", js.undefined)
    }
  }
}
