package typings.bullBoard

import typings.bullBoard.anon.PartialQueueAdapterOption
import typings.bullBoard.bullBoardStrings.data_
import typings.bullBoard.bullBoardStrings.returnValue
import typings.bullBoard.distAppMod.JobCleanStatus
import typings.bullBoard.distAppMod.JobCounts
import typings.bullBoard.distAppMod.JobStatus
import typings.bullBoard.distAppMod.QueueJob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distQueueAdaptersBaseMod {
  
  /* note: abstract class */ @JSImport("bull-board/dist/queueAdapters/base", "BaseAdapter")
  @js.native
  /* protected */ open class BaseAdapter () extends StObject {
    /* protected */ def this(options: PartialQueueAdapterOption) = this()
    
    def clean(queueStatus: JobCleanStatus, graceTimeMs: Double): js.Promise[Unit] = js.native
    
    def format(field: data_ | returnValue, data: Any): Any = js.native
    
    /* private */ var formatters: Any = js.native
    
    def getJob(id: String): js.Promise[js.UndefOr[QueueJob | Null]] = js.native
    
    def getJobCounts(jobStatuses: JobStatus*): js.Promise[JobCounts] = js.native
    
    def getJobLogs(id: String): js.Promise[js.Array[String]] = js.native
    
    def getJobs(jobStatuses: js.Array[JobStatus]): js.Promise[js.Array[QueueJob]] = js.native
    def getJobs(jobStatuses: js.Array[JobStatus], start: Double): js.Promise[js.Array[QueueJob]] = js.native
    def getJobs(jobStatuses: js.Array[JobStatus], start: Double, end: Double): js.Promise[js.Array[QueueJob]] = js.native
    def getJobs(jobStatuses: js.Array[JobStatus], start: Unit, end: Double): js.Promise[js.Array[QueueJob]] = js.native
    
    def getName(): String = js.native
    
    def getRedisInfo(): js.Promise[String] = js.native
    
    val readOnlyMode: Boolean = js.native
    
    def setFormatter(field: data_ | returnValue, formatter: js.Function1[/* data */ Any, Any]): Unit = js.native
  }
}
