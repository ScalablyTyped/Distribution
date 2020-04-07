package typings.babylonjs.lensFlareSystemSceneComponentMod.babylonjsAbstractSceneAugmentingMod

import typings.babylonjs.lensFlareSystemMod.LensFlareSystem
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractScene extends js.Object {
  /**
    * The list of lens flare system added to the scene
    * @see http://doc.babylonjs.com/how_to/how_to_use_lens_flares
    */
  var lensFlareSystems: js.Array[LensFlareSystem]
  /**
    * Adds the given lens flare system to this scene
    * @param newLensFlareSystem The lens flare system to add
    */
  def addLensFlareSystem(newLensFlareSystem: LensFlareSystem): Unit
  /**
    * Gets a lens flare system using its id
    * @param id defines the id to look for
    * @returns the lens flare system or null if not found
    */
  def getLensFlareSystemByID(id: String): Nullable[LensFlareSystem]
  /**
    * Gets a lens flare system using its name
    * @param name defines the name to look for
    * @returns the lens flare system or null if not found
    */
  def getLensFlareSystemByName(name: String): Nullable[LensFlareSystem]
  /**
    * Removes the given lens flare system from this scene.
    * @param toRemove The lens flare system to remove
    * @returns The index of the removed lens flare system
    */
  def removeLensFlareSystem(toRemove: LensFlareSystem): Double
}

object AbstractScene {
  @scala.inline
  def apply(
    addLensFlareSystem: LensFlareSystem => Unit,
    getLensFlareSystemByID: String => Nullable[LensFlareSystem],
    getLensFlareSystemByName: String => Nullable[LensFlareSystem],
    lensFlareSystems: js.Array[LensFlareSystem],
    removeLensFlareSystem: LensFlareSystem => Double
  ): AbstractScene = {
    val __obj = js.Dynamic.literal(addLensFlareSystem = js.Any.fromFunction1(addLensFlareSystem), getLensFlareSystemByID = js.Any.fromFunction1(getLensFlareSystemByID), getLensFlareSystemByName = js.Any.fromFunction1(getLensFlareSystemByName), lensFlareSystems = lensFlareSystems.asInstanceOf[js.Any], removeLensFlareSystem = js.Any.fromFunction1(removeLensFlareSystem))
  
    __obj.asInstanceOf[AbstractScene]
  }
}

