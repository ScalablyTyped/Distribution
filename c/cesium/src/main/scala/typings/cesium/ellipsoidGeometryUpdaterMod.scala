package typings.cesium

import typings.cesium.mod.EllipsoidGeometryUpdater
import typings.cesium.mod.Entity
import typings.cesium.mod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ellipsoidGeometryUpdaterMod {
  
  @JSImport("cesium/Source/DataSources/EllipsoidGeometryUpdater", JSImport.Default)
  @js.native
  open class default protected () extends EllipsoidGeometryUpdater {
    def this(entity: Entity, scene: Scene) = this()
  }
}
