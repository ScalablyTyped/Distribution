package typings.baseui

import typings.react.mod.FocusEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusVisibleMod {
  
  @JSImport("baseui/utils/focusVisible", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def forkBlur(rootProps: Any, handler: js.Function1[/* e */ FocusEvent[Element, Element], Unit]): js.Function1[/* e */ FocusEvent[Element, Element], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forkBlur")(rootProps.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* e */ FocusEvent[Element, Element], Unit]]
  
  inline def forkFocus(rootProps: Any, handler: js.Function1[/* e */ FocusEvent[Element, Element], Unit]): js.Function1[/* e */ FocusEvent[Element, Element], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forkFocus")(rootProps.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* e */ FocusEvent[Element, Element], Unit]]
  
  inline def handleBlurVisible(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleBlurVisible")().asInstanceOf[Unit]
  
  inline def initFocusVisible(node: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initFocusVisible")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isFocusVisible(event: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isFocusVisible")(event.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def teardown(doc: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("teardown")(doc.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
