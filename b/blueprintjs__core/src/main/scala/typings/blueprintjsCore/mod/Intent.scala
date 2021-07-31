package typings.blueprintjsCore.mod

import typings.blueprintjsCore.blueprintjsCoreStrings.danger
import typings.blueprintjsCore.blueprintjsCoreStrings.none
import typings.blueprintjsCore.blueprintjsCoreStrings.primary
import typings.blueprintjsCore.blueprintjsCoreStrings.success
import typings.blueprintjsCore.blueprintjsCoreStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Intent {
  
  @JSImport("@blueprintjs/core", "Intent")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "Intent.DANGER")
  @js.native
  def DANGER: danger = js.native
  @scala.inline
  def DANGER_=(x: danger): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DANGER")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "Intent.NONE")
  @js.native
  def NONE: none = js.native
  @scala.inline
  def NONE_=(x: none): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NONE")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "Intent.PRIMARY")
  @js.native
  def PRIMARY: primary = js.native
  @scala.inline
  def PRIMARY_=(x: primary): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIMARY")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "Intent.SUCCESS")
  @js.native
  def SUCCESS: success = js.native
  @scala.inline
  def SUCCESS_=(x: success): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUCCESS")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "Intent.WARNING")
  @js.native
  def WARNING: warning = js.native
  @scala.inline
  def WARNING_=(x: warning): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WARNING")(x.asInstanceOf[js.Any])
}
