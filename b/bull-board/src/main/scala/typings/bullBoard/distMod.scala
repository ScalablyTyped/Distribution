package typings.bullBoard

import typings.bullBoard.anon.AddQueue
import typings.bullBoard.distQueueAdaptersBaseMod.BaseAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("bull-board/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBullBoard(bullQueues: js.Array[BaseAdapter]): AddQueue = ^.asInstanceOf[js.Dynamic].applyDynamic("createBullBoard")(bullQueues.asInstanceOf[js.Any]).asInstanceOf[AddQueue]
}
