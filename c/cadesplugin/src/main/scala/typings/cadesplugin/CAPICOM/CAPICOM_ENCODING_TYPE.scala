package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginInts.`-1`
import typings.cadesplugin.cadespluginInts.`0`
import typings.cadesplugin.cadespluginInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CAPICOM_ENCODING_TYPE extends StObject {
  
  val CAPICOM_ENCODE_ANY: `-1`
  
  val CAPICOM_ENCODE_BASE64: `0`
  
  val CAPICOM_ENCODE_BINARY: `1`
}
object CAPICOM_ENCODING_TYPE {
  
  inline def apply(): CAPICOM_ENCODING_TYPE = {
    val __obj = js.Dynamic.literal(CAPICOM_ENCODE_ANY = -1, CAPICOM_ENCODE_BASE64 = 0, CAPICOM_ENCODE_BINARY = 1)
    __obj.asInstanceOf[CAPICOM_ENCODING_TYPE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CAPICOM_ENCODING_TYPE] (val x: Self) extends AnyVal {
    
    inline def setCAPICOM_ENCODE_ANY(value: `-1`): Self = StObject.set(x, "CAPICOM_ENCODE_ANY", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_ENCODE_BASE64(value: `0`): Self = StObject.set(x, "CAPICOM_ENCODE_BASE64", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_ENCODE_BINARY(value: `1`): Self = StObject.set(x, "CAPICOM_ENCODE_BINARY", value.asInstanceOf[js.Any])
  }
}
