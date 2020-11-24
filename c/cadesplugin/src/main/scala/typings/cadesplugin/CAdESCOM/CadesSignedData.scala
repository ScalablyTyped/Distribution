package typings.cadesplugin.CAdESCOM

import typings.cadesplugin.CADESCommon.ValuesOf
import typings.cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CadesSignedData extends js.Object {
  
  val Certificates: typings.cadesplugin.CAPICOM.Certificates = js.native
  
  var Content: String = js.native
  
  var ContentEncoding: ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE] = js.native
  
  def Display(): Unit = js.native
  def Display(hwndParent: js.UndefOr[scala.Nothing], title: String): Unit = js.native
  def Display(hwndParent: Double): Unit = js.native
  def Display(hwndParent: Double, title: String): Unit = js.native
  
  var DisplayData: ValuesOf[CADESCOM_DISPLAY_DATA] = js.native
  
  def EnhanceCades(): String = js.native
  def EnhanceCades(
    cadesType: js.UndefOr[scala.Nothing],
    TSAAddress: js.UndefOr[scala.Nothing],
    encodingType: ValuesOf[CAPICOM_ENCODING_TYPE]
  ): String = js.native
  def EnhanceCades(cadesType: js.UndefOr[scala.Nothing], TSAAddress: String): String = js.native
  def EnhanceCades(
    cadesType: js.UndefOr[scala.Nothing],
    TSAAddress: String,
    encodingType: ValuesOf[CAPICOM_ENCODING_TYPE]
  ): String = js.native
  def EnhanceCades(cadesType: ValuesOf[CADESCOM_CADES_TYPE]): String = js.native
  def EnhanceCades(
    cadesType: ValuesOf[CADESCOM_CADES_TYPE],
    TSAAddress: js.UndefOr[scala.Nothing],
    encodingType: ValuesOf[CAPICOM_ENCODING_TYPE]
  ): String = js.native
  def EnhanceCades(cadesType: ValuesOf[CADESCOM_CADES_TYPE], TSAAddress: String): String = js.native
  def EnhanceCades(
    cadesType: ValuesOf[CADESCOM_CADES_TYPE],
    TSAAddress: String,
    encodingType: ValuesOf[CAPICOM_ENCODING_TYPE]
  ): String = js.native
  
  def SignCades(): String = js.native
  def SignCades(
    signer: js.UndefOr[scala.Nothing],
    CadesType: js.UndefOr[scala.Nothing],
    bDetached: js.UndefOr[scala.Nothing],
    EncodingType: ValuesOf[CAPICOM_ENCODING_TYPE]
  ): String = js.native
  def SignCades(signer: js.UndefOr[scala.Nothing], CadesType: js.UndefOr[scala.Nothing], bDetached: Boolean): String = js.native
  def SignCades(
    signer: js.UndefOr[scala.Nothing],
    CadesType: js.UndefOr[scala.Nothing],
    bDetached: Boolean,
    EncodingType: ValuesOf[CAPICOM_ENCODING_TYPE]
  ): String = js.native
  def SignCades(signer: js.UndefOr[scala.Nothing], CadesType: ValuesOf[CADESCOM_CADES_TYPE]): String = js.native
  def SignCades(
    signer: js.UndefOr[scala.Nothing],
    CadesType: ValuesOf[CADESCOM_CADES_TYPE],
    bDetached: js.UndefOr[scala.Nothing],
    EncodingType: ValuesOf[CAPICOM_ENCODING_TYPE]
  ): String = js.native
  def SignCades(signer: js.UndefOr[scala.Nothing], CadesType: ValuesOf[CADESCOM_CADES_TYPE], bDetached: Boolean): String = js.native
  def SignCades(
    signer: js.UndefOr[scala.Nothing],
    CadesType: ValuesOf[CADESCOM_CADES_TYPE],
    bDetached: Boolean,
    EncodingType: ValuesOf[CAPICOM_ENCODING_TYPE]
  ): String = js.native
  def SignCades(signer: CPSigner): String = js.native
  def SignCades(
    signer: CPSigner,
    CadesType: js.UndefOr[scala.Nothing],
    bDetached: js.UndefOr[scala.Nothing],
    EncodingType: ValuesOf[CAPICOM_ENCODING_TYPE]
  ): String = js.native
  def SignCades(signer: CPSigner, CadesType: js.UndefOr[scala.Nothing], bDetached: Boolean): String = js.native
  def SignCades(
    signer: CPSigner,
    CadesType: js.UndefOr[scala.Nothing],
    bDetached: Boolean,
    EncodingType: ValuesOf[CAPICOM_ENCODING_TYPE]
  ): String = js.native
  def SignCades(signer: CPSigner, CadesType: ValuesOf[CADESCOM_CADES_TYPE]): String = js.native
  def SignCades(
    signer: CPSigner,
    CadesType: ValuesOf[CADESCOM_CADES_TYPE],
    bDetached: js.UndefOr[scala.Nothing],
    EncodingType: ValuesOf[CAPICOM_ENCODING_TYPE]
  ): String = js.native
  def SignCades(signer: CPSigner, CadesType: ValuesOf[CADESCOM_CADES_TYPE], bDetached: Boolean): String = js.native
  def SignCades(
    signer: CPSigner,
    CadesType: ValuesOf[CADESCOM_CADES_TYPE],
    bDetached: Boolean,
    EncodingType: ValuesOf[CAPICOM_ENCODING_TYPE]
  ): String = js.native
  
  def VerifyCades(SignedMessage: String): Unit = js.native
  def VerifyCades(SignedMessage: String, CadesType: js.UndefOr[scala.Nothing], bDetached: Boolean): Unit = js.native
  def VerifyCades(SignedMessage: String, CadesType: ValuesOf[CADESCOM_CADES_TYPE]): Unit = js.native
  def VerifyCades(SignedMessage: String, CadesType: ValuesOf[CADESCOM_CADES_TYPE], bDetached: Boolean): Unit = js.native
}
