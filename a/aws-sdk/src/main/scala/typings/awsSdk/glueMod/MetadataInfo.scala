package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataInfo extends js.Object {
  
  /**
    * The time at which the entry was created.
    */
  var CreatedTime: js.UndefOr[CreatedTimestamp] = js.native
  
  /**
    * The metadata key’s corresponding value.
    */
  var MetadataValue: js.UndefOr[MetadataValueString] = js.native
}
object MetadataInfo {
  
  @scala.inline
  def apply(): MetadataInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataInfo]
  }
  
  @scala.inline
  implicit class MetadataInfoOps[Self <: MetadataInfo] (val x: Self) extends AnyVal {
    
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
    def setCreatedTime(value: CreatedTimestamp): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    
    @scala.inline
    def setMetadataValue(value: MetadataValueString): Self = this.set("MetadataValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadataValue: Self = this.set("MetadataValue", js.undefined)
  }
}
