package typings.commonsDashValidatorDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("commons-validator-js", JSImport.Namespace)
@js.native
object commonsDashValidatorDashJsMod extends js.Object {
  @js.native
  /**
    * @param allowLocal   Should local addresses be considered valid? default = false
    */
  class DomainValidator () extends js.Object {
    def this(hasAllowLocal: Anon_AllowLocalBoolean) = this()
    def extractTld(domain: String): String | Null = js.native
    def isValid(domain: String): Boolean = js.native
    def isValidCountryCodeTld(ccTld: String): Boolean = js.native
    def isValidGenericTld(gTld: String): Boolean = js.native
    def isValidInfrastructureTld(iTld: String): Boolean = js.native
    def isValidTld(tld: String): Boolean = js.native
  }
  
  @js.native
  /**
    * @param allowLocal   Should local addresses be considered valid? default = false
    * @param allowTld     Should TLDs be allowed? default = false
    */
  class EmailValidator () extends js.Object {
    def this(hasAllowLocalAllowTld: Anon_AllowLocal) = this()
    def isValid(email: String): Boolean = js.native
  }
  
}

