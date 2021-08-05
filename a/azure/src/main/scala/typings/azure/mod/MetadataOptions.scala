package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataOptions
  extends StObject
     with TimeoutIntervalOptions {
  
  var metadata: js.UndefOr[StorageMetadata] = js.undefined
}
object MetadataOptions {
  
  inline def apply(): MetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataOptions]
  }
  
  extension [Self <: MetadataOptions](x: Self) {
    
    inline def setMetadata(value: StorageMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
