package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libraryFnArrayOfMod {
  
  /* was `typeof core.Array.of` */
  inline def apply[T](items: T*): Array[T] = ^.asInstanceOf[js.Dynamic].apply(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Array[T]]
  
  @JSImport("core-js/library/fn/array/of", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
