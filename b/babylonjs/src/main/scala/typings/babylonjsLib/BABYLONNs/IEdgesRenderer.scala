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

