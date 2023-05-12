package typings.blueprintjsTable.mod

import typings.blueprintjsTable.anon.PartialIDragSelectablePro
import typings.blueprintjsTable.libEsmInteractionsSelectableMod.IDragSelectableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/table", "DragSelectable")
@js.native
open class DragSelectable protected ()
  extends typings.blueprintjsTable.libEsmInteractionsSelectableMod.DragSelectable {
  def this(props: IDragSelectableProps) = this()
  /**
    * @deprecated
    * @see https://legacy.reactjs.org/docs/legacy-context.html
    */
  def this(props: IDragSelectableProps, context: Any) = this()
}
/* static members */
object DragSelectable {
  
  @JSImport("@blueprintjs/table", "DragSelectable")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/table", "DragSelectable.defaultProps")
  @js.native
  def defaultProps: PartialIDragSelectablePro = js.native
  inline def defaultProps_=(x: PartialIDragSelectablePro): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
