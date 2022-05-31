package typings.chunk

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def chunk[T](array: ArrayLike[T]): js.Array[js.Array[T]] = js.Dynamic.global.applyDynamic("chunk")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[T]]]
  inline def chunk[T](array: ArrayLike[T], size: Double): js.Array[js.Array[T]] = (js.Dynamic.global.applyDynamic("chunk")(array.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
}
