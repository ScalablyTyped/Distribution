package typings.dcpClient.mod

import typings.dcpClient.dcpClientStrings.sliceEnd
import typings.dcpClient.dcpClientStrings.sliceError
import typings.dcpClient.dcpClientStrings.sliceFinish
import typings.dcpClient.dcpClientStrings.sliceStart
import typings.dcpClient.dcpClientStrings.terminate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sandbox extends StObject {
  
  /**
    * @sliceError - Emitted when the slice the sandbox was working on throws an error. The first argument is the same payload from sliceStart, the second argument is the error instance.
    * @sliceEnd - Emitted when the slice either finishes or throws an error. The callback argument is the payload from sliceStart.
    * @terminate - Emitted when the sandbox environment is terminated. The sandbox will not be used after this event is emitted.
    */
  def on(event: sliceError | sliceEnd | terminate, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when the sandbox completes the slice it was working on.
    */
  @JSName("on")
  def on_sliceFinish(event: sliceFinish, listener: js.Function1[/* result */ Any, Unit]): this.type = js.native
  /**
    * Emitted when the sandbox begins working on a slice. The job description object. Use job.public for accessing the job’s title/description.
    */
  @JSName("on")
  def on_sliceStart(event: sliceStart, listener: js.Function1[/* job */ js.Object, Unit]): this.type = js.native
}
