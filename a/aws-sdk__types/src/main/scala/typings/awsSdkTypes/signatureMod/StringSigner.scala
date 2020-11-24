package typings.awsSdkTypes.signatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringSigner extends js.Object {
  
  /**
    * Sign the provided `stringToSign` for use outside of the context of
    * request signing. Typical uses include signed policy generation.
    */
  def sign(stringToSign: String): js.Promise[String] = js.native
  def sign(stringToSign: String, options: SigningArguments): js.Promise[String] = js.native
}
