package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginNumbers.`0`
import typings.cadesplugin.cadespluginNumbers.`128`
import typings.cadesplugin.cadespluginNumbers.`1`
import typings.cadesplugin.cadespluginNumbers.`256`
import typings.cadesplugin.cadespluginNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CAPICOM_STORE_OPEN_MODE extends StoreOpenModePlugin {
  
  val CAPICOM_STORE_OPEN_EXISTING_ONLY: `128` = js.native
  
  val CAPICOM_STORE_OPEN_INCLUDE_ARCHIVED: `256` = js.native
  
  val CAPICOM_STORE_OPEN_READ_ONLY: `0` = js.native
  
  val CAPICOM_STORE_OPEN_READ_WRITE: `1` = js.native
}
object CAPICOM_STORE_OPEN_MODE {
  
  @scala.inline
  def apply(
    CAPICOM_STORE_OPEN_EXISTING_ONLY: `128`,
    CAPICOM_STORE_OPEN_INCLUDE_ARCHIVED: `256`,
    CAPICOM_STORE_OPEN_MAXIMUM_ALLOWED: `2`,
    CAPICOM_STORE_OPEN_READ_ONLY: `0`,
    CAPICOM_STORE_OPEN_READ_WRITE: `1`
  ): CAPICOM_STORE_OPEN_MODE = {
    val __obj = js.Dynamic.literal(CAPICOM_STORE_OPEN_EXISTING_ONLY = CAPICOM_STORE_OPEN_EXISTING_ONLY.asInstanceOf[js.Any], CAPICOM_STORE_OPEN_INCLUDE_ARCHIVED = CAPICOM_STORE_OPEN_INCLUDE_ARCHIVED.asInstanceOf[js.Any], CAPICOM_STORE_OPEN_MAXIMUM_ALLOWED = CAPICOM_STORE_OPEN_MAXIMUM_ALLOWED.asInstanceOf[js.Any], CAPICOM_STORE_OPEN_READ_ONLY = CAPICOM_STORE_OPEN_READ_ONLY.asInstanceOf[js.Any], CAPICOM_STORE_OPEN_READ_WRITE = CAPICOM_STORE_OPEN_READ_WRITE.asInstanceOf[js.Any])
    __obj.asInstanceOf[CAPICOM_STORE_OPEN_MODE]
  }
  
  @scala.inline
  implicit class CAPICOM_STORE_OPEN_MODEOps[Self <: CAPICOM_STORE_OPEN_MODE] (val x: Self) extends AnyVal {
    
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
    def setCAPICOM_STORE_OPEN_EXISTING_ONLY(value: `128`): Self = this.set("CAPICOM_STORE_OPEN_EXISTING_ONLY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_STORE_OPEN_INCLUDE_ARCHIVED(value: `256`): Self = this.set("CAPICOM_STORE_OPEN_INCLUDE_ARCHIVED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_STORE_OPEN_READ_ONLY(value: `0`): Self = this.set("CAPICOM_STORE_OPEN_READ_ONLY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_STORE_OPEN_READ_WRITE(value: `1`): Self = this.set("CAPICOM_STORE_OPEN_READ_WRITE", value.asInstanceOf[js.Any])
  }
}
