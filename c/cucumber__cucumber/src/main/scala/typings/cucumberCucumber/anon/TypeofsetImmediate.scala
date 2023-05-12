package typings.cucumberCucumber.anon

import typings.node.timersMod.global.NodeJS.Immediate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofsetImmediate extends StObject {
  
  // util.promisify no rest args compability
  // tslint:disable-next-line void-return
  def apply(callback: js.Function1[/* args */ Unit, Unit]): Immediate = js.native
  /**
    * Schedules the "immediate" execution of the `callback` after I/O events'
    * callbacks.
    *
    * When multiple calls to `setImmediate()` are made, the `callback` functions are
    * queued for execution in the order in which they are created. The entire callback
    * queue is processed every event loop iteration. If an immediate timer is queued
    * from inside an executing callback, that timer will not be triggered until the
    * next event loop iteration.
    *
    * If `callback` is not a function, a `TypeError` will be thrown.
    *
    * This method has a custom variant for promises that is available using `timersPromises.setImmediate()`.
    * @since v0.9.1
    * @param callback The function to call at the end of this turn of the Node.js `Event Loop`
    * @param args Optional arguments to pass when the `callback` is called.
    * @return for use with {@link clearImmediate}
    */
  def apply[TArgs /* <: js.Array[Any] */](
    callback: js.Function1[/* args */ TArgs, Unit],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
  ): Immediate = js.native
}
