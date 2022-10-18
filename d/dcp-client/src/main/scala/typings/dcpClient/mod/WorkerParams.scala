package typings.dcpClient.mod

import typings.dcpClient.dcpClientInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
