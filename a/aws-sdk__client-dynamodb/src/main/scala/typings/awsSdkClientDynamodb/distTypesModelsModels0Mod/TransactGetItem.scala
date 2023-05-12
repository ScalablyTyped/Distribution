package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactGetItem extends StObject {
  
  /**
    * <p>Contains the primary key that identifies the item to get, together with the name of
    *             the table that contains the item, and optionally the specific attributes of the item to
    *             retrieve.</p>
    */
  var Get: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.Get] = js.undefined
}
object TransactGetItem {
  
  inline def apply(): TransactGetItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactGetItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransactGetItem] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Get): Self = StObject.set(x, "Get", value.asInstanceOf[js.Any])
    
    inline def setGetUndefined: Self = StObject.set(x, "Get", js.undefined)
  }
}
