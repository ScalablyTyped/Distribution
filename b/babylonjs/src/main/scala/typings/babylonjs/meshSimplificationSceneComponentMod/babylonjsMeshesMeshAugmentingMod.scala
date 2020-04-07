package typings.babylonjs.meshSimplificationSceneComponentMod

import typings.babylonjs.meshSimplificationMod.ISimplificationSettings
import typings.babylonjs.meshSimplificationMod.SimplificationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("babylonjs/Meshes/mesh", JSImport.Namespace)
@js.native
object babylonjsMeshesMeshAugmentingMod extends js.Object {
  @js.native
  trait Mesh extends js.Object {
    /**
      * Simplify the mesh according to the given array of settings.
      * Function will return immediately and will simplify async
      * @param settings a collection of simplification settings
      * @param parallelProcessing should all levels calculate parallel or one after the other
      * @param simplificationType the type of simplification to run
      * @param successCallback optional success callback to be called after the simplification finished processing all settings
      * @returns the current mesh
      */
    def simplify(settings: js.Array[ISimplificationSettings]): Mesh = js.native
    def simplify(settings: js.Array[ISimplificationSettings], parallelProcessing: Boolean): Mesh = js.native
    def simplify(
      settings: js.Array[ISimplificationSettings],
      parallelProcessing: Boolean,
      simplificationType: SimplificationType
    ): Mesh = js.native
    def simplify(
      settings: js.Array[ISimplificationSettings],
      parallelProcessing: Boolean,
      simplificationType: SimplificationType,
      successCallback: js.Function2[/* mesh */ js.UndefOr[this.type], /* submeshIndex */ js.UndefOr[Double], Unit]
    ): Mesh = js.native
  }
  
}

