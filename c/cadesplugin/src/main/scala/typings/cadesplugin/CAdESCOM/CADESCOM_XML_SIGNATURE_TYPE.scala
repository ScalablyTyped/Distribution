package typings.cadesplugin.CAdESCOM

import typings.cadesplugin.cadespluginInts.`0`
import typings.cadesplugin.cadespluginInts.`1`
import typings.cadesplugin.cadespluginInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CADESCOM_XML_SIGNATURE_TYPE extends StObject {
  
  val CADESCOM_XML_SIGNATURE_TYPE_ENVELOPED: `0`
  
  val CADESCOM_XML_SIGNATURE_TYPE_ENVELOPING: `1`
  
  val CADESCOM_XML_SIGNATURE_TYPE_TEMPLATE: `2`
}
object CADESCOM_XML_SIGNATURE_TYPE {
  
  inline def apply(): CADESCOM_XML_SIGNATURE_TYPE = {
    val __obj = js.Dynamic.literal(CADESCOM_XML_SIGNATURE_TYPE_ENVELOPED = 0, CADESCOM_XML_SIGNATURE_TYPE_ENVELOPING = 1, CADESCOM_XML_SIGNATURE_TYPE_TEMPLATE = 2)
    __obj.asInstanceOf[CADESCOM_XML_SIGNATURE_TYPE]
  }
  
  extension [Self <: CADESCOM_XML_SIGNATURE_TYPE](x: Self) {
    
    inline def setCADESCOM_XML_SIGNATURE_TYPE_ENVELOPED(value: `0`): Self = StObject.set(x, "CADESCOM_XML_SIGNATURE_TYPE_ENVELOPED", value.asInstanceOf[js.Any])
    
    inline def setCADESCOM_XML_SIGNATURE_TYPE_ENVELOPING(value: `1`): Self = StObject.set(x, "CADESCOM_XML_SIGNATURE_TYPE_ENVELOPING", value.asInstanceOf[js.Any])
    
    inline def setCADESCOM_XML_SIGNATURE_TYPE_TEMPLATE(value: `2`): Self = StObject.set(x, "CADESCOM_XML_SIGNATURE_TYPE_TEMPLATE", value.asInstanceOf[js.Any])
  }
}
