package typings.clusterHub

import typings.node.clusterMod.Worker
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cluster-hub", JSImport.Namespace)
  @js.native
  open class ^ () extends Hub {
    def this(messageKey: String) = this()
  }
  
  type Callback = js.Function2[/* err */ js.Error | Null, /* response */ Any, Unit]
  
  @js.native
  trait Hub extends EventEmitter {
    
    def lock(lockKey: String): Boolean = js.native
    def lock(lockKey: String, callback: js.Function1[/* unlock */ js.Function0[Unit], Unit]): Boolean = js.native
    
    def requestAllWorkers(`type`: String): Boolean = js.native
    def requestAllWorkers(`type`: String, data: Any): Boolean = js.native
    def requestAllWorkers(`type`: String, data: Any, callback: Callback): Boolean = js.native
    def requestAllWorkers(`type`: String, data: Unit, callback: Callback): Boolean = js.native
    def requestAllWorkers(`type`: js.Symbol): Boolean = js.native
    def requestAllWorkers(`type`: js.Symbol, data: Any): Boolean = js.native
    def requestAllWorkers(`type`: js.Symbol, data: Any, callback: Callback): Boolean = js.native
    def requestAllWorkers(`type`: js.Symbol, data: Unit, callback: Callback): Boolean = js.native
    
    def requestMaster(`type`: String): Boolean = js.native
    def requestMaster(`type`: String, data: Any): Boolean = js.native
    def requestMaster(`type`: String, data: Any, callback: Callback): Boolean = js.native
    def requestMaster(`type`: String, data: Unit, callback: Callback): Boolean = js.native
    def requestMaster(`type`: js.Symbol): Boolean = js.native
    def requestMaster(`type`: js.Symbol, data: Any): Boolean = js.native
    def requestMaster(`type`: js.Symbol, data: Any, callback: Callback): Boolean = js.native
    def requestMaster(`type`: js.Symbol, data: Unit, callback: Callback): Boolean = js.native
    
    def requestRandomWorker(`type`: String): Boolean = js.native
    def requestRandomWorker(`type`: String, data: Any): Boolean = js.native
    def requestRandomWorker(`type`: String, data: Any, callback: Callback): Boolean = js.native
    def requestRandomWorker(`type`: String, data: Unit, callback: Callback): Boolean = js.native
    def requestRandomWorker(`type`: js.Symbol): Boolean = js.native
    def requestRandomWorker(`type`: js.Symbol, data: Any): Boolean = js.native
    def requestRandomWorker(`type`: js.Symbol, data: Any, callback: Callback): Boolean = js.native
    def requestRandomWorker(`type`: js.Symbol, data: Unit, callback: Callback): Boolean = js.native
    
    def requestWorker(worker: Worker, `type`: String): Boolean = js.native
    def requestWorker(worker: Worker, `type`: String, data: Any): Boolean = js.native
    def requestWorker(worker: Worker, `type`: String, data: Any, callback: Callback): Boolean = js.native
    def requestWorker(worker: Worker, `type`: String, data: Unit, callback: Callback): Boolean = js.native
    def requestWorker(worker: Worker, `type`: js.Symbol): Boolean = js.native
    def requestWorker(worker: Worker, `type`: js.Symbol, data: Any): Boolean = js.native
    def requestWorker(worker: Worker, `type`: js.Symbol, data: Any, callback: Callback): Boolean = js.native
    def requestWorker(worker: Worker, `type`: js.Symbol, data: Unit, callback: Callback): Boolean = js.native
    
    def sendToMaster(`type`: String): Boolean = js.native
    def sendToMaster(`type`: String, data: Any): Boolean = js.native
    def sendToMaster(`type`: js.Symbol): Boolean = js.native
    def sendToMaster(`type`: js.Symbol, data: Any): Boolean = js.native
    
    def sendToRandomWorker(`type`: String): Boolean = js.native
    def sendToRandomWorker(`type`: String, data: Any): Boolean = js.native
    def sendToRandomWorker(`type`: js.Symbol): Boolean = js.native
    def sendToRandomWorker(`type`: js.Symbol, data: Any): Boolean = js.native
    
    def sendToWorker(worker: Worker, `type`: String): Boolean = js.native
    def sendToWorker(worker: Worker, `type`: String, data: Any): Boolean = js.native
    def sendToWorker(worker: Worker, `type`: js.Symbol): Boolean = js.native
    def sendToWorker(worker: Worker, `type`: js.Symbol, data: Any): Boolean = js.native
    
    def sendToWorkers(`type`: String): Boolean = js.native
    def sendToWorkers(`type`: String, data: Any): Boolean = js.native
    def sendToWorkers(`type`: js.Symbol): Boolean = js.native
    def sendToWorkers(`type`: js.Symbol, data: Any): Boolean = js.native
  }
}
