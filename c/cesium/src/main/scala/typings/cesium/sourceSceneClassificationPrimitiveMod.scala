package typings.cesium

import typings.cesium.anon.AllowPicking
import typings.cesium.mod.ClassificationPrimitive
import typings.cesium.mod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSceneClassificationPrimitiveMod {
  
  @JSImport("cesium/Source/Scene/ClassificationPrimitive", JSImport.Default)
  @js.native
  open class default () extends ClassificationPrimitive {
    def this(options: AllowPicking) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Scene/ClassificationPrimitive", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Determines if ClassificationPrimitive rendering is supported.
      * @param scene - The scene.
      * @returns <code>true</code> if ClassificationPrimitives are supported; otherwise, returns <code>false</code>
      */
    inline def isSupported(scene: Scene): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")(scene.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
