package typings.cadesplugin

import typings.cadesplugin.CAPICOM.Store
import typings.cadesplugin.CAdESCOM.About
import typings.cadesplugin.CAdESCOM.CPAttribute
import typings.cadesplugin.CAdESCOM.CPHashedData
import typings.cadesplugin.CAdESCOM.CPSigner
import typings.cadesplugin.CAdESCOM.CadesSignedData
import typings.cadesplugin.CAdESCOM.RawSignature
import typings.cadesplugin.CAdESCOM.SignedXML
import typings.cadesplugin.cadespluginStrings.CAPICOMDotStore
import typings.cadesplugin.cadespluginStrings.CAdESCOMDotAbout
import typings.cadesplugin.cadespluginStrings.CAdESCOMDotCPAttribute
import typings.cadesplugin.cadespluginStrings.CAdESCOMDotCPSigner
import typings.cadesplugin.cadespluginStrings.CAdESCOMDotCadesSignedData
import typings.cadesplugin.cadespluginStrings.CAdESCOMDotHashedData
import typings.cadesplugin.cadespluginStrings.CAdESCOMDotRawSignature
import typings.cadesplugin.cadespluginStrings.CAdESCOMDotSignedXML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CADESPluginSync
  extends StObject
     with CADESPluginBase
     with CADESPlugin {
  
  @JSName("CreateObject")
  def CreateObject_CAPICOMStore(objName: CAPICOMDotStore): Store = js.native
  @JSName("CreateObject")
  def CreateObject_CAdESCOMAbout(objName: CAdESCOMDotAbout): About = js.native
  @JSName("CreateObject")
  def CreateObject_CAdESCOMCPAttribute(objName: CAdESCOMDotCPAttribute): CPAttribute = js.native
  @JSName("CreateObject")
  def CreateObject_CAdESCOMCPSigner(objName: CAdESCOMDotCPSigner): CPSigner = js.native
  @JSName("CreateObject")
  def CreateObject_CAdESCOMCadesSignedData(objName: CAdESCOMDotCadesSignedData): CadesSignedData = js.native
  @JSName("CreateObject")
  def CreateObject_CAdESCOMHashedData(objName: CAdESCOMDotHashedData): CPHashedData = js.native
  @JSName("CreateObject")
  def CreateObject_CAdESCOMRawSignature(objName: CAdESCOMDotRawSignature): RawSignature = js.native
  @JSName("CreateObject")
  def CreateObject_CAdESCOMSignedXML(objName: CAdESCOMDotSignedXML): SignedXML = js.native
}
