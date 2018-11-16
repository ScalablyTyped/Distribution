package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Information about the result of picking within a scene
     * @see https://doc.babylonjs.com/babylon101/picking_collisions
     */
@JSGlobal("BABYLON.PickingInfo")
@js.native
class PickingInfo () extends js.Object {
  /** (See getTextureCoordinates) The barycentric U coordinate that is used when calulating the texture coordinates of the collision.*/
  var bu: scala.Double = js.native
  /** (See getTextureCoordinates) The barycentric V coordinate that is used when calulating the texture coordinates of the collision.*/
  var bv: scala.Double = js.native
  /**
           * Distance away where the pick collided
           */
  var distance: scala.Double = js.native
  /** The id of the face on the mesh that was picked  */
  var faceId: scala.Double = js.native
  /**
           * If the pick collided with an object
           */
  var hit: scala.Boolean = js.native
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
  /** Id of the the submesh that was picked */
  var subMeshId: scala.Double = js.native
  /**
           * Gets the normal correspodning to the face the pick collided with
           * @param useWorldCoordinates If the resulting normal should be relative to the world (default: false)
           * @param useVerticesNormals If the vertices normals should be used to calculate the normal instead of the normal map
           * @returns The normal correspodning to the face the pick collided with
           */
  def getNormal(): Nullable[Vector3] = js.native
  /**
           * Gets the normal correspodning to the face the pick collided with
           * @param useWorldCoordinates If the resulting normal should be relative to the world (default: false)
           * @param useVerticesNormals If the vertices normals should be used to calculate the normal instead of the normal map
           * @returns The normal correspodning to the face the pick collided with
           */
  def getNormal(useWorldCoordinates: scala.Boolean): Nullable[Vector3] = js.native
  /**
           * Gets the normal correspodning to the face the pick collided with
           * @param useWorldCoordinates If the resulting normal should be relative to the world (default: false)
           * @param useVerticesNormals If the vertices normals should be used to calculate the normal instead of the normal map
           * @returns The normal correspodning to the face the pick collided with
           */
  def getNormal(useWorldCoordinates: scala.Boolean, useVerticesNormals: scala.Boolean): Nullable[Vector3] = js.native
  /**
           * Gets the texture coordinates of where the pick occured
           * @returns the vector containing the coordnates of the texture
           */
  def getTextureCoordinates(): Nullable[Vector2] = js.native
}

