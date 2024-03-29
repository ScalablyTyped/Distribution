package typings.carbonComponentsReact

import typings.carbonComponentsReact.libComponentsDropdownDropdownMod.DropdownProps
import typings.carbonComponentsReact.typingsSharedMod.FCReturn
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefProps
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDropdownMod {
  
  @JSImport("carbon-components-react/lib/components/Dropdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ItemType](props: ForwardRefProps[HTMLButtonElement, DropdownProps[ItemType]]): FCReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[FCReturn]
}
