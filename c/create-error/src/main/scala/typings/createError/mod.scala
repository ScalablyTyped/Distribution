package typings.createError

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("create-error", JSImport.Namespace)
  @js.native
  def apply(): Error[Error[Err]] = js.native
  @JSImport("create-error", JSImport.Namespace)
  @js.native
  def apply[T /* <: Error[Error[Err]] */](Target: Error[Error[Err]]): T = js.native
  @JSImport("create-error", JSImport.Namespace)
  @js.native
  def apply[T /* <: Error[Error[Err]] */](Target: Error[Error[Err]], name: js.UndefOr[scala.Nothing], properties: js.Any): T = js.native
  @JSImport("create-error", JSImport.Namespace)
  @js.native
  def apply[T /* <: Error[Error[Err]] */](Target: Error[Error[Err]], name: String): T = js.native
  @JSImport("create-error", JSImport.Namespace)
  @js.native
  def apply[T /* <: Error[Error[Err]] */](Target: Error[Error[Err]], name: String, properties: js.Any): T = js.native
  @JSImport("create-error", JSImport.Namespace)
  @js.native
  def apply[T /* <: Error[Error[Err]] */](name: String): T = js.native
  @JSImport("create-error", JSImport.Namespace)
  @js.native
  def apply[T /* <: Error[Error[Err]] */](name: String, properties: js.Any): T = js.native
  
  type Err = typings.std.Error
  
  @js.native
  trait Error[T /* <: Err */]
    extends typings.std.Error
       with Instantiable0[T]
       with Instantiable1[/* message */ String, T]
       with Instantiable2[js.UndefOr[/* message */ String], /* obj */ js.Any, T]
}
