package typings.cadesplugin.CAdESCOM

import typings.cadesplugin.CAPICOM.Certificate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RawSignature extends StObject {
  
  def SignHash(hash: CPHashedData): String = js.native
  def SignHash(hash: CPHashedData, certificate: String): String = js.native
  
  def VerifyHash(hash: CPHashedData, certificate: Certificate, signature: String): Unit = js.native
}
