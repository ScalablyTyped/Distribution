package typings.cookieclicker.Game

import typings.cookieclicker.cookieclickerStrings._empty
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Note extends StObject {
  
  var date: Double
  
  var desc: String
  
  var height: Double
  
  var id: Double
  
  var l: HTMLDivElement | PseudoNull
  
  var life: Double
  
  var pic: Icon | _empty
  
  var quick: Double
  
  var title: String
}
object Note {
  
  inline def apply(
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
  
  extension [Self <: Note](x: Self) {
    
    inline def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setL(value: HTMLDivElement | PseudoNull): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    inline def setLife(value: Double): Self = StObject.set(x, "life", value.asInstanceOf[js.Any])
    
    inline def setPic(value: Icon | _empty): Self = StObject.set(x, "pic", value.asInstanceOf[js.Any])
    
    inline def setQuick(value: Double): Self = StObject.set(x, "quick", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
