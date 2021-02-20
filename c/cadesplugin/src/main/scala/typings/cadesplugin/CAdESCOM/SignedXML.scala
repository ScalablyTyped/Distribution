package typings.cadesplugin.CAdESCOM

import typings.cadesplugin.CADESCommon.ValuesOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignedXML extends StObject {
  
  var Content: String = js.native
  
  var DigestMethod: String = js.native
  
  def Sign(): String = js.native
  def Sign(signer: js.UndefOr[scala.Nothing], XPath: String): String = js.native
  def Sign(signer: CPSigner): String = js.native
  def Sign(signer: CPSigner, XPath: String): String = js.native
  
  var SignatureMethod: String = js.native
  
  var SignatureType: ValuesOf[CADESCOM_XML_SIGNATURE_TYPE] = js.native
  
  val Signers: typings.cadesplugin.CAPICOM.Signers = js.native
  
  def Verify(SignedMessage: String): Unit = js.native
  def Verify(SignedMessage: String, XPath: String): Unit = js.native
}
