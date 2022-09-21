package typings.cesium

import typings.cesium.mod.Camera
import typings.cesium.mod.HeadingPitchRange
import typings.cesium.mod.Rectangle
import typings.cesium.mod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cameraMod {
  
  @JSImport("cesium/Source/Scene/Camera", JSImport.Default)
  @js.native
  open class default protected () extends Camera {
    def this(scene: Scene) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Scene/Camera", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The default heading/pitch/range that is used when the camera flies to a location that contains a bounding sphere.
      */
    @JSImport("cesium/Source/Scene/Camera", "default.DEFAULT_OFFSET")
    @js.native
    def DEFAULT_OFFSET: HeadingPitchRange = js.native
    inline def DEFAULT_OFFSET_=(x: HeadingPitchRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_OFFSET")(x.asInstanceOf[js.Any])
    
    /**
      * A scalar to multiply to the camera position and add it back after setting the camera to view the rectangle.
      * A value of zero means the camera will view the entire {@link Camera#DEFAULT_VIEW_RECTANGLE}, a value greater than zero
      * will move it further away from the extent, and a value less than zero will move it close to the extent.
      */
    @JSImport("cesium/Source/Scene/Camera", "default.DEFAULT_VIEW_FACTOR")
    @js.native
    def DEFAULT_VIEW_FACTOR: Double = js.native
    inline def DEFAULT_VIEW_FACTOR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_VIEW_FACTOR")(x.asInstanceOf[js.Any])
    
    /**
      * The default rectangle the camera will view on creation.
      */
    @JSImport("cesium/Source/Scene/Camera", "default.DEFAULT_VIEW_RECTANGLE")
    @js.native
    def DEFAULT_VIEW_RECTANGLE: Rectangle = js.native
    inline def DEFAULT_VIEW_RECTANGLE_=(x: Rectangle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_VIEW_RECTANGLE")(x.asInstanceOf[js.Any])
  }
}
