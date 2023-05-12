package typings.babylonjs.BABYLON

import typings.std.WebGLRenderbuffer
import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLHardwareTexture
  extends StObject
     with HardwareTextureWrapper {
  
  /* private */ var _MSAARenderBuffers: Any = js.native
  
  /* private */ var _context: Any = js.native
  
  /* private */ var _webGLTexture: Any = js.native
  
  def addMSAARenderBuffer(buffer: WebGLRenderbuffer): Unit = js.native
  
  def releaseMSAARenderBuffers(): Unit = js.native
  
  def set(hardwareTexture: WebGLTexture): Unit = js.native
  
  def setUsage(): Unit = js.native
  
  @JSName("underlyingResource")
  def underlyingResource_MWebGLHardwareTexture: Nullable[WebGLTexture] = js.native
}
