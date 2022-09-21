package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataInfo extends StObject {
  
  /**
    * The time at which the entry was created.
    */
  var CreatedTime: js.UndefOr[CreatedTimestamp] = js.undefined
  
  /**
    * The metadata key’s corresponding value.
    */
  var MetadataValue: js.UndefOr[MetadataValueString] = js.undefined
  
  /**
    * Other metadata belonging to the same metadata key.
    */
  var OtherMetadataValueList: js.UndefOr[typings.awsSdk.glueMod.OtherMetadataValueList] = js.undefined
}
object MetadataInfo {
  
  inline def apply(): MetadataInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataInfo]
  }
  
  extension [Self <: MetadataInfo](x: Self) {
    
    inline def setCreatedTime(value: CreatedTimestamp): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setMetadataValue(value: MetadataValueString): Self = StObject.set(x, "MetadataValue", value.asInstanceOf[js.Any])
    
    inline def setMetadataValueUndefined: Self = StObject.set(x, "MetadataValue", js.undefined)
    
    inline def setOtherMetadataValueList(value: OtherMetadataValueList): Self = StObject.set(x, "OtherMetadataValueList", value.asInstanceOf[js.Any])
    
    inline def setOtherMetadataValueListUndefined: Self = StObject.set(x, "OtherMetadataValueList", js.undefined)
    
    inline def setOtherMetadataValueListVarargs(value: OtherMetadataValueListItem*): Self = StObject.set(x, "OtherMetadataValueList", js.Array(value*))
  }
}
