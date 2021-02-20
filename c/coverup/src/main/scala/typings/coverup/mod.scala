package typings.coverup

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("coverup", JSImport.Namespace)
  @js.native
  def apply(value: String): String = js.native
  @JSImport("coverup", JSImport.Namespace)
  @js.native
  def apply(value: String, options: Options): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    var char: js.UndefOr[String] = js.native
    
    var compactTo: js.UndefOr[Double] = js.native
    
    var keepLeft: js.UndefOr[Double] = js.native
    
    var keepRight: js.UndefOr[Double] = js.native
    
    var keepSymbols: js.UndefOr[Boolean] = js.native
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
      def setChar(value: String): Self = StObject.set(x, "char", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharUndefined: Self = StObject.set(x, "char", js.undefined)
      
      @scala.inline
      def setCompactTo(value: Double): Self = StObject.set(x, "compactTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactToUndefined: Self = StObject.set(x, "compactTo", js.undefined)
      
      @scala.inline
      def setKeepLeft(value: Double): Self = StObject.set(x, "keepLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepLeftUndefined: Self = StObject.set(x, "keepLeft", js.undefined)
      
      @scala.inline
      def setKeepRight(value: Double): Self = StObject.set(x, "keepRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepRightUndefined: Self = StObject.set(x, "keepRight", js.undefined)
      
      @scala.inline
      def setKeepSymbols(value: Boolean): Self = StObject.set(x, "keepSymbols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepSymbolsUndefined: Self = StObject.set(x, "keepSymbols", js.undefined)
    }
  }
}
