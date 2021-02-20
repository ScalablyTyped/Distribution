package typings.babylonjs.BABYLON

import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RawTexture extends Texture {
  
  /**
    * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
    */
  var format: Double = js.native
  
  /**
    * Updates the texture underlying data.
    * @param data Define the new data of the texture
    */
  def update(data: ArrayBufferView): Unit = js.native
}
