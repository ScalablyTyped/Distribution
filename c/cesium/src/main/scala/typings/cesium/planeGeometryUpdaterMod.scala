package typings.cesium

import typings.cesium.mod.Entity
import typings.cesium.mod.PlaneGeometryUpdater
import typings.cesium.mod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object planeGeometryUpdaterMod {
  
  @JSImport("cesium/Source/DataSources/PlaneGeometryUpdater", JSImport.Default)
  @js.native
  open class default protected () extends PlaneGeometryUpdater {
    def this(entity: Entity, scene: Scene) = this()
  }
}
