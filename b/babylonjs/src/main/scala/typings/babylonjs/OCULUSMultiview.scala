package typings.babylonjs

import typings.std.GLenum
import typings.std.GLint
import typings.std.GLsizei
import typings.std.OVRMultiview2
import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OCULUSMultiview
  extends StObject
     with OVRMultiview2 {
  
  def framebufferTextureMultisampleMultiviewOVR(
    target: GLenum,
    attachment: GLenum,
    texture: Null,
    level: GLint,
    samples: GLsizei,
    baseViewIndex: GLint,
    numViews: GLsizei
  ): Unit = js.native
  def framebufferTextureMultisampleMultiviewOVR(
    target: GLenum,
    attachment: GLenum,
    texture: WebGLTexture,
    level: GLint,
    samples: GLsizei,
    baseViewIndex: GLint,
    numViews: GLsizei
  ): Unit = js.native
}
