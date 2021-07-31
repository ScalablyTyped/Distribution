package typings.coreJs

import typings.std.PropertyDescriptor
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectDefinePropertyMod {
  
  /* was `typeof core.Reflect.defineProperty` */
  @scala.inline
  def apply(target: js.Any, propertyKey: PropertyKey, attributes: PropertyDescriptor): Boolean = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("core-js/fn/reflect/define-property", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
