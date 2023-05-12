package typings.blueprintjsTable.mod

import typings.blueprintjsTable.libEsmCellFormatsJsonFormatMod.IJSONFormatProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/table", "JSONFormat")
@js.native
open class JSONFormat protected ()
  extends typings.blueprintjsTable.libEsmCellFormatsJsonFormatMod.JSONFormat {
  def this(props: IJSONFormatProps) = this()
  /**
    * @deprecated
    * @see https://legacy.reactjs.org/docs/legacy-context.html
    */
  def this(props: IJSONFormatProps, context: Any) = this()
}
/* static members */
object JSONFormat {
  
  @JSImport("@blueprintjs/table", "JSONFormat")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/table", "JSONFormat.defaultProps")
  @js.native
  def defaultProps: IJSONFormatProps = js.native
  inline def defaultProps_=(x: IJSONFormatProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/table", "JSONFormat.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
