package typings.commandExists

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("command-exists", JSImport.Namespace)
  @js.native
  def apply(commandName: String): js.Promise[String] = js.native
  @JSImport("command-exists", JSImport.Namespace)
  @js.native
  def apply(commandName: String, cb: js.Function2[/* error */ Null, /* exists */ Boolean, Unit]): Unit = js.native
  
  @JSImport("command-exists", "sync")
  @js.native
  def sync(commandName: String): Boolean = js.native
}
