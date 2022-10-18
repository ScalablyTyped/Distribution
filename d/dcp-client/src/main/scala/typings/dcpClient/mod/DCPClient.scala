package typings.dcpClient.mod

import typings.dcpClient.mod.compute.Compute
import typings.dcpClient.mod.wallet.Wallet
import typings.dcpClient.mod.worker.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
