package typings.bullBoard.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromoteJob extends StObject {
  
  def cleanJob(): js.Promise[Unit]
  
  def getJobLogs(): js.Promise[js.Array[String]]
  
  def promoteJob(): js.Promise[Unit]
  
  def retryJob(): js.Promise[Unit]
}
object PromoteJob {
  
  inline def apply(
    cleanJob: () => js.Promise[Unit],
    getJobLogs: () => js.Promise[js.Array[String]],
    promoteJob: () => js.Promise[Unit],
    retryJob: () => js.Promise[Unit]
  ): PromoteJob = {
    val __obj = js.Dynamic.literal(cleanJob = js.Any.fromFunction0(cleanJob), getJobLogs = js.Any.fromFunction0(getJobLogs), promoteJob = js.Any.fromFunction0(promoteJob), retryJob = js.Any.fromFunction0(retryJob))
    __obj.asInstanceOf[PromoteJob]
  }
  
  extension [Self <: PromoteJob](x: Self) {
    
    inline def setCleanJob(value: () => js.Promise[Unit]): Self = StObject.set(x, "cleanJob", js.Any.fromFunction0(value))
    
    inline def setGetJobLogs(value: () => js.Promise[js.Array[String]]): Self = StObject.set(x, "getJobLogs", js.Any.fromFunction0(value))
    
    inline def setPromoteJob(value: () => js.Promise[Unit]): Self = StObject.set(x, "promoteJob", js.Any.fromFunction0(value))
    
    inline def setRetryJob(value: () => js.Promise[Unit]): Self = StObject.set(x, "retryJob", js.Any.fromFunction0(value))
  }
}
