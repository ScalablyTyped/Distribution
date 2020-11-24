package typings.cadesplugin.CAdESCOM

import typings.cadesplugin.cadespluginNumbers.`-1`
import typings.cadesplugin.cadespluginNumbers.`0`
import typings.cadesplugin.cadespluginNumbers.`1`
import typings.cadesplugin.cadespluginNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CADESCOM_ATTRIBUTE extends js.Object {
  
  val CADESCOM_ATTRIBUTE_OTHER: `-1` = js.native
  
  val CADESCOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_DESCRIPTION: `2` = js.native
  
  val CADESCOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_NAME: `1` = js.native
  
  val CADESCOM_AUTHENTICATED_ATTRIBUTE_SIGNING_TIME: `0` = js.native
}
object CADESCOM_ATTRIBUTE {
  
  @scala.inline
  def apply(
    CADESCOM_ATTRIBUTE_OTHER: `-1`,
    CADESCOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_DESCRIPTION: `2`,
    CADESCOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_NAME: `1`,
    CADESCOM_AUTHENTICATED_ATTRIBUTE_SIGNING_TIME: `0`
  ): CADESCOM_ATTRIBUTE = {
    val __obj = js.Dynamic.literal(CADESCOM_ATTRIBUTE_OTHER = CADESCOM_ATTRIBUTE_OTHER.asInstanceOf[js.Any], CADESCOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_DESCRIPTION = CADESCOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_DESCRIPTION.asInstanceOf[js.Any], CADESCOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_NAME = CADESCOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_NAME.asInstanceOf[js.Any], CADESCOM_AUTHENTICATED_ATTRIBUTE_SIGNING_TIME = CADESCOM_AUTHENTICATED_ATTRIBUTE_SIGNING_TIME.asInstanceOf[js.Any])
    __obj.asInstanceOf[CADESCOM_ATTRIBUTE]
  }
  
  @scala.inline
  implicit class CADESCOM_ATTRIBUTEOps[Self <: CADESCOM_ATTRIBUTE] (val x: Self) extends AnyVal {
    
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
    def setCADESCOM_ATTRIBUTE_OTHER(value: `-1`): Self = this.set("CADESCOM_ATTRIBUTE_OTHER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADESCOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_DESCRIPTION(value: `2`): Self = this.set("CADESCOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_DESCRIPTION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADESCOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_NAME(value: `1`): Self = this.set("CADESCOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_NAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADESCOM_AUTHENTICATED_ATTRIBUTE_SIGNING_TIME(value: `0`): Self = this.set("CADESCOM_AUTHENTICATED_ATTRIBUTE_SIGNING_TIME", value.asInstanceOf[js.Any])
  }
}
