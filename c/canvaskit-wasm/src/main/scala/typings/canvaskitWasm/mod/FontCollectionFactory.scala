package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontCollectionFactory extends StObject {
  
  /**
    * Return an empty FontCollection
    */
  def Make(): FontCollection
}
object FontCollectionFactory {
  
  inline def apply(Make: () => FontCollection): FontCollectionFactory = {
    val __obj = js.Dynamic.literal(Make = js.Any.fromFunction0(Make))
    __obj.asInstanceOf[FontCollectionFactory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontCollectionFactory] (val x: Self) extends AnyVal {
    
    inline def setMake(value: () => FontCollection): Self = StObject.set(x, "Make", js.Any.fromFunction0(value))
  }
}
