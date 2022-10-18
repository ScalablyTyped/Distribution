package typings.bizcharts

import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContextViewMod {
  
  @JSImport("bizcharts/lib/context/view", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bizcharts/lib/context/view", JSImport.Default)
  @js.native
  val default: Context[Any] = js.native
  
  inline def withView[T](Component: Any): js.Function1[/* props */ T, Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("withView")(Component.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ T, Element]]
}
