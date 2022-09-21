package typings.babylonjs.BABYLON

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VertexAnimationBaker extends StObject {
  
  /**
    * Runs an animation frame and stores its vertex data
    *
    * @param vertexData The array to save data to.
    * @param frameIndex Current frame in the skeleton animation to render.
    * @param textureIndex Current index of the texture data.
    */
  /* private */ var _executeAnimationFrame: Any
  
  /* private */ var _mesh: Any
  
  /* private */ var _scene: Any
  
  /**
    * Bakes the animation into the texture. This should be called once, when the
    * scene starts, so the VAT is generated and associated to the mesh.
    * @param ranges Defines the ranges in the animation that will be baked.
    * @returns The array of matrix transforms for each vertex (columns) and frame (rows), as a Float32Array.
    */
  def bakeVertexData(ranges: js.Array[AnimationRange]): js.Promise[js.typedarray.Float32Array]
  
  /**
    * Loads previously baked data in string format.
    * @param json The json string as serialized by serializeBakedVertexDataToJSON().
    * @returns The array of matrix transforms for each vertex (columns) and frame (rows), as a Float32Array.
    */
  def loadBakedVertexDataFromJSON(json: String): js.typedarray.Float32Array
  
  /**
    * Loads previously baked data.
    * @param data The object as serialized by serializeBakedVertexDataToObject()
    * @returns The array of matrix transforms for each vertex (columns) and frame (rows), as a Float32Array.
    */
  def loadBakedVertexDataFromObject(data: Record[String, Any]): js.typedarray.Float32Array
  
  /**
    * Serializes our vertexData to a JSON string, with a nice string for the vertexData.
    * Should be called right after bakeVertexData().
    * @param vertexData The vertex array data.
    * @returns This object serialized to a safe string.
    */
  def serializeBakedVertexDataToJSON(vertexData: js.typedarray.Float32Array): String
  
  /**
    * Serializes our vertexData to an object, with a nice string for the vertexData.
    * @param vertexData The vertex array data.
    * @returns This object serialized to a JS dict.
    */
  def serializeBakedVertexDataToObject(vertexData: js.typedarray.Float32Array): Record[String, Any]
  
  /**
    * Builds a vertex animation texture given the vertexData in an array.
    * @param vertexData The vertex animation data. You can generate it with bakeVertexData().
    * @returns The vertex animation texture to be used with BakedVertexAnimationManager.
    */
  def textureFromBakedVertexData(vertexData: js.typedarray.Float32Array): RawTexture
}
object VertexAnimationBaker {
  
  inline def apply(
    _executeAnimationFrame: Any,
    _mesh: Any,
    _scene: Any,
    bakeVertexData: js.Array[AnimationRange] => js.Promise[js.typedarray.Float32Array],
    loadBakedVertexDataFromJSON: String => js.typedarray.Float32Array,
    loadBakedVertexDataFromObject: Record[String, Any] => js.typedarray.Float32Array,
    serializeBakedVertexDataToJSON: js.typedarray.Float32Array => String,
    serializeBakedVertexDataToObject: js.typedarray.Float32Array => Record[String, Any],
    textureFromBakedVertexData: js.typedarray.Float32Array => RawTexture
  ): VertexAnimationBaker = {
    val __obj = js.Dynamic.literal(_executeAnimationFrame = _executeAnimationFrame.asInstanceOf[js.Any], _mesh = _mesh.asInstanceOf[js.Any], _scene = _scene.asInstanceOf[js.Any], bakeVertexData = js.Any.fromFunction1(bakeVertexData), loadBakedVertexDataFromJSON = js.Any.fromFunction1(loadBakedVertexDataFromJSON), loadBakedVertexDataFromObject = js.Any.fromFunction1(loadBakedVertexDataFromObject), serializeBakedVertexDataToJSON = js.Any.fromFunction1(serializeBakedVertexDataToJSON), serializeBakedVertexDataToObject = js.Any.fromFunction1(serializeBakedVertexDataToObject), textureFromBakedVertexData = js.Any.fromFunction1(textureFromBakedVertexData))
    __obj.asInstanceOf[VertexAnimationBaker]
  }
  
  extension [Self <: VertexAnimationBaker](x: Self) {
    
    inline def setBakeVertexData(value: js.Array[AnimationRange] => js.Promise[js.typedarray.Float32Array]): Self = StObject.set(x, "bakeVertexData", js.Any.fromFunction1(value))
    
    inline def setLoadBakedVertexDataFromJSON(value: String => js.typedarray.Float32Array): Self = StObject.set(x, "loadBakedVertexDataFromJSON", js.Any.fromFunction1(value))
    
    inline def setLoadBakedVertexDataFromObject(value: Record[String, Any] => js.typedarray.Float32Array): Self = StObject.set(x, "loadBakedVertexDataFromObject", js.Any.fromFunction1(value))
    
    inline def setSerializeBakedVertexDataToJSON(value: js.typedarray.Float32Array => String): Self = StObject.set(x, "serializeBakedVertexDataToJSON", js.Any.fromFunction1(value))
    
    inline def setSerializeBakedVertexDataToObject(value: js.typedarray.Float32Array => Record[String, Any]): Self = StObject.set(x, "serializeBakedVertexDataToObject", js.Any.fromFunction1(value))
    
    inline def setTextureFromBakedVertexData(value: js.typedarray.Float32Array => RawTexture): Self = StObject.set(x, "textureFromBakedVertexData", js.Any.fromFunction1(value))
    
    inline def set_executeAnimationFrame(value: Any): Self = StObject.set(x, "_executeAnimationFrame", value.asInstanceOf[js.Any])
    
    inline def set_mesh(value: Any): Self = StObject.set(x, "_mesh", value.asInstanceOf[js.Any])
    
    inline def set_scene(value: Any): Self = StObject.set(x, "_scene", value.asInstanceOf[js.Any])
  }
}
