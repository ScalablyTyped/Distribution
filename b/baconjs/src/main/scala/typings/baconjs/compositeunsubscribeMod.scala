package typings.baconjs

import typings.baconjs.typesMod.Unsub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compositeunsubscribeMod {
  
  @JSImport("baconjs/types/compositeunsubscribe", JSImport.Default)
  @js.native
  class default () extends CompositeUnsubscribe {
    def this(ss: js.Array[Subscription]) = this()
  }
  
  @js.native
  trait CompositeUnsubscribe extends StObject {
    
    def add(subscription: Subscription): Unit = js.native
    
    def count(): Double = js.native
    
    def empty(): Boolean = js.native
    
    def remove(unsub: Unsub): Unit = js.native
    
    var starting: js.Array[Subscription] = js.native
    
    var subscriptions: js.Array[Unsub] = js.native
    
    def unsubscribe(): Unit = js.native
    
    var unsubscribed: Boolean = js.native
  }
  object CompositeUnsubscribe {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class CompositeUnsubscribeMutableBuilder[Self <: CompositeUnsubscribe] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: Subscription => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCount(value: () => Double): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEmpty(value: () => Boolean): Self = StObject.set(x, "empty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemove(value: Unsub => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStarting(value: js.Array[Subscription]): Self = StObject.set(x, "starting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartingVarargs(value: Subscription*): Self = StObject.set(x, "starting", js.Array(value :_*))
      
      @scala.inline
      def setSubscriptions(value: js.Array[Unsub]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionsVarargs(value: Unsub*): Self = StObject.set(x, "subscriptions", js.Array(value :_*))
      
      @scala.inline
      def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnsubscribed(value: Boolean): Self = StObject.set(x, "unsubscribed", value.asInstanceOf[js.Any])
    }
  }
  
  type Subscription = js.Function2[/* unsubAll */ Unsub, /* unsubMe */ Unsub, Unsub]
}
