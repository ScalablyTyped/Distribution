package typings.bizcharts

import typings.antvG2.libInterfaceMod.InteractionOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsInteractionMod {
  
  @JSImport("bizcharts/lib/components/Interaction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: IInteractionProps): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait IInteractionProps
    extends StObject
       with InteractionOption {
    
    var config: js.UndefOr[js.Object] = js.undefined
  }
  object IInteractionProps {
    
    inline def apply(`type`: String): IInteractionProps = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IInteractionProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IInteractionProps] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: js.Object): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    }
  }
}
