package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionRunAsConfig extends js.Object {
  
  /**
    * The group ID whose permissions are used to run a Lambda function.
    */
  var Gid: js.UndefOr[integer] = js.native
  
  /**
    * The user ID whose permissions are used to run a Lambda function.
    */
  var Uid: js.UndefOr[integer] = js.native
}
object FunctionRunAsConfig {
  
  @scala.inline
  def apply(): FunctionRunAsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionRunAsConfig]
  }
  
  @scala.inline
  implicit class FunctionRunAsConfigOps[Self <: FunctionRunAsConfig] (val x: Self) extends AnyVal {
    
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
    def setGid(value: integer): Self = this.set("Gid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGid: Self = this.set("Gid", js.undefined)
    
    @scala.inline
    def setUid(value: integer): Self = this.set("Uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUid: Self = this.set("Uid", js.undefined)
  }
}
