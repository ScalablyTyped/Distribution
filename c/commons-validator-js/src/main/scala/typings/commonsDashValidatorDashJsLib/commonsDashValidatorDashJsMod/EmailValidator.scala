package typings
package commonsDashValidatorDashJsLib.commonsDashValidatorDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("commons-validator-js", "EmailValidator")
@js.native
/**
  * @param allowLocal   Should local addresses be considered valid? default = false
  * @param allowTld     Should TLDs be allowed? default = false
  */
class EmailValidator () extends js.Object {
  def this(hasAllowLocalAllowTld: commonsDashValidatorDashJsLib.Anon_AllowLocal) = this()
  def isValid(email: java.lang.String): scala.Boolean = js.native
}

