package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicenseInfo extends StObject {
  
  /**
    *  Name of the license. 
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    *  The URL for license data. 
    */
  var url: js.UndefOr[String] = js.undefined
}
object LicenseInfo {
  
  inline def apply(): LicenseInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseInfo]
  }
  
  extension [Self <: LicenseInfo](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
