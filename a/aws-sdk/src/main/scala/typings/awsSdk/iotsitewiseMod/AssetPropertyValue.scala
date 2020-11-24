package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetPropertyValue extends js.Object {
  
  /**
    * The quality of the asset property value.
    */
  var quality: js.UndefOr[Quality] = js.native
  
  /**
    * The timestamp of the asset property value.
    */
  var timestamp: TimeInNanos = js.native
  
  /**
    * The value of the asset property (see Variant).
    */
  var value: Variant = js.native
}
object AssetPropertyValue {
  
  @scala.inline
  def apply(timestamp: TimeInNanos, value: Variant): AssetPropertyValue = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetPropertyValue]
  }
  
  @scala.inline
  implicit class AssetPropertyValueOps[Self <: AssetPropertyValue] (val x: Self) extends AnyVal {
    
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
    def setTimestamp(value: TimeInNanos): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Variant): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuality(value: Quality): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
  }
}
