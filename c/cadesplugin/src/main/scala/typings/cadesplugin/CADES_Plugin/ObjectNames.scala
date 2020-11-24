package typings.cadesplugin.CADES_Plugin

import typings.cadesplugin.CAPICOM.Store
import typings.cadesplugin.CAdESCOM.About
import typings.cadesplugin.CAdESCOM.CPAttribute
import typings.cadesplugin.CAdESCOM.CPHashedData
import typings.cadesplugin.CAdESCOM.CPSigner
import typings.cadesplugin.CAdESCOM.CadesSignedData
import typings.cadesplugin.CAdESCOM.RawSignature
import typings.cadesplugin.CAdESCOM.SignedXML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectNames extends js.Object {
  
  @JSName("CAPICOM.Store")
  var CAPICOMDotStore: Store = js.native
  
  @JSName("CAdESCOM.About")
  var CAdESCOMDotAbout: About = js.native
  
  @JSName("CAdESCOM.CPAttribute")
  var CAdESCOMDotCPAttribute: CPAttribute = js.native
  
  @JSName("CAdESCOM.CPSigner")
  var CAdESCOMDotCPSigner: CPSigner = js.native
  
  @JSName("CAdESCOM.CadesSignedData")
  var CAdESCOMDotCadesSignedData: CadesSignedData = js.native
  
  @JSName("CAdESCOM.HashedData")
  var CAdESCOMDotHashedData: CPHashedData = js.native
  
  @JSName("CAdESCOM.RawSignature")
  var CAdESCOMDotRawSignature: RawSignature = js.native
  
  @JSName("CAdESCOM.SignedXML")
  var CAdESCOMDotSignedXML: SignedXML = js.native
}
object ObjectNames {
  
  @scala.inline
  def apply(
    CAPICOMDotStore: Store,
    CAdESCOMDotAbout: About,
    CAdESCOMDotCPAttribute: CPAttribute,
    CAdESCOMDotCPSigner: CPSigner,
    CAdESCOMDotCadesSignedData: CadesSignedData,
    CAdESCOMDotHashedData: CPHashedData,
    CAdESCOMDotRawSignature: RawSignature,
    CAdESCOMDotSignedXML: SignedXML
  ): ObjectNames = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CAPICOM.Store")(CAPICOMDotStore.asInstanceOf[js.Any])
    __obj.updateDynamic("CAdESCOM.About")(CAdESCOMDotAbout.asInstanceOf[js.Any])
    __obj.updateDynamic("CAdESCOM.CPAttribute")(CAdESCOMDotCPAttribute.asInstanceOf[js.Any])
    __obj.updateDynamic("CAdESCOM.CPSigner")(CAdESCOMDotCPSigner.asInstanceOf[js.Any])
    __obj.updateDynamic("CAdESCOM.CadesSignedData")(CAdESCOMDotCadesSignedData.asInstanceOf[js.Any])
    __obj.updateDynamic("CAdESCOM.HashedData")(CAdESCOMDotHashedData.asInstanceOf[js.Any])
    __obj.updateDynamic("CAdESCOM.RawSignature")(CAdESCOMDotRawSignature.asInstanceOf[js.Any])
    __obj.updateDynamic("CAdESCOM.SignedXML")(CAdESCOMDotSignedXML.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectNames]
  }
  
  @scala.inline
  implicit class ObjectNamesOps[Self <: ObjectNames] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCAPICOMDotStore(value: Store): Self = this.set("CAPICOM.Store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAdESCOMDotAbout(value: About): Self = this.set("CAdESCOM.About", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAdESCOMDotCPAttribute(value: CPAttribute): Self = this.set("CAdESCOM.CPAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAdESCOMDotCPSigner(value: CPSigner): Self = this.set("CAdESCOM.CPSigner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAdESCOMDotCadesSignedData(value: CadesSignedData): Self = this.set("CAdESCOM.CadesSignedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAdESCOMDotHashedData(value: CPHashedData): Self = this.set("CAdESCOM.HashedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAdESCOMDotRawSignature(value: RawSignature): Self = this.set("CAdESCOM.RawSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAdESCOMDotSignedXML(value: SignedXML): Self = this.set("CAdESCOM.SignedXML", value.asInstanceOf[js.Any])
  }
}
