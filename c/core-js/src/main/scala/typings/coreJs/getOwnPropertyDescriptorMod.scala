package typings.coreJs

import typings.std.PropertyDescriptor
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOwnPropertyDescriptorMod {
  
  /* was `typeof core.Object.getOwnPropertyDescriptor` */
  @scala.inline
  def apply(o: js.Any, propertyKey: PropertyKey): PropertyDescriptor = (^.asInstanceOf[js.Dynamic].apply(o.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[PropertyDescriptor]
  
  @JSImport("core-js/fn/object/get-own-property-descriptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
