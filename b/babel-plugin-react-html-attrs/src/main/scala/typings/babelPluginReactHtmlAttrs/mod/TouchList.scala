package typings.babelPluginReactHtmlAttrs.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchList
  extends StObject
     with /* index */ NumberDictionary[Touch] {
  
  def identifiedTouch(identifier: Double): Touch
  
  def item(index: Double): Touch
  
  var length: Double
}
object TouchList {
  
  inline def apply(identifiedTouch: Double => Touch, item: Double => Touch, length: Double): TouchList = {
    val __obj = js.Dynamic.literal(identifiedTouch = js.Any.fromFunction1(identifiedTouch), item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TouchList] (val x: Self) extends AnyVal {
    
    inline def setIdentifiedTouch(value: Double => Touch): Self = StObject.set(x, "identifiedTouch", js.Any.fromFunction1(value))
    
    inline def setItem(value: Double => Touch): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
