package typings.blueprintjsTable.mod

import typings.blueprintjsTable.anon.ValidationMapColumnIntera
import typings.blueprintjsTable.columnHeaderCellMod.IColumnHeaderCellProps
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/table", "ColumnHeaderCell")
@js.native
open class ColumnHeaderCell protected ()
  extends typings.blueprintjsTable.columnHeaderCellMod.ColumnHeaderCell {
  def this(props: IColumnHeaderCellProps) = this()
  def this(props: IColumnHeaderCellProps, context: Any) = this()
}
/* static members */
object ColumnHeaderCell {
  
  @JSImport("@blueprintjs/table", "ColumnHeaderCell")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/table", "ColumnHeaderCell.contextTypes")
  @js.native
  def contextTypes: ValidationMapColumnIntera = js.native
  inline def contextTypes_=(x: ValidationMapColumnIntera): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/table", "ColumnHeaderCell.defaultProps")
  @js.native
  def defaultProps: IColumnHeaderCellProps = js.native
  inline def defaultProps_=(x: IColumnHeaderCellProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/table", "ColumnHeaderCell.displayName")
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
