package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBlobPropertiesOptions
  extends StObject
     with LeaseAccessConditionsOptions {
  
  var snapshotId: js.UndefOr[String] = js.undefined
}
object GetBlobPropertiesOptions {
  
  inline def apply(): GetBlobPropertiesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBlobPropertiesOptions]
  }
  
  extension [Self <: GetBlobPropertiesOptions](x: Self) {
    
    inline def setSnapshotId(value: String): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "snapshotId", js.undefined)
  }
}
