package typings.commandExists

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("command-exists", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(commandName: String): js.Promise[String] = js.native
  def apply(commandName: String, cb: js.Function2[/* error */ Null, /* exists */ Boolean, Unit]): Unit = js.native
  
  def sync(commandName: String): Boolean = js.native
}
