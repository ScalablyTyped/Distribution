package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.ReactDivAttr
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerGlobalBarMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/UIShell/HeaderGlobalBar", JSImport.Default)
  @js.native
  val default: FC[HeaderGlobalBarProps] = js.native
  
  type HeaderGlobalBarProps = ReactDivAttr
  
  type _To = FC[HeaderGlobalBarProps]
  
  /* This means you don't have to write `default`, but can instead just say `headerGlobalBarMod.foo` */
  override def _to: FC[HeaderGlobalBarProps] = default
}
