package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KhronosTextureContainer2 extends StObject {
  
  /* protected */ def _createTexture(data: IDecodedData, internalTexture: InternalTexture): Unit = js.native
  /* protected */ def _createTexture(data: IDecodedData, internalTexture: InternalTexture, options: IKTX2DecoderOptions & IDecodedData): Unit = js.native
  
  /* private */ var _engine: Any = js.native
  
  /**
    * @internal
    */
  def uploadAsync(data: js.typedarray.ArrayBufferView, internalTexture: InternalTexture): js.Promise[Unit] = js.native
  def uploadAsync(
    data: js.typedarray.ArrayBufferView,
    internalTexture: InternalTexture,
    options: IKTX2DecoderOptions & IDecodedData
  ): js.Promise[Unit] = js.native
}
