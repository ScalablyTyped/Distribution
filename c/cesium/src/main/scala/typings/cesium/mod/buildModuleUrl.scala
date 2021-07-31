package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildModuleUrl {
  
  @scala.inline
  def apply(value: String): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("cesium", "buildModuleUrl")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def setBaseUrl(value: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBaseUrl")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
