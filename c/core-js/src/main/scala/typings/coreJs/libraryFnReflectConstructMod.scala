package typings.coreJs

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libraryFnReflectConstructMod {
  
  /* was `typeof core.Reflect.construct` */
  inline def apply(target: Function, argumentsList: ArrayLike[Any]): Any = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], argumentsList.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("core-js/library/fn/reflect/construct", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
