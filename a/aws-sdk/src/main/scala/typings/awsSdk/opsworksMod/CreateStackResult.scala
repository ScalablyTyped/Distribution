package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateStackResult extends js.Object {
  
  /**
    * The stack ID, which is an opaque string that you use to identify the stack when performing actions such as DescribeStacks.
    */
  var StackId: js.UndefOr[String] = js.native
}
object CreateStackResult {
  
  @scala.inline
  def apply(): CreateStackResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStackResult]
  }
  
  @scala.inline
  implicit class CreateStackResultOps[Self <: CreateStackResult] (val x: Self) extends AnyVal {
    
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
    def setStackId(value: String): Self = this.set("StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackId: Self = this.set("StackId", js.undefined)
  }
}
