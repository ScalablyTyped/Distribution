package typings
package bagpipesLib.bagpipesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bagpipes", "Pipe")
@js.native
class Pipe () extends js.Object {
  /** add a new `Fitting` (piece) to the pipe (aka. pipeline) */
  def fit(options: PipeworksOptions, pipe: Fitting): Pipe = js.native
  /** add a new `Fitting` (piece) to the pipe (aka. pipeline) */
  def fit(pipe: Fitting): Pipe = js.native
  /**
    * Send something down the pipe (aka. pipeline)! Any number of arguments
    * can be sent, but often there's just a single `context` object.
    */
  def flow(args: js.Any*): Pipe = js.native
  /** Redirect the flow to another pipe (aka. pipeline). */
  def siphon(options: PipeworksOptions, pipe: Fitting): Pipe = js.native
  /** Redirect the flow to another pipe (aka. pipeline). */
  def siphon(pipe: Fitting): Pipe = js.native
}

