package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateExisting extends StObject {
  
  var updateExisting: js.UndefOr[Boolean] = js.native
}
object UpdateExisting {
  
  @scala.inline
  def apply(): UpdateExisting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateExisting]
  }
  
  @scala.inline
  implicit class UpdateExistingMutableBuilder[Self <: UpdateExisting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpdateExisting(value: Boolean): Self = StObject.set(x, "updateExisting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateExistingUndefined: Self = StObject.set(x, "updateExisting", js.undefined)
  }
}
