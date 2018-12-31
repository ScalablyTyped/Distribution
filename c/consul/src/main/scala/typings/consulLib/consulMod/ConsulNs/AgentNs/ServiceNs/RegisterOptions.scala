package typings
package consulLib.consulMod.ConsulNs.AgentNs.ServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterOptions
  extends consulLib.consulMod.ConsulNs.CommonOptions {
  var address: js.UndefOr[java.lang.String] = js.undefined
  var check: js.UndefOr[RegisterCheck] = js.undefined
  var checks: js.UndefOr[js.Array[RegisterCheck]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var port: js.UndefOr[scala.Double] = js.undefined
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

