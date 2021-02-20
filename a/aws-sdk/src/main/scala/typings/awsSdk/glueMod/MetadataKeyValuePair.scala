package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataKeyValuePair extends StObject {
  
  /**
    * A metadata key.
    */
  var MetadataKey: js.UndefOr[MetadataKeyString] = js.native
  
  /**
    * A metadata key’s corresponding value.
    */
  var MetadataValue: js.UndefOr[MetadataValueString] = js.native
}
object MetadataKeyValuePair {
  
  @scala.inline
  def apply(): MetadataKeyValuePair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataKeyValuePair]
  }
  
  @scala.inline
  implicit class MetadataKeyValuePairMutableBuilder[Self <: MetadataKeyValuePair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadataKey(value: MetadataKeyString): Self = StObject.set(x, "MetadataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataKeyUndefined: Self = StObject.set(x, "MetadataKey", js.undefined)
    
    @scala.inline
    def setMetadataValue(value: MetadataValueString): Self = StObject.set(x, "MetadataValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataValueUndefined: Self = StObject.set(x, "MetadataValue", js.undefined)
  }
}
