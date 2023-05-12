package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGlobalSecondaryIndexAction extends StObject {
  
  /**
    * <p>The name of the global secondary index to be deleted.</p>
    */
  var IndexName: js.UndefOr[String] = js.undefined
}
object DeleteGlobalSecondaryIndexAction {
  
  inline def apply(): DeleteGlobalSecondaryIndexAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteGlobalSecondaryIndexAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteGlobalSecondaryIndexAction] (val x: Self) extends AnyVal {
    
    inline def setIndexName(value: String): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
  }
}
