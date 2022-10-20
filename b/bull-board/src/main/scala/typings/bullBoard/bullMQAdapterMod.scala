package typings.bullBoard

import typings.bullBoard.anon.PartialQueueAdapterOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bullMQAdapterMod {
  
  @JSImport("bull-board/bullMQAdapter", "BullMQAdapter")
  @js.native
  open class BullMQAdapter protected ()
    extends typings.bullBoard.distQueueAdaptersBullMQMod.BullMQAdapter {
    def this(queue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Queue */ Any) = this()
    def this(
      queue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Queue */ Any,
      options: PartialQueueAdapterOption
    ) = this()
  }
}
