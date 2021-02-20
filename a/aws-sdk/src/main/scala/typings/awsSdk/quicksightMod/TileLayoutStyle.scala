package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileLayoutStyle extends StObject {
  
  /**
    * The gutter settings that apply between tiles. 
    */
  var Gutter: js.UndefOr[GutterStyle] = js.native
  
  /**
    * The margin settings that apply around the outside edge of sheets.
    */
  var Margin: js.UndefOr[MarginStyle] = js.native
}
object TileLayoutStyle {
  
  @scala.inline
  def apply(): TileLayoutStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileLayoutStyle]
  }
  
  @scala.inline
  implicit class TileLayoutStyleMutableBuilder[Self <: TileLayoutStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGutter(value: GutterStyle): Self = StObject.set(x, "Gutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGutterUndefined: Self = StObject.set(x, "Gutter", js.undefined)
    
    @scala.inline
    def setMargin(value: MarginStyle): Self = StObject.set(x, "Margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "Margin", js.undefined)
  }
}
