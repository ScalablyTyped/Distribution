package typings.dashify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dashify", JSImport.Namespace)
  @js.native
  def apply(input: String): String = js.native
  @JSImport("dashify", JSImport.Namespace)
  @js.native
  def apply(input: String, options: Options): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    var condense: js.UndefOr[Boolean] = js.native
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
      def setCondense(value: Boolean): Self = StObject.set(x, "condense", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCondenseUndefined: Self = StObject.set(x, "condense", js.undefined)
    }
  }
}
