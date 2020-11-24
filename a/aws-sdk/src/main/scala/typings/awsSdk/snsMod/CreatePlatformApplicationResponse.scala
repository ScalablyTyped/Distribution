package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePlatformApplicationResponse extends js.Object {
  
  /**
    * PlatformApplicationArn is returned.
    */
  var PlatformApplicationArn: js.UndefOr[String] = js.native
}
object CreatePlatformApplicationResponse {
  
  @scala.inline
  def apply(): CreatePlatformApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePlatformApplicationResponse]
  }
  
  @scala.inline
  implicit class CreatePlatformApplicationResponseOps[Self <: CreatePlatformApplicationResponse] (val x: Self) extends AnyVal {
    
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
    def setPlatformApplicationArn(value: String): Self = this.set("PlatformApplicationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformApplicationArn: Self = this.set("PlatformApplicationArn", js.undefined)
  }
}
