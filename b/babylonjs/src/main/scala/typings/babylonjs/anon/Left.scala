package typings.babylonjs.anon

import typings.babylonjs.abstractMeshMod.AbstractMesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Left extends StObject {
  
  var left: AbstractMesh
  
  var right: AbstractMesh
}
object Left {
  
  inline def apply(left: AbstractMesh, right: AbstractMesh): Left = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Left]
  }
  
  extension [Self <: Left](x: Self) {
    
    inline def setLeft(value: AbstractMesh): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: AbstractMesh): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
  }
}
