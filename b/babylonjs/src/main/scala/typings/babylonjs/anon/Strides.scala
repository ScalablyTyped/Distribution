package typings.babylonjs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.VertexBuffer
import typings.std.WebGLVertexArrayObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Strides extends StObject {
  
  var data: StringDictionary[js.typedarray.Float32Array]
  
  var sizes: StringDictionary[Double]
  
  var strides: StringDictionary[Double]
  
  var vertexArrayObjects: js.UndefOr[StringDictionary[WebGLVertexArrayObject]] = js.undefined
  
  var vertexBuffers: StringDictionary[Nullable[VertexBuffer]]
}
object Strides {
  
  inline def apply(
    data: StringDictionary[js.typedarray.Float32Array],
    sizes: StringDictionary[Double],
    strides: StringDictionary[Double],
    vertexBuffers: StringDictionary[Nullable[VertexBuffer]]
  ): Strides = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any], vertexBuffers = vertexBuffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Strides]
  }
  
  extension [Self <: Strides](x: Self) {
    
    inline def setData(value: StringDictionary[js.typedarray.Float32Array]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setSizes(value: StringDictionary[Double]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setStrides(value: StringDictionary[Double]): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
    
    inline def setVertexArrayObjects(value: StringDictionary[WebGLVertexArrayObject]): Self = StObject.set(x, "vertexArrayObjects", value.asInstanceOf[js.Any])
    
    inline def setVertexArrayObjectsUndefined: Self = StObject.set(x, "vertexArrayObjects", js.undefined)
    
    inline def setVertexBuffers(value: StringDictionary[Nullable[VertexBuffer]]): Self = StObject.set(x, "vertexBuffers", value.asInstanceOf[js.Any])
  }
}
