package typings.deepEqual

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(actual: js.Any, expected: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].apply(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(actual: js.Any, expected: js.Any, opts: DeepEqualOptions): Boolean = (^.asInstanceOf[js.Dynamic].apply(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("deep-equal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DeepEqualOptions extends StObject {
    
    var strict: Boolean
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
