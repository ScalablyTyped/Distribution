package typings.cytoscape.cytoscapeMod.Css

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * These properties allow for the creation of shadows on nodes or edges.
  * Note that shadow-blur could seriously impact performance on large graph.
  * http://js.cytoscape.org/#style/shadow
  */
trait Shadow extends js.Object {
  /**
    * The shadow blur, note that if greater than 0, this could impact performance.
    */
  var `shadow-blur`: Double
  /**
    * The colour of the shadow.
    */
  var `shadow-color`: Colour
  /**
    * The x offset relative to the node/edge where the shadow will be displayed, can be negative. If you set blur to 0, add an offset to view your shadow.
    */
  var `shadow-offset-x`: Double
  /**
    * The y offset relative to the node/edge where the shadow will be displayed, can be negative. If you set blur to 0, add an offset to view your shadow.
    */
  var `shadow-offset-y`: Double
  /**
    * The opacity of the shadow.
    */
  var `shadow-opacity`: Double
}

object Shadow {
  @scala.inline
  def apply(
    `shadow-blur`: Double,
    `shadow-color`: Colour,
    `shadow-offset-x`: Double,
    `shadow-offset-y`: Double,
    `shadow-opacity`: Double
  ): Shadow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("shadow-blur")(`shadow-blur`)
    __obj.updateDynamic("shadow-color")(`shadow-color`)
    __obj.updateDynamic("shadow-offset-x")(`shadow-offset-x`)
    __obj.updateDynamic("shadow-offset-y")(`shadow-offset-y`)
    __obj.updateDynamic("shadow-opacity")(`shadow-opacity`)
    __obj.asInstanceOf[Shadow]
  }
}

