package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.fluidFormFluidFormMod.FluidFormProps
import typings.carbonComponentsReact.formContextMod.FormContextProps
import typings.react.mod.Context
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fluidFormMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/FluidForm", JSImport.Default)
  @js.native
  val default: FC[FluidFormProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/FluidForm", "FormContext")
  @js.native
  val FormContext: Context[FormContextProps] = js.native
  
  type _To = FC[FluidFormProps]
  
  /* This means you don't have to write `default`, but can instead just say `fluidFormMod.foo` */
  override def _to: FC[FluidFormProps] = default
}
