package typings.babylonjs.anon

import typings.node.timersMod.global.NodeJS.Timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofsetTimeout extends StObject {
  
  // util.promisify no rest args compability
  // tslint:disable-next-line void-return
  def apply(callback: js.Function1[/* args */ Unit, Unit]): Timeout = js.native
  def apply(callback: js.Function1[/* args */ Unit, Unit], ms: Double): Timeout = js.native
  /**
    * Schedules execution of a one-time `callback` after `delay` milliseconds.
    *
    * The `callback` will likely not be invoked in precisely `delay` milliseconds.
    * Node.js makes no guarantees about the exact timing of when callbacks will fire,
    * nor of their ordering. The callback will be called as close as possible to the
    * time specified.
    *
    * When `delay` is larger than `2147483647` or less than `1`, the `delay`will be set to `1`. Non-integer delays are truncated to an integer.
    *
    * If `callback` is not a function, a `TypeError` will be thrown.
    *
    * This method has a custom variant for promises that is available using `timersPromises.setTimeout()`.
    * @since v0.0.1
    * @param callback The function to call when the timer elapses.
    * @param [delay=1] The number of milliseconds to wait before calling the `callback`.
    * @param args Optional arguments to pass when the `callback` is called.
    * @return for use with {@link clearTimeout}
    */
  def apply[TArgs /* <: js.Array[Any] */](
    callback: js.Function1[/* args */ TArgs, Unit],
    ms: Double,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
  ): Timeout = js.native
  def apply[TArgs /* <: js.Array[Any] */](
    callback: js.Function1[/* args */ TArgs, Unit],
    ms: Unit,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
  ): Timeout = js.native
}
