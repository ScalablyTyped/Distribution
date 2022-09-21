package typings.blueprintjsTable.mod

import typings.blueprintjsTable.anon.Truncated
import typings.blueprintjsTable.editableCellMod.IEditableCellProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/table", "EditableCell")
@js.native
open class EditableCell protected ()
  extends typings.blueprintjsTable.editableCellMod.EditableCell {
  def this(props: IEditableCellProps) = this()
}
/* static members */
object EditableCell {
  
  @JSImport("@blueprintjs/table", "EditableCell")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/table", "EditableCell.defaultProps")
  @js.native
  def defaultProps: Truncated = js.native
  inline def defaultProps_=(x: Truncated): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/table", "EditableCell.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
