package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.libComponentsFormFormMod.FormProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsFluidFormFluidFormMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/FluidForm/FluidForm", JSImport.Default)
  @js.native
  val default: FC[FluidFormProps] = js.native
  
  type FluidFormProps = FormProps
  
  type _To = FC[FluidFormProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsFluidFormFluidFormMod.foo` */
  override def _to: FC[FluidFormProps] = default
}
