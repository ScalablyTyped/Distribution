package typings.babylonjs.BABYLON

import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CubeMapInfo extends StObject {
  
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
  implicit class CubeMapInfoMutableBuilder[Self <: CubeMapInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBack(value: Nullable[ArrayBufferView]): Self = StObject.set(x, "back", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackNull: Self = StObject.set(x, "back", null)
    
    @scala.inline
    def setDown(value: Nullable[ArrayBufferView]): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownNull: Self = StObject.set(x, "down", null)
    
    @scala.inline
    def setFormat(value: Double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFront(value: Nullable[ArrayBufferView]): Self = StObject.set(x, "front", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrontNull: Self = StObject.set(x, "front", null)
    
    @scala.inline
    def setGammaSpace(value: Boolean): Self = StObject.set(x, "gammaSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Nullable[ArrayBufferView]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftNull: Self = StObject.set(x, "left", null)
    
    @scala.inline
    def setRight(value: Nullable[ArrayBufferView]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightNull: Self = StObject.set(x, "right", null)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUp(value: Nullable[ArrayBufferView]): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpNull: Self = StObject.set(x, "up", null)
  }
}
