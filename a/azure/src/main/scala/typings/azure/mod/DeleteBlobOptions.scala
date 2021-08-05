package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBlobOptions
  extends StObject
     with GetBlobPropertiesOptions {
  
  var deleteSnapshots: js.UndefOr[String] = js.undefined
}
object DeleteBlobOptions {
  
  inline def apply(): DeleteBlobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBlobOptions]
  }
  
  extension [Self <: DeleteBlobOptions](x: Self) {
    
    inline def setDeleteSnapshots(value: String): Self = StObject.set(x, "deleteSnapshots", value.asInstanceOf[js.Any])
    
    inline def setDeleteSnapshotsUndefined: Self = StObject.set(x, "deleteSnapshots", js.undefined)
  }
}
