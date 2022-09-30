package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInstanceMetadataOptionsResult extends StObject {
  
  var operation: js.UndefOr[Operation] = js.undefined
}
object UpdateInstanceMetadataOptionsResult {
  
  inline def apply(): UpdateInstanceMetadataOptionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateInstanceMetadataOptionsResult]
  }
  
  extension [Self <: UpdateInstanceMetadataOptionsResult](x: Self) {
    
    inline def setOperation(value: Operation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
  }
}
