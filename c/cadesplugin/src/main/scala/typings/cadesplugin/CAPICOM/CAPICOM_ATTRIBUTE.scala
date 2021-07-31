package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginNumbers.`0`
import typings.cadesplugin.cadespluginNumbers.`1`
import typings.cadesplugin.cadespluginNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CAPICOM_ATTRIBUTE extends StObject {
  
  val CAPICOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_DESCRIPTION: `2`
  
  val CAPICOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_NAME: `1`
  
  val CAPICOM_AUTHENTICATED_ATTRIBUTE_SIGNING_TIME: `0`
}
object CAPICOM_ATTRIBUTE {
  
  @scala.inline
  def apply(): CAPICOM_ATTRIBUTE = {
    val __obj = js.Dynamic.literal(CAPICOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_DESCRIPTION = 2, CAPICOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_NAME = 1, CAPICOM_AUTHENTICATED_ATTRIBUTE_SIGNING_TIME = 0)
    __obj.asInstanceOf[CAPICOM_ATTRIBUTE]
  }
  
  @scala.inline
  implicit class CAPICOM_ATTRIBUTEMutableBuilder[Self <: CAPICOM_ATTRIBUTE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCAPICOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_DESCRIPTION(value: `2`): Self = StObject.set(x, "CAPICOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_DESCRIPTION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_NAME(value: `1`): Self = StObject.set(x, "CAPICOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_NAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_AUTHENTICATED_ATTRIBUTE_SIGNING_TIME(value: `0`): Self = StObject.set(x, "CAPICOM_AUTHENTICATED_ATTRIBUTE_SIGNING_TIME", value.asInstanceOf[js.Any])
  }
}
