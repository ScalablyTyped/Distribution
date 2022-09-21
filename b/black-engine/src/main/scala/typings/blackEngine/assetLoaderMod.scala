package typings.blackEngine

import typings.blackEngine.messageDispatcherMod.MessageDispatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assetLoaderMod {
  
  @JSImport("black-engine/assets/loaders/AssetLoader", "AssetLoader")
  @js.native
  open class AssetLoader protected () extends MessageDispatcher {
    def this(url: String) = this()
    
    def abort(): Unit = js.native
    
    def data: Any = js.native
    
    def load(): Unit = js.native
    
    /* protected */ var mData: Any = js.native
    
    /* private */ var mIsLoaded: Any = js.native
    
    /* private */ var mNumOwners: Any = js.native
    
    /* protected */ var mUrl: String = js.native
    
    /* protected */ def onAbort(): Unit = js.native
    
    /* protected */ def onError(): Unit = js.native
    
    /* protected */ def onLoad(): Unit = js.native
    
    def url: String = js.native
  }
}
