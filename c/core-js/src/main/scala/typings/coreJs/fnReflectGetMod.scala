package typings.coreJs

import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fnReflectGetMod {
  
  /* was `typeof core.Reflect.get` */
  inline def apply(target: Any, propertyKey: PropertyKey): Any = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(target: Any, propertyKey: PropertyKey, receiver: Any): Any = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], receiver.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("core-js/fn/reflect/get", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
