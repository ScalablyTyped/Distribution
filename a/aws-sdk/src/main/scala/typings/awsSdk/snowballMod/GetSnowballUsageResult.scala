package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSnowballUsageResult extends js.Object {
  
  /**
    * The service limit for number of Snow devices this account can have at once. The default service limit is 1 (one).
    */
  var SnowballLimit: js.UndefOr[Integer] = js.native
  
  /**
    * The number of Snow devices that this account is currently using.
    */
  var SnowballsInUse: js.UndefOr[Integer] = js.native
}
object GetSnowballUsageResult {
  
  @scala.inline
  def apply(): GetSnowballUsageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSnowballUsageResult]
  }
  
  @scala.inline
  implicit class GetSnowballUsageResultOps[Self <: GetSnowballUsageResult] (val x: Self) extends AnyVal {
    
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
    def setSnowballLimit(value: Integer): Self = this.set("SnowballLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnowballLimit: Self = this.set("SnowballLimit", js.undefined)
    
    @scala.inline
    def setSnowballsInUse(value: Integer): Self = this.set("SnowballsInUse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnowballsInUse: Self = this.set("SnowballsInUse", js.undefined)
  }
}
