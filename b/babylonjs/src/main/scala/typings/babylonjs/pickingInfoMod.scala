package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.mathVectorMod.Vector2
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.rayMod.Ray
import typings.babylonjs.spriteMod.Sprite
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Collisions/pickingInfo", JSImport.Namespace)
@js.native
object pickingInfoMod extends js.Object {
  
  @js.native
  class PickingInfo () extends js.Object {
    
    /** @hidden */
    var _pickingUnavailable: Boolean = js.native
    
    /** (See getTextureCoordinates) The barycentric U coordinate that is used when calculating the texture coordinates of the collision.*/
    var bu: Double = js.native
    
    /** (See getTextureCoordinates) The barycentric V coordinate that is used when calculating the texture coordinates of the collision.*/
    var bv: Double = js.native
    
    /**
      * Distance away where the pick collided
      */
    var distance: Double = js.native
    
    /** The index of the face on the mesh that was picked, or the index of the Line if the picked Mesh is a LinesMesh */
    var faceId: Double = js.native
    
    /**
      * Gets the normal correspodning to the face the pick collided with
      * @param useWorldCoordinates If the resulting normal should be relative to the world (default: false)
      * @param useVerticesNormals If the vertices normals should be used to calculate the normal instead of the normal map
      * @returns The normal correspodning to the face the pick collided with
      */
    def getNormal(): Nullable[Vector3] = js.native
    def getNormal(useWorldCoordinates: js.UndefOr[scala.Nothing], useVerticesNormals: Boolean): Nullable[Vector3] = js.native
    def getNormal(useWorldCoordinates: Boolean): Nullable[Vector3] = js.native
    def getNormal(useWorldCoordinates: Boolean, useVerticesNormals: Boolean): Nullable[Vector3] = js.native
    
    /**
      * Gets the texture coordinates of where the pick occured
      * @returns the vector containing the coordnates of the texture
      */
    def getTextureCoordinates(): Nullable[Vector2] = js.native
    
    /**
      * If the pick collided with an object
      */
    var hit: Boolean = js.native
    
    /**
      * If a mesh was used to do the picking (eg. 6dof controller) this will be populated.
      */
    var originMesh: Nullable[AbstractMesh] = js.native
    
    /**
      * The mesh corresponding the the pick collision
      */
    var pickedMesh: Nullable[AbstractMesh] = js.native
    
    /**
      * The location of pick collision
      */
    var pickedPoint: Nullable[Vector3] = js.native
    
    /** If a sprite was picked, this will be the sprite the pick collided with */
    var pickedSprite: Nullable[Sprite] = js.native
    
    /**
      * The ray that was used to perform the picking.
      */
    var ray: Nullable[Ray] = js.native
    
    /** The index of the face on the subMesh that was picked, or the index of the Line if the picked Mesh is a LinesMesh */
    var subMeshFaceId: Double = js.native
    
    /** Id of the the submesh that was picked */
    var subMeshId: Double = js.native
    
    /** If we are pikcing a mesh with thin instance, this will give you the picked thin instance */
    var thinInstanceIndex: Double = js.native
  }
}
