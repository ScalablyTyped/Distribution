package typings.blueprintjsTable.mod

import typings.blueprintjsTable.libEsmColumnMod.IColumnProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/table", "Column")
@js.native
open class Column protected ()
  extends typings.blueprintjsTable.libEsmColumnMod.Column {
  def this(props: IColumnProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: IColumnProps, context: Any) = this()
}
/* static members */
object Column {
  
  @JSImport("@blueprintjs/table", "Column")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/table", "Column.defaultProps")
  @js.native
  def defaultProps: IColumnProps = js.native
  inline def defaultProps_=(x: IColumnProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/table", "Column.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
