package typings.commonsValidatorJs

import typings.commonsValidatorJs.anon.AllowLocal
import typings.commonsValidatorJs.anon.AllowLocalBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("commons-validator-js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  /**
    * @param allowLocal   Should local addresses be considered valid? default = false
    */
  class DomainValidator () extends js.Object {
    def this(hasAllowLocal: AllowLocalBoolean) = this()
    
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
    def this(hasAllowLocalAllowTld: AllowLocal) = this()
    
    def isValid(email: String): Boolean = js.native
  }
}
