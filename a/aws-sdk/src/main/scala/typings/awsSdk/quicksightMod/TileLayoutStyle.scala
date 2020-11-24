package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileLayoutStyle extends js.Object {
  
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
  implicit class TileLayoutStyleOps[Self <: TileLayoutStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGutter(value: GutterStyle): Self = this.set("Gutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGutter: Self = this.set("Gutter", js.undefined)
    
    @scala.inline
    def setMargin(value: MarginStyle): Self = this.set("Margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("Margin", js.undefined)
  }
}
