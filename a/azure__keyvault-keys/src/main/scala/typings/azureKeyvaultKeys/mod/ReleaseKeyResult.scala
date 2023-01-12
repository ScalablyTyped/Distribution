package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseKeyResult extends StObject {
  
  /** A signed token containing the released key. */
  var value: String
}
object ReleaseKeyResult {
  
  inline def apply(value: String): ReleaseKeyResult = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseKeyResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReleaseKeyResult] (val x: Self) extends AnyVal {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
