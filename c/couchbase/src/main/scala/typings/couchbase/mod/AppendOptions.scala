package typings.couchbase.mod

import typings.couchbase.mod.Bucket.CAS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppendOptions extends StObject {
  
  /**
    * The CAS value to check. If the item on the server contains a different CAS value, the operation will fail. Note that if this option is undefined, no comparison will be performed.
    */
  var cas: js.UndefOr[CAS] = js.undefined
  
  /**
    * Ensures this operation is persisted to this many nodes.
    */
  var persist_to: js.UndefOr[Double] = js.undefined
  
  /**
    *     Ensures this operation is replicated to this many nodes.
    */
  var replicate_to: js.UndefOr[Double] = js.undefined
}
object AppendOptions {
  
  inline def apply(): AppendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppendOptions]
  }
  
  extension [Self <: AppendOptions](x: Self) {
    
    inline def setCas(value: CAS): Self = StObject.set(x, "cas", value.asInstanceOf[js.Any])
    
    inline def setCasUndefined: Self = StObject.set(x, "cas", js.undefined)
    
    inline def setPersist_to(value: Double): Self = StObject.set(x, "persist_to", value.asInstanceOf[js.Any])
    
    inline def setPersist_toUndefined: Self = StObject.set(x, "persist_to", js.undefined)
    
    inline def setReplicate_to(value: Double): Self = StObject.set(x, "replicate_to", value.asInstanceOf[js.Any])
    
    inline def setReplicate_toUndefined: Self = StObject.set(x, "replicate_to", js.undefined)
  }
}
