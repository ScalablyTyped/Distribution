package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.ReactAttr
import typings.react.mod.FC
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsUishellHeaderMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/UIShell/Header", JSImport.Default)
  @js.native
  val default: FC[HeaderProps] = js.native
  
  type HeaderProps = ReactAttr[HTMLElement]
  
  type _To = FC[HeaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsUishellHeaderMod.foo` */
  override def _to: FC[HeaderProps] = default
}
