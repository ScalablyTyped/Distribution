package typings.cesium

import typings.cesium.mod.CorridorGeometryUpdater
import typings.cesium.mod.Entity
import typings.cesium.mod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object corridorGeometryUpdaterMod {
  
  @JSImport("cesium/Source/DataSources/CorridorGeometryUpdater", JSImport.Default)
  @js.native
  open class default protected () extends CorridorGeometryUpdater {
    def this(entity: Entity, scene: Scene) = this()
  }
}
