package typings.cancan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cancan", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with CanCan {
    def this(options: Option) = this()
  }
  
  @js.native
  trait CanCan extends StObject {
    
    def allow[T](model: Any, actions: String, targets: T): Unit = js.native
    def allow[T](
      model: Any,
      actions: String,
      targets: T,
      condition: js.Function3[/* performer */ Any, /* target */ Any, /* options */ js.UndefOr[Any], Boolean]
    ): Unit = js.native
    def allow[T](model: Any, actions: String, targets: T, condition: js.Object): Unit = js.native
    def allow[T](model: Any, actions: String, targets: String): Unit = js.native
    def allow[T](
      model: Any,
      actions: String,
      targets: String,
      condition: js.Function3[/* performer */ Any, /* target */ Any, /* options */ js.UndefOr[Any], Boolean]
    ): Unit = js.native
    def allow[T](model: Any, actions: String, targets: String, condition: js.Object): Unit = js.native
    def allow[T](model: Any, actions: String, targets: js.Array[String | T]): Unit = js.native
    def allow[T](
      model: Any,
      actions: String,
      targets: js.Array[String | T],
      condition: js.Function3[/* performer */ Any, /* target */ Any, js.UndefOr[Any], Boolean]
    ): Unit = js.native
    def allow[T](model: Any, actions: String, targets: js.Array[String | T], condition: js.Object): Unit = js.native
    def allow[T](model: Any, actions: js.Array[String], targets: T): Unit = js.native
    def allow[T](
      model: Any,
      actions: js.Array[String],
      targets: T,
      condition: js.Function3[/* performer */ Any, /* target */ Any, /* options */ js.UndefOr[Any], Boolean]
    ): Unit = js.native
    def allow[T](model: Any, actions: js.Array[String], targets: T, condition: js.Object): Unit = js.native
    def allow[T](model: Any, actions: js.Array[String], targets: String): Unit = js.native
    def allow[T](
      model: Any,
      actions: js.Array[String],
      targets: String,
      condition: js.Function3[/* performer */ Any, /* target */ Any, /* options */ js.UndefOr[Any], Boolean]
    ): Unit = js.native
    def allow[T](model: Any, actions: js.Array[String], targets: String, condition: js.Object): Unit = js.native
    def allow[T](model: Any, actions: js.Array[String], targets: js.Array[String | T]): Unit = js.native
    def allow[T](
      model: Any,
      actions: js.Array[String],
      targets: js.Array[String | T],
      condition: js.Function3[/* performer */ Any, /* target */ Any, js.UndefOr[Any], Boolean]
    ): Unit = js.native
    def allow[T](model: Any, actions: js.Array[String], targets: js.Array[String | T], condition: js.Object): Unit = js.native
    
    def authorize(performer: Any, action: String, target: Any): Unit = js.native
    def authorize(performer: Any, action: String, target: Any, options: Any): Unit = js.native
    
    def can(performer: Any, action: String, target: Any): Boolean = js.native
    def can(performer: Any, action: String, target: Any, options: Any): Boolean = js.native
    
    def cannot(performer: Any, action: String, target: Any): Boolean = js.native
    def cannot(performer: Any, action: String, target: Any, options: Any): Boolean = js.native
  }
  
  trait Option extends StObject {
    
    var createError: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var instanceOf: js.UndefOr[js.Function2[/* instance */ Any, /* model */ Any, Boolean]] = js.undefined
  }
  object Option {
    
    inline def apply(): Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Option]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
      
      inline def setCreateError(value: () => Any): Self = StObject.set(x, "createError", js.Any.fromFunction0(value))
      
      inline def setCreateErrorUndefined: Self = StObject.set(x, "createError", js.undefined)
      
      inline def setInstanceOf(value: (/* instance */ Any, /* model */ Any) => Boolean): Self = StObject.set(x, "instanceOf", js.Any.fromFunction2(value))
      
      inline def setInstanceOfUndefined: Self = StObject.set(x, "instanceOf", js.undefined)
    }
  }
}
