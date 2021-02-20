package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetPropertyValue extends StObject {
  
  /**
    * Optional. A string that describes the quality of the value. Accepts substitution templates. Must be GOOD, BAD, or UNCERTAIN.
    */
  var quality: js.UndefOr[AssetPropertyQuality] = js.native
  
  /**
    * The asset property value timestamp.
    */
  var timestamp: AssetPropertyTimestamp = js.native
  
  /**
    * The value of the asset property.
    */
  var value: AssetPropertyVariant = js.native
}
object AssetPropertyValue {
  
  @scala.inline
  def apply(timestamp: AssetPropertyTimestamp, value: AssetPropertyVariant): AssetPropertyValue = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
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
    def setValue(value: AssetPropertyVariant): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
