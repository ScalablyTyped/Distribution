package typings.codemirrorView.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanelConfig extends StObject {
  
  /**
    Override where panels with `top: false` are placed.
    */
  var bottomContainer: js.UndefOr[HTMLElement] = js.undefined
  
  /**
    By default, panels will be placed inside the editor's DOM
    structure. You can use this option to override where panels with
    `top: true` are placed.
    */
  var topContainer: js.UndefOr[HTMLElement] = js.undefined
}
object PanelConfig {
  
  inline def apply(): PanelConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanelConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PanelConfig] (val x: Self) extends AnyVal {
    
    inline def setBottomContainer(value: HTMLElement): Self = StObject.set(x, "bottomContainer", value.asInstanceOf[js.Any])
    
    inline def setBottomContainerUndefined: Self = StObject.set(x, "bottomContainer", js.undefined)
    
    inline def setTopContainer(value: HTMLElement): Self = StObject.set(x, "topContainer", value.asInstanceOf[js.Any])
    
    inline def setTopContainerUndefined: Self = StObject.set(x, "topContainer", js.undefined)
  }
}
