package typings.awsSdkServiceModel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildApiModelIsArrayOfMod {
  
  @JSImport("@aws-sdk/service-model/build/ApiModel/isArrayOf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isArrayOf[T](arg: Any, determiner: Determiner[T]): /* is std.Array<T> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArrayOf")(arg.asInstanceOf[js.Any], determiner.asInstanceOf[js.Any])).asInstanceOf[/* is std.Array<T> */ Boolean]
  
  type Determiner[T] = js.Function1[/* arg */ Any, /* is T */ Boolean]
}
