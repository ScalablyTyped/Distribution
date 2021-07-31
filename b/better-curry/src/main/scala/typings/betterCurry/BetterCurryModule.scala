package typings.betterCurry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BetterCurryModule {
  
  @js.native
  trait BetterCurry extends StObject {
    
    var MAX_OPTIMIZED: Double = js.native
    
    def delegate[T](proto: T, target: String): Delegate[T] = js.native
    
    def flatten(args: (js.Array[js.Any] | js.Any)*): js.Array[js.Any] = js.native
    
    def predefine[T /* <: js.Function */](fn: T, args: js.Array[js.Any]): OriginalFunctionReminder[T] = js.native
    def predefine[T /* <: js.Function */](fn: T, args: js.Array[js.Any], context: js.Object): OriginalFunctionReminder[T] = js.native
    def predefine[T /* <: js.Function */](fn: T, args: js.Array[js.Any], context: js.Object, len: Double): OriginalFunctionReminder[T] = js.native
    def predefine[T /* <: js.Function */](fn: T, args: js.Array[js.Any], context: js.Object, len: Double, checkArguments: Boolean): OriginalFunctionReminder[T] = js.native
    def predefine[T /* <: js.Function */](fn: T, args: js.Array[js.Any], context: js.Object, len: Unit, checkArguments: Boolean): OriginalFunctionReminder[T] = js.native
    def predefine[T /* <: js.Function */](fn: T, args: js.Array[js.Any], context: Unit, len: Double): OriginalFunctionReminder[T] = js.native
    def predefine[T /* <: js.Function */](fn: T, args: js.Array[js.Any], context: Unit, len: Double, checkArguments: Boolean): OriginalFunctionReminder[T] = js.native
    def predefine[T /* <: js.Function */](fn: T, args: js.Array[js.Any], context: Unit, len: Unit, checkArguments: Boolean): OriginalFunctionReminder[T] = js.native
    
    def wrap[T /* <: js.Function */](fn: T): OriginalFunctionReminder[T] = js.native
    def wrap[T /* <: js.Function */](fn: T, context: js.Object): OriginalFunctionReminder[T] = js.native
    def wrap[T /* <: js.Function */](fn: T, context: js.Object, len: Double): OriginalFunctionReminder[T] = js.native
    def wrap[T /* <: js.Function */](fn: T, context: js.Object, len: Double, checkArguments: Boolean): OriginalFunctionReminder[T] = js.native
    def wrap[T /* <: js.Function */](fn: T, context: js.Object, len: Unit, checkArguments: Boolean): OriginalFunctionReminder[T] = js.native
    def wrap[T /* <: js.Function */](fn: T, context: Unit, len: Double): OriginalFunctionReminder[T] = js.native
    def wrap[T /* <: js.Function */](fn: T, context: Unit, len: Double, checkArguments: Boolean): OriginalFunctionReminder[T] = js.native
    def wrap[T /* <: js.Function */](fn: T, context: Unit, len: Unit, checkArguments: Boolean): OriginalFunctionReminder[T] = js.native
  }
  
  @js.native
  trait Delegate[T] extends StObject {
    
    def access(name: String): Delegate[T] = js.native
    def access(name: DelegateOptions): Delegate[T] = js.native
    
    def all(): Unit = js.native
    def all(skip: js.Array[String]): Unit = js.native
    
    def getter(name: String): Delegate[T] = js.native
    def getter(name: DelegateOptions): Delegate[T] = js.native
    
    var getters: js.Array[js.Any] = js.native
    
    def method(name: String): Delegate[T] = js.native
    def method(name: DelegateOptions): Delegate[T] = js.native
    
    var methods: js.Array[js.Any] = js.native
    
    var proto: T = js.native
    
    def revoke(name: String): Delegate[T] = js.native
    
    def setter(name: String): Delegate[T] = js.native
    def setter(name: DelegateOptions): Delegate[T] = js.native
    
    var setters: js.Array[js.Any] = js.native
    
    var target: String = js.native
  }
  
  trait DelegateOptions extends StObject {
    
    var args: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var as: js.UndefOr[String] = js.undefined
    
    var len: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object DelegateOptions {
    
    @scala.inline
    def apply(): DelegateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DelegateOptions]
    }
    
    @scala.inline
    implicit class DelegateOptionsMutableBuilder[Self <: DelegateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setLen(value: Double): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLenUndefined: Self = StObject.set(x, "len", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait OriginalFunctionReminder[T]
    extends js.Function {
    
    var __length: Double = js.native
  }
}
