package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerDeInfo extends js.Object {
  
  /**
    * Name of the SerDe.
    */
  var Name: js.UndefOr[NameString] = js.native
  
  /**
    * These key-value pairs define initialization parameters for the SerDe.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.native
  
  /**
    * Usually the class that implements the SerDe. An example is org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe.
    */
  var SerializationLibrary: js.UndefOr[NameString] = js.native
}
object SerDeInfo {
  
  @scala.inline
  def apply(): SerDeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerDeInfo]
  }
  
  @scala.inline
  implicit class SerDeInfoOps[Self <: SerDeInfo] (val x: Self) extends AnyVal {
    
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
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setParameters(value: ParametersMap): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
    
    @scala.inline
    def setSerializationLibrary(value: NameString): Self = this.set("SerializationLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerializationLibrary: Self = this.set("SerializationLibrary", js.undefined)
  }
}
