package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPrimitive extends StObject {
  
  /**
    * Gets the css cursor value when the primitive has events on it.
    * @returns css cursor string when primitive has events on it.
    */
  def getCursor(): String
  
  /**
    * Gets whether the primitive is visible.
    * @returns A boolean indicating whether the primitive is visible or not.
    */
  def getVisible(): Boolean
  
  /** Optional property to store any additional metadata for this primitive. */
  var metadata: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the options for customizing the IPrimitive.
    * @param options The options for customizing the IPrimitive.
    */
  def setOptions(options: IPrimitiveOptions): Unit
}
object IPrimitive {
  
  inline def apply(getCursor: () => String, getVisible: () => Boolean, setOptions: IPrimitiveOptions => Unit): IPrimitive = {
    val __obj = js.Dynamic.literal(getCursor = js.Any.fromFunction0(getCursor), getVisible = js.Any.fromFunction0(getVisible), setOptions = js.Any.fromFunction1(setOptions))
    __obj.asInstanceOf[IPrimitive]
  }
  
  extension [Self <: IPrimitive](x: Self) {
    
    inline def setGetCursor(value: () => String): Self = StObject.set(x, "getCursor", js.Any.fromFunction0(value))
    
    inline def setGetVisible(value: () => Boolean): Self = StObject.set(x, "getVisible", js.Any.fromFunction0(value))
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setSetOptions(value: IPrimitiveOptions => Unit): Self = StObject.set(x, "setOptions", js.Any.fromFunction1(value))
  }
}
