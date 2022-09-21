package typings.cesium

import typings.cesium.mod.Entity
import typings.cesium.mod.PolygonGeometryUpdater
import typings.cesium.mod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polygonGeometryUpdaterMod {
  
  @JSImport("cesium/Source/DataSources/PolygonGeometryUpdater", JSImport.Default)
  @js.native
  open class default protected () extends PolygonGeometryUpdater {
    def this(entity: Entity, scene: Scene) = this()
  }
}
