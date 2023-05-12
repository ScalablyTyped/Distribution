package typings.detectElementOverflow

import typings.detectElementOverflow.anon.CollidedBottom
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("detect-element-overflow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(element: HTMLElement, container: HTMLElement): CollidedBottom = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[CollidedBottom]
}
