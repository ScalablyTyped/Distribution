package typings.cucumberCucumber

import typings.cucumberCucumber.libPluginTypesMod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPluginMod {
  
  @JSImport("@cucumber/cucumber/lib/plugin", "PluginManager")
  @js.native
  open class PluginManager protected ()
    extends typings.cucumberCucumber.libPluginPluginManagerMod.PluginManager {
    def this(pluginFns: js.Array[Plugin]) = this()
  }
}
