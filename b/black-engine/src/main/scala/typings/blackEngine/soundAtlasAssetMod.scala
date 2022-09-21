package typings.blackEngine

import typings.blackEngine.assetMod.Asset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object soundAtlasAssetMod {
  
  @JSImport("black-engine/assets/SoundAtlasAsset", "SoundAtlasAsset")
  @js.native
  open class SoundAtlasAsset protected () extends Asset {
    def this(name: String, soundUrl: String, dataUrl: String) = this()
    
    /* private */ var mAudioXHR: Any = js.native
    
    /* private */ var mDataUrl: Any = js.native
    
    /* private */ var mDataXHR: Any = js.native
    
    /* private */ var mSoundUrl: Any = js.native
    
    def onLoaderRequested(factory: Any): Unit = js.native
  }
}
