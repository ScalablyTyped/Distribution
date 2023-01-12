package typings.couchbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchOptions extends StObject {
  
  /**
    *     Ensures this operation is persisted to this many nodes.
    */
  var persist_to: js.UndefOr[Double] = js.undefined
  
  /**
    * Ensures this operation is replicated to this many nodes.
    */
  var replicate_to: js.UndefOr[Double] = js.undefined
}
object TouchOptions {
  
  inline def apply(): TouchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TouchOptions] (val x: Self) extends AnyVal {
    
    inline def setPersist_to(value: Double): Self = StObject.set(x, "persist_to", value.asInstanceOf[js.Any])
    
    inline def setPersist_toUndefined: Self = StObject.set(x, "persist_to", js.undefined)
    
    inline def setReplicate_to(value: Double): Self = StObject.set(x, "replicate_to", value.asInstanceOf[js.Any])
    
    inline def setReplicate_toUndefined: Self = StObject.set(x, "replicate_to", js.undefined)
  }
}
