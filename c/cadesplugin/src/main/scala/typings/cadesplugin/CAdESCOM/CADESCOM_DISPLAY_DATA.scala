package typings.cadesplugin.CAdESCOM

import typings.cadesplugin.cadespluginInts.`0`
import typings.cadesplugin.cadespluginInts.`1`
import typings.cadesplugin.cadespluginInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CADESCOM_DISPLAY_DATA extends StObject {
  
  val CADESCOM_DISPLAY_DATA_ATTRIBUTE: `2`
  
  val CADESCOM_DISPLAY_DATA_CONTENT: `1`
  
  val CADESCOM_DISPLAY_DATA_NONE: `0`
}
object CADESCOM_DISPLAY_DATA {
  
  inline def apply(): CADESCOM_DISPLAY_DATA = {
    val __obj = js.Dynamic.literal(CADESCOM_DISPLAY_DATA_ATTRIBUTE = 2, CADESCOM_DISPLAY_DATA_CONTENT = 1, CADESCOM_DISPLAY_DATA_NONE = 0)
    __obj.asInstanceOf[CADESCOM_DISPLAY_DATA]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CADESCOM_DISPLAY_DATA] (val x: Self) extends AnyVal {
    
    inline def setCADESCOM_DISPLAY_DATA_ATTRIBUTE(value: `2`): Self = StObject.set(x, "CADESCOM_DISPLAY_DATA_ATTRIBUTE", value.asInstanceOf[js.Any])
    
    inline def setCADESCOM_DISPLAY_DATA_CONTENT(value: `1`): Self = StObject.set(x, "CADESCOM_DISPLAY_DATA_CONTENT", value.asInstanceOf[js.Any])
    
    inline def setCADESCOM_DISPLAY_DATA_NONE(value: `0`): Self = StObject.set(x, "CADESCOM_DISPLAY_DATA_NONE", value.asInstanceOf[js.Any])
  }
}
