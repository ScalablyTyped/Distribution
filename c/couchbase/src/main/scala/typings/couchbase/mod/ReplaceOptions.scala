package typings.couchbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceOptions
  extends StObject
     with AppendOptions {
  
  /**
    * Set the initial expiration time for the document. A value of 0 represents never expiring.
    */
  var expiry: js.UndefOr[Double] = js.undefined
}
object ReplaceOptions {
  
  inline def apply(): ReplaceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceOptions]
  }
  
  extension [Self <: ReplaceOptions](x: Self) {
    
    inline def setExpiry(value: Double): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    inline def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
  }
}
