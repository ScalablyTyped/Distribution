package typings.awsSdk.simpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainMetadataResult extends js.Object {
  
  /**
    * The number of unique attribute names in the domain.
    */
  var AttributeNameCount: js.UndefOr[Integer] = js.native
  
  /**
    * The total size of all unique attribute names in the domain, in bytes.
    */
  var AttributeNamesSizeBytes: js.UndefOr[Long] = js.native
  
  /**
    * The number of all attribute name/value pairs in the domain.
    */
  var AttributeValueCount: js.UndefOr[Integer] = js.native
  
  /**
    * The total size of all attribute values in the domain, in bytes.
    */
  var AttributeValuesSizeBytes: js.UndefOr[Long] = js.native
  
  /**
    * The number of all items in the domain.
    */
  var ItemCount: js.UndefOr[Integer] = js.native
  
  /**
    * The total size of all item names in the domain, in bytes.
    */
  var ItemNamesSizeBytes: js.UndefOr[Long] = js.native
  
  /**
    * The data and time when metadata was calculated, in Epoch (UNIX) seconds.
    */
  var Timestamp: js.UndefOr[Integer] = js.native
}
object DomainMetadataResult {
  
  @scala.inline
  def apply(): DomainMetadataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainMetadataResult]
  }
  
  @scala.inline
  implicit class DomainMetadataResultOps[Self <: DomainMetadataResult] (val x: Self) extends AnyVal {
    
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
    def setAttributeNameCount(value: Integer): Self = this.set("AttributeNameCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeNameCount: Self = this.set("AttributeNameCount", js.undefined)
    
    @scala.inline
    def setAttributeNamesSizeBytes(value: Long): Self = this.set("AttributeNamesSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeNamesSizeBytes: Self = this.set("AttributeNamesSizeBytes", js.undefined)
    
    @scala.inline
    def setAttributeValueCount(value: Integer): Self = this.set("AttributeValueCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeValueCount: Self = this.set("AttributeValueCount", js.undefined)
    
    @scala.inline
    def setAttributeValuesSizeBytes(value: Long): Self = this.set("AttributeValuesSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeValuesSizeBytes: Self = this.set("AttributeValuesSizeBytes", js.undefined)
    
    @scala.inline
    def setItemCount(value: Integer): Self = this.set("ItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemCount: Self = this.set("ItemCount", js.undefined)
    
    @scala.inline
    def setItemNamesSizeBytes(value: Long): Self = this.set("ItemNamesSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemNamesSizeBytes: Self = this.set("ItemNamesSizeBytes", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Integer): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("Timestamp", js.undefined)
  }
}
