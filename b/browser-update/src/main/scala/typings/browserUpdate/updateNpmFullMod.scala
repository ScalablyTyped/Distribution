package typings.browserUpdate

import typings.browserUpdate.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateNpmFullMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(options: Unit, test: Boolean): Unit = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(options: Options): Unit = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(options: Options, test: Boolean): Unit = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("browser-update/update.npm.full", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
