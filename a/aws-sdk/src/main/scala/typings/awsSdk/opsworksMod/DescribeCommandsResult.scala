package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCommandsResult extends js.Object {
  
  /**
    * An array of Command objects that describe each of the specified commands.
    */
  var Commands: js.UndefOr[typings.awsSdk.opsworksMod.Commands] = js.native
}
object DescribeCommandsResult {
  
  @scala.inline
  def apply(): DescribeCommandsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCommandsResult]
  }
  
  @scala.inline
  implicit class DescribeCommandsResultOps[Self <: DescribeCommandsResult] (val x: Self) extends AnyVal {
    
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
    def setCommandsVarargs(value: Command*): Self = this.set("Commands", js.Array(value :_*))
    
    @scala.inline
    def setCommands(value: Commands): Self = this.set("Commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommands: Self = this.set("Commands", js.undefined)
  }
}
