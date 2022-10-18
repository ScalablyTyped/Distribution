package typings.dcpClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * Emits a progress event. Every work function must invoke this function.
    * If a progress event is not emitted within 30 seconds, the scheduler will throw an ENOPROGRESS error.
    * @param n An estimate between 0 and 1 (inclusive) of the ratio of work completed to the total amount of work that needs to be done for one slice.
    * This value must be between 6 significant digits and must always be increasing as more work is continuously being done.
    * @returns void | EnoProgressError
    */
  inline def progress(): Unit | EnoProgressError = js.Dynamic.global.applyDynamic("progress")().asInstanceOf[Unit | EnoProgressError]
  inline def progress(n: String): Unit | EnoProgressError = js.Dynamic.global.applyDynamic("progress")(n.asInstanceOf[js.Any]).asInstanceOf[Unit | EnoProgressError]
  inline def progress(n: Double): Unit | EnoProgressError = js.Dynamic.global.applyDynamic("progress")(n.asInstanceOf[js.Any]).asInstanceOf[Unit | EnoProgressError]
}
