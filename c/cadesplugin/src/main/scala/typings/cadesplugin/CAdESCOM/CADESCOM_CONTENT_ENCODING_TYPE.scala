package typings.cadesplugin.CAdESCOM

import typings.cadesplugin.cadespluginNumbers.`0`
import typings.cadesplugin.cadespluginNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CADESCOM_CONTENT_ENCODING_TYPE extends StObject {
  
  val CADESCOM_BASE64_TO_BINARY: `1` = js.native
  
  val CADESCOM_STRING_TO_UCS2LE: `0` = js.native
}
object CADESCOM_CONTENT_ENCODING_TYPE {
  
  @scala.inline
  def apply(CADESCOM_BASE64_TO_BINARY: `1`, CADESCOM_STRING_TO_UCS2LE: `0`): CADESCOM_CONTENT_ENCODING_TYPE = {
    val __obj = js.Dynamic.literal(CADESCOM_BASE64_TO_BINARY = CADESCOM_BASE64_TO_BINARY.asInstanceOf[js.Any], CADESCOM_STRING_TO_UCS2LE = CADESCOM_STRING_TO_UCS2LE.asInstanceOf[js.Any])
    __obj.asInstanceOf[CADESCOM_CONTENT_ENCODING_TYPE]
  }
  
  @scala.inline
  implicit class CADESCOM_CONTENT_ENCODING_TYPEMutableBuilder[Self <: CADESCOM_CONTENT_ENCODING_TYPE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCADESCOM_BASE64_TO_BINARY(value: `1`): Self = StObject.set(x, "CADESCOM_BASE64_TO_BINARY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADESCOM_STRING_TO_UCS2LE(value: `0`): Self = StObject.set(x, "CADESCOM_STRING_TO_UCS2LE", value.asInstanceOf[js.Any])
  }
}
