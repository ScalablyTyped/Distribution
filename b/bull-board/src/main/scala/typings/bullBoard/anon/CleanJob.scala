package typings.bullBoard.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CleanJob extends StObject {
  
  def cleanJob(): js.Promise[Unit]
  
  def promoteJob(): js.Promise[Unit]
  
  def retryJob(): js.Promise[Unit]
}
object CleanJob {
  
  inline def apply(
    cleanJob: () => js.Promise[Unit],
    promoteJob: () => js.Promise[Unit],
    retryJob: () => js.Promise[Unit]
  ): CleanJob = {
    val __obj = js.Dynamic.literal(cleanJob = js.Any.fromFunction0(cleanJob), promoteJob = js.Any.fromFunction0(promoteJob), retryJob = js.Any.fromFunction0(retryJob))
    __obj.asInstanceOf[CleanJob]
  }
  
  extension [Self <: CleanJob](x: Self) {
    
    inline def setCleanJob(value: () => js.Promise[Unit]): Self = StObject.set(x, "cleanJob", js.Any.fromFunction0(value))
    
    inline def setPromoteJob(value: () => js.Promise[Unit]): Self = StObject.set(x, "promoteJob", js.Any.fromFunction0(value))
    
    inline def setRetryJob(value: () => js.Promise[Unit]): Self = StObject.set(x, "retryJob", js.Any.fromFunction0(value))
  }
}
