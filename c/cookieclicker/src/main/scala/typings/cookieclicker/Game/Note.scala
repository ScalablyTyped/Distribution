package typings.cookieclicker.Game

import typings.cookieclicker.cookieclickerStrings._empty
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Note extends js.Object {
  
  var date: Double = js.native
  
  var desc: String = js.native
  
  var height: Double = js.native
  
  var id: Double = js.native
  
  var l: HTMLDivElement | PseudoNull = js.native
  
  var life: Double = js.native
  
  var pic: Icon | _empty = js.native
  
  var quick: Double = js.native
  
  var title: String = js.native
}
object Note {
  
  @scala.inline
  def apply(
    date: Double,
    desc: String,
    height: Double,
    id: Double,
    l: HTMLDivElement | PseudoNull,
    life: Double,
    pic: Icon | _empty,
    quick: Double,
    title: String
  ): Note = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], life = life.asInstanceOf[js.Any], pic = pic.asInstanceOf[js.Any], quick = quick.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Note]
  }
  
  @scala.inline
  implicit class NoteOps[Self <: Note] (val x: Self) extends AnyVal {
    
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
    def setDate(value: Double): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesc(value: String): Self = this.set("desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL(value: HTMLDivElement | PseudoNull): Self = this.set("l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLife(value: Double): Self = this.set("life", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPic(value: Icon | _empty): Self = this.set("pic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuick(value: Double): Self = this.set("quick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
