package typings.bizcharts.mod

import typings.bizcharts.anon.Id
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bizcharts", "Base")
@js.native
class Base[T] ()
  extends Component[T, js.Object, js.Any] {
  
  var generateBaseTypedComponent: js.UndefOr[js.Function1[/* name */ String, Base[BaseProps]]] = js.native
  
  var getParentInfo: js.UndefOr[js.Function0[Id]] = js.native
  
  var id: js.UndefOr[Double | String] = js.native
  
  var name: js.UndefOr[String] = js.native
}
