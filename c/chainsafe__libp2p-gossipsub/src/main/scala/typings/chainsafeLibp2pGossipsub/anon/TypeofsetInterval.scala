package typings.chainsafeLibp2pGossipsub.anon

import typings.node.timersMod.global.NodeJS.Timer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofsetInterval extends StObject {
  
  // util.promisify no rest args compability
  // tslint:disable-next-line void-return
  def apply(callback: js.Function1[/* args */ Unit, Unit]): Timer = js.native
  def apply(callback: js.Function1[/* args */ Unit, Unit], ms: Double): Timer = js.native
  /**
    * Schedules repeated execution of `callback` every `delay` milliseconds.
    *
    * When `delay` is larger than `2147483647` or less than `1`, the `delay` will be
    * set to `1`. Non-integer delays are truncated to an integer.
    *
    * If `callback` is not a function, a `TypeError` will be thrown.
    *
    * This method has a custom variant for promises that is available using `timersPromises.setInterval()`.
    * @since v0.0.1
    * @param callback The function to call when the timer elapses.
    * @param [delay=1] The number of milliseconds to wait before calling the `callback`.
    * @param args Optional arguments to pass when the `callback` is called.
    * @return for use with {@link clearInterval}
    */
  def apply[TArgs /* <: js.Array[Any] */](
    callback: js.Function1[/* args */ TArgs, Unit],
    ms: Double,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
  ): Timer = js.native
  def apply[TArgs /* <: js.Array[Any] */](
    callback: js.Function1[/* args */ TArgs, Unit],
    ms: Unit,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
  ): Timer = js.native
}
