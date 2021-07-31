package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.ReactLabelAttr
import typings.react.mod.FC
import typings.std.HTMLLabelElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formLabelFormLabelMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/FormLabel/FormLabel", JSImport.Default)
  @js.native
  val default: FC[FormLabelProps] = js.native
  
  type FormLabelProps = ReactLabelAttr[HTMLLabelElement]
  
  type _To = FC[FormLabelProps]
  
  /* This means you don't have to write `default`, but can instead just say `formLabelFormLabelMod.foo` */
  override def _to: FC[FormLabelProps] = default
}
