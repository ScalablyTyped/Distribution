package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceLimit extends js.Object {
  
  /**
    * Specifies whether the account has met the quota that corresponds to the metric specified by the UsageByAccount.type field in the response.
    */
  var isServiceLimited: js.UndefOr[boolean] = js.native
  
  /**
    * The unit of measurement for the value specified by the value field.
    */
  var unit: js.UndefOr[Unit] = js.native
  
  /**
    * The value for the metric specified by the UsageByAccount.type field in the response.
    */
  var value: js.UndefOr[long] = js.native
}
object ServiceLimit {
  
  @scala.inline
  def apply(): ServiceLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceLimit]
  }
  
  @scala.inline
  implicit class ServiceLimitOps[Self <: ServiceLimit] (val x: Self) extends AnyVal {
    
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
    def setIsServiceLimited(value: boolean): Self = this.set("isServiceLimited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsServiceLimited: Self = this.set("isServiceLimited", js.undefined)
    
    @scala.inline
    def setUnit(value: Unit): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    
    @scala.inline
    def setValue(value: long): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
