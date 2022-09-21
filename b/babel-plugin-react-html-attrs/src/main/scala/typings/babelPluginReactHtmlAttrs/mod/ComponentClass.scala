package typings.babelPluginReactHtmlAttrs.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentClass[P, S]
  extends StObject
     with StaticLifecycle[P, S]
     with Instantiable1[/* props */ P, Component[P, S, Any]]
     with Instantiable2[/* props */ P, /* context */ Any, Component[P, S, Any]] {
  
  var childContextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  
  var contextType: js.UndefOr[Context[Any]] = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  
  var defaultProps: js.UndefOr[Partial[P]] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMap[P]] = js.native
}
