package typings.bullBoard

import typings.bullBoard.anon.Api
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUiComponentsAppMod {
  
  @JSImport("bull-board/dist/ui/components/App", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def App(hasApi: Api): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("App")(hasApi.asInstanceOf[js.Any]).asInstanceOf[Element]
}
