package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDataLayer
  extends StObject
     with ILayer {
  
  /** Clears all data in the layer. */
  def clear(): Unit
}
object IDataLayer {
  
  inline def apply(clear: () => Unit): IDataLayer = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear))
    __obj.asInstanceOf[IDataLayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDataLayer] (val x: Self) extends AnyVal {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
  }
}
