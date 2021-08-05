package typings.commandExists

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(commandName: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(commandName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def apply(commandName: String, cb: js.Function2[/* error */ Null, /* exists */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(commandName.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("command-exists", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sync(commandName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(commandName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
