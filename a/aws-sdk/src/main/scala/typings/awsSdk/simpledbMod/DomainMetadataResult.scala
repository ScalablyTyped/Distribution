package typings.awsSdk.simpledbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainMetadataResult extends StObject {
  
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
  implicit class DomainMetadataResultMutableBuilder[Self <: DomainMetadataResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeNameCount(value: Integer): Self = StObject.set(x, "AttributeNameCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNameCountUndefined: Self = StObject.set(x, "AttributeNameCount", js.undefined)
    
    @scala.inline
    def setAttributeNamesSizeBytes(value: Long): Self = StObject.set(x, "AttributeNamesSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNamesSizeBytesUndefined: Self = StObject.set(x, "AttributeNamesSizeBytes", js.undefined)
    
    @scala.inline
    def setAttributeValueCount(value: Integer): Self = StObject.set(x, "AttributeValueCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeValueCountUndefined: Self = StObject.set(x, "AttributeValueCount", js.undefined)
    
    @scala.inline
    def setAttributeValuesSizeBytes(value: Long): Self = StObject.set(x, "AttributeValuesSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeValuesSizeBytesUndefined: Self = StObject.set(x, "AttributeValuesSizeBytes", js.undefined)
    
    @scala.inline
    def setItemCount(value: Integer): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemCountUndefined: Self = StObject.set(x, "ItemCount", js.undefined)
    
    @scala.inline
    def setItemNamesSizeBytes(value: Long): Self = StObject.set(x, "ItemNamesSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemNamesSizeBytesUndefined: Self = StObject.set(x, "ItemNamesSizeBytes", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Integer): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
