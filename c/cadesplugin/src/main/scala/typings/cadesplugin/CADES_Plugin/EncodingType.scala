package typings.cadesplugin.CADES_Plugin

import typings.cadesplugin.cadespluginNumbers.`-1`
import typings.cadesplugin.cadespluginNumbers.`0`
import typings.cadesplugin.cadespluginNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncodingType extends js.Object {
  
  val CADESCOM_ENCODE_ANY: `-1` = js.native
  
  val CADESCOM_ENCODE_BASE64: `0` = js.native
  
  val CADESCOM_ENCODE_BINARY: `1` = js.native
}
object EncodingType {
  
  @scala.inline
  def apply(CADESCOM_ENCODE_ANY: `-1`, CADESCOM_ENCODE_BASE64: `0`, CADESCOM_ENCODE_BINARY: `1`): EncodingType = {
    val __obj = js.Dynamic.literal(CADESCOM_ENCODE_ANY = CADESCOM_ENCODE_ANY.asInstanceOf[js.Any], CADESCOM_ENCODE_BASE64 = CADESCOM_ENCODE_BASE64.asInstanceOf[js.Any], CADESCOM_ENCODE_BINARY = CADESCOM_ENCODE_BINARY.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodingType]
  }
  
  @scala.inline
  implicit class EncodingTypeOps[Self <: EncodingType] (val x: Self) extends AnyVal {
    
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
    def setCADESCOM_ENCODE_ANY(value: `-1`): Self = this.set("CADESCOM_ENCODE_ANY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADESCOM_ENCODE_BASE64(value: `0`): Self = this.set("CADESCOM_ENCODE_BASE64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADESCOM_ENCODE_BINARY(value: `1`): Self = this.set("CADESCOM_ENCODE_BINARY", value.asInstanceOf[js.Any])
  }
}
