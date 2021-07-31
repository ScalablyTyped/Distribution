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
}
object MetadataInfo {
  
  @scala.inline
  def apply(): MetadataInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataInfo]
  }
  
  @scala.inline
  implicit class MetadataInfoMutableBuilder[Self <: MetadataInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedTime(value: CreatedTimestamp): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setMetadataValue(value: MetadataValueString): Self = StObject.set(x, "MetadataValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataValueUndefined: Self = StObject.set(x, "MetadataValue", js.undefined)
  }
}
