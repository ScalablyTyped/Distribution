package typings.bullBoard

import typings.bullBoard.anon.BasePath
import typings.bullBoard.anon.Status
import typings.bullBoard.distApiMod.GetQueues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUiServicesApiMod {
  
  @JSImport("bull-board/dist/ui/services/Api", "Api")
  @js.native
  open class Api () extends StObject {
    def this(param0: BasePath) = this()
    
    /* private */ var axios: Any = js.native
    
    def cleanAllCompleted(queueName: String): js.Promise[Unit] = js.native
    
    def cleanAllDelayed(queueName: String): js.Promise[Unit] = js.native
    
    def cleanAllFailed(queueName: String): js.Promise[Unit] = js.native
    
    @JSName("cleanJob")
    def cleanJob_id(
      queueName: String,
      jobId: /* import warning: importer.ImportType#apply Failed type conversion: bull-board.bull-board/dist/app.QueueJobJson['id'] */ js.Any
    ): js.Promise[Unit] = js.native
    
    @JSName("getJobLogs")
    def getJobLogs_id(
      queueName: String,
      jobId: /* import warning: importer.ImportType#apply Failed type conversion: bull-board.bull-board/dist/app.QueueJobJson['id'] */ js.Any
    ): js.Promise[js.Array[String]] = js.native
    
    def getQueues(param0: Status): js.Promise[GetQueues] = js.native
    
    /* private */ var handleError: Any = js.native
    
    /* private */ var handleResponse: Any = js.native
    
    @JSName("promoteJob")
    def promoteJob_id(
      queueName: String,
      jobId: /* import warning: importer.ImportType#apply Failed type conversion: bull-board.bull-board/dist/app.QueueJobJson['id'] */ js.Any
    ): js.Promise[Unit] = js.native
    
    def retryAll(queueName: String): js.Promise[Unit] = js.native
    
    @JSName("retryJob")
    def retryJob_id(
      queueName: String,
      jobId: /* import warning: importer.ImportType#apply Failed type conversion: bull-board.bull-board/dist/app.QueueJobJson['id'] */ js.Any
    ): js.Promise[Unit] = js.native
  }
}
