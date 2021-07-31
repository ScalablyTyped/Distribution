package typings.calcPercent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(`val`: Double, total: Double): String = (^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any], total.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(`val`: Double, total: Double, opts: Options): String = (^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any], total.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("calc-percent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * Number of decimals
      * @default 0
      */
    var decimal: js.UndefOr[Double] = js.undefined
    
    /**
      * Append a suffix.
      * @default ''
      */
    var suffix: js.UndefOr[String] = js.undefined
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
      def setDecimal(value: Double): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalUndefined: Self = StObject.set(x, "decimal", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
}
