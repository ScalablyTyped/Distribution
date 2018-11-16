package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Class used to represent data loading progression
     */
@JSGlobal("BABYLON.SceneLoaderProgressEvent")
@js.native
class SceneLoaderProgressEvent protected () extends js.Object {
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
  /** defines if data length to load can be evaluated */
  val lengthComputable: scala.Boolean = js.native
  /** defines the loaded data length */
  val loaded: scala.Double = js.native
  /** defines the data length to load */
  val total: scala.Double = js.native
}

/**
     * Class used to represent data loading progression
     */
@JSGlobal("BABYLON.SceneLoaderProgressEvent")
@js.native
object SceneLoaderProgressEvent extends js.Object {
  /**
           * Creates a new SceneLoaderProgressEvent from a ProgressEvent
           * @param event defines the source event
           * @returns a new SceneLoaderProgressEvent
           */
  def FromProgressEvent(event: stdLib.ProgressEvent): babylonjsLib.BABYLONNs.SceneLoaderProgressEvent = js.native
}

