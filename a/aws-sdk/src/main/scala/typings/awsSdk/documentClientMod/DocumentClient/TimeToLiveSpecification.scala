package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeToLiveSpecification extends js.Object {
  
  /**
    * The name of the TTL attribute used to store the expiration time for items in the table.
    */
  var AttributeName: TimeToLiveAttributeName = js.native
  
  /**
    * Indicates whether TTL is to be enabled (true) or disabled (false) on the table.
    */
  var Enabled: TimeToLiveEnabled = js.native
}
object TimeToLiveSpecification {
  
  @scala.inline
  def apply(AttributeName: TimeToLiveAttributeName, Enabled: TimeToLiveEnabled): TimeToLiveSpecification = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeToLiveSpecification]
  }
  
  @scala.inline
  implicit class TimeToLiveSpecificationOps[Self <: TimeToLiveSpecification] (val x: Self) extends AnyVal {
    
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
    def setAttributeName(value: TimeToLiveAttributeName): Self = this.set("AttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: TimeToLiveEnabled): Self = this.set("Enabled", value.asInstanceOf[js.Any])
  }
}
