package typings.deepEqual

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("deep-equal", JSImport.Namespace)
  @js.native
  def apply(actual: js.Any, expected: js.Any): Boolean = js.native
  @JSImport("deep-equal", JSImport.Namespace)
  @js.native
  def apply(actual: js.Any, expected: js.Any, opts: DeepEqualOptions): Boolean = js.native
  
  @js.native
  trait DeepEqualOptions extends StObject {
    
    var strict: Boolean = js.native
  }
  object DeepEqualOptions {
    
    @scala.inline
    def apply(strict: Boolean): DeepEqualOptions = {
      val __obj = js.Dynamic.literal(strict = strict.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeepEqualOptions]
    }
    
    @scala.inline
    implicit class DeepEqualOptionsMutableBuilder[Self <: DeepEqualOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    }
  }
}
