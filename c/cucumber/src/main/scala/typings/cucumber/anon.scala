package typings.cucumber

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Attach extends StObject {
    
    var attach: js.Function = js.native
    
    var parameters: StringDictionary[js.Any] = js.native
  }
  object Attach {
    
    @scala.inline
    def apply(attach: js.Function, parameters: StringDictionary[js.Any]): Attach = {
      val __obj = js.Dynamic.literal(attach = attach.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attach]
    }
    
    @scala.inline
    implicit class AttachMutableBuilder[Self <: Attach] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttach(value: js.Function): Self = StObject.set(x, "attach", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameters(value: StringDictionary[js.Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    }
  }
}
