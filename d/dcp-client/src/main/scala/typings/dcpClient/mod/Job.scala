package typings.dcpClient.mod

import typings.dcpClient.dcpClientStrings.accepted
import typings.dcpClient.dcpClientStrings.complete
import typings.dcpClient.dcpClientStrings.console
import typings.dcpClient.dcpClientStrings.readystatechange
import typings.dcpClient.dcpClientStrings.result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dcp-client", "Job")
@js.native
open class Job () extends StObject {
  
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
  
  def localExec(
    cores: Double,
    slicePaymentOffer: js.Object,
    paymentAccountKeystore: Keystore,
    initialSliceProfile: js.Object
  ): js.Promise[ResultHandle] = js.native
  /**
    * Deploys the job for work to be done in locally in the client.
    * @param cores – The number of local cores to be used to execute the job.
    * @param slicePaymentOffer – The amount of DCC user is willing to pay per slice. However, localExec jobs don’t take DCC.
    * @param paymentAccountKeystore – Instance of Wallet API Keystore being used as the payment account for executing a job.
    * @param initialSliceProfile – Object describing the cost the user believes the average slice will incur in terms of CPU/CPU and I/O.
    * @returns Promise<ResultHandle>
    */
  def localExec(
    cores: Double,
    slicePaymentOffer: Double,
    paymentAccountKeystore: Keystore,
    initialSliceProfile: js.Object
  ): js.Promise[ResultHandle] = js.native
  
  /**
    * @accepted - Emitted when the job gets accepted by the DCP Scheduler.
    * @complete - Emitted when the job finishes.
    * @readystatechange - Emitted leading up to deployment of the job.
    * @console - Used to collect the console output of the workers.
    * @result - Emitted when a slice completes and returns.
    */
  def on(
    event: accepted | complete | readystatechange | console | result,
    listener: js.Function1[/* ev */ js.UndefOr[Any], Unit]
  ): this.type = js.native
  
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
