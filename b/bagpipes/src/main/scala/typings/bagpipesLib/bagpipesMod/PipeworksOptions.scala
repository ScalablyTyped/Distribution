package typings
package bagpipesLib.bagpipesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeworksOptions extends js.Object {
  /**
    * Adds to the pre and post queues, respectively.
    * Ensures a pipe gets fitted before or after the main execution pipeline.
    */
  var affinity: Affinity
}

