package typings.coreJs

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libraryFnArraySpliceMod {
  
  /* was `typeof core.Array.splice` */
  inline def apply[T](array: ArrayLike[T], start: Double, deleteCount: Double, items: T*): Array[T] = (^.asInstanceOf[js.Dynamic].apply((scala.List(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).`++`(items.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Array[T]]
  inline def apply[T](array: ArrayLike[T], start: Double, deleteCount: Unit, items: T*): Array[T] = (^.asInstanceOf[js.Dynamic].apply((scala.List(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).`++`(items.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Array[T]]
  
  @JSImport("core-js/library/fn/array/splice", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
