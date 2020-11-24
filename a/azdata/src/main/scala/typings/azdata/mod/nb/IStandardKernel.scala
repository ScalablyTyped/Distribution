package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStandardKernel extends js.Object {
  
  val connectionProviderIds: js.Array[String] = js.native
  
  val displayName: String = js.native
  
  val name: String = js.native
}
object IStandardKernel {
  
  @scala.inline
  def apply(connectionProviderIds: js.Array[String], displayName: String, name: String): IStandardKernel = {
    val __obj = js.Dynamic.literal(connectionProviderIds = connectionProviderIds.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStandardKernel]
  }
  
  @scala.inline
  implicit class IStandardKernelOps[Self <: IStandardKernel] (val x: Self) extends AnyVal {
    
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
    def setConnectionProviderIdsVarargs(value: String*): Self = this.set("connectionProviderIds", js.Array(value :_*))
    
    @scala.inline
    def setConnectionProviderIds(value: js.Array[String]): Self = this.set("connectionProviderIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
