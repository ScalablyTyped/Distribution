package typings
package charmLib.charmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("charm", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Create a new readable/writable charm stream.
    *
    * You can pass in readable or writable streams as parameters
    * and they will be piped to or from accordingly.
    * You can also pass `process` in which case
    * `process.stdin` and `process.stdout` will be used.
    */
  def apply(): charmLib.charmMod.charmNs.CharmInstance = js.native
  def apply(param: charmLib.charmMod.charmNs.CharmAnyStream): charmLib.charmMod.charmNs.CharmInstance = js.native
}

