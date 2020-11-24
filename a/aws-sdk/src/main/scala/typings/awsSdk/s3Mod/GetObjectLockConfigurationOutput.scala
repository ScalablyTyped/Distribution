package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetObjectLockConfigurationOutput extends js.Object {
  
  /**
    * The specified bucket's Object Lock configuration.
    */
  var ObjectLockConfiguration: js.UndefOr[typings.awsSdk.s3Mod.ObjectLockConfiguration] = js.native
}
object GetObjectLockConfigurationOutput {
  
  @scala.inline
  def apply(): GetObjectLockConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetObjectLockConfigurationOutput]
  }
  
  @scala.inline
  implicit class GetObjectLockConfigurationOutputOps[Self <: GetObjectLockConfigurationOutput] (val x: Self) extends AnyVal {
    
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
    def setObjectLockConfiguration(value: ObjectLockConfiguration): Self = this.set("ObjectLockConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectLockConfiguration: Self = this.set("ObjectLockConfiguration", js.undefined)
  }
}
