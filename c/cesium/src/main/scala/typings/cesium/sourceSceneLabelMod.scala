package typings.cesium

import typings.cesium.mod.Label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSceneLabelMod {
  
  @JSImport("cesium/Source/Scene/Label", JSImport.Default)
  @js.native
  open class default () extends Label
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Scene/Label", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Determines whether or not run the algorithm, that match the text of the label to right-to-left languages
      * @example
      * // Example 1.
      * // Set a label's rightToLeft before init
      * Cesium.Label.enableRightToLeftDetection = true;
      * const myLabelEntity = viewer.entities.add({
      *   label: {
      *     id: 'my label',
      *     text: 'זה טקסט בעברית \n ועכשיו יורדים שורה',
      *   }
      * });
      * @example
      * // Example 2.
      * const myLabelEntity = viewer.entities.add({
      *   label: {
      *     id: 'my label',
      *     text: 'English text'
      *   }
      * });
      * // Set a label's rightToLeft after init
      * Cesium.Label.enableRightToLeftDetection = true;
      * myLabelEntity.text = 'טקסט חדש';
      */
    @JSImport("cesium/Source/Scene/Label", "default.enableRightToLeftDetection")
    @js.native
    def enableRightToLeftDetection: Boolean = js.native
    inline def enableRightToLeftDetection_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableRightToLeftDetection")(x.asInstanceOf[js.Any])
  }
}
