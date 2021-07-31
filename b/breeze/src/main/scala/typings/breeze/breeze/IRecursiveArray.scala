package typings.breeze.breeze

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRecursiveArray[T]
  extends StObject
     with /* i */ NumberDictionary[T | IRecursiveArray[T]]
object IRecursiveArray {
  
  @scala.inline
  def apply[T](): IRecursiveArray[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRecursiveArray[T]]
  }
}
