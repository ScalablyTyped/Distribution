package typings.classValidator

import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("class-validator/types/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertToArray[T](`val`: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToArray")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def convertToArray[T](`val`: Map[Any, T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToArray")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def convertToArray[T](`val`: Set[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToArray")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def getGlobal(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobal")().asInstanceOf[Any]
  
  inline def isPromise[T](p: Any): /* is std.Promise<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(p.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<T> */ Boolean]
}
