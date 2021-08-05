package typings.cliCursor

import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cli-cursor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hide(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")().asInstanceOf[Unit]
  inline def hide(stream: WritableStream): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")(stream.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def show(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")().asInstanceOf[Unit]
  inline def show(stream: WritableStream): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(stream.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def toggle(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggle")().asInstanceOf[Unit]
  inline def toggle(force: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(force.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def toggle(force: Boolean, stream: WritableStream): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(force.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toggle(force: Unit, stream: WritableStream): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(force.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
