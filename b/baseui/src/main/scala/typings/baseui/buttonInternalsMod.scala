package typings.baseui

import typings.baseui.buttonTypesMod.ButtonProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonInternalsMod {
  
  @JSImport("baseui/button/button-internals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: ButtonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
