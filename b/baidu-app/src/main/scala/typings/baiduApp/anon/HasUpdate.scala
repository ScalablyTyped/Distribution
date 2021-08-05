package typings.baiduApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasUpdate extends StObject {
  
  var hasUpdate: Boolean
}
object HasUpdate {
  
  inline def apply(hasUpdate: Boolean): HasUpdate = {
    val __obj = js.Dynamic.literal(hasUpdate = hasUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasUpdate]
  }
  
  extension [Self <: HasUpdate](x: Self) {
    
    inline def setHasUpdate(value: Boolean): Self = StObject.set(x, "hasUpdate", value.asInstanceOf[js.Any])
  }
}
