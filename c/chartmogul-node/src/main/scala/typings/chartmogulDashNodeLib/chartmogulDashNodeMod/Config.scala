package typings
package chartmogulDashNodeLib.chartmogulDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Config")
@js.native
class Config protected () extends js.Object {
  def this(token: java.lang.String, secret: java.lang.String) = this()
  def this(token: java.lang.String, secret: java.lang.String, base: java.lang.String) = this()
  var API_BASE: java.lang.String = js.native
  var VERSION: java.lang.String = js.native
  var retries: scala.Double = js.native
  def getAccountToken(): java.lang.String = js.native
  def getSecretKey(): java.lang.String = js.native
}

