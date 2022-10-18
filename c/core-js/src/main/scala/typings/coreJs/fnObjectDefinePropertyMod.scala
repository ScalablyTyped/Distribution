package typings.coreJs

import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fnObjectDefinePropertyMod {
  
  /* was `typeof core.Object.defineProperty` */
  inline def apply(o: Any, propertyKey: PropertyKey, attributes: js.PropertyDescriptor): Any = (^.asInstanceOf[js.Dynamic].apply(o.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("core-js/fn/object/define-property", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
