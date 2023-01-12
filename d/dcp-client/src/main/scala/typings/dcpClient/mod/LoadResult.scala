package typings.dcpClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadResult extends StObject {
  
  var keystore: Keystore
  
  var safe: Boolean
}
object LoadResult {
  
  inline def apply(keystore: Keystore, safe: Boolean): LoadResult = {
    val __obj = js.Dynamic.literal(keystore = keystore.asInstanceOf[js.Any], safe = safe.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoadResult] (val x: Self) extends AnyVal {
    
    inline def setKeystore(value: Keystore): Self = StObject.set(x, "keystore", value.asInstanceOf[js.Any])
    
    inline def setSafe(value: Boolean): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
  }
}
