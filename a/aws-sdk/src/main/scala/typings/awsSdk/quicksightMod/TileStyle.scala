package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileStyle extends js.Object {
  
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
  implicit class TileStyleOps[Self <: TileStyle] (val x: Self) extends AnyVal {
    
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
    def setBorder(value: BorderStyle): Self = this.set("Border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("Border", js.undefined)
  }
}
