package typings.breeze.breeze

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type IRecursiveArray = {[i: number] : T | breeze.breeze.IRecursiveArray<T>}
}}}
to avoid circular code involving: 
- breeze.breeze.IRecursiveArray
*/
trait IRecursiveArray[T]
  extends StObject
     with /* i */ NumberDictionary[T | IRecursiveArray[T]]
object IRecursiveArray {
  
  inline def apply[T](): IRecursiveArray[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRecursiveArray[T]]
  }
}
