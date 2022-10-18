package typings.cesium

import typings.cesium.mod.Cesium3DTilesInspectorViewModel
import typings.cesium.mod.Cesium3DTileset
import typings.cesium.mod.Scene
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceWidgetsCesium3DTilesInspectorCesium3DTilesInspectorViewModelMod {
  
  @JSImport("cesium/Source/Widgets/Cesium3DTilesInspector/Cesium3DTilesInspectorViewModel", JSImport.Default)
  @js.native
  open class default protected () extends Cesium3DTilesInspectorViewModel {
    def this(scene: Scene, performanceContainer: HTMLElement) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Widgets/Cesium3DTilesInspector/Cesium3DTilesInspectorViewModel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Generates an HTML string of the statistics
      * @param tileset - The tileset
      * @param isPick - Whether this is getting the statistics for the pick pass
      * @returns The formatted statistics
      */
    inline def getStatistics(tileset: Cesium3DTileset, isPick: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStatistics")(tileset.asInstanceOf[js.Any], isPick.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
