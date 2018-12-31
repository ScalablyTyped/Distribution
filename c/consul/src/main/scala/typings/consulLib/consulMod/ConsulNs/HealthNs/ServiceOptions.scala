package typings
package consulLib.consulMod.ConsulNs.HealthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceOptions
  extends consulLib.consulMod.ConsulNs.CommonOptions {
  var near: js.UndefOr[java.lang.String] = js.undefined
  var passing: js.UndefOr[scala.Boolean] = js.undefined
  var service: java.lang.String
  var tag: js.UndefOr[java.lang.String] = js.undefined
}

