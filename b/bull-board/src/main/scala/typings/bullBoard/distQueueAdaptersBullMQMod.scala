package typings.bullBoard

import typings.bullBoard.anon.PartialQueueAdapterOption
import typings.bullBoard.distQueueAdaptersBaseMod.BaseAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distQueueAdaptersBullMQMod {
  
  @JSImport("bull-board/dist/queueAdapters/bullMQ", "BullMQAdapter")
  @js.native
  open class BullMQAdapter protected () extends BaseAdapter {
    def this(queue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Queue */ Any) = this()
    def this(
      queue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Queue */ Any,
      options: PartialQueueAdapterOption
    ) = this()
    
    /* private */ val LIMIT: Any = js.native
    
    /* private */ var queue: Any = js.native
  }
}
