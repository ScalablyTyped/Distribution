package typings.commonsDashValidatorDashJs.commonsDashValidatorDashJsMod

import typings.commonsDashValidatorDashJs.Anon_AllowLocal
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
  def this(hasAllowLocalAllowTld: Anon_AllowLocal) = this()
  def isValid(email: String): Boolean = js.native
}

