package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedOpsItem extends StObject {
  
  /**
    * The ID of an OpsItem related to the current OpsItem.
    */
  var OpsItemId: String
}
object RelatedOpsItem {
  
  inline def apply(OpsItemId: String): RelatedOpsItem = {
    val __obj = js.Dynamic.literal(OpsItemId = OpsItemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelatedOpsItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelatedOpsItem] (val x: Self) extends AnyVal {
    
    inline def setOpsItemId(value: String): Self = StObject.set(x, "OpsItemId", value.asInstanceOf[js.Any])
  }
}
