package typings.cesium

import typings.cesium.mod.EllipseGeometryUpdater
import typings.cesium.mod.Entity
import typings.cesium.mod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ellipseGeometryUpdaterMod {
  
  @JSImport("cesium/Source/DataSources/EllipseGeometryUpdater", JSImport.Default)
  @js.native
  open class default protected () extends EllipseGeometryUpdater {
    def this(entity: Entity, scene: Scene) = this()
  }
}
