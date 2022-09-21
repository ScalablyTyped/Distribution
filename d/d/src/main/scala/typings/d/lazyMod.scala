package typings.d

import org.scalablytyped.runtime.StringDictionary
import typings.std.PropertyDescriptorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lazyMod {
  
  inline def apply(obj: StringDictionary[js.PropertyDescriptor]): PropertyDescriptorMap = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[PropertyDescriptorMap]
  
  @JSImport("d/lazy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
