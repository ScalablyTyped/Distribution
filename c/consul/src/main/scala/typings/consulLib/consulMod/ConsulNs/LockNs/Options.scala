package typings
package consulLib.consulMod.ConsulNs.LockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var key: java.lang.String
  var lockretrytime: js.UndefOr[java.lang.String] = js.undefined
  var lockwaittime: js.UndefOr[java.lang.String] = js.undefined
  var session: js.UndefOr[js.Object | java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
}

