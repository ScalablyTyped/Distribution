package typings.baiduApp.swan

import typings.baiduApp.anon.Swanid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwanIdTask extends js.Object {
  
  var data: Swanid = js.native
  
  var errno: String = js.native
}
object SwanIdTask {
  
  @scala.inline
  def apply(data: Swanid, errno: String): SwanIdTask = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errno = errno.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwanIdTask]
  }
  
  @scala.inline
  implicit class SwanIdTaskOps[Self <: SwanIdTask] (val x: Self) extends AnyVal {
    
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
    def setData(value: Swanid): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrno(value: String): Self = this.set("errno", value.asInstanceOf[js.Any])
  }
}
