package typings.cancan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cancan", JSImport.Namespace)
  @js.native
  class ^ () extends CanCan {
    def this(options: Option) = this()
  }
  
  @js.native
  trait CanCan extends StObject {
    
    def allow[T](model: js.Any, actions: String, targets: T): Unit = js.native
    def allow[T](
      model: js.Any,
      actions: String,
      targets: T,
      condition: js.Function3[/* performer */ js.Any, /* target */ js.Any, /* options */ js.UndefOr[js.Any], Boolean]
    ): Unit = js.native
    def allow[T](model: js.Any, actions: String, targets: T, condition: js.Object): Unit = js.native
    def allow[T](model: js.Any, actions: String, targets: String): Unit = js.native
    def allow[T](
      model: js.Any,
      actions: String,
      targets: String,
      condition: js.Function3[/* performer */ js.Any, /* target */ js.Any, /* options */ js.UndefOr[js.Any], Boolean]
    ): Unit = js.native
    def allow[T](model: js.Any, actions: String, targets: String, condition: js.Object): Unit = js.native
    def allow[T](model: js.Any, actions: String, targets: js.Array[String | T]): Unit = js.native
    def allow[T](
      model: js.Any,
      actions: String,
      targets: js.Array[String | T],
      condition: js.Function3[/* performer */ js.Any, /* target */ js.Any, js.UndefOr[js.Any], Boolean]
    ): Unit = js.native
    def allow[T](model: js.Any, actions: String, targets: js.Array[String | T], condition: js.Object): Unit = js.native
    def allow[T](model: js.Any, actions: js.Array[String], targets: T): Unit = js.native
    def allow[T](
      model: js.Any,
      actions: js.Array[String],
      targets: T,
      condition: js.Function3[/* performer */ js.Any, /* target */ js.Any, /* options */ js.UndefOr[js.Any], Boolean]
    ): Unit = js.native
    def allow[T](model: js.Any, actions: js.Array[String], targets: T, condition: js.Object): Unit = js.native
    def allow[T](model: js.Any, actions: js.Array[String], targets: String): Unit = js.native
    def allow[T](
      model: js.Any,
      actions: js.Array[String],
      targets: String,
      condition: js.Function3[/* performer */ js.Any, /* target */ js.Any, /* options */ js.UndefOr[js.Any], Boolean]
    ): Unit = js.native
    def allow[T](model: js.Any, actions: js.Array[String], targets: String, condition: js.Object): Unit = js.native
    def allow[T](model: js.Any, actions: js.Array[String], targets: js.Array[String | T]): Unit = js.native
    def allow[T](
      model: js.Any,
      actions: js.Array[String],
      targets: js.Array[String | T],
      condition: js.Function3[/* performer */ js.Any, /* target */ js.Any, js.UndefOr[js.Any], Boolean]
    ): Unit = js.native
    def allow[T](model: js.Any, actions: js.Array[String], targets: js.Array[String | T], condition: js.Object): Unit = js.native
    
    def authorize(performer: js.Any, action: String, target: js.Any): Unit = js.native
    def authorize(performer: js.Any, action: String, target: js.Any, options: js.Any): Unit = js.native
    
    def can(performer: js.Any, action: String, target: js.Any): Boolean = js.native
    def can(performer: js.Any, action: String, target: js.Any, options: js.Any): Boolean = js.native
    
    def cannot(performer: js.Any, action: String, target: js.Any): Boolean = js.native
    def cannot(performer: js.Any, action: String, target: js.Any, options: js.Any): Boolean = js.native
  }
  
  @js.native
  trait Option extends StObject {
    
    var createError: js.UndefOr[js.Function0[_]] = js.native
    
    var instanceOf: js.UndefOr[js.Function2[/* instance */ js.Any, /* model */ js.Any, Boolean]] = js.native
  }
  object Option {
    
    @scala.inline
    def apply(): Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Option]
    }
    
    @scala.inline
    implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateError(value: () => _): Self = StObject.set(x, "createError", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCreateErrorUndefined: Self = StObject.set(x, "createError", js.undefined)
      
      @scala.inline
      def setInstanceOf(value: (/* instance */ js.Any, /* model */ js.Any) => Boolean): Self = StObject.set(x, "instanceOf", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInstanceOfUndefined: Self = StObject.set(x, "instanceOf", js.undefined)
    }
  }
}
