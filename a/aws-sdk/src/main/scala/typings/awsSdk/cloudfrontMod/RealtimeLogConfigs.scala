package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RealtimeLogConfigs extends js.Object {
  
  /**
    * A flag that indicates whether there are more real-time log configurations than are contained in this list.
    */
  var IsTruncated: Boolean = js.native
  
  /**
    * Contains the list of real-time log configurations.
    */
  var Items: js.UndefOr[RealtimeLogConfigList] = js.native
  
  /**
    * This parameter indicates where this list of real-time log configurations begins. This list includes real-time log configurations that occur after the marker.
    */
  var Marker: String = js.native
  
  /**
    * The maximum number of real-time log configurations requested.
    */
  var MaxItems: integer = js.native
  
  /**
    * If there are more items in the list than are in this response, this element is present. It contains the value that you should use in the Marker field of a subsequent request to continue listing real-time log configurations where you left off. 
    */
  var NextMarker: js.UndefOr[String] = js.native
}
object RealtimeLogConfigs {
  
  @scala.inline
  def apply(IsTruncated: Boolean, Marker: String, MaxItems: integer): RealtimeLogConfigs = {
    val __obj = js.Dynamic.literal(IsTruncated = IsTruncated.asInstanceOf[js.Any], Marker = Marker.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealtimeLogConfigs]
  }
  
  @scala.inline
  implicit class RealtimeLogConfigsOps[Self <: RealtimeLogConfigs] (val x: Self) extends AnyVal {
    
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
    def setIsTruncated(value: Boolean): Self = this.set("IsTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItems(value: integer): Self = this.set("MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: RealtimeLogConfig*): Self = this.set("Items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: RealtimeLogConfigList): Self = this.set("Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("Items", js.undefined)
    
    @scala.inline
    def setNextMarker(value: String): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
  }
}
