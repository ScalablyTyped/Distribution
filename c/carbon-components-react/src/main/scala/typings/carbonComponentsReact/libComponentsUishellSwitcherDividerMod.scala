package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.ReactAttr
import typings.react.mod.FC
import typings.std.HTMLHRElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsUishellSwitcherDividerMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/UIShell/SwitcherDivider", JSImport.Default)
  @js.native
  val default: FC[SwitcherDividerProps] = js.native
  
  type SwitcherDividerProps = ReactAttr[HTMLHRElement]
  
  type _To = FC[SwitcherDividerProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsUishellSwitcherDividerMod.foo` */
  override def _to: FC[SwitcherDividerProps] = default
}
