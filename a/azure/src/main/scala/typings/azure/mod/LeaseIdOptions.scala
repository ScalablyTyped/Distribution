package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeaseIdOptions
  extends StObject
     with TimeoutIntervalOptions {
  
  var leaseId: js.UndefOr[String] = js.undefined
}
object LeaseIdOptions {
  
  inline def apply(): LeaseIdOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeaseIdOptions]
  }
  
  extension [Self <: LeaseIdOptions](x: Self) {
    
    inline def setLeaseId(value: String): Self = StObject.set(x, "leaseId", value.asInstanceOf[js.Any])
    
    inline def setLeaseIdUndefined: Self = StObject.set(x, "leaseId", js.undefined)
  }
}
