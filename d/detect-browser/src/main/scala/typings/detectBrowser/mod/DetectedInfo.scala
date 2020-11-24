package typings.detectBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectedInfo[T /* <: DetectedInfoType */, N /* <: String */, O, V] extends js.Object {
  
  val name: N = js.native
  
  val os: O = js.native
  
  val `type`: T = js.native
  
  val version: V = js.native
}
object DetectedInfo {
  
  @scala.inline
  def apply[T /* <: DetectedInfoType */, N /* <: String */, O, V](name: N, os: O, `type`: T, version: V): DetectedInfo[T, N, O, V] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectedInfo[T, N, O, V]]
  }
  
  @scala.inline
  implicit class DetectedInfoOps[Self <: DetectedInfo[_, _, _, _], T /* <: DetectedInfoType */, N /* <: String */, O, V] (val x: Self with (DetectedInfo[T, N, O, V])) extends AnyVal {
    
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
    def setName(value: N): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(value: O): Self = this.set("os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: T): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: V): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
