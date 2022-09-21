package typings.dcpClient

import typings.dcpClient.computeMod.Compute
import typings.dcpClient.dcpClientNumbers.`1`
import typings.dcpClient.dcpClientStrings.default
import typings.dcpClient.dcpClientStrings.sliceEnd
import typings.dcpClient.dcpClientStrings.sliceError
import typings.dcpClient.dcpClientStrings.sliceFinish
import typings.dcpClient.dcpClientStrings.sliceStart
import typings.dcpClient.dcpClientStrings.terminate
import typings.dcpClient.walletMod.Wallet
import typings.dcpClient.workerMod.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dcp-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dcp-client", "AuthKeystore")
  @js.native
  open class AuthKeystore () extends Keystore
  
  @JSImport("dcp-client", "Job")
  @js.native
  open class Job () extends StObject
  
  @JSImport("dcp-client", "JobHandle")
  @js.native
  open class JobHandle () extends StObject
  
  @JSImport("dcp-client", "JobHistory")
  @js.native
  open class JobHistory () extends StObject {
    
    var history: js.Object = js.native
    
    var status: String = js.native
  }
  
  @JSImport("dcp-client", "JobInfo")
  @js.native
  open class JobInfo () extends StObject {
    
    var jobInfo: js.Object = js.native
    
    var status: String = js.native
  }
  
  @JSImport("dcp-client", "Keystore")
  @js.native
  open class Keystore () extends StObject {
    
    var id: Double = js.native
  }
  
  @JSImport("dcp-client", "PaymentKeystore")
  @js.native
  open class PaymentKeystore () extends Keystore {
    
    var address: Address = js.native
  }
  
  @JSImport("dcp-client", "SandboxOptions")
  @js.native
  open class SandboxOptions () extends StObject {
    
    /**
      * When true, the sandbox will ignore errors from the sandbox not firing progress events.
      */
    var ignoreNoProgress: Boolean = js.native
  }
  
  @JSImport("dcp-client", "SliceProfile")
  @js.native
  open class SliceProfile () extends StObject
  
  @JSImport("dcp-client", "Supervisor")
  @js.native
  open class Supervisor () extends StObject
  
  @JSImport("dcp-client", "WorkValue")
  @js.native
  open class WorkValue () extends StObject
  
  @JSImport("dcp-client", "WorkValueQuote")
  @js.native
  open class WorkValueQuote () extends StObject
  
  inline def init(): js.Promise[DCPClient] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[js.Promise[DCPClient]]
  
  trait Address extends StObject {
    
    var account: String
  }
  object Address {
    
    inline def apply(account: String): Address = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    extension [Self <: Address](x: Self) {
      
      inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    }
  }
  
  trait AuthKeystoreOptions extends StObject {
    
    /**
      * Try an empty password before prompting user. Defaults to true.
      */
    var checkEmpty: Boolean
    
    /**
      * An optional, user-defined identifier used for caching keystores.
      */
    var contextId: js.UndefOr[String] = js.undefined
    
    /**
      *  An optional name for the job that they keystore is being requested for.
      */
    var jobName: js.UndefOr[String] = js.undefined
    
    /**
      * The keystore name.
      */
    var name: String | default
  }
  object AuthKeystoreOptions {
    
    inline def apply(checkEmpty: Boolean, name: String | default): AuthKeystoreOptions = {
      val __obj = js.Dynamic.literal(checkEmpty = checkEmpty.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthKeystoreOptions]
    }
    
    extension [Self <: AuthKeystoreOptions](x: Self) {
      
      inline def setCheckEmpty(value: Boolean): Self = StObject.set(x, "checkEmpty", value.asInstanceOf[js.Any])
      
      inline def setContextId(value: String): Self = StObject.set(x, "contextId", value.asInstanceOf[js.Any])
      
      inline def setContextIdUndefined: Self = StObject.set(x, "contextId", js.undefined)
      
      inline def setJobName(value: String): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
      
      inline def setJobNameUndefined: Self = StObject.set(x, "jobName", js.undefined)
      
      inline def setName(value: String | default): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait DCPClient extends StObject {
    
    var compute: Compute
    
    var wallet: Wallet
    
    var worker: Worker
  }
  object DCPClient {
    
    inline def apply(compute: Compute, wallet: Wallet, worker: Worker): DCPClient = {
      val __obj = js.Dynamic.literal(compute = compute.asInstanceOf[js.Any], wallet = wallet.asInstanceOf[js.Any], worker = worker.asInstanceOf[js.Any])
      __obj.asInstanceOf[DCPClient]
    }
    
    extension [Self <: DCPClient](x: Self) {
      
      inline def setCompute(value: Compute): Self = StObject.set(x, "compute", value.asInstanceOf[js.Any])
      
      inline def setWallet(value: Wallet): Self = StObject.set(x, "wallet", value.asInstanceOf[js.Any])
      
      inline def setWorker(value: Worker): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
    }
  }
  
  trait LoadOptions extends StObject {
    
    /**
      * Override paths.
      */
    var dir: js.UndefOr[String] = js.undefined
    
    /**
      * The keystore filename.
      */
    var filename: js.UndefOr[String] = js.undefined
    
    /**
      * The keystore label or filename.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      *  Override the default keystore directory search path (Node.js Only). This must be a complete pathname.
      */
    var paths: js.UndefOr[js.Array[String] | String] = js.undefined
  }
  object LoadOptions {
    
    inline def apply(): LoadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadOptions]
    }
    
    extension [Self <: LoadOptions](x: Self) {
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPaths(value: js.Array[String] | String): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
    }
  }
  
  trait LoadResult extends StObject {
    
    var keystore: Keystore
    
    var safe: Boolean
  }
  object LoadResult {
    
    inline def apply(keystore: Keystore, safe: Boolean): LoadResult = {
      val __obj = js.Dynamic.literal(keystore = keystore.asInstanceOf[js.Any], safe = safe.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadResult]
    }
    
    extension [Self <: LoadResult](x: Self) {
      
      inline def setKeystore(value: Keystore): Self = StObject.set(x, "keystore", value.asInstanceOf[js.Any])
      
      inline def setSafe(value: Boolean): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
    }
  }
  
  trait PaymentParams extends StObject {
    
    /**
      * Whether the slice was accepted, payment value will be 0 if not accepted.
      */
    var accepted: Boolean
    
    /**
      * String representation of the DCC value that was paid out.
      */
    var payment: String
    
    /**
      * Bank address that the payment was sent to.
      */
    var paymentAddress: String
    
    /**
      * Reason string for why the slice was accepted/rejected.
      */
    var reason: String
  }
  object PaymentParams {
    
    inline def apply(accepted: Boolean, payment: String, paymentAddress: String, reason: String): PaymentParams = {
      val __obj = js.Dynamic.literal(accepted = accepted.asInstanceOf[js.Any], payment = payment.asInstanceOf[js.Any], paymentAddress = paymentAddress.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentParams]
    }
    
    extension [Self <: PaymentParams](x: Self) {
      
      inline def setAccepted(value: Boolean): Self = StObject.set(x, "accepted", value.asInstanceOf[js.Any])
      
      inline def setPayment(value: String): Self = StObject.set(x, "payment", value.asInstanceOf[js.Any])
      
      inline def setPaymentAddress(value: String): Self = StObject.set(x, "paymentAddress", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ranges extends StObject {
    
    var ranges: js.Array[Any]
  }
  object Ranges {
    
    inline def apply(ranges: js.Array[Any]): Ranges = {
      val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ranges]
    }
    
    extension [Self <: Ranges](x: Self) {
      
      inline def setRanges(value: js.Array[Any]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setRangesVarargs(value: Any*): Self = StObject.set(x, "ranges", js.Array(value*))
    }
  }
  
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
  
  trait SchedMsg extends StObject {
    
    /**
      * This command is an announcement from the scheduler,
      * the provided message should be displayed to the user (modal on web, console on node). The message to be displayed to the user.
      */
    def announce(message: String): Unit
    
    /**
      * This command instructs the worker to immediately stop working, and can optionally disable the worker to prevent restarting.
      * The user will need to manually intervene to restart the worker. When false, the worker will be disabled.
      */
    def kill(temporary: Boolean): Unit
    
    /**
      * This web-only command will open a new webpage to the provided URL. The URL to open the new page to.
      */
    def openPopup(href: String): Unit
    
    /**
      * This command instructs the worker to “hard” reload, in the browser this will trigger a page refresh and in node it will exit the process.
      */
    def reload(): Unit
    
    /**
      * This command instructs the worker to stop working on a specific job. The address of the job to stop working on.
      */
    def remove(jobAddress: String): Unit
    
    /**
      * This command instructs the worker to restart, e.g. call worker.stop() then worker.start().
      */
    def restart(): Unit
  }
  object SchedMsg {
    
    inline def apply(
      announce: String => Unit,
      kill: Boolean => Unit,
      openPopup: String => Unit,
      reload: () => Unit,
      remove: String => Unit,
      restart: () => Unit
    ): SchedMsg = {
      val __obj = js.Dynamic.literal(announce = js.Any.fromFunction1(announce), kill = js.Any.fromFunction1(kill), openPopup = js.Any.fromFunction1(openPopup), reload = js.Any.fromFunction0(reload), remove = js.Any.fromFunction1(remove), restart = js.Any.fromFunction0(restart))
      __obj.asInstanceOf[SchedMsg]
    }
    
    extension [Self <: SchedMsg](x: Self) {
      
      inline def setAnnounce(value: String => Unit): Self = StObject.set(x, "announce", js.Any.fromFunction1(value))
      
      inline def setKill(value: Boolean => Unit): Self = StObject.set(x, "kill", js.Any.fromFunction1(value))
      
      inline def setOpenPopup(value: String => Unit): Self = StObject.set(x, "openPopup", js.Any.fromFunction1(value))
      
      inline def setReload(value: () => Unit): Self = StObject.set(x, "reload", js.Any.fromFunction0(value))
      
      inline def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setRestart(value: () => Unit): Self = StObject.set(x, "restart", js.Any.fromFunction0(value))
    }
  }
  
  trait WorkerParams extends StObject {
    
    /**
      * @summary Keystore that will be used as the identity when communicating with the scheduler, will default to wallet.getId()
      */
    var identityKeystore: js.UndefOr[Keystore] = js.undefined
    
    /**
      * @summary When provided, this worker will only compute slices for the provided job. The job must have been deployed with the local exec flag set.
      */
    var jobAddress: js.UndefOr[String] = js.undefined
    
    /**
      * @summary Maximum number of sandboxes that can be working at one time.
      */
    var maxWorkingSandboxes: Double | `1`
    
    /**
      * @summary Address used for depositing DCCs in after a slice is computed,
      * will default to (await wallet.get()).address
      */
    var paymentAddress: js.UndefOr[String | Keystore] = js.undefined
    
    /**
      * @summary Sandbox options
      */
    var sandboxOptions: SandboxOptions
    
    /**
      * @summary URL to use when connecting to the scheduler, defaults to dcpConfig.scheduler.location
      */
    var schedulerURL: js.UndefOr[String] = js.undefined
  }
  object WorkerParams {
    
    inline def apply(maxWorkingSandboxes: Double | `1`, sandboxOptions: SandboxOptions): WorkerParams = {
      val __obj = js.Dynamic.literal(maxWorkingSandboxes = maxWorkingSandboxes.asInstanceOf[js.Any], sandboxOptions = sandboxOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerParams]
    }
    
    extension [Self <: WorkerParams](x: Self) {
      
      inline def setIdentityKeystore(value: Keystore): Self = StObject.set(x, "identityKeystore", value.asInstanceOf[js.Any])
      
      inline def setIdentityKeystoreUndefined: Self = StObject.set(x, "identityKeystore", js.undefined)
      
      inline def setJobAddress(value: String): Self = StObject.set(x, "jobAddress", value.asInstanceOf[js.Any])
      
      inline def setJobAddressUndefined: Self = StObject.set(x, "jobAddress", js.undefined)
      
      inline def setMaxWorkingSandboxes(value: Double | `1`): Self = StObject.set(x, "maxWorkingSandboxes", value.asInstanceOf[js.Any])
      
      inline def setPaymentAddress(value: String | Keystore): Self = StObject.set(x, "paymentAddress", value.asInstanceOf[js.Any])
      
      inline def setPaymentAddressUndefined: Self = StObject.set(x, "paymentAddress", js.undefined)
      
      inline def setSandboxOptions(value: SandboxOptions): Self = StObject.set(x, "sandboxOptions", value.asInstanceOf[js.Any])
      
      inline def setSchedulerURL(value: String): Self = StObject.set(x, "schedulerURL", value.asInstanceOf[js.Any])
      
      inline def setSchedulerURLUndefined: Self = StObject.set(x, "schedulerURL", js.undefined)
    }
  }
  
  type jobId = Double
}
