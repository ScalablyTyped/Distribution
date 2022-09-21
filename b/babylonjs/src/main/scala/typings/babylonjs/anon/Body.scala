package typings.babylonjs.anon

import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Body extends StObject {
  
  var body: Any
  
  var point: Nullable[Vector3]
}
object Body {
  
  inline def apply(body: Any): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], point = null)
    __obj.asInstanceOf[Body]
  }
  
  extension [Self <: Body](x: Self) {
    
    inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: Nullable[Vector3]): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointNull: Self = StObject.set(x, "point", null)
  }
}
