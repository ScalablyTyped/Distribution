package typings
package commonsDashValidatorDashJsLib.commonsDashValidatorDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("commons-validator-js", "DomainValidator")
@js.native
/**
  * @param allowLocal   Should local addresses be considered valid? default = false
  */
class DomainValidator () extends js.Object {
  def this(hasAllowLocal: commonsDashValidatorDashJsLib.Anon_AllowLocalBoolean) = this()
  def extractTld(domain: java.lang.String): java.lang.String | scala.Null = js.native
  def isValid(domain: java.lang.String): scala.Boolean = js.native
  def isValidCountryCodeTld(ccTld: java.lang.String): scala.Boolean = js.native
  def isValidGenericTld(gTld: java.lang.String): scala.Boolean = js.native
  def isValidInfrastructureTld(iTld: java.lang.String): scala.Boolean = js.native
  def isValidTld(tld: java.lang.String): scala.Boolean = js.native
}

