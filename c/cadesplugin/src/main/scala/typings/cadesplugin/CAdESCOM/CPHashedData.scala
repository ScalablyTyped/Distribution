package typings.cadesplugin.CAdESCOM

import typings.cadesplugin.CADESCommon.ValuesOf
import typings.cadesplugin.CAPICOM.CAPICOM_HASH_ALGORITHM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CPHashedData extends js.Object {
  
  var Algorithm: ValuesOf[CAPICOM_HASH_ALGORITHM] = js.native
  
  var DataEncoding: ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE] = js.native
  
  def Hash(newVal: String): Unit = js.native
  
  def SetHashValue(newVal: String): Unit = js.native
  
  var Value: String = js.native
}
object CPHashedData {
  
  @scala.inline
  def apply(
    Algorithm: ValuesOf[CAPICOM_HASH_ALGORITHM],
    DataEncoding: ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE],
    Hash: String => Unit,
    SetHashValue: String => Unit,
    Value: String
  ): CPHashedData = {
    val __obj = js.Dynamic.literal(Algorithm = Algorithm.asInstanceOf[js.Any], DataEncoding = DataEncoding.asInstanceOf[js.Any], Hash = js.Any.fromFunction1(Hash), SetHashValue = js.Any.fromFunction1(SetHashValue), Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPHashedData]
  }
  
  @scala.inline
  implicit class CPHashedDataOps[Self <: CPHashedData] (val x: Self) extends AnyVal {
    
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
    def setAlgorithm(value: ValuesOf[CAPICOM_HASH_ALGORITHM]): Self = this.set("Algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataEncoding(value: ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE]): Self = this.set("DataEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: String => Unit): Self = this.set("Hash", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHashValue(value: String => Unit): Self = this.set("SetHashValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
}
