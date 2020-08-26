package typings.createError

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("create-error", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait Error[T /* <: Err */]
    extends typings.std.Error
       with Instantiable0[T]
       with Instantiable1[/* message */ String, T]
       with Instantiable2[js.UndefOr[/* message */ String], /* obj */ js.Any, T]
  
  def apply(): Error[Error[Err]] = js.native
  def apply[T /* <: Error[Error[Err]] */](Target: Error[Error[Err]]): T = js.native
  def apply[T /* <: Error[Error[Err]] */](Target: Error[Error[Err]], name: js.UndefOr[scala.Nothing], properties: js.Any): T = js.native
  def apply[T /* <: Error[Error[Err]] */](Target: Error[Error[Err]], name: String): T = js.native
  def apply[T /* <: Error[Error[Err]] */](Target: Error[Error[Err]], name: String, properties: js.Any): T = js.native
  def apply[T /* <: Error[Error[Err]] */](name: String): T = js.native
  def apply[T /* <: Error[Error[Err]] */](name: String, properties: js.Any): T = js.native
  type Err = typings.std.Error
}

