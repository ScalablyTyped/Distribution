package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.ReactDivAttr
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsFormItemFormItemMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/FormItem/FormItem", JSImport.Default)
  @js.native
  val default: FC[FormItemProps] = js.native
  
  type FormItemProps = ReactDivAttr
  
  type _To = FC[FormItemProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsFormItemFormItemMod.foo` */
  override def _to: FC[FormItemProps] = default
}
