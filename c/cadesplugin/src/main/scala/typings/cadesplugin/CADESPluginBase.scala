package typings.cadesplugin

import typings.cadesplugin.CADESCommon.ValuesOf
import typings.cadesplugin.CADES_Plugin.EncodingType
import typings.cadesplugin.CADES_Plugin.LogLevel
import typings.cadesplugin.CADES_Plugin.SignedXmlUrls
import typings.cadesplugin.CAPICOM.CAPICOM_ATTRIBUTE
import typings.cadesplugin.CAPICOM.CAPICOM_CERTIFICATE_FIND_TYPE
import typings.cadesplugin.CAPICOM.CAPICOM_CERTIFICATE_INCLUDE_OPTION
import typings.cadesplugin.CAPICOM.CAPICOM_PROPID
import typings.cadesplugin.CAPICOM.CertIntoTypePlugin
import typings.cadesplugin.CAPICOM.EKUPlugin
import typings.cadesplugin.CAPICOM.KeyUsagePlugin
import typings.cadesplugin.CAPICOM.OIDPlugin
import typings.cadesplugin.CAPICOM.StoreLocationPlugin
import typings.cadesplugin.CAPICOM.StoreNamePlugin
import typings.cadesplugin.CAPICOM.StoreOpenModePlugin
import typings.cadesplugin.CAdESCOM.CADESCOMInstallResponseRestrictionFlags
import typings.cadesplugin.CAdESCOM.CADESCOM_ATTRIBUTE
import typings.cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE
import typings.cadesplugin.CAdESCOM.CADESCOM_CONTENT_ENCODING_TYPE
import typings.cadesplugin.CAdESCOM.CADESCOM_DISPLAY_DATA
import typings.cadesplugin.CAdESCOM.CADESCOM_ENCRYPTION_ALGORITHM
import typings.cadesplugin.CAdESCOM.CADESCOM_HASH_ALGORITHM
import typings.cadesplugin.CAdESCOM.CADESCOM_XML_SIGNATURE_TYPE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CADESPluginBase
  extends js.Promise[scala.Nothing]
     with StoreLocationPlugin
     with typings.cadesplugin.CAdESCOM.StoreLocationPlugin
     with StoreNamePlugin
     with StoreOpenModePlugin
     with CAPICOM_CERTIFICATE_FIND_TYPE
     with LogLevel
     with CADESCOM_XML_SIGNATURE_TYPE
     with SignedXmlUrls
     with CADESCOM_CADES_TYPE
     with EncodingType
     with CAPICOM_CERTIFICATE_INCLUDE_OPTION
     with CertIntoTypePlugin
     with KeyUsagePlugin
     with CAPICOM_PROPID
     with OIDPlugin
     with EKUPlugin
     with CAPICOM_ATTRIBUTE
     with CADESCOM_ATTRIBUTE
     with CADESCOM_CONTENT_ENCODING_TYPE
     with CADESCOM_DISPLAY_DATA
     with CADESCOM_ENCRYPTION_ALGORITHM
     with CADESCOM_HASH_ALGORITHM
     with CADESCOMInstallResponseRestrictionFlags {
  
  val JSModuleVersion: String = js.native
  
  def async_spawn[T](generatorFun: js.Function1[/* repeated */ Any, js.Iterator[T]]): T = js.native
  
  val current_log_level: Double = js.native
  
  def getLastError(exception: js.Error): String = js.native
  
  def is_capilite_enabled(): Boolean = js.native
  
  def set(obj: CADESPluginBase): Unit = js.native
  
  def set_log_level(level: ValuesOf[LogLevel]): Unit = js.native
  
  /* InferMemberOverrides */
  override def `then`[B](
    onFulfilled: js.Function1[scala.Nothing, B | js.Thenable[B]],
    onRejected: js.UndefOr[js.Function1[Any, B | js.Thenable[B]]]
  ): js.Promise[B] & js.Thenable[B] = js.native
  /* InferMemberOverrides */
  override def `then`[B](onFulfilled: Unit, onRejected: js.UndefOr[js.Function1[Any, B | js.Thenable[B]]]): js.Promise[B] & js.Thenable[B] = js.native
}
