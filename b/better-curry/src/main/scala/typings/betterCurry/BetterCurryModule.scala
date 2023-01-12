package typings.betterCurry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BetterCurryModule {
  
  @js.native
  trait BetterCurry extends StObject {
    
    var MAX_OPTIMIZED: Double = js.native
    
    def delegate[T](proto: T, target: String): Delegate[T] = js.native
    
    def flatten(args: (js.Array[Any] | Any)*): js.Array[Any] = js.native
    
    def predefine[T /* <: js.Function */](fn: T, args: js.Array[Any]): OriginalFunctionReminder[T] = js.native
    def predefine[T /* <: js.Function */](fn: T, args: js.Array[Any], context: js.Object): OriginalFunctionReminder[T] = js.native
    def predefine[T /* <: js.Function */](fn: T, args: js.Array[Any], context: js.Object, len: Double): OriginalFunctionReminder[T] = js.native
    def predefine[T /* <: js.Function */](fn: T, args: js.Array[Any], context: js.Object, len: Double, checkArguments: Boolean): OriginalFunctionReminder[T] = js.native
    def predefine[T /* <: js.Function */](fn: T, args: js.Array[Any], context: js.Object, len: Unit, checkArguments: Boolean): OriginalFunctionReminder[T] = js.native
    def predefine[T /* <: js.Function */](fn: T, args: js.Array[Any], context: Unit, len: Double): OriginalFunctionReminder[T] = js.native
    def predefine[T /* <: js.Function */](fn: T, args: js.Array[Any], context: Unit, len: Double, checkArguments: Boolean): OriginalFunctionReminder[T] = js.native
    def predefine[T /* <: js.Function */](fn: T, args: js.Array[Any], context: Unit, len: Unit, checkArguments: Boolean): OriginalFunctionReminder[T] = js.native
    
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
    
    var getters: js.Array[Any] = js.native
    
    def method(name: String): Delegate[T] = js.native
    def method(name: DelegateOptions): Delegate[T] = js.native
    
    var methods: js.Array[Any] = js.native
    
    var proto: T = js.native
    
    def revoke(name: String): Delegate[T] = js.native
    
    def setter(name: String): Delegate[T] = js.native
    def setter(name: DelegateOptions): Delegate[T] = js.native
    
    var setters: js.Array[Any] = js.native
    
    var target: String = js.native
  }
  
  trait DelegateOptions extends StObject {
    
    var args: js.UndefOr[js.Array[Any]] = js.undefined
    
    var as: js.UndefOr[String] = js.undefined
    
    var len: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object DelegateOptions {
    
    inline def apply(): DelegateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DelegateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DelegateOptions] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setLen(value: Double): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
      
      inline def setLenUndefined: Self = StObject.set(x, "len", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait OriginalFunctionReminder[T]
    extends js.Function {
    
    var __length: Double = js.native
  }
}
