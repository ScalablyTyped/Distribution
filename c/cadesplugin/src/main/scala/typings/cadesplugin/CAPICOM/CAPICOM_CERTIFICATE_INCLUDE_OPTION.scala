package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginNumbers.`0`
import typings.cadesplugin.cadespluginNumbers.`1`
import typings.cadesplugin.cadespluginNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CAPICOM_CERTIFICATE_INCLUDE_OPTION extends js.Object {
  
  val CAPICOM_CERTIFICATE_INCLUDE_CHAIN_EXCEPT_ROOT: `0` = js.native
  
  val CAPICOM_CERTIFICATE_INCLUDE_END_ENTITY_ONLY: `2` = js.native
  
  val CAPICOM_CERTIFICATE_INCLUDE_WHOLE_CHAIN: `1` = js.native
}
object CAPICOM_CERTIFICATE_INCLUDE_OPTION {
  
  @scala.inline
  def apply(
    CAPICOM_CERTIFICATE_INCLUDE_CHAIN_EXCEPT_ROOT: `0`,
    CAPICOM_CERTIFICATE_INCLUDE_END_ENTITY_ONLY: `2`,
    CAPICOM_CERTIFICATE_INCLUDE_WHOLE_CHAIN: `1`
  ): CAPICOM_CERTIFICATE_INCLUDE_OPTION = {
    val __obj = js.Dynamic.literal(CAPICOM_CERTIFICATE_INCLUDE_CHAIN_EXCEPT_ROOT = CAPICOM_CERTIFICATE_INCLUDE_CHAIN_EXCEPT_ROOT.asInstanceOf[js.Any], CAPICOM_CERTIFICATE_INCLUDE_END_ENTITY_ONLY = CAPICOM_CERTIFICATE_INCLUDE_END_ENTITY_ONLY.asInstanceOf[js.Any], CAPICOM_CERTIFICATE_INCLUDE_WHOLE_CHAIN = CAPICOM_CERTIFICATE_INCLUDE_WHOLE_CHAIN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CAPICOM_CERTIFICATE_INCLUDE_OPTION]
  }
  
  @scala.inline
  implicit class CAPICOM_CERTIFICATE_INCLUDE_OPTIONOps[Self <: CAPICOM_CERTIFICATE_INCLUDE_OPTION] (val x: Self) extends AnyVal {
    
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
    def setCAPICOM_CERTIFICATE_INCLUDE_CHAIN_EXCEPT_ROOT(value: `0`): Self = this.set("CAPICOM_CERTIFICATE_INCLUDE_CHAIN_EXCEPT_ROOT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_CERTIFICATE_INCLUDE_END_ENTITY_ONLY(value: `2`): Self = this.set("CAPICOM_CERTIFICATE_INCLUDE_END_ENTITY_ONLY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_CERTIFICATE_INCLUDE_WHOLE_CHAIN(value: `1`): Self = this.set("CAPICOM_CERTIFICATE_INCLUDE_WHOLE_CHAIN", value.asInstanceOf[js.Any])
  }
}
