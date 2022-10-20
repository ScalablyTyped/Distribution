package typings.bullBoard

import typings.bull.mod.Queue
import typings.bullBoard.anon.PartialQueueAdapterOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bullAdapterMod {
  
  @JSImport("bull-board/bullAdapter", "BullAdapter")
  @js.native
  open class BullAdapter protected ()
    extends typings.bullBoard.distQueueAdaptersBullMod.BullAdapter {
    def this(queue: Queue[Any]) = this()
    def this(queue: Queue[Any], options: PartialQueueAdapterOption) = this()
  }
}
