package typings.bigscreen

import typings.std.Element
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bigscreen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bigscreen", "element")
  @js.native
  val element: Element = js.native
  
  @JSImport("bigscreen", "enabled")
  @js.native
  val enabled: Boolean = js.native
  
  inline def exit(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exit")().asInstanceOf[Unit]
  
  inline def onchange(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onchange")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def onenter(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onenter")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def onerror(element: Element, reason: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onerror")(element.asInstanceOf[js.Any], reason.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def onexit(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onexit")().asInstanceOf[Unit]
  
  inline def request(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def request(element: Element, onEnter: js.Function1[/* element */ Element, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(element.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def request(element: Element, onEnter: js.Function1[/* element */ Element, Unit], onExit: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(element.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any], onExit.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def request(
    element: Element,
    onEnter: js.Function1[/* element */ Element, Unit],
    onExit: js.Function0[Unit],
    onError: js.Function2[/* element */ Element, /* reason */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(element.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any], onExit.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def request(
    element: Element,
    onEnter: js.Function1[/* element */ Element, Unit],
    onExit: Unit,
    onError: js.Function2[/* element */ Element, /* reason */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(element.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any], onExit.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def request(element: Element, onEnter: Unit, onExit: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(element.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any], onExit.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def request(
    element: Element,
    onEnter: Unit,
    onExit: js.Function0[Unit],
    onError: js.Function2[/* element */ Element, /* reason */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(element.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any], onExit.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def request(
    element: Element,
    onEnter: Unit,
    onExit: Unit,
    onError: js.Function2[/* element */ Element, /* reason */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(element.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any], onExit.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toggle(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggle")().asInstanceOf[Unit]
  inline def toggle(element: Unit, onEnter: js.Function1[/* element */ Element, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(element.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toggle(element: Unit, onEnter: js.Function1[/* element */ Element, Unit], onExit: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(element.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any], onExit.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toggle(
    element: Unit,
    onEnter: js.Function1[/* element */ Element, Unit],
    onExit: js.Function0[Unit],
    onError: js.Function2[/* element */ Element, /* reason */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(element.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any], onExit.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toggle(
    element: Unit,
    onEnter: js.Function1[/* element */ Element, Unit],
    onExit: Unit,
    onError: js.Function2[/* element */ Element, /* reason */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(element.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any], onExit.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toggle(element: Unit, onEnter: Unit, onExit: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(element.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any], onExit.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toggle(
    element: Unit,
    onEnter: Unit,
    onExit: js.Function0[Unit],
    onError: js.Function2[/* element */ Element, /* reason */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(element.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any], onExit.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toggle(
    element: Unit,
    onEnter: Unit,
    onExit: Unit,
    onError: js.Function2[/* element */ Element, /* reason */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(element.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any], onExit.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toggle(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def toggle(element: Element, onEnter: js.Function1[/* element */ Element, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(element.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toggle(element: Element, onEnter: js.Function1[/* element */ Element, Unit], onExit: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(element.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any], onExit.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toggle(
    element: Element,
    onEnter: js.Function1[/* element */ Element, Unit],
    onExit: js.Function0[Unit],
    onError: js.Function2[/* element */ Element, /* reason */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(element.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any], onExit.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toggle(
    element: Element,
    onEnter: js.Function1[/* element */ Element, Unit],
    onExit: Unit,
    onError: js.Function2[/* element */ Element, /* reason */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(element.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any], onExit.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toggle(element: Element, onEnter: Unit, onExit: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(element.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any], onExit.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toggle(
    element: Element,
    onEnter: Unit,
    onExit: js.Function0[Unit],
    onError: js.Function2[/* element */ Element, /* reason */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(element.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any], onExit.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toggle(
    element: Element,
    onEnter: Unit,
    onExit: Unit,
    onError: js.Function2[/* element */ Element, /* reason */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(element.asInstanceOf[js.Any], onEnter.asInstanceOf[js.Any], onExit.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def videoEnabled(video: HTMLVideoElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("videoEnabled")(video.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
