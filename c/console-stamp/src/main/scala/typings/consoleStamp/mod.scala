package typings.consoleStamp

import typings.consoleStamp.anon.Colors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(console: js.Object): Unit = ^.asInstanceOf[js.Dynamic].apply(console.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(console: js.Object, options: Colors): Unit = (^.asInstanceOf[js.Dynamic].apply(console.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("console-stamp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
