package typings.cesium

import typings.cesium.anon.Intensity
import typings.cesium.mod.SunLight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sunLightMod {
  
  @JSImport("cesium/Source/Scene/SunLight", JSImport.Default)
  @js.native
  open class default () extends SunLight {
    def this(options: Intensity) = this()
  }
}
