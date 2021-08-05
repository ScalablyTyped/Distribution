package typings.chai.Chai

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathInfo extends StObject {
  
  var exists: Boolean
  
  var name: String
  
  var parent: js.Object
  
  var value: js.UndefOr[js.Any] = js.undefined
}
object PathInfo {
  
  inline def apply(exists: Boolean, name: String, parent: js.Object): PathInfo = {
    val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathInfo]
  }
  
  extension [Self <: PathInfo](x: Self) {
    
    inline def setExists(value: Boolean): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Object): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
