package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KernelSpec extends js.Object {
  
  /**
    * The display name of the kernel.
    */
  var DisplayName: js.UndefOr[KernelDisplayName] = js.native
  
  /**
    * The name of the kernel.
    */
  var Name: KernelName = js.native
}
object KernelSpec {
  
  @scala.inline
  def apply(Name: KernelName): KernelSpec = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KernelSpec]
  }
  
  @scala.inline
  implicit class KernelSpecOps[Self <: KernelSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: KernelName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: KernelDisplayName): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
  }
}
