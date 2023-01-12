package typings.cadesplugin.CAdESCOM

import typings.cadesplugin.cadespluginInts.`0`
import typings.cadesplugin.cadespluginInts.`0x10000000`
import typings.cadesplugin.cadespluginInts.`1`
import typings.cadesplugin.cadespluginInts.`2`
import typings.cadesplugin.cadespluginInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CADESCOMInstallResponseRestrictionFlags extends StObject {
  
  val CADESCOM_AllowNoOutstandingRequest: `1`
  
  val CADESCOM_AllowNone: `0`
  
  val CADESCOM_AllowUntrustedCertificate: `2`
  
  val CADESCOM_AllowUntrustedRoot: `4`
  
  val CADESCOM_SkipInstallToStore: `0x10000000`
}
object CADESCOMInstallResponseRestrictionFlags {
  
  inline def apply(): CADESCOMInstallResponseRestrictionFlags = {
    val __obj = js.Dynamic.literal(CADESCOM_AllowNoOutstandingRequest = 1, CADESCOM_AllowNone = 0, CADESCOM_AllowUntrustedCertificate = 2, CADESCOM_AllowUntrustedRoot = 4, CADESCOM_SkipInstallToStore = 0x10000000)
    __obj.asInstanceOf[CADESCOMInstallResponseRestrictionFlags]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CADESCOMInstallResponseRestrictionFlags] (val x: Self) extends AnyVal {
    
    inline def setCADESCOM_AllowNoOutstandingRequest(value: `1`): Self = StObject.set(x, "CADESCOM_AllowNoOutstandingRequest", value.asInstanceOf[js.Any])
    
    inline def setCADESCOM_AllowNone(value: `0`): Self = StObject.set(x, "CADESCOM_AllowNone", value.asInstanceOf[js.Any])
    
    inline def setCADESCOM_AllowUntrustedCertificate(value: `2`): Self = StObject.set(x, "CADESCOM_AllowUntrustedCertificate", value.asInstanceOf[js.Any])
    
    inline def setCADESCOM_AllowUntrustedRoot(value: `4`): Self = StObject.set(x, "CADESCOM_AllowUntrustedRoot", value.asInstanceOf[js.Any])
    
    inline def setCADESCOM_SkipInstallToStore(value: `0x10000000`): Self = StObject.set(x, "CADESCOM_SkipInstallToStore", value.asInstanceOf[js.Any])
  }
}
