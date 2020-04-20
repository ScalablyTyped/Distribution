package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEdgesRenderer extends IDisposable {
  /**
    * Gets or sets a boolean indicating if the edgesRenderer is active
    */
  var isEnabled: Boolean
  /**
    * Checks wether or not the edges renderer is ready to render.
    * @return true if ready, otherwise false.
    */
  def isReady(): Boolean
  /**
    * Renders the edges of the attached mesh,
    */
  def render(): Unit
}

object IEdgesRenderer {
  @scala.inline
  def apply(dispose: () => Unit, isEnabled: Boolean, isReady: () => Boolean, render: () => Unit): IEdgesRenderer = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isEnabled = isEnabled.asInstanceOf[js.Any], isReady = js.Any.fromFunction0(isReady), render = js.Any.fromFunction0(render))
    __obj.asInstanceOf[IEdgesRenderer]
  }
}

