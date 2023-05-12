package typings.ckeditorCkeditor5Utils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcToarrayMod {
  
  @JSImport("@ckeditor/ckeditor5-utils/src/toarray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](data: ArrayOrItem[T] | ReadonlyArrayOrItem[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  type ArrayOrItem[T] = T | js.Array[T]
  
  type ReadonlyArrayOrItem[T] = T | js.Array[T]
}
