package typings.cathoQuantum

import typings.cathoQuantum.buttonMod.ButtonProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object socialButtonMod {
  
  @JSImport("@catho/quantum/SocialButton", JSImport.Default)
  @js.native
  open class default ()
    extends Component[SocialButtonProps, js.Object, Any]
  
  type SocialButton = Component[SocialButtonProps, js.Object, Any]
  
  trait SocialButtonProps
    extends StObject
       with ButtonProps {
    
    var provider: String
  }
  object SocialButtonProps {
    
    inline def apply(provider: String): SocialButtonProps = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocialButtonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SocialButtonProps] (val x: Self) extends AnyVal {
      
      inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
}
