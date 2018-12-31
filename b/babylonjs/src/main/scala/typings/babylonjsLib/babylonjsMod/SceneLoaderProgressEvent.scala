package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to represent data loading progression
  */
@JSImport("babylonjs", "SceneLoaderProgressEvent")
@js.native
class SceneLoaderProgressEvent protected ()
  extends babylonjsLib.BABYLONNs.SceneLoaderProgressEvent {
  /**
    * Create a new progress event
    * @param lengthComputable defines if data length to load can be evaluated
    * @param loaded defines the loaded data length
    * @param total defines the data length to load
    */
  def this(/** defines if data length to load can be evaluated */
  lengthComputable: scala.Boolean, /** defines the loaded data length */
  loaded: scala.Double, /** defines the data length to load */
  total: scala.Double) = this()
}

/**
  * Class used to represent data loading progression
  */
@JSImport("babylonjs", "SceneLoaderProgressEvent")
@js.native
object SceneLoaderProgressEvent extends js.Object {
  /**
    * Creates a new SceneLoaderProgressEvent from a ProgressEvent
    * @param event defines the source event
    * @returns a new SceneLoaderProgressEvent
    */
  def FromProgressEvent(event: stdLib.ProgressEvent): babylonjsLib.BABYLONNs.SceneLoaderProgressEvent = js.native
}

