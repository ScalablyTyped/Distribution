package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the size containing width and height
  */
trait IXYZ extends js.Object {
  /**
    * X
    */
  var x: Double
  /**
    * Y
    */
  var y: Double
  /**
    * Z
    */
  var z: Double
}

object IXYZ {
  @scala.inline
  def apply(x: Double, y: Double, z: Double): IXYZ = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IXYZ]
  }
}

