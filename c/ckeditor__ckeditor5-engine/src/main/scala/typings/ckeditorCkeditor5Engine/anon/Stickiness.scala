package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.positionMod.PositionStickiness
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stickiness extends StObject {
  
  var path: js.Array[Double]
  
  var root: ReturnType[FnCall | js.Function0[PickDocumentFragmentchild]]
  
  var stickiness: PositionStickiness
}
object Stickiness {
  
  inline def apply(
    path: js.Array[Double],
    root: ReturnType[FnCall | js.Function0[PickDocumentFragmentchild]],
    stickiness: PositionStickiness
  ): Stickiness = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], stickiness = stickiness.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stickiness]
  }
  
  extension [Self <: Stickiness](x: Self) {
    
    inline def setPath(value: js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setRoot(value: ReturnType[FnCall | js.Function0[PickDocumentFragmentchild]]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setStickiness(value: PositionStickiness): Self = StObject.set(x, "stickiness", value.asInstanceOf[js.Any])
  }
}
