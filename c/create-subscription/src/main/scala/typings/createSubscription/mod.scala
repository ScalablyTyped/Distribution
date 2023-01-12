package typings.createSubscription

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("create-subscription", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSubscription[S, T](config: SubscriptionConfig[S, T]): Subscription[S, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSubscription")(config.asInstanceOf[js.Any]).asInstanceOf[Subscription[S, T]]
  
  type Subscription[S, T] = ComponentClass[SubscriptionProps[S, T], ComponentState]
  
  trait SubscriptionConfig[S, T] extends StObject {
    
    /**
      * Synchronously gets the value for the subscribed property.
      * Return undefined if the subscribable value is undefined,
      * Or does not support synchronous reading (e.g. native Promise).
      */
    def getCurrentValue(source: S): T
    
    /**
      * Set up a subscription for the subscribable value in props, and return an unsubscribe function.
      * Return false to indicate the property cannot be unsubscribed from (e.g. native Promises).
      * Due to the variety of change event types, subscribers should provide their own handlers.
      * Those handlers should not attempt to update state though;
      * They should call the callback() instead when a subscription changes.
      */
    def subscribe(source: S, callback: js.Function1[/* newValue */ T, Unit]): Unsubscribe
  }
  object SubscriptionConfig {
    
    inline def apply[S, T](getCurrentValue: S => T, subscribe: (S, js.Function1[/* newValue */ T, Unit]) => Unsubscribe): SubscriptionConfig[S, T] = {
      val __obj = js.Dynamic.literal(getCurrentValue = js.Any.fromFunction1(getCurrentValue), subscribe = js.Any.fromFunction2(subscribe))
      __obj.asInstanceOf[SubscriptionConfig[S, T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubscriptionConfig[?, ?], S, T] (val x: Self & (SubscriptionConfig[S, T])) extends AnyVal {
      
      inline def setGetCurrentValue(value: S => T): Self = StObject.set(x, "getCurrentValue", js.Any.fromFunction1(value))
      
      inline def setSubscribe(value: (S, js.Function1[/* newValue */ T, Unit]) => Unsubscribe): Self = StObject.set(x, "subscribe", js.Any.fromFunction2(value))
    }
  }
  
  trait SubscriptionProps[S, T] extends StObject {
    
    def children(value: T): ReactNode
    
    var source: S
  }
  object SubscriptionProps {
    
    inline def apply[S, T](children: T => ReactNode, source: S): SubscriptionProps[S, T] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscriptionProps[S, T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubscriptionProps[?, ?], S, T] (val x: Self & (SubscriptionProps[S, T])) extends AnyVal {
      
      inline def setChildren(value: T => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setSource(value: S): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  type Unsubscribe = js.Function0[Any]
}
