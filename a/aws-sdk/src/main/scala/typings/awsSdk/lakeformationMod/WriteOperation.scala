package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteOperation extends StObject {
  
  /**
    * A new object to add to the governed table.
    */
  var AddObject: js.UndefOr[AddObjectInput] = js.undefined
  
  /**
    * An object to delete from the governed table.
    */
  var DeleteObject: js.UndefOr[DeleteObjectInput] = js.undefined
}
object WriteOperation {
  
  inline def apply(): WriteOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteOperation]
  }
  
  extension [Self <: WriteOperation](x: Self) {
    
    inline def setAddObject(value: AddObjectInput): Self = StObject.set(x, "AddObject", value.asInstanceOf[js.Any])
    
    inline def setAddObjectUndefined: Self = StObject.set(x, "AddObject", js.undefined)
    
    inline def setDeleteObject(value: DeleteObjectInput): Self = StObject.set(x, "DeleteObject", value.asInstanceOf[js.Any])
    
    inline def setDeleteObjectUndefined: Self = StObject.set(x, "DeleteObject", js.undefined)
  }
}
