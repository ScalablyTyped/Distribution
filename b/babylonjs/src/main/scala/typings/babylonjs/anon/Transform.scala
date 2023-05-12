package typings.babylonjs.anon

import typings.babylonjs.mathsMathDotvectorMod.Matrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transform extends StObject {
  
  var transform: js.UndefOr[Matrix] = js.undefined
  
  var vertexData: typings.babylonjs.meshesMeshDotvertexDataMod.VertexData
}
object Transform {
  
  inline def apply(vertexData: typings.babylonjs.meshesMeshDotvertexDataMod.VertexData): Transform = {
    val __obj = js.Dynamic.literal(vertexData = vertexData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transform] (val x: Self) extends AnyVal {
    
    inline def setTransform(value: Matrix): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setVertexData(value: typings.babylonjs.meshesMeshDotvertexDataMod.VertexData): Self = StObject.set(x, "vertexData", value.asInstanceOf[js.Any])
  }
}
