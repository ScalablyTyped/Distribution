package typings.cesium

import typings.cesium.mod.CylinderGeometryUpdater
import typings.cesium.mod.Entity
import typings.cesium.mod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cylinderGeometryUpdaterMod {
  
  @JSImport("cesium/Source/DataSources/CylinderGeometryUpdater", JSImport.Default)
  @js.native
  open class default protected () extends CylinderGeometryUpdater {
    def this(entity: Entity, scene: Scene) = this()
  }
}
