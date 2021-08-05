package typings.coreJs

import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectGetMod {
  
  /* was `typeof core.Reflect.get` */
  inline def apply(target: js.Any, propertyKey: PropertyKey): js.Any = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def apply(target: js.Any, propertyKey: PropertyKey, receiver: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], receiver.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @JSImport("core-js/library/fn/reflect/get", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
