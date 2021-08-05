package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChangePolicy extends StObject {
  
  /**
    * The deletion behavior when the crawler finds a deleted object.
    */
  var DeleteBehavior: js.UndefOr[typings.awsSdk.glueMod.DeleteBehavior] = js.undefined
  
  /**
    * The update behavior when the crawler finds a changed schema.
    */
  var UpdateBehavior: js.UndefOr[typings.awsSdk.glueMod.UpdateBehavior] = js.undefined
}
object SchemaChangePolicy {
  
  inline def apply(): SchemaChangePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChangePolicy]
  }
  
  extension [Self <: SchemaChangePolicy](x: Self) {
    
    inline def setDeleteBehavior(value: DeleteBehavior): Self = StObject.set(x, "DeleteBehavior", value.asInstanceOf[js.Any])
    
    inline def setDeleteBehaviorUndefined: Self = StObject.set(x, "DeleteBehavior", js.undefined)
    
    inline def setUpdateBehavior(value: UpdateBehavior): Self = StObject.set(x, "UpdateBehavior", value.asInstanceOf[js.Any])
    
    inline def setUpdateBehaviorUndefined: Self = StObject.set(x, "UpdateBehavior", js.undefined)
  }
}
