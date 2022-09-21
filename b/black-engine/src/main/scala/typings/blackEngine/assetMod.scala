package typings.blackEngine

import typings.blackEngine.assetLoaderMod.AssetLoader
import typings.blackEngine.loaderFactoryMod.LoaderFactory
import typings.blackEngine.messageDispatcherMod.MessageDispatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assetMod {
  
  @JSImport("black-engine/assets/Asset", "Asset")
  @js.native
  open class Asset protected () extends MessageDispatcher {
    def this(`type`: Any, name: String) = this()
    
    /* private */ var __onLoaderComplete: Any = js.native
    
    /* private */ var __onLoaderError: Any = js.native
    
    def abort(): Unit = js.native
    
    def addLoader(loader: AssetLoader): AssetLoader = js.native
    
    def data: Any = js.native
    
    def isReady: Boolean = js.native
    
    def loaders: js.Array[AssetLoader] = js.native
    
    /* protected */ var mData: Any = js.native
    
    /* private */ var mIsReady: Any = js.native
    
    /* protected */ var mLoaders: js.Array[AssetLoader] = js.native
    
    /* protected */ var mName: String = js.native
    
    /* private */ var mNumLoaded: Any = js.native
    
    /* protected */ var mType: String = js.native
    
    def name: String = js.native
    
    /* protected */ def onAllLoaded(): Unit = js.native
    
    def onLoaderRequested(factory: LoaderFactory): Unit = js.native
    
    /* protected */ def ready(): Unit = js.native
    /* protected */ def ready(data: Any): Unit = js.native
    
    def `type`: String = js.native
  }
}
