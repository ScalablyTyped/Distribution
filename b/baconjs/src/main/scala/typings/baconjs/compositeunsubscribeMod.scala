package typings.baconjs

import typings.baconjs.typesMod.Unsub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compositeunsubscribeMod {
  
  @JSImport("baconjs/types/compositeunsubscribe", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with CompositeUnsubscribe {
    def this(ss: js.Array[Subscription]) = this()
    
    /* CompleteClass */
    override def add(subscription: Subscription): Unit = js.native
    
    /* CompleteClass */
    override def count(): Double = js.native
    
    /* CompleteClass */
    override def empty(): Boolean = js.native
    
    /* CompleteClass */
    override def remove(unsub: Unsub): Unit = js.native
    
    /* CompleteClass */
    var starting: js.Array[Subscription] = js.native
    
    /* CompleteClass */
    var subscriptions: js.Array[Unsub] = js.native
    
    /* CompleteClass */
    override def unsubscribe(): Unit = js.native
    
    /* CompleteClass */
    var unsubscribed: Boolean = js.native
  }
  
  trait CompositeUnsubscribe extends StObject {
    
    def add(subscription: Subscription): Unit
    
    def count(): Double
    
    def empty(): Boolean
    
    def remove(unsub: Unsub): Unit
    
    var starting: js.Array[Subscription]
    
    var subscriptions: js.Array[Unsub]
    
    def unsubscribe(): Unit
    
    var unsubscribed: Boolean
  }
  object CompositeUnsubscribe {
    
    inline def apply(
      add: Subscription => Unit,
      count: () => Double,
      empty: () => Boolean,
      remove: Unsub => Unit,
      starting: js.Array[Subscription],
      subscriptions: js.Array[Unsub],
      unsubscribe: () => Unit,
      unsubscribed: Boolean
    ): CompositeUnsubscribe = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), count = js.Any.fromFunction0(count), empty = js.Any.fromFunction0(empty), remove = js.Any.fromFunction1(remove), starting = starting.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction0(unsubscribe), unsubscribed = unsubscribed.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompositeUnsubscribe]
    }
    
    extension [Self <: CompositeUnsubscribe](x: Self) {
      
      inline def setAdd(value: Subscription => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setCount(value: () => Double): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
      
      inline def setEmpty(value: () => Boolean): Self = StObject.set(x, "empty", js.Any.fromFunction0(value))
      
      inline def setRemove(value: Unsub => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setStarting(value: js.Array[Subscription]): Self = StObject.set(x, "starting", value.asInstanceOf[js.Any])
      
      inline def setStartingVarargs(value: Subscription*): Self = StObject.set(x, "starting", js.Array(value :_*))
      
      inline def setSubscriptions(value: js.Array[Unsub]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionsVarargs(value: Unsub*): Self = StObject.set(x, "subscriptions", js.Array(value :_*))
      
      inline def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
      
      inline def setUnsubscribed(value: Boolean): Self = StObject.set(x, "unsubscribed", value.asInstanceOf[js.Any])
    }
  }
  
  type Subscription = js.Function2[/* unsubAll */ Unsub, /* unsubMe */ Unsub, Unsub]
}
