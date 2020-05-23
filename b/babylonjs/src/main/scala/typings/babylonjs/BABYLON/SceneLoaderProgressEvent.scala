package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneLoaderProgressEvent extends js.Object {
  /** defines if data length to load can be evaluated */
  val lengthComputable: Boolean
  /** defines the loaded data length */
  val loaded: Double
  /** defines the data length to load */
  val total: Double
}

object SceneLoaderProgressEvent {
  @scala.inline
  def apply(lengthComputable: Boolean, loaded: Double, total: Double): SceneLoaderProgressEvent = {
    val __obj = js.Dynamic.literal(lengthComputable = lengthComputable.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneLoaderProgressEvent]
  }
}

