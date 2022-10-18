package typings.blueprintjsCore.mod

import typings.blueprintjsCore.anon.PartialNonIdealStateProps
import typings.blueprintjsCore.libEsmComponentsNonIdealStateNonIdealStateMod.NonIdealStateProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "NonIdealState")
@js.native
open class NonIdealState protected ()
  extends typings.blueprintjsCore.libEsmComponentsMod.NonIdealState {
  def this(props: NonIdealStateProps) = this()
  def this(props: NonIdealStateProps, context: Any) = this()
}
/* static members */
object NonIdealState {
  
  @JSImport("@blueprintjs/core", "NonIdealState")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "NonIdealState.defaultProps")
  @js.native
  def defaultProps: PartialNonIdealStateProps = js.native
  inline def defaultProps_=(x: PartialNonIdealStateProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "NonIdealState.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
