package typings.babelPluginReactHtmlAttrs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// will show `Memo(${Component.displayName || Component.name})` in devtools by default,
// but can be given its own specific name
@js.native
trait MemoExoticComponent[T /* <: ComponentType[js.Any] */]
  extends StObject
     with NamedExoticComponent[ComponentPropsWithRef[T]] {
  
  val `type`: T = js.native
}
