package typings.containsPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("contains-path", JSImport.Namespace)
  @js.native
  def apply(filepath: String, substr: String): Boolean = js.native
  @JSImport("contains-path", JSImport.Namespace)
  @js.native
  def apply(filepath: String, substr: String, options: Options): Boolean = js.native
  
  @js.native
  trait Options extends StObject {
    
    var nocase: js.UndefOr[Boolean] = js.native
    
    var partialMatch: js.UndefOr[Boolean] = js.native
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
      def setNocase(value: Boolean): Self = StObject.set(x, "nocase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNocaseUndefined: Self = StObject.set(x, "nocase", js.undefined)
      
      @scala.inline
      def setPartialMatch(value: Boolean): Self = StObject.set(x, "partialMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartialMatchUndefined: Self = StObject.set(x, "partialMatch", js.undefined)
    }
  }
}
