package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Selector
  extends StObject
     with _ElementContext
object _Selector {
  
  inline def LabelledFramesSelector(
    fromFrames: MultiArray[
      /* import warning: importer.ImportType#apply Failed type conversion: axe-core.axe-core.FramesSelector[0] */ js.Any
    ]
  ): typings.axeCore.mod.LabelledFramesSelector = {
    val __obj = js.Dynamic.literal(fromFrames = fromFrames.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.axeCore.mod.LabelledFramesSelector]
  }
  
  inline def LabelledShadowDomSelector(fromShadowDom: ShadowDomSelector): typings.axeCore.mod.LabelledShadowDomSelector = {
    val __obj = js.Dynamic.literal(fromShadowDom = fromShadowDom.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.axeCore.mod.LabelledShadowDomSelector]
  }
}
