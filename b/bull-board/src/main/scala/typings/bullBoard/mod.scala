package typings.bullBoard

import org.scalablytyped.runtime.Shortcut
import typings.bull.mod.Queue
import typings.bull.mod.QueueOptions
import typings.express.mod.Express
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("bull-board", JSImport.Namespace)
  @js.native
  val ^ : Options = js.native
  
  trait CreateQueue extends StObject {
    
    def add(name: String, opts: QueueOptions): Queue[js.Any]
  }
  object CreateQueue {
    
    @scala.inline
    def apply(add: (String, QueueOptions) => Queue[js.Any]): CreateQueue = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add))
      __obj.asInstanceOf[CreateQueue]
    }
    
    @scala.inline
    implicit class CreateQueueMutableBuilder[Self <: CreateQueue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: (String, QueueOptions) => Queue[js.Any]): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    def UI(): Express = js.native
    
    def createQueues(redisURL: String): CreateQueue = js.native
    
    def setQueues(bullQueues: js.Array[Queue[js.Any]]): Queue[js.Any] = js.native
    def setQueues(bullQueues: Queue[js.Any]): Queue[js.Any] = js.native
  }
  
  type _To = Options
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Options = ^
}
