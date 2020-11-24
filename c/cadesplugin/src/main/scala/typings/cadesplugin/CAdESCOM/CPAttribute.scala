package typings.cadesplugin.CAdESCOM

import typings.cadesplugin.CADESCommon.ValuesOf
import typings.cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CPAttribute extends js.Object {
  
  var Name: ValuesOf[CADESCOM_ATTRIBUTE] = js.native
  
  var Value: js.Any = js.native
  
  var ValueEncoding: ValuesOf[CAPICOM_ENCODING_TYPE] = js.native
}
object CPAttribute {
  
  @scala.inline
  def apply(Name: ValuesOf[CADESCOM_ATTRIBUTE], Value: js.Any, ValueEncoding: ValuesOf[CAPICOM_ENCODING_TYPE]): CPAttribute = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], ValueEncoding = ValueEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPAttribute]
  }
  
  @scala.inline
  implicit class CPAttributeOps[Self <: CPAttribute] (val x: Self) extends AnyVal {
    
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
    def setName(value: ValuesOf[CADESCOM_ATTRIBUTE]): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueEncoding(value: ValuesOf[CAPICOM_ENCODING_TYPE]): Self = this.set("ValueEncoding", value.asInstanceOf[js.Any])
  }
}
