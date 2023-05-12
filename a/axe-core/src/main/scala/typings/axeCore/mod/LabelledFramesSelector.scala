package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelledFramesSelector
  extends StObject
     with _Selector
     with _SerialSelector {
  
  var fromFrames: MultiArray[
    /* import warning: importer.ImportType#apply Failed type conversion: axe-core.axe-core.FramesSelector[0] */ js.Any
  ]
}
object LabelledFramesSelector {
  
  inline def apply(
    fromFrames: MultiArray[
      /* import warning: importer.ImportType#apply Failed type conversion: axe-core.axe-core.FramesSelector[0] */ js.Any
    ]
  ): LabelledFramesSelector = {
    val __obj = js.Dynamic.literal(fromFrames = fromFrames.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelledFramesSelector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelledFramesSelector] (val x: Self) extends AnyVal {
    
    inline def setFromFrames(
      value: MultiArray[
          /* import warning: importer.ImportType#apply Failed type conversion: axe-core.axe-core.FramesSelector[0] */ js.Any
        ]
    ): Self = StObject.set(x, "fromFrames", value.asInstanceOf[js.Any])
  }
}
