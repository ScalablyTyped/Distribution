package typings.cac

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Run extends StObject {
    
    var run: js.UndefOr[Boolean] = js.native
  }
  object Run {
    
    @scala.inline
    def apply(): Run = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Run]
    }
    
    @scala.inline
    implicit class RunMutableBuilder[Self <: Run] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRun(value: Boolean): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
    }
  }
}
