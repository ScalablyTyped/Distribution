package typings.cadesplugin.CAdESCOM

import typings.cadesplugin.cadespluginNumbers.`0`
import typings.cadesplugin.cadespluginNumbers.`1`
import typings.cadesplugin.cadespluginNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CADESCOM_XML_SIGNATURE_TYPE extends StObject {
  
  val CADESCOM_XML_SIGNATURE_TYPE_ENVELOPED: `0` = js.native
  
  val CADESCOM_XML_SIGNATURE_TYPE_ENVELOPING: `1` = js.native
  
  val CADESCOM_XML_SIGNATURE_TYPE_TEMPLATE: `2` = js.native
}
object CADESCOM_XML_SIGNATURE_TYPE {
  
  @scala.inline
  def apply(
    CADESCOM_XML_SIGNATURE_TYPE_ENVELOPED: `0`,
    CADESCOM_XML_SIGNATURE_TYPE_ENVELOPING: `1`,
    CADESCOM_XML_SIGNATURE_TYPE_TEMPLATE: `2`
  ): CADESCOM_XML_SIGNATURE_TYPE = {
    val __obj = js.Dynamic.literal(CADESCOM_XML_SIGNATURE_TYPE_ENVELOPED = CADESCOM_XML_SIGNATURE_TYPE_ENVELOPED.asInstanceOf[js.Any], CADESCOM_XML_SIGNATURE_TYPE_ENVELOPING = CADESCOM_XML_SIGNATURE_TYPE_ENVELOPING.asInstanceOf[js.Any], CADESCOM_XML_SIGNATURE_TYPE_TEMPLATE = CADESCOM_XML_SIGNATURE_TYPE_TEMPLATE.asInstanceOf[js.Any])
    __obj.asInstanceOf[CADESCOM_XML_SIGNATURE_TYPE]
  }
  
  @scala.inline
  implicit class CADESCOM_XML_SIGNATURE_TYPEMutableBuilder[Self <: CADESCOM_XML_SIGNATURE_TYPE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCADESCOM_XML_SIGNATURE_TYPE_ENVELOPED(value: `0`): Self = StObject.set(x, "CADESCOM_XML_SIGNATURE_TYPE_ENVELOPED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADESCOM_XML_SIGNATURE_TYPE_ENVELOPING(value: `1`): Self = StObject.set(x, "CADESCOM_XML_SIGNATURE_TYPE_ENVELOPING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADESCOM_XML_SIGNATURE_TYPE_TEMPLATE(value: `2`): Self = StObject.set(x, "CADESCOM_XML_SIGNATURE_TYPE_TEMPLATE", value.asInstanceOf[js.Any])
  }
}
