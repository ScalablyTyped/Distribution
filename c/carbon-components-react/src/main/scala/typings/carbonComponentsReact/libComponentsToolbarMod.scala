package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.libComponentsToolbarToolbarMod.ToolbarItemProps
import typings.carbonComponentsReact.libComponentsToolbarToolbarMod.ToolbarOptionProps
import typings.carbonComponentsReact.libComponentsToolbarToolbarMod.ToolbarProps
import typings.carbonComponentsReact.libComponentsToolbarToolbarMod.ToolbarTitleProps
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefReturn
import typings.react.mod.FC
import typings.std.HTMLHRElement
import typings.std.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsToolbarMod extends Shortcut {
  
  /**
    * @deprecated
    */
  @JSImport("carbon-components-react/lib/components/Toolbar", JSImport.Default)
  @js.native
  val default: FC[ToolbarProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/Toolbar", "ToolbarDivider")
  @js.native
  val ToolbarDivider: ForwardRefReturn[HTMLHRElement, js.Object] = js.native
  
  @JSImport("carbon-components-react/lib/components/Toolbar", "ToolbarItem")
  @js.native
  val ToolbarItem: FC[ToolbarItemProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/Toolbar", "ToolbarOption")
  @js.native
  val ToolbarOption: ForwardRefReturn[HTMLLIElement, ToolbarOptionProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/Toolbar", "ToolbarTitle")
  @js.native
  val ToolbarTitle: ForwardRefReturn[HTMLLIElement, ToolbarTitleProps] = js.native
  
  type _To = FC[ToolbarProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsToolbarMod.foo` */
  override def _to: FC[ToolbarProps] = default
}
