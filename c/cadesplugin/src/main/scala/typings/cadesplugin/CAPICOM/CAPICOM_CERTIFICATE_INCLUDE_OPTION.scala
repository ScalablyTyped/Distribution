package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginInts.`0`
import typings.cadesplugin.cadespluginInts.`1`
import typings.cadesplugin.cadespluginInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CAPICOM_CERTIFICATE_INCLUDE_OPTION extends StObject {
  
  val CAPICOM_CERTIFICATE_INCLUDE_CHAIN_EXCEPT_ROOT: `0`
  
  val CAPICOM_CERTIFICATE_INCLUDE_END_ENTITY_ONLY: `2`
  
  val CAPICOM_CERTIFICATE_INCLUDE_WHOLE_CHAIN: `1`
}
object CAPICOM_CERTIFICATE_INCLUDE_OPTION {
  
  inline def apply(): CAPICOM_CERTIFICATE_INCLUDE_OPTION = {
    val __obj = js.Dynamic.literal(CAPICOM_CERTIFICATE_INCLUDE_CHAIN_EXCEPT_ROOT = 0, CAPICOM_CERTIFICATE_INCLUDE_END_ENTITY_ONLY = 2, CAPICOM_CERTIFICATE_INCLUDE_WHOLE_CHAIN = 1)
    __obj.asInstanceOf[CAPICOM_CERTIFICATE_INCLUDE_OPTION]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CAPICOM_CERTIFICATE_INCLUDE_OPTION] (val x: Self) extends AnyVal {
    
    inline def setCAPICOM_CERTIFICATE_INCLUDE_CHAIN_EXCEPT_ROOT(value: `0`): Self = StObject.set(x, "CAPICOM_CERTIFICATE_INCLUDE_CHAIN_EXCEPT_ROOT", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_CERTIFICATE_INCLUDE_END_ENTITY_ONLY(value: `2`): Self = StObject.set(x, "CAPICOM_CERTIFICATE_INCLUDE_END_ENTITY_ONLY", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_CERTIFICATE_INCLUDE_WHOLE_CHAIN(value: `1`): Self = StObject.set(x, "CAPICOM_CERTIFICATE_INCLUDE_WHOLE_CHAIN", value.asInstanceOf[js.Any])
  }
}
