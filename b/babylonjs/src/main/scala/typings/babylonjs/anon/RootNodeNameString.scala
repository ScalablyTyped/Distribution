package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootNodeNameString extends StObject {
  
  var rootNodeName: String
}
object RootNodeNameString {
  
  inline def apply(rootNodeName: String): RootNodeNameString = {
    val __obj = js.Dynamic.literal(rootNodeName = rootNodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootNodeNameString]
  }
  
  extension [Self <: RootNodeNameString](x: Self) {
    
    inline def setRootNodeName(value: String): Self = StObject.set(x, "rootNodeName", value.asInstanceOf[js.Any])
  }
}
