package typings.createError

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Error[Error[js.Error]] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Error[Error[js.Error]]]
  inline def apply[T /* <: Error[Error[js.Error]] */](Target: Error[Error[js.Error]]): T = ^.asInstanceOf[js.Dynamic].apply(Target.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def apply[T /* <: Error[Error[js.Error]] */](Target: Error[Error[js.Error]], name: String): T = (^.asInstanceOf[js.Dynamic].apply(Target.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def apply[T /* <: Error[Error[js.Error]] */](Target: Error[Error[js.Error]], name: String, properties: Any): T = (^.asInstanceOf[js.Dynamic].apply(Target.asInstanceOf[js.Any], name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def apply[T /* <: Error[Error[js.Error]] */](Target: Error[Error[js.Error]], name: Unit, properties: Any): T = (^.asInstanceOf[js.Dynamic].apply(Target.asInstanceOf[js.Any], name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def apply[T /* <: Error[Error[js.Error]] */](name: String): T = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def apply[T /* <: Error[Error[js.Error]] */](name: String, properties: Any): T = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("create-error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Err = js.Error
  
  @js.native
  trait Error[T /* <: js.Error */]
    extends StObject
       with typings.std.Error
       with Instantiable0[T]
       with Instantiable1[/* message */ String, T]
       with Instantiable2[(/* message */ String) | (/* message */ Unit), /* obj */ Any, T]
}
