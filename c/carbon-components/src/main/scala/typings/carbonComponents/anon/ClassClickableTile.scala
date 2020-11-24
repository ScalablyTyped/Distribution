package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassClickableTile extends js.Object {
  
  var classClickableTile: String = js.native
  
  var classExpandedTile: String = js.native
  
  var classSelectableTile: String = js.native
  
  var selectorAboveTheFold: String = js.native
  
  var selectorInit: String = js.native
  
  var selectorTileInput: String = js.native
}
object ClassClickableTile {
  
  @scala.inline
  def apply(
    classClickableTile: String,
    classExpandedTile: String,
    classSelectableTile: String,
    selectorAboveTheFold: String,
    selectorInit: String,
    selectorTileInput: String
  ): ClassClickableTile = {
    val __obj = js.Dynamic.literal(classClickableTile = classClickableTile.asInstanceOf[js.Any], classExpandedTile = classExpandedTile.asInstanceOf[js.Any], classSelectableTile = classSelectableTile.asInstanceOf[js.Any], selectorAboveTheFold = selectorAboveTheFold.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorTileInput = selectorTileInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassClickableTile]
  }
  
  @scala.inline
  implicit class ClassClickableTileOps[Self <: ClassClickableTile] (val x: Self) extends AnyVal {
    
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
    def setClassClickableTile(value: String): Self = this.set("classClickableTile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassExpandedTile(value: String): Self = this.set("classExpandedTile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassSelectableTile(value: String): Self = this.set("classSelectableTile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorAboveTheFold(value: String): Self = this.set("selectorAboveTheFold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorInit(value: String): Self = this.set("selectorInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorTileInput(value: String): Self = this.set("selectorTileInput", value.asInstanceOf[js.Any])
  }
}
