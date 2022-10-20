package typings.bullBoard

import typings.bullBoard.anon.Active
import typings.bullBoard.bullBoardStrings.data_
import typings.bullBoard.distUtilsMod.KeyOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUiComponentsConstantsMod {
  
  /* Inlined std.Record<bull-board.bull-board/dist/ui/components/constants.Status, std.Array<bull-board.bull-board/dist/ui/components/constants.Field>> */
  object FIELDS {
    
    @JSImport("bull-board/dist/ui/components/constants", "FIELDS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bull-board/dist/ui/components/constants", "FIELDS.active")
    @js.native
    def active: js.Array[Field] = js.native
    inline def active_=(x: js.Array[Field]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("active")(x.asInstanceOf[js.Any])
    
    @JSImport("bull-board/dist/ui/components/constants", "FIELDS.completed")
    @js.native
    def completed: js.Array[Field] = js.native
    inline def completed_=(x: js.Array[Field]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("completed")(x.asInstanceOf[js.Any])
    
    @JSImport("bull-board/dist/ui/components/constants", "FIELDS.delayed")
    @js.native
    def delayed: js.Array[Field] = js.native
    inline def delayed_=(x: js.Array[Field]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delayed")(x.asInstanceOf[js.Any])
    
    @JSImport("bull-board/dist/ui/components/constants", "FIELDS.failed")
    @js.native
    def failed: js.Array[Field] = js.native
    inline def failed_=(x: js.Array[Field]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("failed")(x.asInstanceOf[js.Any])
    
    @JSImport("bull-board/dist/ui/components/constants", "FIELDS.latest")
    @js.native
    def latest: js.Array[Field] = js.native
    inline def latest_=(x: js.Array[Field]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("latest")(x.asInstanceOf[js.Any])
    
    @JSImport("bull-board/dist/ui/components/constants", "FIELDS.paused")
    @js.native
    def paused: js.Array[Field] = js.native
    inline def paused_=(x: js.Array[Field]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paused")(x.asInstanceOf[js.Any])
    
    @JSImport("bull-board/dist/ui/components/constants", "FIELDS.waiting")
    @js.native
    def waiting: js.Array[Field] = js.native
    inline def waiting_=(x: js.Array[Field]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("waiting")(x.asInstanceOf[js.Any])
  }
  
  object STATUSES {
    
    @JSImport("bull-board/dist/ui/components/constants", "STATUSES")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bull-board/dist/ui/components/constants", "STATUSES.active")
    @js.native
    def active: String = js.native
    inline def active_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("active")(x.asInstanceOf[js.Any])
    
    @JSImport("bull-board/dist/ui/components/constants", "STATUSES.completed")
    @js.native
    def completed: String = js.native
    inline def completed_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("completed")(x.asInstanceOf[js.Any])
    
    @JSImport("bull-board/dist/ui/components/constants", "STATUSES.delayed")
    @js.native
    def delayed: String = js.native
    inline def delayed_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delayed")(x.asInstanceOf[js.Any])
    
    @JSImport("bull-board/dist/ui/components/constants", "STATUSES.failed")
    @js.native
    def failed: String = js.native
    inline def failed_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("failed")(x.asInstanceOf[js.Any])
    
    @JSImport("bull-board/dist/ui/components/constants", "STATUSES.latest")
    @js.native
    def latest: String = js.native
    inline def latest_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("latest")(x.asInstanceOf[js.Any])
    
    @JSImport("bull-board/dist/ui/components/constants", "STATUSES.paused")
    @js.native
    def paused: String = js.native
    inline def paused_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paused")(x.asInstanceOf[js.Any])
    
    @JSImport("bull-board/dist/ui/components/constants", "STATUSES.waiting")
    @js.native
    def waiting: String = js.native
    inline def waiting_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("waiting")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("bull-board/dist/ui/components/constants", "STATUS_LIST")
  @js.native
  val STATUS_LIST: KeyOf[Active] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.bullBoard.bullBoardStrings.attempts
    - typings.bullBoard.bullBoardStrings.data_
    - typings.bullBoard.bullBoardStrings.id
    - typings.bullBoard.bullBoardStrings.name
    - typings.bullBoard.bullBoardStrings.opts
    - typings.bullBoard.bullBoardStrings.progress
    - typings.bullBoard.bullBoardStrings.timestamps
    - typings.bullBoard.bullBoardStrings.delay
    - typings.bullBoard.bullBoardStrings.failedReason
    - typings.bullBoard.bullBoardStrings.retry
    - typings.bullBoard.bullBoardStrings.promote
    - typings.bullBoard.bullBoardStrings.clean
  */
  trait Field extends StObject
  object Field {
    
    inline def attempts: typings.bullBoard.bullBoardStrings.attempts = "attempts".asInstanceOf[typings.bullBoard.bullBoardStrings.attempts]
    
    inline def clean: typings.bullBoard.bullBoardStrings.clean = "clean".asInstanceOf[typings.bullBoard.bullBoardStrings.clean]
    
    inline def data: data_ = "data".asInstanceOf[data_]
    
    inline def delay: typings.bullBoard.bullBoardStrings.delay = "delay".asInstanceOf[typings.bullBoard.bullBoardStrings.delay]
    
    inline def failedReason: typings.bullBoard.bullBoardStrings.failedReason = "failedReason".asInstanceOf[typings.bullBoard.bullBoardStrings.failedReason]
    
    inline def id: typings.bullBoard.bullBoardStrings.id = "id".asInstanceOf[typings.bullBoard.bullBoardStrings.id]
    
    inline def name: typings.bullBoard.bullBoardStrings.name = "name".asInstanceOf[typings.bullBoard.bullBoardStrings.name]
    
    inline def opts: typings.bullBoard.bullBoardStrings.opts = "opts".asInstanceOf[typings.bullBoard.bullBoardStrings.opts]
    
    inline def progress: typings.bullBoard.bullBoardStrings.progress = "progress".asInstanceOf[typings.bullBoard.bullBoardStrings.progress]
    
    inline def promote: typings.bullBoard.bullBoardStrings.promote = "promote".asInstanceOf[typings.bullBoard.bullBoardStrings.promote]
    
    inline def retry: typings.bullBoard.bullBoardStrings.retry = "retry".asInstanceOf[typings.bullBoard.bullBoardStrings.retry]
    
    inline def timestamps: typings.bullBoard.bullBoardStrings.timestamps = "timestamps".asInstanceOf[typings.bullBoard.bullBoardStrings.timestamps]
  }
  
  /* keyof bull-board.anon.Active */ /* Rewritten from type alias, can be one of: 
    - typings.bullBoard.bullBoardStrings.latest
    - typings.bullBoard.bullBoardStrings.active
    - typings.bullBoard.bullBoardStrings.waiting
    - typings.bullBoard.bullBoardStrings.completed
    - typings.bullBoard.bullBoardStrings.failed
    - typings.bullBoard.bullBoardStrings.delayed
    - typings.bullBoard.bullBoardStrings.paused
  */
  trait Status extends StObject
}
