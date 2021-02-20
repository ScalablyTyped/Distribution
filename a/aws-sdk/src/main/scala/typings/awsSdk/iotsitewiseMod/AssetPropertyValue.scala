package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetPropertyValue extends StObject {
  
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
  implicit class AssetPropertyValueMutableBuilder[Self <: AssetPropertyValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuality(value: Quality): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    @scala.inline
    def setTimestamp(value: TimeInNanos): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Variant): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
