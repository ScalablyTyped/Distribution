package typings.babylonjs

import typings.babylonjs.animationRangeMod.AnimationRange
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.rawTextureMod.RawTexture
import typings.babylonjs.sceneMod.Scene
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vertexAnimationBakerMod {
  
  @JSImport("babylonjs/BakedVertexAnimation/vertexAnimationBaker", "VertexAnimationBaker")
  @js.native
  open class VertexAnimationBaker protected () extends StObject {
    /**
      * Create a new VertexAnimationBaker object which can help baking animations into a texture.
      * @param scene Defines the scene the VAT belongs to
      * @param mesh Defines the mesh the VAT belongs to
      */
    def this(scene: Scene, mesh: Mesh) = this()
    
    /**
      * Runs an animation frame and stores its vertex data
      *
      * @param vertexData The array to save data to.
      * @param frameIndex Current frame in the skeleton animation to render.
      * @param textureIndex Current index of the texture data.
      */
    /* private */ var _executeAnimationFrame: Any = js.native
    
    /* private */ var _mesh: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /**
      * Bakes the animation into the texture. This should be called once, when the
      * scene starts, so the VAT is generated and associated to the mesh.
      * @param ranges Defines the ranges in the animation that will be baked.
      * @returns The array of matrix transforms for each vertex (columns) and frame (rows), as a Float32Array.
      */
    def bakeVertexData(ranges: js.Array[AnimationRange]): js.Promise[js.typedarray.Float32Array] = js.native
    
    /**
      * Loads previously baked data in string format.
      * @param json The json string as serialized by serializeBakedVertexDataToJSON().
      * @returns The array of matrix transforms for each vertex (columns) and frame (rows), as a Float32Array.
      */
    def loadBakedVertexDataFromJSON(json: String): js.typedarray.Float32Array = js.native
    
    /**
      * Loads previously baked data.
      * @param data The object as serialized by serializeBakedVertexDataToObject()
      * @returns The array of matrix transforms for each vertex (columns) and frame (rows), as a Float32Array.
      */
    def loadBakedVertexDataFromObject(data: Record[String, Any]): js.typedarray.Float32Array = js.native
    
    /**
      * Serializes our vertexData to a JSON string, with a nice string for the vertexData.
      * Should be called right after bakeVertexData().
      * @param vertexData The vertex array data.
      * @returns This object serialized to a safe string.
      */
    def serializeBakedVertexDataToJSON(vertexData: js.typedarray.Float32Array): String = js.native
    
    /**
      * Serializes our vertexData to an object, with a nice string for the vertexData.
      * @param vertexData The vertex array data.
      * @returns This object serialized to a JS dict.
      */
    def serializeBakedVertexDataToObject(vertexData: js.typedarray.Float32Array): Record[String, Any] = js.native
    
    /**
      * Builds a vertex animation texture given the vertexData in an array.
      * @param vertexData The vertex animation data. You can generate it with bakeVertexData().
      * @returns The vertex animation texture to be used with BakedVertexAnimationManager.
      */
    def textureFromBakedVertexData(vertexData: js.typedarray.Float32Array): RawTexture = js.native
  }
}
