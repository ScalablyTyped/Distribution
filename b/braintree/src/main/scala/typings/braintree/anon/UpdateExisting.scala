package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateExisting extends StObject {
  
  var updateExisting: js.UndefOr[Boolean] = js.undefined
}
object UpdateExisting {
  
  inline def apply(): UpdateExisting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateExisting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateExisting] (val x: Self) extends AnyVal {
    
    inline def setUpdateExisting(value: Boolean): Self = StObject.set(x, "updateExisting", value.asInstanceOf[js.Any])
    
    inline def setUpdateExistingUndefined: Self = StObject.set(x, "updateExisting", js.undefined)
  }
}
