package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetPropertyValue extends StObject {
  
  /**
    * The quality of the asset property value. The value must be GOOD, BAD, or UNCERTAIN. You can also specify an expression.
    */
  var quality: js.UndefOr[AssetPropertyQuality] = js.undefined
  
  /**
    * The timestamp associated with the asset property value. The default is the current event time.
    */
  var timestamp: js.UndefOr[AssetPropertyTimestamp] = js.undefined
  
  /**
    * The value to send to an asset property.
    */
  var value: AssetPropertyVariant
}
object AssetPropertyValue {
  
  @scala.inline
  def apply(value: AssetPropertyVariant): AssetPropertyValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetPropertyValue]
  }
  
  @scala.inline
  implicit class AssetPropertyValueMutableBuilder[Self <: AssetPropertyValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuality(value: AssetPropertyQuality): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    @scala.inline
    def setTimestamp(value: AssetPropertyTimestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    @scala.inline
    def setValue(value: AssetPropertyVariant): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
