package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateContainerOptions
  extends StObject
     with TimeoutIntervalOptions {
  
  var metadata: js.UndefOr[StorageMetadata] = js.undefined
  
  var publicAccessLevel: js.UndefOr[String] = js.undefined
}
object CreateContainerOptions {
  
  inline def apply(): CreateContainerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateContainerOptions]
  }
  
  extension [Self <: CreateContainerOptions](x: Self) {
    
    inline def setMetadata(value: StorageMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setPublicAccessLevel(value: String): Self = StObject.set(x, "publicAccessLevel", value.asInstanceOf[js.Any])
    
    inline def setPublicAccessLevelUndefined: Self = StObject.set(x, "publicAccessLevel", js.undefined)
  }
}
