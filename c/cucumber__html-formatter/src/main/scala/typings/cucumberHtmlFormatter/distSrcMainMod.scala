package typings.cucumberHtmlFormatter

import typings.cucumberMessages.mod.Envelope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMainMod {
  
  object global {
    
    trait Window extends StObject {
      
      var CUCUMBER_MESSAGES: js.Array[Envelope]
    }
    object Window {
      
      inline def apply(CUCUMBER_MESSAGES: js.Array[Envelope]): Window = {
        val __obj = js.Dynamic.literal(CUCUMBER_MESSAGES = CUCUMBER_MESSAGES.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        inline def setCUCUMBER_MESSAGES(value: js.Array[Envelope]): Self = StObject.set(x, "CUCUMBER_MESSAGES", value.asInstanceOf[js.Any])
        
        inline def setCUCUMBER_MESSAGESVarargs(value: Envelope*): Self = StObject.set(x, "CUCUMBER_MESSAGES", js.Array(value*))
      }
    }
  }
}
