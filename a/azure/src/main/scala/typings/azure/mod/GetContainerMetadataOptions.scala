package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContainerMetadataOptions
  extends StObject
     with GetContainerPropertiesOptions {
  
  var accessConditions: js.UndefOr[StorageAccessCondition] = js.undefined
}
object GetContainerMetadataOptions {
  
  inline def apply(): GetContainerMetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContainerMetadataOptions]
  }
  
  extension [Self <: GetContainerMetadataOptions](x: Self) {
    
    inline def setAccessConditions(value: StorageAccessCondition): Self = StObject.set(x, "accessConditions", value.asInstanceOf[js.Any])
    
    inline def setAccessConditionsUndefined: Self = StObject.set(x, "accessConditions", js.undefined)
  }
}
