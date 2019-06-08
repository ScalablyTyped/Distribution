package typings
package deathLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("death", JSImport.Namespace)
@js.native
object deathMod extends js.Object {
  def apply(
    callback: js.Function1[
      /* signal */ deathLib.deathLibStrings.SIGINT | deathLib.deathLibStrings.SIGTERM | deathLib.deathLibStrings.SIGQUIT, 
      scala.Unit
    ]
  ): js.Function0[scala.Unit] = js.native
  /**
    * Invokes a callback when a SIGINT, SIGTERM, or SIGQUIT is detected
    * on the current node process. Configurable by the provided options.
    *
    * @param options
    * @returns A function to subscribe to the configured death detection
    * @example
    *  ON_DEATH({
    *    debug: true,
    *    uncaughtException: true,
    *  })((signal) => {
    *    console.log('Oh no!');
    *  });
    * @example
    *  const OFF_DEATH = ON_DEATH({
    *    debug: true,
    *    uncaughtException: true,
    *  })((signal) => {
    *    console.log('Oh no!');
    *  });
    *  // later
    *  OFF_DEATH();
    */
  def apply(options: deathLib.Anon_Debug): js.Function1[
    /* callback */ js.Function1[
      /* signal */ deathLib.deathLibStrings.SIGINT | deathLib.deathLibStrings.SIGTERM | deathLib.deathLibStrings.SIGQUIT | deathLib.deathLibStrings.SIGHUP | deathLib.deathLibStrings.uncaughtException, 
      scala.Unit
    ], 
    js.Function0[scala.Unit]
  ] = js.native
}

