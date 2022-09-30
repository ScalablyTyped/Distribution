package typings.cadesplugin.CAdESCOM

import typings.cadesplugin.cadespluginInts.`0`
import typings.cadesplugin.cadespluginInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CADESCOM_CONTENT_ENCODING_TYPE extends StObject {
  
  val CADESCOM_BASE64_TO_BINARY: `1`
  
  val CADESCOM_STRING_TO_UCS2LE: `0`
}
object CADESCOM_CONTENT_ENCODING_TYPE {
  
  inline def apply(): CADESCOM_CONTENT_ENCODING_TYPE = {
    val __obj = js.Dynamic.literal(CADESCOM_BASE64_TO_BINARY = 1, CADESCOM_STRING_TO_UCS2LE = 0)
    __obj.asInstanceOf[CADESCOM_CONTENT_ENCODING_TYPE]
  }
  
  extension [Self <: CADESCOM_CONTENT_ENCODING_TYPE](x: Self) {
    
    inline def setCADESCOM_BASE64_TO_BINARY(value: `1`): Self = StObject.set(x, "CADESCOM_BASE64_TO_BINARY", value.asInstanceOf[js.Any])
    
    inline def setCADESCOM_STRING_TO_UCS2LE(value: `0`): Self = StObject.set(x, "CADESCOM_STRING_TO_UCS2LE", value.asInstanceOf[js.Any])
  }
}
