package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAppImageConfigResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) for the AppImageConfig.
    */
  var AppImageConfigArn: js.UndefOr[typings.awsSdk.sagemakerMod.AppImageConfigArn] = js.native
}
object UpdateAppImageConfigResponse {
  
  @scala.inline
  def apply(): UpdateAppImageConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAppImageConfigResponse]
  }
  
  @scala.inline
  implicit class UpdateAppImageConfigResponseOps[Self <: UpdateAppImageConfigResponse] (val x: Self) extends AnyVal {
    
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
    def setAppImageConfigArn(value: AppImageConfigArn): Self = this.set("AppImageConfigArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppImageConfigArn: Self = this.set("AppImageConfigArn", js.undefined)
  }
}
