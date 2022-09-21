package typings.coreJs

import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fnReflectDefinePropertyMod {
  
  /* was `typeof core.Reflect.defineProperty` */
  inline def apply(target: Any, propertyKey: PropertyKey, attributes: js.PropertyDescriptor): Boolean = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("core-js/library/fn/reflect/define-property", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
