package typings.bullBoard.anon

import typings.bullBoard.distQueueAdaptersBaseMod.BaseAdapter
import typings.expressServeStaticCore.mod.Express
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddQueue extends StObject {
  
  def addQueue(queue: BaseAdapter): Unit = js.native
  
  def removeQueue(queueOrName: String): Unit = js.native
  def removeQueue(queueOrName: BaseAdapter): Unit = js.native
  
  def replaceQueues(newBullQueues: js.Array[BaseAdapter]): Unit = js.native
  
  var router: Express = js.native
  
  def setQueues(newBullQueues: js.Array[BaseAdapter]): Unit = js.native
}
