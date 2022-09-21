package typings.cadesplugin.CAdESCOM

import typings.cadesplugin.CADESCommon.ValuesOf
import typings.cadesplugin.CADESCommon.VarDate
import typings.cadesplugin.CAPICOM.CAPICOM_CERTIFICATE_INCLUDE_OPTION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CPSigner extends StObject {
  
  var AuthenticatedAttributes2: CPAuthenticatedAttributes2 = js.native
  
  var Certificate: typings.cadesplugin.CAPICOM.Certificate = js.native
  
  var CheckCertificate: Boolean = js.native
  
  def Display(): Unit = js.native
  def Display(hwndParent: Double): Unit = js.native
  def Display(hwndParent: Double, title: String): Unit = js.native
  def Display(hwndParent: Unit, title: String): Unit = js.native
  
  var KeyPin: String = js.native
  
  def Load(fileName: String): Unit = js.native
  def Load(fileName: String, password: String): Unit = js.native
  
  var Options: ValuesOf[CAPICOM_CERTIFICATE_INCLUDE_OPTION] = js.native
  
  val SignatureTimeStampTime: VarDate = js.native
  
  val SigningTime: VarDate = js.native
  
  var TSAAddress: String = js.native
}
