package typings.cadesplugin.CAdESCOM

import typings.cadesplugin.cadespluginInts.`-1`
import typings.cadesplugin.cadespluginInts.`0`
import typings.cadesplugin.cadespluginInts.`1`
import typings.cadesplugin.cadespluginInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CADESCOM_ATTRIBUTE extends StObject {
  
  val CADESCOM_ATTRIBUTE_OTHER: `-1`
  
  val CADESCOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_DESCRIPTION: `2`
  
  val CADESCOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_NAME: `1`
  
  val CADESCOM_AUTHENTICATED_ATTRIBUTE_SIGNING_TIME: `0`
}
object CADESCOM_ATTRIBUTE {
  
  inline def apply(): CADESCOM_ATTRIBUTE = {
    val __obj = js.Dynamic.literal(CADESCOM_ATTRIBUTE_OTHER = -1, CADESCOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_DESCRIPTION = 2, CADESCOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_NAME = 1, CADESCOM_AUTHENTICATED_ATTRIBUTE_SIGNING_TIME = 0)
    __obj.asInstanceOf[CADESCOM_ATTRIBUTE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CADESCOM_ATTRIBUTE] (val x: Self) extends AnyVal {
    
    inline def setCADESCOM_ATTRIBUTE_OTHER(value: `-1`): Self = StObject.set(x, "CADESCOM_ATTRIBUTE_OTHER", value.asInstanceOf[js.Any])
    
    inline def setCADESCOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_DESCRIPTION(value: `2`): Self = StObject.set(x, "CADESCOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_DESCRIPTION", value.asInstanceOf[js.Any])
    
    inline def setCADESCOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_NAME(value: `1`): Self = StObject.set(x, "CADESCOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_NAME", value.asInstanceOf[js.Any])
    
    inline def setCADESCOM_AUTHENTICATED_ATTRIBUTE_SIGNING_TIME(value: `0`): Self = StObject.set(x, "CADESCOM_AUTHENTICATED_ATTRIBUTE_SIGNING_TIME", value.asInstanceOf[js.Any])
  }
}
