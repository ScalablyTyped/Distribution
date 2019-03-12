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
    dispose: () => scala.Unit,
    isEnabled: scala.Boolean,
    isReady: () => scala.Boolean,
    render: () => scala.Unit
  ): IEdgesRenderer = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isEnabled = isEnabled, isReady = js.Any.fromFunction0(isReady), render = js.Any.fromFunction0(render))
  
    __obj.asInstanceOf[IEdgesRenderer]
  }
}

