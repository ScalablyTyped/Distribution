package typings.bullBoard

import typings.bull.mod.Queue
import typings.bullBoard.anon.PartialQueueAdapterOption
import typings.bullBoard.distQueueAdaptersBaseMod.BaseAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distQueueAdaptersBullMod {
  
  @JSImport("bull-board/dist/queueAdapters/bull", "BullAdapter")
  @js.native
  open class BullAdapter protected () extends BaseAdapter {
    def this(queue: Queue[Any]) = this()
    def this(queue: Queue[Any], options: PartialQueueAdapterOption) = this()
    
    var queue: Queue[Any] = js.native
  }
}
