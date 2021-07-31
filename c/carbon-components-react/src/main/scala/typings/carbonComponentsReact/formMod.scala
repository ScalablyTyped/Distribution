package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.formFormMod.FormProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Form", JSImport.Default)
  @js.native
  val default: FC[FormProps] = js.native
  
  type _To = FC[FormProps]
  
  /* This means you don't have to write `default`, but can instead just say `formMod.foo` */
  override def _to: FC[FormProps] = default
}
