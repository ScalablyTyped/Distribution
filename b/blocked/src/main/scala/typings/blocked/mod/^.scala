package typings.blocked.mod

import typings.node.NodeJS.Timer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("blocked", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(callback: js.Function1[/* ms */ Double, Unit]): Timer = js.native
  def apply(callback: js.Function1[/* ms */ Double, Unit], options: Options): Timer = js.native
}
