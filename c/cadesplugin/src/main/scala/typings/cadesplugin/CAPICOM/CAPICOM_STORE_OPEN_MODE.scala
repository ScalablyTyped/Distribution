package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginNumbers.`0`
import typings.cadesplugin.cadespluginNumbers.`128`
import typings.cadesplugin.cadespluginNumbers.`1`
import typings.cadesplugin.cadespluginNumbers.`256`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CAPICOM_STORE_OPEN_MODE
  extends StObject
     with StoreOpenModePlugin {
  
  val CAPICOM_STORE_OPEN_EXISTING_ONLY: `128`
  
  val CAPICOM_STORE_OPEN_INCLUDE_ARCHIVED: `256`
  
  val CAPICOM_STORE_OPEN_READ_ONLY: `0`
  
  val CAPICOM_STORE_OPEN_READ_WRITE: `1`
}
object CAPICOM_STORE_OPEN_MODE {
  
  inline def apply(): CAPICOM_STORE_OPEN_MODE = {
    val __obj = js.Dynamic.literal(CAPICOM_STORE_OPEN_EXISTING_ONLY = 128, CAPICOM_STORE_OPEN_INCLUDE_ARCHIVED = 256, CAPICOM_STORE_OPEN_MAXIMUM_ALLOWED = 2, CAPICOM_STORE_OPEN_READ_ONLY = 0, CAPICOM_STORE_OPEN_READ_WRITE = 1)
    __obj.asInstanceOf[CAPICOM_STORE_OPEN_MODE]
  }
  
  extension [Self <: CAPICOM_STORE_OPEN_MODE](x: Self) {
    
    inline def setCAPICOM_STORE_OPEN_EXISTING_ONLY(value: `128`): Self = StObject.set(x, "CAPICOM_STORE_OPEN_EXISTING_ONLY", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_STORE_OPEN_INCLUDE_ARCHIVED(value: `256`): Self = StObject.set(x, "CAPICOM_STORE_OPEN_INCLUDE_ARCHIVED", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_STORE_OPEN_READ_ONLY(value: `0`): Self = StObject.set(x, "CAPICOM_STORE_OPEN_READ_ONLY", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_STORE_OPEN_READ_WRITE(value: `1`): Self = StObject.set(x, "CAPICOM_STORE_OPEN_READ_WRITE", value.asInstanceOf[js.Any])
  }
}
