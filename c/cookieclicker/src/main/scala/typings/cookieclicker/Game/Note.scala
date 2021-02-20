package typings.cookieclicker.Game

import typings.cookieclicker.cookieclickerStrings._empty
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Note extends StObject {
  
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
  implicit class NoteMutableBuilder[Self <: Note] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL(value: HTMLDivElement | PseudoNull): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLife(value: Double): Self = StObject.set(x, "life", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPic(value: Icon | _empty): Self = StObject.set(x, "pic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuick(value: Double): Self = StObject.set(x, "quick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
