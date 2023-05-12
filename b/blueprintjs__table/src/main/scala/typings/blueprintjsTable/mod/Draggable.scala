package typings.blueprintjsTable.mod

import typings.blueprintjsTable.anon.PreventDefault
import typings.blueprintjsTable.libEsmInteractionsDraggableMod.IDraggableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/table", "Draggable")
@js.native
open class Draggable protected ()
  extends typings.blueprintjsTable.libEsmInteractionsDraggableMod.Draggable {
  def this(props: IDraggableProps) = this()
  /**
    * @deprecated
    * @see https://legacy.reactjs.org/docs/legacy-context.html
    */
  def this(props: IDraggableProps, context: Any) = this()
}
/* static members */
object Draggable {
  
  @JSImport("@blueprintjs/table", "Draggable")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/table", "Draggable.defaultProps")
  @js.native
  def defaultProps: PreventDefault = js.native
  inline def defaultProps_=(x: PreventDefault): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
