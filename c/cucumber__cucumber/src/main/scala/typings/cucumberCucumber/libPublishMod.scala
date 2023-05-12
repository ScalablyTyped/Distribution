package typings.cucumberCucumber

import org.scalablytyped.runtime.Shortcut
import typings.cucumberCucumber.libPluginTypesMod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPublishMod extends Shortcut {
  
  @JSImport("@cucumber/cucumber/lib/publish", JSImport.Default)
  @js.native
  val default: Plugin = js.native
  
  type _To = Plugin
  
  /* This means you don't have to write `default`, but can instead just say `libPublishMod.foo` */
  override def _to: Plugin = default
}
