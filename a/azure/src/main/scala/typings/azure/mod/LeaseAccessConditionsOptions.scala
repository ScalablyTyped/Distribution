package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeaseAccessConditionsOptions
  extends StObject
     with LeaseIdOptions {
  
  var accessConditions: js.UndefOr[StorageAccessCondition] = js.undefined
}
object LeaseAccessConditionsOptions {
  
  inline def apply(): LeaseAccessConditionsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeaseAccessConditionsOptions]
  }
  
  extension [Self <: LeaseAccessConditionsOptions](x: Self) {
    
    inline def setAccessConditions(value: StorageAccessCondition): Self = StObject.set(x, "accessConditions", value.asInstanceOf[js.Any])
    
    inline def setAccessConditionsUndefined: Self = StObject.set(x, "accessConditions", js.undefined)
  }
}
