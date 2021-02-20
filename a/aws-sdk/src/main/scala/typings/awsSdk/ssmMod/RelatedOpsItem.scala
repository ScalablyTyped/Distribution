package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelatedOpsItem extends StObject {
  
  /**
    * The ID of an OpsItem related to the current OpsItem.
    */
  var OpsItemId: String = js.native
}
object RelatedOpsItem {
  
  @scala.inline
  def apply(OpsItemId: String): RelatedOpsItem = {
    val __obj = js.Dynamic.literal(OpsItemId = OpsItemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelatedOpsItem]
  }
  
  @scala.inline
  implicit class RelatedOpsItemMutableBuilder[Self <: RelatedOpsItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpsItemId(value: String): Self = StObject.set(x, "OpsItemId", value.asInstanceOf[js.Any])
  }
}
