package typings.coreJs

import typings.std.PropertyDescriptorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fnObjectCreateMod {
  
  /* was `typeof core.Object.create` */
  inline def apply(o: Any): Any = ^.asInstanceOf[js.Dynamic].apply(o.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def apply(o: Any, properties: PropertyDescriptorMap): Any = (^.asInstanceOf[js.Dynamic].apply(o.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("core-js/fn/object/create", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
