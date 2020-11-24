package typings.chromeApps.chrome.audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceIdLists extends js.Object {
  
  /**
    * List of input devices specified by their ID.
    * To indicate input devices should be unaffected, leave this property unset.
    */
  var input: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * List of output devices specified by their ID.
    * To indicate output devices should be unaffected, leave this property unset.
    */
  var output: js.UndefOr[js.Array[String]] = js.native
}
object DeviceIdLists {
  
  @scala.inline
  def apply(): DeviceIdLists = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceIdLists]
  }
  
  @scala.inline
  implicit class DeviceIdListsOps[Self <: DeviceIdLists] (val x: Self) extends AnyVal {
    
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
    def setInputVarargs(value: String*): Self = this.set("input", js.Array(value :_*))
    
    @scala.inline
    def setInput(value: js.Array[String]): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setOutputVarargs(value: String*): Self = this.set("output", js.Array(value :_*))
    
    @scala.inline
    def setOutput(value: js.Array[String]): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
  }
}
