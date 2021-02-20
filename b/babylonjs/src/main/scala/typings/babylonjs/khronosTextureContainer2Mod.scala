package typings.babylonjs

import typings.babylonjs.anon.JsDecoderModule
import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object khronosTextureContainer2Mod {
  
  @JSImport("babylonjs/Misc/khronosTextureContainer2", "KhronosTextureContainer2")
  @js.native
  class KhronosTextureContainer2 protected () extends StObject {
    /**
      * Constructor
      * @param engine The engine to use
      * @param numWorkers The number of workers for async operations. Specify `0` to disable web workers and run synchronously in the current context.
      */
    def this(engine: ThinEngine) = this()
    def this(engine: ThinEngine, numWorkers: Double) = this()
    
    /* protected */ def _createTexture(data: js.Any, internalTexture: InternalTexture): Unit = js.native
    /* protected */ def _createTexture(data: js.Any, internalTexture: InternalTexture, options: js.Any): Unit = js.native
    
    var _engine: js.Any = js.native
    
    /**
      * Stop all async operations and release resources.
      */
    def dispose(): Unit = js.native
    
    /** @hidden */
    def uploadAsync(data: ArrayBufferView, internalTexture: InternalTexture): js.Promise[Unit] = js.native
    def uploadAsync(data: ArrayBufferView, internalTexture: InternalTexture, options: js.Any): js.Promise[Unit] = js.native
  }
  /* static members */
  object KhronosTextureContainer2 {
    
    @JSImport("babylonjs/Misc/khronosTextureContainer2", "KhronosTextureContainer2")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Default number of workers used to handle data decoding
      */
    @JSImport("babylonjs/Misc/khronosTextureContainer2", "KhronosTextureContainer2.DefaultNumWorkers")
    @js.native
    def DefaultNumWorkers: Double = js.native
    @scala.inline
    def DefaultNumWorkers_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultNumWorkers")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/khronosTextureContainer2", "KhronosTextureContainer2.GetDefaultNumWorkers")
    @js.native
    def GetDefaultNumWorkers: js.Any = js.native
    @scala.inline
    def GetDefaultNumWorkers_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GetDefaultNumWorkers")(x.asInstanceOf[js.Any])
    
    /**
      * Checks if the given data starts with a KTX2 file identifier.
      * @param data the data to check
      * @returns true if the data is a KTX2 file or false otherwise
      */
    @JSImport("babylonjs/Misc/khronosTextureContainer2", "KhronosTextureContainer2.IsValid")
    @js.native
    def IsValid(data: ArrayBufferView): Boolean = js.native
    
    /**
      * URLs to use when loading the KTX2 decoder module as well as its dependencies
      * If a url is null, the default url is used (pointing to https://preview.babylonjs.com)
      * Note that jsDecoderModule can't be null and that the other dependencies will only be loaded if necessary
      * Urls you can change:
      *     URLConfig.jsDecoderModule
      *     URLConfig.wasmUASTCToASTC
      *     URLConfig.wasmUASTCToBC7
      *     URLConfig.wasmUASTCToRGBA_UNORM
      *     URLConfig.wasmUASTCToRGBA_SRGB
      *     URLConfig.jsMSCTranscoder
      *     URLConfig.wasmMSCTranscoder
      * You can see their default values in this PG: https://playground.babylonjs.com/#EIJH8L#9
      */
    @JSImport("babylonjs/Misc/khronosTextureContainer2", "KhronosTextureContainer2.URLConfig")
    @js.native
    def URLConfig: JsDecoderModule = js.native
    @scala.inline
    def URLConfig_=(x: JsDecoderModule): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URLConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/khronosTextureContainer2", "KhronosTextureContainer2._CreateWorkerPool")
    @js.native
    def _CreateWorkerPool: js.Any = js.native
    @scala.inline
    def _CreateWorkerPool_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateWorkerPool")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/khronosTextureContainer2", "KhronosTextureContainer2._Initialized")
    @js.native
    def _Initialized: js.Any = js.native
    @scala.inline
    def _Initialized_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Initialized")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/khronosTextureContainer2", "KhronosTextureContainer2._Ktx2Decoder")
    @js.native
    def _Ktx2Decoder: js.Any = js.native
    @scala.inline
    def _Ktx2Decoder_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Ktx2Decoder")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/khronosTextureContainer2", "KhronosTextureContainer2._WorkerPoolPromise")
    @js.native
    def _WorkerPoolPromise: js.Any = js.native
    @scala.inline
    def _WorkerPoolPromise_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_WorkerPoolPromise")(x.asInstanceOf[js.Any])
  }
}
