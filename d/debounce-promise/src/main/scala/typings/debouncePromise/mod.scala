package typings.debouncePromise

import typings.debouncePromise.anon.DebounceOptionsaccumulate
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T /* <: js.Function1[/* repeated */ Any, Any] */](func: T): js.Function1[
    /* args */ Parameters[T], 
    /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<T> extends std.Promise<any> ? std.ReturnType<T> : std.Promise<std.ReturnType<T>> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].apply(func.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* args */ Parameters[T], 
    /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<T> extends std.Promise<any> ? std.ReturnType<T> : std.Promise<std.ReturnType<T>> */ js.Any
  ]]
  inline def apply[T /* <: js.Function1[/* repeated */ Any, Any] */](func: T, wait: js.Function0[Double]): js.Function1[
    /* args */ Parameters[T], 
    /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<T> extends std.Promise<any> ? std.ReturnType<T> : std.Promise<std.ReturnType<T>> */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].apply(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* args */ Parameters[T], 
    /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<T> extends std.Promise<any> ? std.ReturnType<T> : std.Promise<std.ReturnType<T>> */ js.Any
  ]]
  inline def apply[T /* <: js.Function1[/* repeated */ Any, Any] */](func: T, wait: js.Function0[Double], options: DebounceOptions): js.Function1[
    /* args */ Parameters[T], 
    /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<T> extends std.Promise<any> ? std.ReturnType<T> : std.Promise<std.ReturnType<T>> */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].apply(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* args */ Parameters[T], 
    /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<T> extends std.Promise<any> ? std.ReturnType<T> : std.Promise<std.ReturnType<T>> */ js.Any
  ]]
  inline def apply[T /* <: js.Function1[/* repeated */ Any, Any] */](func: T, wait: Double): js.Function1[
    /* args */ Parameters[T], 
    /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<T> extends std.Promise<any> ? std.ReturnType<T> : std.Promise<std.ReturnType<T>> */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].apply(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* args */ Parameters[T], 
    /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<T> extends std.Promise<any> ? std.ReturnType<T> : std.Promise<std.ReturnType<T>> */ js.Any
  ]]
  inline def apply[T /* <: js.Function1[/* repeated */ Any, Any] */](func: T, wait: Double, options: DebounceOptions): js.Function1[
    /* args */ Parameters[T], 
    /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<T> extends std.Promise<any> ? std.ReturnType<T> : std.Promise<std.ReturnType<T>> */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].apply(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* args */ Parameters[T], 
    /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<T> extends std.Promise<any> ? std.ReturnType<T> : std.Promise<std.ReturnType<T>> */ js.Any
  ]]
  inline def apply[T /* <: js.Function1[/* repeated */ Any, Any] */](func: T, wait: Unit, options: DebounceOptions): js.Function1[
    /* args */ Parameters[T], 
    /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<T> extends std.Promise<any> ? std.ReturnType<T> : std.Promise<std.ReturnType<T>> */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].apply(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* args */ Parameters[T], 
    /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<T> extends std.Promise<any> ? std.ReturnType<T> : std.Promise<std.ReturnType<T>> */ js.Any
  ]]
  // func is called with an array of array of parameters if accumulate is true
  // Use Array<[arg0, arg1, ..., argN]> as func's first parameter type for correct hints
  inline def apply[T /* <: js.Array[Any] */, R](
    func: js.Function1[
      /* args */ js.Array[
        /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T]
      ], 
      R
    ]
  ): js.Function1[
    /* args */ T, 
    /* import warning: importer.ImportType#apply Failed type conversion: R extends std.Promise<any> ? R : std.Promise<R> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].apply(func.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* args */ T, 
    /* import warning: importer.ImportType#apply Failed type conversion: R extends std.Promise<any> ? R : std.Promise<R> */ js.Any
  ]]
  inline def apply[T /* <: js.Array[Any] */, R](
    func: js.Function1[
      /* args */ js.Array[
        /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T]
      ], 
      R
    ],
    wait: Double
  ): js.Function1[
    /* args */ T, 
    /* import warning: importer.ImportType#apply Failed type conversion: R extends std.Promise<any> ? R : std.Promise<R> */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].apply(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* args */ T, 
    /* import warning: importer.ImportType#apply Failed type conversion: R extends std.Promise<any> ? R : std.Promise<R> */ js.Any
  ]]
  inline def apply[T /* <: js.Array[Any] */, R](
    func: js.Function1[
      /* args */ js.Array[
        /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T]
      ], 
      R
    ],
    wait: Double,
    options: DebounceOptionsaccumulate
  ): js.Function1[
    /* args */ T, 
    /* import warning: importer.ImportType#apply Failed type conversion: R extends std.Promise<any> ? R : std.Promise<R> */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].apply(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* args */ T, 
    /* import warning: importer.ImportType#apply Failed type conversion: R extends std.Promise<any> ? R : std.Promise<R> */ js.Any
  ]]
  inline def apply[T /* <: js.Array[Any] */, R](
    func: js.Function1[
      /* args */ js.Array[
        /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T]
      ], 
      R
    ],
    wait: Unit,
    options: DebounceOptionsaccumulate
  ): js.Function1[
    /* args */ T, 
    /* import warning: importer.ImportType#apply Failed type conversion: R extends std.Promise<any> ? R : std.Promise<R> */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].apply(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* args */ T, 
    /* import warning: importer.ImportType#apply Failed type conversion: R extends std.Promise<any> ? R : std.Promise<R> */ js.Any
  ]]
  
  @JSImport("debounce-promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DebounceOptions extends StObject {
    
    var accumulate: js.UndefOr[Boolean] = js.undefined
    
    var leading: js.UndefOr[Boolean] = js.undefined
  }
  object DebounceOptions {
    
    inline def apply(): DebounceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DebounceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DebounceOptions] (val x: Self) extends AnyVal {
      
      inline def setAccumulate(value: Boolean): Self = StObject.set(x, "accumulate", value.asInstanceOf[js.Any])
      
      inline def setAccumulateUndefined: Self = StObject.set(x, "accumulate", js.undefined)
      
      inline def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      inline def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
    }
  }
}
