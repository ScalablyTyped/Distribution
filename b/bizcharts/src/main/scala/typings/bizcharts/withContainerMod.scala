package typings.bizcharts

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withContainerMod {
  
  @JSImport("bizcharts/lib/boundary/withContainer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Iprops](Component: Any): ForwardRefExoticComponent[PropsWithoutRef[Iprops] & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[Iprops] & RefAttributes[Any]]]
  inline def default[Iprops](Component: Any, name: String): ForwardRefExoticComponent[PropsWithoutRef[Iprops] & RefAttributes[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[Iprops] & RefAttributes[Any]]]
}
