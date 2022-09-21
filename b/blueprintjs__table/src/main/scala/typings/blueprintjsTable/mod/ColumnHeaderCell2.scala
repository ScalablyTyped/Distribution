package typings.blueprintjsTable.mod

import typings.blueprintjsTable.columnHeaderCell2Mod.ColumnHeaderCell2Props
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/table", "ColumnHeaderCell2")
@js.native
open class ColumnHeaderCell2 protected ()
  extends typings.blueprintjsTable.columnHeaderCell2Mod.ColumnHeaderCell2 {
  def this(props: ColumnHeaderCell2Props) = this()
  def this(props: ColumnHeaderCell2Props, context: Any) = this()
}
/* static members */
object ColumnHeaderCell2 {
  
  @JSImport("@blueprintjs/table", "ColumnHeaderCell2")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/table", "ColumnHeaderCell2.defaultProps")
  @js.native
  def defaultProps: ColumnHeaderCell2Props = js.native
  inline def defaultProps_=(x: ColumnHeaderCell2Props): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/table", "ColumnHeaderCell2.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  /**
    * This method determines if a `MouseEvent` was triggered on a target that
    * should be used as the header click/drag target. This enables users of
    * this component to render fully interactive components in their header
    * cells without worry of selection or resize operations from capturing
    * their mouse events.
    */
  inline def isHeaderMouseTarget(target: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHeaderMouseTarget")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
