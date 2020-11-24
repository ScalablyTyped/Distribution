package typings.babylonjs.panoramaToCubemapMod

import typings.babylonjs.typesMod.Nullable
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CubeMapInfo extends js.Object {
  
  /**
    * The pixel array for the back face.
    * This is stored in format, left to right, up to down format.
    */
  var back: Nullable[ArrayBufferView] = js.native
  
  /**
    * The pixel array for the down face.
    * This is stored in format, left to right, up to down format.
    */
  var down: Nullable[ArrayBufferView] = js.native
  
  /**
    * The format of the texture.
    *
    * RGBA, RGB.
    */
  var format: Double = js.native
  
  /**
    * The pixel array for the front face.
    * This is stored in format, left to right, up to down format.
    */
  var front: Nullable[ArrayBufferView] = js.native
  
  /**
    * Specifies whether the texture is in gamma space.
    */
  var gammaSpace: Boolean = js.native
  
  /**
    * The pixel array for the left face.
    * This is stored in format, left to right, up to down format.
    */
  var left: Nullable[ArrayBufferView] = js.native
  
  /**
    * The pixel array for the right face.
    * This is stored in format, left to right, up to down format.
    */
  var right: Nullable[ArrayBufferView] = js.native
  
  /**
    * The size of the cubemap stored.
    *
    * Each faces will be size * size pixels.
    */
  var size: Double = js.native
  
  /**
    * The type of the texture data.
    *
    * UNSIGNED_INT, FLOAT.
    */
  var `type`: Double = js.native
  
  /**
    * The pixel array for the up face.
    * This is stored in format, left to right, up to down format.
    */
  var up: Nullable[ArrayBufferView] = js.native
}
object CubeMapInfo {
  
  @scala.inline
  def apply(format: Double, gammaSpace: Boolean, size: Double, `type`: Double): CubeMapInfo = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], gammaSpace = gammaSpace.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CubeMapInfo]
  }
  
  @scala.inline
  implicit class CubeMapInfoOps[Self <: CubeMapInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFormat(value: Double): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGammaSpace(value: Boolean): Self = this.set("gammaSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBack(value: Nullable[ArrayBufferView]): Self = this.set("back", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackNull: Self = this.set("back", null)
    
    @scala.inline
    def setDown(value: Nullable[ArrayBufferView]): Self = this.set("down", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownNull: Self = this.set("down", null)
    
    @scala.inline
    def setFront(value: Nullable[ArrayBufferView]): Self = this.set("front", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrontNull: Self = this.set("front", null)
    
    @scala.inline
    def setLeft(value: Nullable[ArrayBufferView]): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftNull: Self = this.set("left", null)
    
    @scala.inline
    def setRight(value: Nullable[ArrayBufferView]): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightNull: Self = this.set("right", null)
    
    @scala.inline
    def setUp(value: Nullable[ArrayBufferView]): Self = this.set("up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpNull: Self = this.set("up", null)
  }
}
