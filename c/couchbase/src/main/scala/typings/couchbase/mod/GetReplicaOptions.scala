package typings.couchbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReplicaOptions extends StObject {
  
  /**
    * The index for which replica you wish to retrieve this value from, or if undefined, use the value from the first server that replies.
    */
  var index: js.UndefOr[Double] = js.undefined
}
object GetReplicaOptions {
  
  inline def apply(): GetReplicaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReplicaOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetReplicaOptions] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
  }
}
