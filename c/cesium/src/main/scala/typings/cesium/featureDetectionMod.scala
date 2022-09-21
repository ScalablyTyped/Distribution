package typings.cesium

import typings.cesium.mod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureDetectionMod {
  
  object default {
    
    @JSImport("cesium/Source/Core/FeatureDetection", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Detects whether the current browser supports Basis Universal textures and the web assembly modules needed to transcode them.
      * @returns true if the browser supports web assembly modules and the scene supports Basis Universal textures, false if not.
      */
    inline def supportsBasis(scene: Scene): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsBasis")(scene.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Detects whether the current browser supports BigInt.
      * @returns true if the browser supports BigInt, false if not.
      */
    inline def supportsBigInt(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsBigInt")().asInstanceOf[Boolean]
    
    /**
      * Detects whether the current browser supports BigInt64Array typed arrays.
      * @returns true if the browser supports BigInt64Array typed arrays, false if not.
      */
    inline def supportsBigInt64Array(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsBigInt64Array")().asInstanceOf[Boolean]
    
    /**
      * Detects whether the current browser supports BigUint64Array typed arrays.
      * @returns true if the browser supports BigUint64Array typed arrays, false if not.
      */
    inline def supportsBigUint64Array(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsBigUint64Array")().asInstanceOf[Boolean]
    
    /**
      * Detects whether the current browser supports the full screen standard.
      * @returns true if the browser supports the full screen standard, false if not.
      */
    inline def supportsFullscreen(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsFullscreen")().asInstanceOf[Boolean]
    
    /**
      * Detects whether the current browser supports typed arrays.
      * @returns true if the browser supports typed arrays, false if not.
      */
    inline def supportsTypedArrays(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsTypedArrays")().asInstanceOf[Boolean]
    
    /**
      * Detects whether the current browser supports Web Assembly.
      * @returns true if the browsers supports Web Assembly, false if not.
      */
    inline def supportsWebAssembly(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsWebAssembly")().asInstanceOf[Boolean]
    
    /**
      * Detects whether the current browser supports Web Workers.
      * @returns true if the browsers supports Web Workers, false if not.
      */
    inline def supportsWebWorkers(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsWebWorkers")().asInstanceOf[Boolean]
  }
}
