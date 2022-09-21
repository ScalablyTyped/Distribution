package typings.coreJs

import typings.std.PropertyDescriptorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectDefinePropertiesMod {
  
  /* was `typeof core.Object.defineProperties` */
  inline def apply(o: Any, properties: PropertyDescriptorMap): Any = (^.asInstanceOf[js.Dynamic].apply(o.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("core-js/library/fn/object/define-properties", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
