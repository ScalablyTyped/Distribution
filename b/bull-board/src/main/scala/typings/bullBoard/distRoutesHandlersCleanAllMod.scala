package typings.bullBoard

import typings.bullBoard.distAppMod.JobCleanStatus
import typings.expressServeStaticCore.mod.RequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRoutesHandlersCleanAllMod {
  
  @JSImport("bull-board/dist/routes/handlers/cleanAll", "cleanAll")
  @js.native
  val cleanAll: RequestHandler = js.native
  
  trait RequestParams extends StObject {
    
    var queueName: String
    
    var queueStatus: JobCleanStatus
  }
  object RequestParams {
    
    inline def apply(queueName: String, queueStatus: JobCleanStatus): RequestParams = {
      val __obj = js.Dynamic.literal(queueName = queueName.asInstanceOf[js.Any], queueStatus = queueStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestParams]
    }
    
    extension [Self <: RequestParams](x: Self) {
      
      inline def setQueueName(value: String): Self = StObject.set(x, "queueName", value.asInstanceOf[js.Any])
      
      inline def setQueueStatus(value: JobCleanStatus): Self = StObject.set(x, "queueStatus", value.asInstanceOf[js.Any])
    }
  }
}
