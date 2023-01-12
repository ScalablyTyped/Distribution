package typings.babylonjs

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscHighDynamicRangePanoramaToCubemapMod {
  
  @JSImport("babylonjs/Misc/HighDynamicRange/panoramaToCubemap", "PanoramaToCubeMapTools")
  @js.native
  open class PanoramaToCubeMapTools () extends StObject
  /* static members */
  object PanoramaToCubeMapTools {
    
    @JSImport("babylonjs/Misc/HighDynamicRange/panoramaToCubemap", "PanoramaToCubeMapTools")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Misc/HighDynamicRange/panoramaToCubemap", "PanoramaToCubeMapTools.CalcProjectionSpherical")
    @js.native
    def CalcProjectionSpherical: Any = js.native
    inline def CalcProjectionSpherical_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CalcProjectionSpherical")(x.asInstanceOf[js.Any])
    
    /**
      * Converts a panorama stored in RGB right to left up to down format into a cubemap (6 faces).
      *
      * @param float32Array The source data.
      * @param inputWidth The width of the input panorama.
      * @param inputHeight The height of the input panorama.
      * @param size The willing size of the generated cubemap (each faces will be size * size pixels)
      * @returns The cubemap data
      */
    inline def ConvertPanoramaToCubemap(float32Array: js.typedarray.Float32Array, inputWidth: Double, inputHeight: Double, size: Double): CubeMapInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("ConvertPanoramaToCubemap")(float32Array.asInstanceOf[js.Any], inputWidth.asInstanceOf[js.Any], inputHeight.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[CubeMapInfo]
    
    @JSImport("babylonjs/Misc/HighDynamicRange/panoramaToCubemap", "PanoramaToCubeMapTools.CreateCubemapTexture")
    @js.native
    def CreateCubemapTexture: Any = js.native
    inline def CreateCubemapTexture_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateCubemapTexture")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/HighDynamicRange/panoramaToCubemap", "PanoramaToCubeMapTools.FACE_BACK")
    @js.native
    def FACE_BACK: Any = js.native
    inline def FACE_BACK_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_BACK")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/HighDynamicRange/panoramaToCubemap", "PanoramaToCubeMapTools.FACE_DOWN")
    @js.native
    def FACE_DOWN: Any = js.native
    inline def FACE_DOWN_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_DOWN")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/HighDynamicRange/panoramaToCubemap", "PanoramaToCubeMapTools.FACE_FRONT")
    @js.native
    def FACE_FRONT: Any = js.native
    inline def FACE_FRONT_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_FRONT")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/HighDynamicRange/panoramaToCubemap", "PanoramaToCubeMapTools.FACE_LEFT")
    @js.native
    def FACE_LEFT: Any = js.native
    inline def FACE_LEFT_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_LEFT")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/HighDynamicRange/panoramaToCubemap", "PanoramaToCubeMapTools.FACE_RIGHT")
    @js.native
    def FACE_RIGHT: Any = js.native
    inline def FACE_RIGHT_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_RIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/HighDynamicRange/panoramaToCubemap", "PanoramaToCubeMapTools.FACE_UP")
    @js.native
    def FACE_UP: Any = js.native
    inline def FACE_UP_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACE_UP")(x.asInstanceOf[js.Any])
  }
  
  trait CubeMapInfo extends StObject {
    
    /**
      * The pixel array for the back face.
      * This is stored in format, left to right, up to down format.
      */
    var back: Nullable[js.typedarray.ArrayBufferView]
    
    /**
      * The pixel array for the down face.
      * This is stored in format, left to right, up to down format.
      */
    var down: Nullable[js.typedarray.ArrayBufferView]
    
    /**
      * The format of the texture.
      *
      * RGBA, RGB.
      */
    var format: Double
    
    /**
      * The pixel array for the front face.
      * This is stored in format, left to right, up to down format.
      */
    var front: Nullable[js.typedarray.ArrayBufferView]
    
    /**
      * Specifies whether the texture is in gamma space.
      */
    var gammaSpace: Boolean
    
    /**
      * The pixel array for the left face.
      * This is stored in format, left to right, up to down format.
      */
    var left: Nullable[js.typedarray.ArrayBufferView]
    
    /**
      * The pixel array for the right face.
      * This is stored in format, left to right, up to down format.
      */
    var right: Nullable[js.typedarray.ArrayBufferView]
    
    /**
      * The size of the cubemap stored.
      *
      * Each faces will be size * size pixels.
      */
    var size: Double
    
    /**
      * The type of the texture data.
      *
      * UNSIGNED_INT, FLOAT.
      */
    var `type`: Double
    
    /**
      * The pixel array for the up face.
      * This is stored in format, left to right, up to down format.
      */
    var up: Nullable[js.typedarray.ArrayBufferView]
  }
  object CubeMapInfo {
    
    inline def apply(format: Double, gammaSpace: Boolean, size: Double, `type`: Double): CubeMapInfo = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], gammaSpace = gammaSpace.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], back = null, down = null, front = null, left = null, right = null, up = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CubeMapInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CubeMapInfo] (val x: Self) extends AnyVal {
      
      inline def setBack(value: Nullable[js.typedarray.ArrayBufferView]): Self = StObject.set(x, "back", value.asInstanceOf[js.Any])
      
      inline def setBackNull: Self = StObject.set(x, "back", null)
      
      inline def setDown(value: Nullable[js.typedarray.ArrayBufferView]): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
      
      inline def setDownNull: Self = StObject.set(x, "down", null)
      
      inline def setFormat(value: Double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFront(value: Nullable[js.typedarray.ArrayBufferView]): Self = StObject.set(x, "front", value.asInstanceOf[js.Any])
      
      inline def setFrontNull: Self = StObject.set(x, "front", null)
      
      inline def setGammaSpace(value: Boolean): Self = StObject.set(x, "gammaSpace", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Nullable[js.typedarray.ArrayBufferView]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftNull: Self = StObject.set(x, "left", null)
      
      inline def setRight(value: Nullable[js.typedarray.ArrayBufferView]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightNull: Self = StObject.set(x, "right", null)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUp(value: Nullable[js.typedarray.ArrayBufferView]): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
      
      inline def setUpNull: Self = StObject.set(x, "up", null)
    }
  }
}
