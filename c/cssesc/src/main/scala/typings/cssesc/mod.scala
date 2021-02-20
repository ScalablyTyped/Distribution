package typings.cssesc

import typings.cssesc.anon.ReadonlyPartialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cssesc", JSImport.Namespace)
  @js.native
  def apply(string: String): String = js.native
  @JSImport("cssesc", JSImport.Namespace)
  @js.native
  def apply(string: String, options: ReadonlyPartialOptions): String = js.native
  
  @JSImport("cssesc", "options")
  @js.native
  val options: Options_ = js.native
  
  @JSImport("cssesc", "version")
  @js.native
  val version: String = js.native
  
  @js.native
  trait Options_ extends StObject {
    
    var escapeEverything: Boolean = js.native
    
    var isIdentifier: Boolean = js.native
    
    var quotes: String = js.native
    
    var wrap: Boolean = js.native
  }
  object Options_ {
    
    @scala.inline
    def apply(escapeEverything: Boolean, isIdentifier: Boolean, quotes: String, wrap: Boolean): Options_ = {
      val __obj = js.Dynamic.literal(escapeEverything = escapeEverything.asInstanceOf[js.Any], isIdentifier = isIdentifier.asInstanceOf[js.Any], quotes = quotes.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options_]
    }
    
    @scala.inline
    implicit class Options_MutableBuilder[Self <: Options_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEscapeEverything(value: Boolean): Self = StObject.set(x, "escapeEverything", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIdentifier(value: Boolean): Self = StObject.set(x, "isIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotes(value: String): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    }
  }
}
