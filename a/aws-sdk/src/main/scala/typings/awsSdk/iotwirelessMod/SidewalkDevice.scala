package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SidewalkDevice extends StObject {
  
  var AmazonId: js.UndefOr[typings.awsSdk.iotwirelessMod.AmazonId] = js.undefined
  
  /**
    * The sidewalk device certificates for Ed25519 and P256r1.
    */
  var DeviceCertificates: js.UndefOr[DeviceCertificateList] = js.undefined
  
  /**
    * The sidewalk device identification.
    */
  var SidewalkId: js.UndefOr[typings.awsSdk.iotwirelessMod.SidewalkId] = js.undefined
  
  /**
    * The Sidewalk manufacturing series number.
    */
  var SidewalkManufacturingSn: js.UndefOr[typings.awsSdk.iotwirelessMod.SidewalkManufacturingSn] = js.undefined
}
object SidewalkDevice {
  
  inline def apply(): SidewalkDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SidewalkDevice]
  }
  
  extension [Self <: SidewalkDevice](x: Self) {
    
    inline def setAmazonId(value: AmazonId): Self = StObject.set(x, "AmazonId", value.asInstanceOf[js.Any])
    
    inline def setAmazonIdUndefined: Self = StObject.set(x, "AmazonId", js.undefined)
    
    inline def setDeviceCertificates(value: DeviceCertificateList): Self = StObject.set(x, "DeviceCertificates", value.asInstanceOf[js.Any])
    
    inline def setDeviceCertificatesUndefined: Self = StObject.set(x, "DeviceCertificates", js.undefined)
    
    inline def setDeviceCertificatesVarargs(value: CertificateList*): Self = StObject.set(x, "DeviceCertificates", js.Array(value*))
    
    inline def setSidewalkId(value: SidewalkId): Self = StObject.set(x, "SidewalkId", value.asInstanceOf[js.Any])
    
    inline def setSidewalkIdUndefined: Self = StObject.set(x, "SidewalkId", js.undefined)
    
    inline def setSidewalkManufacturingSn(value: SidewalkManufacturingSn): Self = StObject.set(x, "SidewalkManufacturingSn", value.asInstanceOf[js.Any])
    
    inline def setSidewalkManufacturingSnUndefined: Self = StObject.set(x, "SidewalkManufacturingSn", js.undefined)
  }
}
