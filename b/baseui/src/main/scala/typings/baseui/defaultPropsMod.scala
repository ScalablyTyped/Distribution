package typings.baseui

import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.primary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultPropsMod {
  
  object defaultProps {
    
    @JSImport("baseui/button/default-props", "defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/button/default-props", "defaultProps.disabled")
    @js.native
    def disabled: Boolean = js.native
    inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/button/default-props", "defaultProps.isLoading")
    @js.native
    def isLoading: Boolean = js.native
    inline def isLoading_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/button/default-props", "defaultProps.isSelected")
    @js.native
    def isSelected: Boolean = js.native
    inline def isSelected_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/button/default-props", "defaultProps.kind")
    @js.native
    def kind: primary = js.native
    inline def kind_=(x: primary): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kind")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/button/default-props", "defaultProps.shape")
    @js.native
    def shape: default_ = js.native
    inline def shape_=(x: default_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shape")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/button/default-props", "defaultProps.size")
    @js.native
    def size: default_ = js.native
    inline def size_=(x: default_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
  }
}
