package typings.coreJs

import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectSetMod {
  
  /* was `typeof core.Reflect.set` */
  @scala.inline
  def apply(target: js.Any, propertyKey: PropertyKey, value: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(target: js.Any, propertyKey: PropertyKey, value: js.Any, receiver: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], value.asInstanceOf[js.Any], receiver.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("core-js/fn/reflect/set", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
