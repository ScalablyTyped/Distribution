package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileStyle extends StObject {
  
  /**
    * The border around a tile.
    */
  var Border: js.UndefOr[BorderStyle] = js.native
}
object TileStyle {
  
  @scala.inline
  def apply(): TileStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileStyle]
  }
  
  @scala.inline
  implicit class TileStyleMutableBuilder[Self <: TileStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: BorderStyle): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "Border", js.undefined)
  }
}
