package typings.bizcharts

import typings.react.mod.Context
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContextCanvasMod {
  
  @JSImport("bizcharts/lib/context/canvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bizcharts/lib/context/canvas", JSImport.Default)
  @js.native
  val default: Context[Any] = js.native
  
  inline def withCanvasContext[T](Component: Any): ForwardRefExoticComponent[PropsWithoutRef[T] & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withCanvasContext")(Component.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[T] & RefAttributes[Any]]]
}
