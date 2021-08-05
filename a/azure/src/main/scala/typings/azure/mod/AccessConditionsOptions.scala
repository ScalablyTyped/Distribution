package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessConditionsOptions
  extends StObject
     with TimeoutIntervalOptions {
  
  var accessConditions: js.UndefOr[StorageAccessCondition] = js.undefined
}
object AccessConditionsOptions {
  
  inline def apply(): AccessConditionsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessConditionsOptions]
  }
  
  extension [Self <: AccessConditionsOptions](x: Self) {
    
    inline def setAccessConditions(value: StorageAccessCondition): Self = StObject.set(x, "accessConditions", value.asInstanceOf[js.Any])
    
    inline def setAccessConditionsUndefined: Self = StObject.set(x, "accessConditions", js.undefined)
  }
}
