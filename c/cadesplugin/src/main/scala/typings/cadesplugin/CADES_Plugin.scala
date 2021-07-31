package typings.cadesplugin

import typings.cadesplugin.CAPICOM.Store
import typings.cadesplugin.CAPICOM.StoreAsync
import typings.cadesplugin.CAdESCOM.About
import typings.cadesplugin.CAdESCOM.AboutAsync
import typings.cadesplugin.CAdESCOM.CPAttribute
import typings.cadesplugin.CAdESCOM.CPAttributeAsync
import typings.cadesplugin.CAdESCOM.CPHashedData
import typings.cadesplugin.CAdESCOM.CPHashedDataAsync
import typings.cadesplugin.CAdESCOM.CPSigner
import typings.cadesplugin.CAdESCOM.CPSignerAsync
import typings.cadesplugin.CAdESCOM.CadesSignedData
import typings.cadesplugin.CAdESCOM.CadesSignedDataAsync
import typings.cadesplugin.CAdESCOM.RawSignature
import typings.cadesplugin.CAdESCOM.RawSignatureAsync
import typings.cadesplugin.CAdESCOM.SignedXML
import typings.cadesplugin.CAdESCOM.SignedXMLAsync
import typings.cadesplugin.cadespluginNumbers.`-1`
import typings.cadesplugin.cadespluginNumbers.`0`
import typings.cadesplugin.cadespluginNumbers.`1`
import typings.cadesplugin.cadespluginNumbers.`2`
import typings.cadesplugin.cadespluginNumbers.`4`
import typings.cadesplugin.cadespluginStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04Slashxmldsig-moreNumbersigngostr34102001-gostr3411`
import typings.cadesplugin.cadespluginStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04Slashxmldsig-moreNumbersigngostr3411`
import typings.cadesplugin.cadespluginStrings.`urnColonietfColonparamsColonxmlColonnsColoncpxmlsecColonalgorithmsColongostr34102001-gostr3411`
import typings.cadesplugin.cadespluginStrings.urnColonietfColonparamsColonxmlColonnsColoncpxmlsecColonalgorithmsColongostr3411
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CADES_Plugin {
  
  trait EncodingType extends StObject {
    
    val CADESCOM_ENCODE_ANY: `-1`
    
    val CADESCOM_ENCODE_BASE64: `0`
    
    val CADESCOM_ENCODE_BINARY: `1`
  }
  object EncodingType {
    
    @scala.inline
    def apply(): EncodingType = {
      val __obj = js.Dynamic.literal(CADESCOM_ENCODE_ANY = -1, CADESCOM_ENCODE_BASE64 = 0, CADESCOM_ENCODE_BINARY = 1)
      __obj.asInstanceOf[EncodingType]
    }
    
    @scala.inline
    implicit class EncodingTypeMutableBuilder[Self <: EncodingType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCADESCOM_ENCODE_ANY(value: `-1`): Self = StObject.set(x, "CADESCOM_ENCODE_ANY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCADESCOM_ENCODE_BASE64(value: `0`): Self = StObject.set(x, "CADESCOM_ENCODE_BASE64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCADESCOM_ENCODE_BINARY(value: `1`): Self = StObject.set(x, "CADESCOM_ENCODE_BINARY", value.asInstanceOf[js.Any])
    }
  }
  
  trait LogLevel extends StObject {
    
    val LOG_LEVEL_DEBUG: `4`
    
    val LOG_LEVEL_ERROR: `1`
    
    val LOG_LEVEL_INFO: `2`
  }
  object LogLevel {
    
    @scala.inline
    def apply(): LogLevel = {
      val __obj = js.Dynamic.literal(LOG_LEVEL_DEBUG = 4, LOG_LEVEL_ERROR = 1, LOG_LEVEL_INFO = 2)
      __obj.asInstanceOf[LogLevel]
    }
    
    @scala.inline
    implicit class LogLevelMutableBuilder[Self <: LogLevel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLOG_LEVEL_DEBUG(value: `4`): Self = StObject.set(x, "LOG_LEVEL_DEBUG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLOG_LEVEL_ERROR(value: `1`): Self = StObject.set(x, "LOG_LEVEL_ERROR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLOG_LEVEL_INFO(value: `2`): Self = StObject.set(x, "LOG_LEVEL_INFO", value.asInstanceOf[js.Any])
    }
  }
  
  trait ObjectNames extends StObject {
    
    @JSName("CAPICOM.Store")
    var CAPICOMDotStore: Store
    
    @JSName("CAdESCOM.About")
    var CAdESCOMDotAbout: About
    
    @JSName("CAdESCOM.CPAttribute")
    var CAdESCOMDotCPAttribute: CPAttribute
    
    @JSName("CAdESCOM.CPSigner")
    var CAdESCOMDotCPSigner: CPSigner
    
    @JSName("CAdESCOM.CadesSignedData")
    var CAdESCOMDotCadesSignedData: CadesSignedData
    
    @JSName("CAdESCOM.HashedData")
    var CAdESCOMDotHashedData: CPHashedData
    
    @JSName("CAdESCOM.RawSignature")
    var CAdESCOMDotRawSignature: RawSignature
    
    @JSName("CAdESCOM.SignedXML")
    var CAdESCOMDotSignedXML: SignedXML
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
    implicit class ObjectNamesMutableBuilder[Self <: ObjectNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCAPICOMDotStore(value: Store): Self = StObject.set(x, "CAPICOM.Store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCAdESCOMDotAbout(value: About): Self = StObject.set(x, "CAdESCOM.About", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCAdESCOMDotCPAttribute(value: CPAttribute): Self = StObject.set(x, "CAdESCOM.CPAttribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCAdESCOMDotCPSigner(value: CPSigner): Self = StObject.set(x, "CAdESCOM.CPSigner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCAdESCOMDotCadesSignedData(value: CadesSignedData): Self = StObject.set(x, "CAdESCOM.CadesSignedData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCAdESCOMDotHashedData(value: CPHashedData): Self = StObject.set(x, "CAdESCOM.HashedData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCAdESCOMDotRawSignature(value: RawSignature): Self = StObject.set(x, "CAdESCOM.RawSignature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCAdESCOMDotSignedXML(value: SignedXML): Self = StObject.set(x, "CAdESCOM.SignedXML", value.asInstanceOf[js.Any])
    }
  }
  
  trait ObjectNamesAsync extends StObject {
    
    @JSName("CAdESCOM.About")
    var CAdESCOMDotAbout: AboutAsync
    
    @JSName("CAdESCOM.CPAttribute")
    var CAdESCOMDotCPAttribute: CPAttributeAsync
    
    @JSName("CAdESCOM.CPSigner")
    var CAdESCOMDotCPSigner: CPSignerAsync
    
    @JSName("CAdESCOM.CadesSignedData")
    var CAdESCOMDotCadesSignedData: CadesSignedDataAsync
    
    @JSName("CAdESCOM.HashedData")
    var CAdESCOMDotHashedData: CPHashedDataAsync
    
    @JSName("CAdESCOM.RawSignature")
    var CAdESCOMDotRawSignature: RawSignatureAsync
    
    @JSName("CAdESCOM.SignedXML")
    var CAdESCOMDotSignedXML: SignedXMLAsync
    
    @JSName("CAdESCOM.Store")
    var CAdESCOMDotStore: StoreAsync
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
    implicit class ObjectNamesAsyncMutableBuilder[Self <: ObjectNamesAsync] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCAdESCOMDotAbout(value: AboutAsync): Self = StObject.set(x, "CAdESCOM.About", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCAdESCOMDotCPAttribute(value: CPAttributeAsync): Self = StObject.set(x, "CAdESCOM.CPAttribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCAdESCOMDotCPSigner(value: CPSignerAsync): Self = StObject.set(x, "CAdESCOM.CPSigner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCAdESCOMDotCadesSignedData(value: CadesSignedDataAsync): Self = StObject.set(x, "CAdESCOM.CadesSignedData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCAdESCOMDotHashedData(value: CPHashedDataAsync): Self = StObject.set(x, "CAdESCOM.HashedData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCAdESCOMDotRawSignature(value: RawSignatureAsync): Self = StObject.set(x, "CAdESCOM.RawSignature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCAdESCOMDotSignedXML(value: SignedXMLAsync): Self = StObject.set(x, "CAdESCOM.SignedXML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCAdESCOMDotStore(value: StoreAsync): Self = StObject.set(x, "CAdESCOM.Store", value.asInstanceOf[js.Any])
    }
  }
  
  trait SignedXmlUrls extends StObject {
    
    val XmlDsigGost3410Url: `urnColonietfColonparamsColonxmlColonnsColoncpxmlsecColonalgorithmsColongostr34102001-gostr3411`
    
    val XmlDsigGost3410UrlObsolete: `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04Slashxmldsig-moreNumbersigngostr34102001-gostr3411`
    
    val XmlDsigGost3411Url: urnColonietfColonparamsColonxmlColonnsColoncpxmlsecColonalgorithmsColongostr3411
    
    val XmlDsigGost3411UrlObsolete: `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04Slashxmldsig-moreNumbersigngostr3411`
  }
  object SignedXmlUrls {
    
    @scala.inline
    def apply(): SignedXmlUrls = {
      val __obj = js.Dynamic.literal(XmlDsigGost3410Url = "urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102001-gostr3411", XmlDsigGost3410UrlObsolete = "http://www.w3.org/2001/04/xmldsig-more#gostr34102001-gostr3411", XmlDsigGost3411Url = "urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr3411", XmlDsigGost3411UrlObsolete = "http://www.w3.org/2001/04/xmldsig-more#gostr3411")
      __obj.asInstanceOf[SignedXmlUrls]
    }
    
    @scala.inline
    implicit class SignedXmlUrlsMutableBuilder[Self <: SignedXmlUrls] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setXmlDsigGost3410Url(
        value: `urnColonietfColonparamsColonxmlColonnsColoncpxmlsecColonalgorithmsColongostr34102001-gostr3411`
      ): Self = StObject.set(x, "XmlDsigGost3410Url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlDsigGost3410UrlObsolete(
        value: `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04Slashxmldsig-moreNumbersigngostr34102001-gostr3411`
      ): Self = StObject.set(x, "XmlDsigGost3410UrlObsolete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlDsigGost3411Url(value: urnColonietfColonparamsColonxmlColonnsColoncpxmlsecColonalgorithmsColongostr3411): Self = StObject.set(x, "XmlDsigGost3411Url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlDsigGost3411UrlObsolete(value: `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04Slashxmldsig-moreNumbersigngostr3411`): Self = StObject.set(x, "XmlDsigGost3411UrlObsolete", value.asInstanceOf[js.Any])
    }
  }
}
