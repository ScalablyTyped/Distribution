package typings.baseui

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecatedComponentMod {
  
  @JSImport("baseui/utils/deprecated-component", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(Component: ComponentClass[js.Object, ComponentState], displayName: String): ComponentClass[js.Object, ComponentState] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any], displayName.asInstanceOf[js.Any])).asInstanceOf[ComponentClass[js.Object, ComponentState]]
  inline def default(Component: FunctionComponent[js.Object], displayName: String): FunctionComponent[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any], displayName.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[js.Object]]
}
