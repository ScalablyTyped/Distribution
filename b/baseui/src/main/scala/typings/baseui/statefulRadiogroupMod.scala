package typings.baseui

import typings.baseui.anon.StatefulRadioGroupPropsOm
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statefulRadiogroupMod {
  
  object default {
    
    inline def apply(props: StatefulRadioGroupPropsOm): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/radio/stateful-radiogroup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/radio/stateful-radiogroup", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
