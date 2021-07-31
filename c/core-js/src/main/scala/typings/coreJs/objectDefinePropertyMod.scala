package typings.coreJs

import typings.std.PropertyDescriptor
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectDefinePropertyMod {
  
  /* was `typeof core.Object.defineProperty` */
  @scala.inline
  def apply(o: js.Any, propertyKey: PropertyKey, attributes: PropertyDescriptor): js.Any = (^.asInstanceOf[js.Dynamic].apply(o.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @JSImport("core-js/library/fn/object/define-property", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
