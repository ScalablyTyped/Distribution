package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginNumbers.`0`
import typings.cadesplugin.cadespluginNumbers.`1`
import typings.cadesplugin.cadespluginNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CAPICOM_ATTRIBUTE extends js.Object {
  
  val CAPICOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_DESCRIPTION: `2` = js.native
  
  val CAPICOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_NAME: `1` = js.native
  
  val CAPICOM_AUTHENTICATED_ATTRIBUTE_SIGNING_TIME: `0` = js.native
}
object CAPICOM_ATTRIBUTE {
  
  @scala.inline
  def apply(
    CAPICOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_DESCRIPTION: `2`,
    CAPICOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_NAME: `1`,
    CAPICOM_AUTHENTICATED_ATTRIBUTE_SIGNING_TIME: `0`
  ): CAPICOM_ATTRIBUTE = {
    val __obj = js.Dynamic.literal(CAPICOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_DESCRIPTION = CAPICOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_DESCRIPTION.asInstanceOf[js.Any], CAPICOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_NAME = CAPICOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_NAME.asInstanceOf[js.Any], CAPICOM_AUTHENTICATED_ATTRIBUTE_SIGNING_TIME = CAPICOM_AUTHENTICATED_ATTRIBUTE_SIGNING_TIME.asInstanceOf[js.Any])
    __obj.asInstanceOf[CAPICOM_ATTRIBUTE]
  }
  
  @scala.inline
  implicit class CAPICOM_ATTRIBUTEOps[Self <: CAPICOM_ATTRIBUTE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCAPICOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_DESCRIPTION(value: `2`): Self = this.set("CAPICOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_DESCRIPTION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_NAME(value: `1`): Self = this.set("CAPICOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_NAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_AUTHENTICATED_ATTRIBUTE_SIGNING_TIME(value: `0`): Self = this.set("CAPICOM_AUTHENTICATED_ATTRIBUTE_SIGNING_TIME", value.asInstanceOf[js.Any])
  }
}
