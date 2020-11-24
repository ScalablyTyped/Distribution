package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISessionOptions extends js.Object {
  
  /**
    * The id of an existing kernel.
    */
  var kernelId: js.UndefOr[String] = js.native
  
  /**
    * The type of kernel (e.g. python3).
    */
  var kernelName: js.UndefOr[String] = js.native
  
  /**
    * The name of the session.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The path (not including name) to the session.
    */
  var path: String = js.native
  
  /**
    * The type of the session.
    */
  var `type`: js.UndefOr[String] = js.native
}
object ISessionOptions {
  
  @scala.inline
  def apply(path: String): ISessionOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISessionOptions]
  }
  
  @scala.inline
  implicit class ISessionOptionsOps[Self <: ISessionOptions] (val x: Self) extends AnyVal {
    
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelId(value: String): Self = this.set("kernelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernelId: Self = this.set("kernelId", js.undefined)
    
    @scala.inline
    def setKernelName(value: String): Self = this.set("kernelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernelName: Self = this.set("kernelName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
