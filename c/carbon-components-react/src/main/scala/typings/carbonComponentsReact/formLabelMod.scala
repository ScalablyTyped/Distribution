package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.formLabelFormLabelMod.FormLabelProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formLabelMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/FormLabel", JSImport.Default)
  @js.native
  val default: FC[FormLabelProps] = js.native
  
  type _To = FC[FormLabelProps]
  
  /* This means you don't have to write `default`, but can instead just say `formLabelMod.foo` */
  override def _to: FC[FormLabelProps] = default
}
