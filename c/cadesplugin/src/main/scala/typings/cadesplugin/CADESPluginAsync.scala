package typings.cadesplugin

import typings.cadesplugin.CAPICOM.StoreAsync
import typings.cadesplugin.CAdESCOM.AboutAsync
import typings.cadesplugin.CAdESCOM.CPAttributeAsync
import typings.cadesplugin.CAdESCOM.CPHashedDataAsync
import typings.cadesplugin.CAdESCOM.CPSignerAsync
import typings.cadesplugin.CAdESCOM.CadesSignedDataAsync
import typings.cadesplugin.CAdESCOM.RawSignatureAsync
import typings.cadesplugin.CAdESCOM.SignedXMLAsync
import typings.cadesplugin.cadespluginStrings.CAdESCOMDotAbout
import typings.cadesplugin.cadespluginStrings.CAdESCOMDotCPAttribute
import typings.cadesplugin.cadespluginStrings.CAdESCOMDotCPSigner
import typings.cadesplugin.cadespluginStrings.CAdESCOMDotCadesSignedData
import typings.cadesplugin.cadespluginStrings.CAdESCOMDotHashedData
import typings.cadesplugin.cadespluginStrings.CAdESCOMDotRawSignature
import typings.cadesplugin.cadespluginStrings.CAdESCOMDotSignedXML
import typings.cadesplugin.cadespluginStrings.CAdESCOMDotStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CADESPluginAsync
  extends CADESPluginBase
     with CADESPlugin {
  
  @JSName("CreateObjectAsync")
  def CreateObjectAsync_CAdESCOMAbout(objName: CAdESCOMDotAbout): js.Promise[AboutAsync] = js.native
  @JSName("CreateObjectAsync")
  def CreateObjectAsync_CAdESCOMCPAttribute(objName: CAdESCOMDotCPAttribute): js.Promise[CPAttributeAsync] = js.native
  @JSName("CreateObjectAsync")
  def CreateObjectAsync_CAdESCOMCPSigner(objName: CAdESCOMDotCPSigner): js.Promise[CPSignerAsync] = js.native
  @JSName("CreateObjectAsync")
  def CreateObjectAsync_CAdESCOMCadesSignedData(objName: CAdESCOMDotCadesSignedData): js.Promise[CadesSignedDataAsync] = js.native
  @JSName("CreateObjectAsync")
  def CreateObjectAsync_CAdESCOMHashedData(objName: CAdESCOMDotHashedData): js.Promise[CPHashedDataAsync] = js.native
  @JSName("CreateObjectAsync")
  def CreateObjectAsync_CAdESCOMRawSignature(objName: CAdESCOMDotRawSignature): js.Promise[RawSignatureAsync] = js.native
  @JSName("CreateObjectAsync")
  def CreateObjectAsync_CAdESCOMSignedXML(objName: CAdESCOMDotSignedXML): js.Promise[SignedXMLAsync] = js.native
  @JSName("CreateObjectAsync")
  def CreateObjectAsync_CAdESCOMStore(objName: CAdESCOMDotStore): js.Promise[StoreAsync] = js.native
  
  def ReleasePluginObjects(): js.Promise[Boolean] = js.native
  
  /* InferMemberOverrides */
  override def `then`[B](
    onFulfilled: js.Function1[scala.Nothing, B | js.Thenable[B]],
    onRejected: js.UndefOr[js.Function1[Any, B | js.Thenable[B]]]
  ): js.Promise[B] & js.Thenable[B] = js.native
  /* InferMemberOverrides */
  override def `then`[B](onFulfilled: Unit, onRejected: js.UndefOr[js.Function1[Any, B | js.Thenable[B]]]): js.Promise[B] & js.Thenable[B] = js.native
}
