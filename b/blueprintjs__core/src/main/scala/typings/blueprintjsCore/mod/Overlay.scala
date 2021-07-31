package typings.blueprintjsCore.mod

import typings.blueprintjsCore.anon.HasEverOpened
import typings.blueprintjsCore.overlayMod.IOverlayProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Overlay")
@js.native
class Overlay protected ()
  extends typings.blueprintjsCore.componentsMod.Overlay {
  def this(props: IOverlayProps) = this()
  def this(props: IOverlayProps, context: js.Any) = this()
}
/* static members */
object Overlay {
  
  @JSImport("@blueprintjs/core", "Overlay")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "Overlay.defaultProps")
  @js.native
  def defaultProps: IOverlayProps = js.native
  @scala.inline
  def defaultProps_=(x: IOverlayProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "Overlay.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def getDerivedStateFromProps(hasHasEverOpened: IOverlayProps): HasEverOpened | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(hasHasEverOpened.asInstanceOf[js.Any]).asInstanceOf[HasEverOpened | Null]
  
  @JSImport("@blueprintjs/core", "Overlay.getLastOpened")
  @js.native
  def getLastOpened: js.Any = js.native
  @scala.inline
  def getLastOpened_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getLastOpened")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "Overlay.openStack")
  @js.native
  def openStack: js.Any = js.native
  @scala.inline
  def openStack_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openStack")(x.asInstanceOf[js.Any])
}
