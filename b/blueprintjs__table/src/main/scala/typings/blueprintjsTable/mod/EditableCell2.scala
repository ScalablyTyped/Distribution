package typings.blueprintjsTable.mod

import typings.blueprintjsTable.anon.Truncated
import typings.blueprintjsTable.editableCell2Mod.EditableCell2Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/table", "EditableCell2")
@js.native
open class EditableCell2 protected ()
  extends typings.blueprintjsTable.editableCell2Mod.EditableCell2 {
  def this(props: EditableCell2Props) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: EditableCell2Props, context: Any) = this()
}
/* static members */
object EditableCell2 {
  
  @JSImport("@blueprintjs/table", "EditableCell2")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/table", "EditableCell2.defaultProps")
  @js.native
  def defaultProps: Truncated = js.native
  inline def defaultProps_=(x: Truncated): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/table", "EditableCell2.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
