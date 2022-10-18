package typings.awsSdkServiceModel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildApiModelIsObjectMapOfMod {
  
  @JSImport("@aws-sdk/service-model/build/ApiModel/isObjectMapOf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isObjectMapOf[T](arg: Any, determiner: Determiner[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectMapOf")(arg.asInstanceOf[js.Any], determiner.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type Determiner[T] = js.Function1[/* arg */ Any, /* is T */ Boolean]
}
