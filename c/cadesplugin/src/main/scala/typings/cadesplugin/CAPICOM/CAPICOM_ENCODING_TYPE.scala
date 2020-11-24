package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginNumbers.`-1`
import typings.cadesplugin.cadespluginNumbers.`0`
import typings.cadesplugin.cadespluginNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CAPICOM_ENCODING_TYPE extends js.Object {
  
  val CAPICOM_ENCODE_ANY: `-1` = js.native
  
  val CAPICOM_ENCODE_BASE64: `0` = js.native
  
  val CAPICOM_ENCODE_BINARY: `1` = js.native
}
object CAPICOM_ENCODING_TYPE {
  
  @scala.inline
  def apply(CAPICOM_ENCODE_ANY: `-1`, CAPICOM_ENCODE_BASE64: `0`, CAPICOM_ENCODE_BINARY: `1`): CAPICOM_ENCODING_TYPE = {
    val __obj = js.Dynamic.literal(CAPICOM_ENCODE_ANY = CAPICOM_ENCODE_ANY.asInstanceOf[js.Any], CAPICOM_ENCODE_BASE64 = CAPICOM_ENCODE_BASE64.asInstanceOf[js.Any], CAPICOM_ENCODE_BINARY = CAPICOM_ENCODE_BINARY.asInstanceOf[js.Any])
    __obj.asInstanceOf[CAPICOM_ENCODING_TYPE]
  }
  
  @scala.inline
  implicit class CAPICOM_ENCODING_TYPEOps[Self <: CAPICOM_ENCODING_TYPE] (val x: Self) extends AnyVal {
    
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
    def setCAPICOM_ENCODE_ANY(value: `-1`): Self = this.set("CAPICOM_ENCODE_ANY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_ENCODE_BASE64(value: `0`): Self = this.set("CAPICOM_ENCODE_BASE64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_ENCODE_BINARY(value: `1`): Self = this.set("CAPICOM_ENCODE_BINARY", value.asInstanceOf[js.Any])
  }
}
