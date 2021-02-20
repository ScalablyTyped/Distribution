package typings.cadesplugin.CAdESCOM

import typings.cadesplugin.cadespluginNumbers.`0`
import typings.cadesplugin.cadespluginNumbers.`1`
import typings.cadesplugin.cadespluginNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CADESCOM_DISPLAY_DATA extends StObject {
  
  val CADESCOM_DISPLAY_DATA_ATTRIBUTE: `2` = js.native
  
  val CADESCOM_DISPLAY_DATA_CONTENT: `1` = js.native
  
  val CADESCOM_DISPLAY_DATA_NONE: `0` = js.native
}
object CADESCOM_DISPLAY_DATA {
  
  @scala.inline
  def apply(
    CADESCOM_DISPLAY_DATA_ATTRIBUTE: `2`,
    CADESCOM_DISPLAY_DATA_CONTENT: `1`,
    CADESCOM_DISPLAY_DATA_NONE: `0`
  ): CADESCOM_DISPLAY_DATA = {
    val __obj = js.Dynamic.literal(CADESCOM_DISPLAY_DATA_ATTRIBUTE = CADESCOM_DISPLAY_DATA_ATTRIBUTE.asInstanceOf[js.Any], CADESCOM_DISPLAY_DATA_CONTENT = CADESCOM_DISPLAY_DATA_CONTENT.asInstanceOf[js.Any], CADESCOM_DISPLAY_DATA_NONE = CADESCOM_DISPLAY_DATA_NONE.asInstanceOf[js.Any])
    __obj.asInstanceOf[CADESCOM_DISPLAY_DATA]
  }
  
  @scala.inline
  implicit class CADESCOM_DISPLAY_DATAMutableBuilder[Self <: CADESCOM_DISPLAY_DATA] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCADESCOM_DISPLAY_DATA_ATTRIBUTE(value: `2`): Self = StObject.set(x, "CADESCOM_DISPLAY_DATA_ATTRIBUTE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADESCOM_DISPLAY_DATA_CONTENT(value: `1`): Self = StObject.set(x, "CADESCOM_DISPLAY_DATA_CONTENT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADESCOM_DISPLAY_DATA_NONE(value: `0`): Self = StObject.set(x, "CADESCOM_DISPLAY_DATA_NONE", value.asInstanceOf[js.Any])
  }
}
