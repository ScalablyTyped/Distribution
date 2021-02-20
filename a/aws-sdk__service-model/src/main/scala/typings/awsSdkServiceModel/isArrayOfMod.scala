package typings.awsSdkServiceModel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isArrayOfMod {
  
  @JSImport("@aws-sdk/service-model/build/ApiModel/isArrayOf", "isArrayOf")
  @js.native
  def isArrayOf[T](arg: js.Any, determiner: Determiner[T]): /* is std.Array<T> */ Boolean = js.native
  
  type Determiner[T] = js.Function1[/* arg */ js.Any, /* is T */ Boolean]
}
