package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Matrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VertexData extends StObject {
  
  var transform: js.UndefOr[Matrix] = js.undefined
  
  var vertexData: typings.babylonjs.BABYLON.VertexData
}
object VertexData {
  
  inline def apply(vertexData: typings.babylonjs.BABYLON.VertexData): VertexData = {
    val __obj = js.Dynamic.literal(vertexData = vertexData.asInstanceOf[js.Any])
    __obj.asInstanceOf[VertexData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VertexData] (val x: Self) extends AnyVal {
    
    inline def setTransform(value: Matrix): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setVertexData(value: typings.babylonjs.BABYLON.VertexData): Self = StObject.set(x, "vertexData", value.asInstanceOf[js.Any])
  }
}
