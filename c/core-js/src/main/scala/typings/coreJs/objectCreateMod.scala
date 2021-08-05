package typings.coreJs

import typings.std.PropertyDescriptorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectCreateMod {
  
  /* was `typeof core.Object.create` */
  inline def apply(o: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].apply(o.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def apply(o: js.Any, properties: PropertyDescriptorMap): js.Any = (^.asInstanceOf[js.Dynamic].apply(o.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @JSImport("core-js/library/fn/object/create", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
