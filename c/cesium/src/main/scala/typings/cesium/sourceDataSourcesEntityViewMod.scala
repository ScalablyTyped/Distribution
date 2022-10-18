package typings.cesium

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.Ellipsoid
import typings.cesium.mod.Entity
import typings.cesium.mod.EntityView
import typings.cesium.mod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceDataSourcesEntityViewMod {
  
  @JSImport("cesium/Source/DataSources/EntityView", JSImport.Default)
  @js.native
  open class default protected () extends EntityView {
    def this(entity: Entity, scene: Scene) = this()
    def this(entity: Entity, scene: Scene, ellipsoid: Ellipsoid) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/DataSources/EntityView", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets or sets a camera offset that will be used to
      * initialize subsequent EntityViews.
      */
    @JSImport("cesium/Source/DataSources/EntityView", "default.defaultOffset3D")
    @js.native
    def defaultOffset3D: Cartesian3 = js.native
    inline def defaultOffset3D_=(x: Cartesian3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOffset3D")(x.asInstanceOf[js.Any])
  }
}
