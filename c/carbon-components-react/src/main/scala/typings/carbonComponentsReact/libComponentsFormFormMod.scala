package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.FormHTMLAttributes
import typings.std.HTMLFormElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsFormFormMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Form/Form", JSImport.Default)
  @js.native
  val default: FC[FormProps] = js.native
  
  type FormProps = FormHTMLAttributes[HTMLFormElement]
  
  type _To = FC[FormProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsFormFormMod.foo` */
  override def _to: FC[FormProps] = default
}
