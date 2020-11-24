package typings.cadesplugin.CADES_Plugin

import typings.cadesplugin.CAPICOM.StoreAsync
import typings.cadesplugin.CAdESCOM.AboutAsync
import typings.cadesplugin.CAdESCOM.CPAttributeAsync
import typings.cadesplugin.CAdESCOM.CPHashedDataAsync
import typings.cadesplugin.CAdESCOM.CPSignerAsync
import typings.cadesplugin.CAdESCOM.CadesSignedDataAsync
import typings.cadesplugin.CAdESCOM.RawSignatureAsync
import typings.cadesplugin.CAdESCOM.SignedXMLAsync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectNamesAsync extends js.Object {
  
  @JSName("CAdESCOM.About")
  var CAdESCOMDotAbout: AboutAsync = js.native
  
  @JSName("CAdESCOM.CPAttribute")
  var CAdESCOMDotCPAttribute: CPAttributeAsync = js.native
  
  @JSName("CAdESCOM.CPSigner")
  var CAdESCOMDotCPSigner: CPSignerAsync = js.native
  
  @JSName("CAdESCOM.CadesSignedData")
  var CAdESCOMDotCadesSignedData: CadesSignedDataAsync = js.native
  
  @JSName("CAdESCOM.HashedData")
  var CAdESCOMDotHashedData: CPHashedDataAsync = js.native
  
  @JSName("CAdESCOM.RawSignature")
  var CAdESCOMDotRawSignature: RawSignatureAsync = js.native
  
  @JSName("CAdESCOM.SignedXML")
  var CAdESCOMDotSignedXML: SignedXMLAsync = js.native
  
  @JSName("CAdESCOM.Store")
  var CAdESCOMDotStore: StoreAsync = js.native
}
object ObjectNamesAsync {
  
  @scala.inline
  def apply(
    CAdESCOMDotAbout: AboutAsync,
    CAdESCOMDotCPAttribute: CPAttributeAsync,
    CAdESCOMDotCPSigner: CPSignerAsync,
    CAdESCOMDotCadesSignedData: CadesSignedDataAsync,
    CAdESCOMDotHashedData: CPHashedDataAsync,
    CAdESCOMDotRawSignature: RawSignatureAsync,
    CAdESCOMDotSignedXML: SignedXMLAsync,
    CAdESCOMDotStore: StoreAsync
  ): ObjectNamesAsync = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CAdESCOM.About")(CAdESCOMDotAbout.asInstanceOf[js.Any])
    __obj.updateDynamic("CAdESCOM.CPAttribute")(CAdESCOMDotCPAttribute.asInstanceOf[js.Any])
    __obj.updateDynamic("CAdESCOM.CPSigner")(CAdESCOMDotCPSigner.asInstanceOf[js.Any])
    __obj.updateDynamic("CAdESCOM.CadesSignedData")(CAdESCOMDotCadesSignedData.asInstanceOf[js.Any])
    __obj.updateDynamic("CAdESCOM.HashedData")(CAdESCOMDotHashedData.asInstanceOf[js.Any])
    __obj.updateDynamic("CAdESCOM.RawSignature")(CAdESCOMDotRawSignature.asInstanceOf[js.Any])
    __obj.updateDynamic("CAdESCOM.SignedXML")(CAdESCOMDotSignedXML.asInstanceOf[js.Any])
    __obj.updateDynamic("CAdESCOM.Store")(CAdESCOMDotStore.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectNamesAsync]
  }
  
  @scala.inline
  implicit class ObjectNamesAsyncOps[Self <: ObjectNamesAsync] (val x: Self) extends AnyVal {
    
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
    def setCAdESCOMDotAbout(value: AboutAsync): Self = this.set("CAdESCOM.About", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAdESCOMDotCPAttribute(value: CPAttributeAsync): Self = this.set("CAdESCOM.CPAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAdESCOMDotCPSigner(value: CPSignerAsync): Self = this.set("CAdESCOM.CPSigner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAdESCOMDotCadesSignedData(value: CadesSignedDataAsync): Self = this.set("CAdESCOM.CadesSignedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAdESCOMDotHashedData(value: CPHashedDataAsync): Self = this.set("CAdESCOM.HashedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAdESCOMDotRawSignature(value: RawSignatureAsync): Self = this.set("CAdESCOM.RawSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAdESCOMDotSignedXML(value: SignedXMLAsync): Self = this.set("CAdESCOM.SignedXML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAdESCOMDotStore(value: StoreAsync): Self = this.set("CAdESCOM.Store", value.asInstanceOf[js.Any])
  }
}
