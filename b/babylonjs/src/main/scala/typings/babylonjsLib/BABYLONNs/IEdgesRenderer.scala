package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the minimum contract an Edges renderer should follow.
  */
trait IEdgesRenderer extends IDisposable {
  /**
    * Gets or sets a boolean indicating if the edgesRenderer is active
    */
  var isEnabled: scala.Boolean
  /**
    * Checks wether or not the edges renderer is ready to render.
    * @return true if ready, otherwise false.
    */
  def isReady(): scala.Boolean
  /**
    * Renders the edges of the attached mesh,
    */
  def render(): scala.Unit
}

object IEdgesRenderer {
  @scala.inline
  def apply(
    dispose: js.Function0[scala.Unit],
    isEnabled: scala.Boolean,
    isReady: js.Function0[scala.Boolean],
    render: js.Function0[scala.Unit]
  ): IEdgesRenderer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("isEnabled")(isEnabled)
    __obj.updateDynamic("isReady")(isReady)
    __obj.updateDynamic("render")(render)
    __obj.asInstanceOf[IEdgesRenderer]
  }
}

