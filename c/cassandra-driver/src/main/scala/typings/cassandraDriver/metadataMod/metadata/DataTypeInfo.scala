package typings.cassandraDriver.metadataMod.metadata

import typings.cassandraDriver.anon.Frozen
import typings.cassandraDriver.typesMod.types.dataTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTypeInfo extends js.Object {
  
  var code: dataTypes = js.native
  
  var info: String | DataTypeInfo | js.Array[DataTypeInfo] = js.native
  
  var options: Frozen = js.native
}
object DataTypeInfo {
  
  @scala.inline
  def apply(code: dataTypes, info: String | DataTypeInfo | js.Array[DataTypeInfo], options: Frozen): DataTypeInfo = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTypeInfo]
  }
  
  @scala.inline
  implicit class DataTypeInfoOps[Self <: DataTypeInfo] (val x: Self) extends AnyVal {
    
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
    def setCode(value: dataTypes): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoVarargs(value: DataTypeInfo*): Self = this.set("info", js.Array(value :_*))
    
    @scala.inline
    def setInfo(value: String | DataTypeInfo | js.Array[DataTypeInfo]): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: Frozen): Self = this.set("options", value.asInstanceOf[js.Any])
  }
}
