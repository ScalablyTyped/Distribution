package typings.carbonComponentsReact

import typings.carbonComponentsReact.anon.Ariacontrols
import typings.carbonComponentsReact.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object disclosureMod {
  
  @JSImport("carbon-components-react/lib/components/Disclosure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useDisclosure(id: String): UseDisclosureReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("useDisclosure")(id.asInstanceOf[js.Any]).asInstanceOf[UseDisclosureReturn]
  
  trait UseDisclosureReturn extends StObject {
    
    var buttonProps: Ariacontrols
    
    var contentProps: Id
    
    var open: Boolean
  }
  object UseDisclosureReturn {
    
    inline def apply(buttonProps: Ariacontrols, contentProps: Id, open: Boolean): UseDisclosureReturn = {
      val __obj = js.Dynamic.literal(buttonProps = buttonProps.asInstanceOf[js.Any], contentProps = contentProps.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseDisclosureReturn]
    }
    
    extension [Self <: UseDisclosureReturn](x: Self) {
      
      inline def setButtonProps(value: Ariacontrols): Self = StObject.set(x, "buttonProps", value.asInstanceOf[js.Any])
      
      inline def setContentProps(value: Id): Self = StObject.set(x, "contentProps", value.asInstanceOf[js.Any])
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    }
  }
}
