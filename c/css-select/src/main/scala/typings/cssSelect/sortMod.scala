package typings.cssSelect

import typings.cssSelect.typesMod.InternalSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortMod {
  
  @JSImport("css-select/lib/esm/sort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(arr: js.Array[InternalSelector]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(arr.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isTraversal(token: InternalSelector): /* is css-what.css-what/lib/es/types.Traversal */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTraversal")(token.asInstanceOf[js.Any]).asInstanceOf[/* is css-what.css-what/lib/es/types.Traversal */ Boolean]
}
