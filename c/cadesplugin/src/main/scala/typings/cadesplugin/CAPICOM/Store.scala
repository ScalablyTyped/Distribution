package typings.cadesplugin.CAPICOM

import typings.cadesplugin.CADESCommon.ValuesOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Store extends js.Object {
  
  val Certificates: typings.cadesplugin.CAPICOM.Certificates = js.native
  
  def Close(): Unit = js.native
  
  def Delete(): Boolean = js.native
  
  def Import(encodedStore: String): Unit = js.native
  
  val Location: ValuesOf[CAPICOM_STORE_LOCATION] = js.native
  
  val Name: String = js.native
  
  def Open(): Unit = js.native
  def Open(
    location: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    openMode: ValuesOf[CAPICOM_STORE_OPEN_MODE]
  ): Unit = js.native
  def Open(location: js.UndefOr[scala.Nothing], name: ValuesOf[CAPICOM_STORE_NAME]): Unit = js.native
  def Open(
    location: js.UndefOr[scala.Nothing],
    name: ValuesOf[CAPICOM_STORE_NAME],
    openMode: ValuesOf[CAPICOM_STORE_OPEN_MODE]
  ): Unit = js.native
  def Open(location: ValuesOf[CAPICOM_STORE_LOCATION]): Unit = js.native
  def Open(
    location: ValuesOf[CAPICOM_STORE_LOCATION],
    name: js.UndefOr[scala.Nothing],
    openMode: ValuesOf[CAPICOM_STORE_OPEN_MODE]
  ): Unit = js.native
  def Open(location: ValuesOf[CAPICOM_STORE_LOCATION], name: ValuesOf[CAPICOM_STORE_NAME]): Unit = js.native
  def Open(
    location: ValuesOf[CAPICOM_STORE_LOCATION],
    name: ValuesOf[CAPICOM_STORE_NAME],
    openMode: ValuesOf[CAPICOM_STORE_OPEN_MODE]
  ): Unit = js.native
}
