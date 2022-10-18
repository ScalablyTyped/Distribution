package typings.dcpClient.mod

import typings.dcpClient.dcpClientStrings.fetch
import typings.dcpClient.dcpClientStrings.fetchEnd
import typings.dcpClient.dcpClientStrings.fetchError
import typings.dcpClient.dcpClientStrings.fetchStart
import typings.dcpClient.dcpClientStrings.payment
import typings.dcpClient.dcpClientStrings.sandbox
import typings.dcpClient.dcpClientStrings.start
import typings.dcpClient.dcpClientStrings.stop
import typings.dcpClient.dcpClientStrings.submit
import typings.dcpClient.dcpClientStrings.submitEnd
import typings.dcpClient.dcpClientStrings.submitError
import typings.dcpClient.dcpClientStrings.submitStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object worker {
  
  @JSImport("dcp-client", "worker.Worker")
  @js.native
  open class Worker () extends StObject {
    
    /**
      * @start - Emitted when the worker is started.
      * @stop - Emitted when the worker is stopped.
      * @fetchStart - Emitted when the worker submits a result. Contains the value of DCC earned.
      * @fetchEnd - Emitted when the worker’s slice fetch request is finished, on both success and error. If it was emmitted due to an error, the callback argument will be the error instance.
      * @fetch - Emitted when the worker successfully fetches slices from the scheduler.
      * @fetchError - Emitted when the worker’s slice fetch request returns an error. The callback argument is the error instance.
      * @submitStart - Emitted when the worker starts a request to submit a result to the scheduler.
      * @submitEnd - Emitted when the worker’s result submit request is finished, on both success and error. If it was emitted due to an error, the callback argument wil be the error instance.
      * @submit - Emitted when the worker successfully submits a result to the scheduler.
      * @submitError - Emitted when the worker successfully submits a result to the scheduler.
      */
    def on(
      event: start | stop | fetchStart | fetchEnd | fetch | fetchError | submitStart | submitEnd | submit | submitError,
      listener: js.Function0[Unit]
    ): this.type = js.native
    /**
      * Emitted when the worker submits a result. Contains the value of DCC earned.
      */
    @JSName("on")
    def on_payment(event: payment, listener: js.Function1[/* paymentParams */ PaymentParams, Unit]): this.type = js.native
    /**
      * Emitted when the worker instantiates a new sandbox. The argument provided to the callback is the Sandbox instance.
      */
    @JSName("on")
    def on_sandbox(event: sandbox, listener: js.Function1[/* sandbox */ Sandbox, Unit]): this.type = js.native
    
    /**
      * @summary The internal schedMsg client instance. Custom behaviour for schedMsg commands can be provided on this object
      */
    var schedMsg: SchedMsg = js.native
    
    /**
      * This method will start the worker. It will begin to fetch work from the supervisor and submit the computed results automatically.
      * It will throw if the worker is already started.
      */
    def start(): js.Promise[Unit] = js.native
    
    /**
      * This method will stop the worker. If the immediate flag is true,
      * the worker will terminate all working sandboxes without waiting for them to finish working.
      */
    def stop(immediate: Boolean): js.Promise[Unit] = js.native
    
    /**
      * @summary The internal supervisor instance.
      */
    var supervisor: Supervisor = js.native
    
    /**
      * This boolean indicates the current status of the worker. It should not be set manually.
      */
    var working: Boolean = js.native
  }
  object Worker {
    
    @JSImport("dcp-client", "worker.Worker")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * [See docs](https://docs.dcp.dev/specs/worker-api.html?highlight=maxworkingsandboxes%20number#methods)
      * This static method will set a key in local storage (or on the file system on Node) to disable the worker.
      * The user will need to manually intervene before the worker can be started again.
      */
    /* static member */
    inline def disableWorker(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableWorker")().asInstanceOf[Unit]
  }
}
