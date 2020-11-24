package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.azdata.mod.ComponentProperties because Already inherited
- typings.azdata.mod.TreeProperties because var conflicts: CSSStyles, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined withCheckbox */ @js.native
trait TreeComponent[T] extends Component {
  
  def registerDataProvider[T](dataProvider: TreeComponentDataProvider[T]): TreeComponentView[T] = js.native
  
  var withCheckbox: js.UndefOr[Boolean] = js.native
}
