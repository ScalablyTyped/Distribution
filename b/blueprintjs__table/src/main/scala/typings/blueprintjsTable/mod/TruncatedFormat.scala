package typings.blueprintjsTable.mod

import typings.blueprintjsTable.libEsmCellFormatsTruncatedFormatMod.TruncatedFormatProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/table", "TruncatedFormat")
@js.native
open class TruncatedFormat protected ()
  extends typings.blueprintjsTable.libEsmCellFormatsTruncatedFormatMod.TruncatedFormat {
  def this(props: TruncatedFormatProps) = this()
  /**
    * @deprecated
    * @see https://legacy.reactjs.org/docs/legacy-context.html
    */
  def this(props: TruncatedFormatProps, context: Any) = this()
}
/* static members */
object TruncatedFormat {
  
  @JSImport("@blueprintjs/table", "TruncatedFormat")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/table", "TruncatedFormat.defaultProps")
  @js.native
  def defaultProps: TruncatedFormatProps = js.native
  inline def defaultProps_=(x: TruncatedFormatProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/table", "TruncatedFormat.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
