package typings.blueprintjsTable.mod

import typings.blueprintjsTable.anon.Truncated
import typings.blueprintjsTable.cellMod.ICellProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/table", "Cell")
@js.native
open class Cell protected ()
  extends typings.blueprintjsTable.cellMod.Cell {
  def this(props: ICellProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: ICellProps, context: Any) = this()
}
/* static members */
object Cell {
  
  @JSImport("@blueprintjs/table", "Cell")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/table", "Cell.defaultProps")
  @js.native
  def defaultProps: Truncated = js.native
  inline def defaultProps_=(x: Truncated): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/table", "Cell.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
