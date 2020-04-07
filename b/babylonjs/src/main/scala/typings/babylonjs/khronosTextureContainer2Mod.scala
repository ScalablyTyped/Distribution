package typings.babylonjs

import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Misc/khronosTextureContainer2", JSImport.Namespace)
@js.native
object khronosTextureContainer2Mod extends js.Object {
  @js.native
  class KhronosTextureContainer2 protected () extends js.Object {
    def this(engine: ThinEngine) = this()
    var _determineTranscodeFormat: js.Any = js.native
    def uploadAsync(data: ArrayBufferView, internalTexture: InternalTexture): js.Promise[Unit] = js.native
  }
  
  /* static members */
  @js.native
  object KhronosTextureContainer2 extends js.Object {
    var _ModulePromise: js.Any = js.native
    var _TranscodeFormat: js.Any = js.native
    /**
      * Checks if the given data starts with a KTX2 file identifier.
      * @param data the data to check
      * @returns true if the data is a KTX2 file or false otherwise
      */
    def IsValid(data: ArrayBufferView): Boolean = js.native
  }
  
}

