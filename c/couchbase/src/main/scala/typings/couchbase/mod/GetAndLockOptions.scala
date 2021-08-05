package typings.couchbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAndLockOptions extends StObject {
  
  var lockTime: js.UndefOr[Double] = js.undefined
}
object GetAndLockOptions {
  
  inline def apply(): GetAndLockOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAndLockOptions]
  }
  
  extension [Self <: GetAndLockOptions](x: Self) {
    
    inline def setLockTime(value: Double): Self = StObject.set(x, "lockTime", value.asInstanceOf[js.Any])
    
    inline def setLockTimeUndefined: Self = StObject.set(x, "lockTime", js.undefined)
  }
}
