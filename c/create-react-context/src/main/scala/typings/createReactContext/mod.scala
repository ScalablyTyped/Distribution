package typings.createReactContext

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("create-react-context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](defaultValue: T): Context[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[Context[T]]
  @scala.inline
  def default[T](defaultValue: T, calculateChangedBits: js.Function2[/* prev */ T, /* next */ T, Double]): Context[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(defaultValue.asInstanceOf[js.Any], calculateChangedBits.asInstanceOf[js.Any])).asInstanceOf[Context[T]]
  
  trait ConsumerProps[T] extends StObject {
    
    var children: RenderFn[T] | js.Array[RenderFn[T]]
    
    var observedBits: js.UndefOr[Double] = js.undefined
  }
  object ConsumerProps {
    
    @scala.inline
    def apply[T](children: RenderFn[T] | js.Array[RenderFn[T]]): ConsumerProps[T] = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConsumerProps[T]]
    }
    
    @scala.inline
    implicit class ConsumerPropsMutableBuilder[Self <: ConsumerProps[?], T] (val x: Self & ConsumerProps[T]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: RenderFn[T] | js.Array[RenderFn[T]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: T => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenVarargs(value: RenderFn[T]*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setObservedBits(value: Double): Self = StObject.set(x, "observedBits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObservedBitsUndefined: Self = StObject.set(x, "observedBits", js.undefined)
    }
  }
  
  trait Context[T] extends StObject {
    
    var Consumer: ComponentClass[ConsumerProps[T], ComponentState]
    
    var Provider: ComponentClass[ProviderProps[T], ComponentState]
  }
  object Context {
    
    @scala.inline
    def apply[T](
      Consumer: ComponentClass[ConsumerProps[T], ComponentState],
      Provider: ComponentClass[ProviderProps[T], ComponentState]
    ): Context[T] = {
      val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context[T]]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context[?], T] (val x: Self & Context[T]) extends AnyVal {
      
      @scala.inline
      def setConsumer(value: ComponentClass[ConsumerProps[T], ComponentState]): Self = StObject.set(x, "Consumer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvider(value: ComponentClass[ProviderProps[T], ComponentState]): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProviderProps[T] extends StObject {
    
    var children: ReactNode
    
    var value: T
  }
  object ProviderProps {
    
    @scala.inline
    def apply[T](value: T): ProviderProps[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProviderProps[T]]
    }
    
    @scala.inline
    implicit class ProviderPropsMutableBuilder[Self <: ProviderProps[?], T] (val x: Self & ProviderProps[T]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type RenderFn[T] = js.Function1[/* value */ T, ReactNode]
}
