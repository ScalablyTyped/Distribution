package typings.babylonjs.legacyMod

import typings.std.Parameters
import typings.std.TypedPropertyDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeOverride {
  
  inline def apply[T /* <: js.Function1[/* repeated */ Any, Boolean] */](
    target: Any,
    propertyKey: String,
    descriptor: TypedPropertyDescriptor[js.Function1[/* params */ Parameters[T], Any]]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply[T /* <: js.Function1[/* repeated */ Any, Boolean] */](
    target: Any,
    propertyKey: String,
    descriptor: TypedPropertyDescriptor[js.Function1[/* params */ Parameters[T], Any]],
    predicate: T
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("babylonjs/Legacy/legacy", "nativeOverride")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "nativeOverride.filter")
  @js.native
  def filter: js.Function1[
    /* predicate */ js.Function1[/* params */ Any, Boolean], 
    js.Function3[
      /* target */ Any, 
      /* propertyKey */ String, 
      /* descriptor */ TypedPropertyDescriptor[
        js.Function1[/* params */ Parameters[js.Function1[/* params */ Any, Boolean]], Any]
      ], 
      Unit
    ]
  ] = js.native
  inline def filter_=(
    x: js.Function1[
      /* predicate */ js.Function1[/* params */ Any, Boolean], 
      js.Function3[
        /* target */ Any, 
        /* propertyKey */ String, 
        /* descriptor */ TypedPropertyDescriptor[
          js.Function1[/* params */ Parameters[js.Function1[/* params */ Any, Boolean]], Any]
        ], 
        Unit
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filter")(x.asInstanceOf[js.Any])
}
