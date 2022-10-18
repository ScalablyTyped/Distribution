package typings.coreJs

import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fnReflectSetMod {
  
  /* was `typeof core.Reflect.set` */
  inline def apply(target: Any, propertyKey: PropertyKey, value: Any): Boolean = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(target: Any, propertyKey: PropertyKey, value: Any, receiver: Any): Boolean = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], value.asInstanceOf[js.Any], receiver.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("core-js/fn/reflect/set", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
