package typings.carbonComponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingsMod {
  
  object default {
    
    @JSImport("carbon-components/globals/js/settings", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("carbon-components/globals/js/settings", "default.prefix")
    @js.native
    def prefix: String = js.native
    @scala.inline
    def prefix_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefix")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components/globals/js/settings", "default.selectorFocusable")
    @js.native
    def selectorFocusable: String = js.native
    @scala.inline
    def selectorFocusable_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorFocusable")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components/globals/js/settings", "default.selectorTabbable")
    @js.native
    def selectorTabbable: String = js.native
    @scala.inline
    def selectorTabbable_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorTabbable")(x.asInstanceOf[js.Any])
  }
}
