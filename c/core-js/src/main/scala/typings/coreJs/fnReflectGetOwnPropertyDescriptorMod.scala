package typings.coreJs

import typings.std.PropertyDescriptor
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fnReflectGetOwnPropertyDescriptorMod {
  
  /* was `typeof core.Reflect.getOwnPropertyDescriptor` */
  inline def apply(target: js.Any, propertyKey: PropertyKey): PropertyDescriptor = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[PropertyDescriptor]
  
  @JSImport("core-js/library/fn/reflect/get-own-property-descriptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
