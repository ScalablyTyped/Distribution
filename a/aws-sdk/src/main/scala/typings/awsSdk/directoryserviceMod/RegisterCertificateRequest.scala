package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterCertificateRequest extends StObject {
  
  /**
    * The certificate PEM string that needs to be registered.
    */
  var CertificateData: typings.awsSdk.directoryserviceMod.CertificateData
  
  /**
    * A ClientCertAuthSettings object that contains client certificate authentication settings.
    */
  var ClientCertAuthSettings: js.UndefOr[typings.awsSdk.directoryserviceMod.ClientCertAuthSettings] = js.undefined
  
  /**
    * The identifier of the directory.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId
  
  /**
    * The function that the registered certificate performs. Valid values include ClientLDAPS or ClientCertAuth. The default value is ClientLDAPS.
    */
  var Type: js.UndefOr[CertificateType] = js.undefined
}
object RegisterCertificateRequest {
  
  inline def apply(CertificateData: CertificateData, DirectoryId: DirectoryId): RegisterCertificateRequest = {
    val __obj = js.Dynamic.literal(CertificateData = CertificateData.asInstanceOf[js.Any], DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterCertificateRequest]
  }
  
  extension [Self <: RegisterCertificateRequest](x: Self) {
    
    inline def setCertificateData(value: CertificateData): Self = StObject.set(x, "CertificateData", value.asInstanceOf[js.Any])
    
    inline def setClientCertAuthSettings(value: ClientCertAuthSettings): Self = StObject.set(x, "ClientCertAuthSettings", value.asInstanceOf[js.Any])
    
    inline def setClientCertAuthSettingsUndefined: Self = StObject.set(x, "ClientCertAuthSettings", js.undefined)
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setType(value: CertificateType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
