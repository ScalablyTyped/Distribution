package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkPicture
  extends StObject
     with EmbindObject[SkPicture] {
  
  /**
    *  Returns a new shader that will draw with this picture.
    *
    *  @param tmx  The tiling mode to use when sampling in the x-direction.
    *  @param tmy  The tiling mode to use when sampling in the y-direction.
    *  @param mode How to filter the tiles
    *  @param localMatrix Optional matrix used when sampling
    *  @param tileRect The tile rectangle in picture coordinates: this represents the subset
    *              (or superset) of the picture used when building a tile. It is not
    *              affected by localMatrix and does not imply scaling (only translation
    *              and cropping). If null, the tile rect is considered equal to the picture
    *              bounds.
    */
  def makeShader(tmx: TileMode, tmy: TileMode, mode: FilterMode): Shader = js.native
  def makeShader(tmx: TileMode, tmy: TileMode, mode: FilterMode, localMatrix: Unit, tileRect: InputRect): Shader = js.native
  def makeShader(tmx: TileMode, tmy: TileMode, mode: FilterMode, localMatrix: InputMatrix): Shader = js.native
  def makeShader(tmx: TileMode, tmy: TileMode, mode: FilterMode, localMatrix: InputMatrix, tileRect: InputRect): Shader = js.native
  
  /**
    * Returns the serialized format of this SkPicture. The format may change at anytime and
    * no promises are made for backwards or forward compatibility.
    */
  def serialize(): js.typedarray.Uint8Array | Null = js.native
}
