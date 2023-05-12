package typings.dcpClient.mod

import typings.dcpClient.anon.Distributed
import typings.dcpClient.anon.FnCallEventNameListener
import typings.dcpClient.anon.Job
import typings.dcpClient.anon.Level
import typings.dcpClient.anon.Message
import typings.dcpClient.dcpClientStrings.accepted
import typings.dcpClient.dcpClientStrings.cancel
import typings.dcpClient.dcpClientStrings.complete
import typings.dcpClient.dcpClientStrings.console
import typings.dcpClient.dcpClientStrings.error
import typings.dcpClient.dcpClientStrings.readystatechange
import typings.dcpClient.dcpClientStrings.result
import typings.dcpClient.dcpClientStrings.resultsUpdated
import typings.dcpClient.dcpClientStrings.status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dcp-client", "JobHandle")
@js.native
open class JobHandle () extends StObject {
  
  /**
    * Executes the function `listener` when the event `eventName` is triggered.
    * @param eventName A case-sensitive string representing the event type to listen for.
    * @param listener A function that is called when the specified event type occurs.
    * @event accepted: The job gets accepted by the DCP Scheduler.
    * @event complete: The job finishes.
    * @event readystatechange: Emitted leading up to deployment of the job.
    * @event console: Used to collect the console output of the workers.
    * @event result A slice completes and returns.
    */
  def addEventListener(eventName: readystatechange | resultsUpdated | cancel, listener: js.Function0[Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_accepted(eventName: accepted, listener: js.Function1[/* event */ Job, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_complete(eventName: complete, listener: js.Function1[/* event */ ResultHandle, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_console(eventName: console, listener: js.Function1[/* event */ Level, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(eventName: error, listener: js.Function1[/* event */ Message, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_result(eventName: result, listener: js.Function1[/* event */ typings.dcpClient.anon.Address, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_status(eventName: status, listener: js.Function1[/* event */ Distributed, Unit]): Unit = js.native
  
  /**
    * Same as {@link JobHandle.addEventListener}
    */
  def addListener(eventName: readystatechange | resultsUpdated | cancel, listener: js.Function0[Unit]): Unit = js.native
  /**
    * Same as {@link JobHandle.addEventListener}
    */
  @JSName("addListener")
  var addListener_Original: FnCallEventNameListener = js.native
  /**
    * Same as {@link JobHandle.addEventListener}
    */
  @JSName("addListener")
  def addListener_accepted(eventName: accepted, listener: js.Function1[/* event */ Job, Unit]): Unit = js.native
  /**
    * Same as {@link JobHandle.addEventListener}
    */
  @JSName("addListener")
  def addListener_complete(eventName: complete, listener: js.Function1[/* event */ ResultHandle, Unit]): Unit = js.native
  /**
    * Same as {@link JobHandle.addEventListener}
    */
  @JSName("addListener")
  def addListener_console(eventName: console, listener: js.Function1[/* event */ Level, Unit]): Unit = js.native
  /**
    * Same as {@link JobHandle.addEventListener}
    */
  @JSName("addListener")
  def addListener_error(eventName: error, listener: js.Function1[/* event */ Message, Unit]): Unit = js.native
  /**
    * Same as {@link JobHandle.addEventListener}
    */
  @JSName("addListener")
  def addListener_result(eventName: result, listener: js.Function1[/* event */ typings.dcpClient.anon.Address, Unit]): Unit = js.native
  /**
    * Same as {@link JobHandle.addEventListener}
    */
  @JSName("addListener")
  def addListener_status(eventName: status, listener: js.Function1[/* event */ Distributed, Unit]): Unit = js.native
  
  /**
    * Job address
    */
  var address: String = js.native
  
  /**
    * Deploys the job for work to be done in locally in the client.
    * @param reason string – The reason for job cancellation, sent to client if provided.
    * @returns Promise<void>
    */
  def cancel(reason: String): js.Promise[Unit] = js.native
  
  /**
    * Deploys the job to the scheduler for work to be done by distributed workers all throughout the DCP network.
    * @param slicePaymentOffer - The amount of DCC user is willing to pay per slice.
    * @param paymentAccountKeystore – Instance of Wallet API Keystore being used as the payment account for executing a job.
    * @param initialSliceProfile – Object describing the cost the user believes the average slice will incur in terms of CPU/GPU and I/O.
    * @returns Promise<ResultHandle>
    */
  def exec(): js.Promise[ResultHandle] = js.native
  def exec(slicePaymentOffer: js.Object): js.Promise[ResultHandle] = js.native
  def exec(slicePaymentOffer: js.Object, paymentAccountKeystore: Unit, initialSliceProfile: js.Object): js.Promise[ResultHandle] = js.native
  def exec(slicePaymentOffer: js.Object, paymentAccountKeystore: Keystore): js.Promise[ResultHandle] = js.native
  def exec(slicePaymentOffer: js.Object, paymentAccountKeystore: Keystore, initialSliceProfile: js.Object): js.Promise[ResultHandle] = js.native
  def exec(slicePaymentOffer: Double): js.Promise[ResultHandle] = js.native
  def exec(slicePaymentOffer: Double, paymentAccountKeystore: Unit, initialSliceProfile: js.Object): js.Promise[ResultHandle] = js.native
  def exec(slicePaymentOffer: Double, paymentAccountKeystore: Keystore): js.Promise[ResultHandle] = js.native
  def exec(slicePaymentOffer: Double, paymentAccountKeystore: Keystore, initialSliceProfile: js.Object): js.Promise[ResultHandle] = js.native
  def exec(slicePaymentOffer: Unit, paymentAccountKeystore: Unit, initialSliceProfile: js.Object): js.Promise[ResultHandle] = js.native
  def exec(slicePaymentOffer: Unit, paymentAccountKeystore: Keystore): js.Promise[ResultHandle] = js.native
  def exec(slicePaymentOffer: Unit, paymentAccountKeystore: Keystore, initialSliceProfile: js.Object): js.Promise[ResultHandle] = js.native
  
  /**
    * Job id
    * Note: The job id is a getter for job address.
    */
  var id: String = js.native
  
  /**
    * Deploys the job for work to be done in locally in the client.
    * @param cores The number of local cores to be used to execute the job.
    * @param slicePaymentOffer The amount of DCC user is willing to pay per slice. However, localExec jobs don’t take DCC.
    * @param paymentAccountKeystore Instance of Wallet API Keystore being used as the payment account for executing a job.
    * @param initialSliceProfile Object describing the cost the user believes the average slice will incur in terms of CPU/CPU and I/O.
    * @returns The same result handle returned by `JobHandle.prototype.exec`.
    */
  def localExec(): js.Promise[ResultHandle] = js.native
  def localExec(cores: Double): js.Promise[ResultHandle] = js.native
  def localExec(cores: Double, slicePaymentOffer: js.Object): js.Promise[ResultHandle] = js.native
  def localExec(
    cores: Double,
    slicePaymentOffer: js.Object,
    paymentAccountKeystore: Unit,
    initialSliceProfile: js.Object
  ): js.Promise[ResultHandle] = js.native
  def localExec(cores: Double, slicePaymentOffer: js.Object, paymentAccountKeystore: Keystore): js.Promise[ResultHandle] = js.native
  def localExec(
    cores: Double,
    slicePaymentOffer: js.Object,
    paymentAccountKeystore: Keystore,
    initialSliceProfile: js.Object
  ): js.Promise[ResultHandle] = js.native
  def localExec(cores: Double, slicePaymentOffer: Double): js.Promise[ResultHandle] = js.native
  def localExec(
    cores: Double,
    slicePaymentOffer: Double,
    paymentAccountKeystore: Unit,
    initialSliceProfile: js.Object
  ): js.Promise[ResultHandle] = js.native
  def localExec(cores: Double, slicePaymentOffer: Double, paymentAccountKeystore: Keystore): js.Promise[ResultHandle] = js.native
  def localExec(
    cores: Double,
    slicePaymentOffer: Double,
    paymentAccountKeystore: Keystore,
    initialSliceProfile: js.Object
  ): js.Promise[ResultHandle] = js.native
  def localExec(
    cores: Double,
    slicePaymentOffer: Unit,
    paymentAccountKeystore: Unit,
    initialSliceProfile: js.Object
  ): js.Promise[ResultHandle] = js.native
  def localExec(cores: Double, slicePaymentOffer: Unit, paymentAccountKeystore: Keystore): js.Promise[ResultHandle] = js.native
  def localExec(
    cores: Double,
    slicePaymentOffer: Unit,
    paymentAccountKeystore: Keystore,
    initialSliceProfile: js.Object
  ): js.Promise[ResultHandle] = js.native
  def localExec(cores: Unit, slicePaymentOffer: js.Object): js.Promise[ResultHandle] = js.native
  def localExec(
    cores: Unit,
    slicePaymentOffer: js.Object,
    paymentAccountKeystore: Unit,
    initialSliceProfile: js.Object
  ): js.Promise[ResultHandle] = js.native
  def localExec(cores: Unit, slicePaymentOffer: js.Object, paymentAccountKeystore: Keystore): js.Promise[ResultHandle] = js.native
  def localExec(
    cores: Unit,
    slicePaymentOffer: js.Object,
    paymentAccountKeystore: Keystore,
    initialSliceProfile: js.Object
  ): js.Promise[ResultHandle] = js.native
  def localExec(cores: Unit, slicePaymentOffer: Double): js.Promise[ResultHandle] = js.native
  def localExec(
    cores: Unit,
    slicePaymentOffer: Double,
    paymentAccountKeystore: Unit,
    initialSliceProfile: js.Object
  ): js.Promise[ResultHandle] = js.native
  def localExec(cores: Unit, slicePaymentOffer: Double, paymentAccountKeystore: Keystore): js.Promise[ResultHandle] = js.native
  def localExec(
    cores: Unit,
    slicePaymentOffer: Double,
    paymentAccountKeystore: Keystore,
    initialSliceProfile: js.Object
  ): js.Promise[ResultHandle] = js.native
  def localExec(cores: Unit, slicePaymentOffer: Unit, paymentAccountKeystore: Unit, initialSliceProfile: js.Object): js.Promise[ResultHandle] = js.native
  def localExec(cores: Unit, slicePaymentOffer: Unit, paymentAccountKeystore: Keystore): js.Promise[ResultHandle] = js.native
  def localExec(
    cores: Unit,
    slicePaymentOffer: Unit,
    paymentAccountKeystore: Keystore,
    initialSliceProfile: js.Object
  ): js.Promise[ResultHandle] = js.native
  
  /**
    * Same as {@link JobHandle.addEventListener}
    */
  def on(eventName: readystatechange | resultsUpdated | cancel, listener: js.Function0[Unit]): Unit = js.native
  /**
    * Same as {@link JobHandle.addEventListener}
    */
  @JSName("on")
  var on_Original: FnCallEventNameListener = js.native
  /**
    * Same as {@link JobHandle.addEventListener}
    */
  @JSName("on")
  def on_accepted(eventName: accepted, listener: js.Function1[/* event */ Job, Unit]): Unit = js.native
  /**
    * Same as {@link JobHandle.addEventListener}
    */
  @JSName("on")
  def on_complete(eventName: complete, listener: js.Function1[/* event */ ResultHandle, Unit]): Unit = js.native
  /**
    * Same as {@link JobHandle.addEventListener}
    */
  @JSName("on")
  def on_console(eventName: console, listener: js.Function1[/* event */ Level, Unit]): Unit = js.native
  /**
    * Same as {@link JobHandle.addEventListener}
    */
  @JSName("on")
  def on_error(eventName: error, listener: js.Function1[/* event */ Message, Unit]): Unit = js.native
  /**
    * Same as {@link JobHandle.addEventListener}
    */
  @JSName("on")
  def on_result(eventName: result, listener: js.Function1[/* event */ typings.dcpClient.anon.Address, Unit]): Unit = js.native
  /**
    * Same as {@link JobHandle.addEventListener}
    */
  @JSName("on")
  def on_status(eventName: status, listener: js.Function1[/* event */ Distributed, Unit]): Unit = js.native
  
  /**
    * An object to store public-facing attributes of a job. Anything stored in this object will be available for use inside the work function.
    * Properties of this object can be seen by the worker in order to display what job it is currently working on.
    */
  var public: PublicProperties = js.native
  
  /**
    * Resumes the job.
    * modulePaths should not have .js extension at the end of the path. For more information on moduleIdentifiers, view the CommonJs specification in
    * [See docs](https://wiki.commonjs.org/wiki/Modules/1.1#Module_Identifiers)
    * @param modulePaths – Either a string or a list of strings that represent the module dependency path.
    * @returns Promise<void>
    */
  def requires(modulePaths: String): js.Promise[Unit] = js.native
  def requires(modulePaths: js.Array[String]): js.Promise[Unit] = js.native
  
  /**
    * Resumes the job.
    * @returns Promise<void>
    */
  def resume(reason: String): js.Promise[Unit] = js.native
  
  /**
    * Setting Job.useStrict true runs the work function in the strict mode.
    */
  var useStrict: Boolean = js.native
}
