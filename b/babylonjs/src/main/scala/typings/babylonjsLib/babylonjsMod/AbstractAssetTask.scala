package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Define an abstract asset task used with a AssetsManager class to load assets into a scene
     */
@JSImport("babylonjs", "AbstractAssetTask")
@js.native
abstract class AbstractAssetTask protected ()
  extends babylonjsLib.BABYLONNs.AbstractAssetTask {
  /**
           * Creates a new AssetsManager
           * @param name defines the name of the task
           */
  def this(/**
           * Task name
           */ name: java.lang.String) = this()
}

