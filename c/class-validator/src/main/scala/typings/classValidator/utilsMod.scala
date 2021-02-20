package typings.classValidator

import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("class-validator/types/utils", "convertToArray")
  @js.native
  def convertToArray[T](`val`: js.Array[T]): js.Array[T] = js.native
  @JSImport("class-validator/types/utils", "convertToArray")
  @js.native
  def convertToArray[T](`val`: Map[_, T]): js.Array[T] = js.native
  @JSImport("class-validator/types/utils", "convertToArray")
  @js.native
  def convertToArray[T](`val`: Set[T]): js.Array[T] = js.native
  
  @JSImport("class-validator/types/utils", "isPromise")
  @js.native
  def isPromise[T](p: js.Any): /* is std.Promise<T> */ Boolean = js.native
}
