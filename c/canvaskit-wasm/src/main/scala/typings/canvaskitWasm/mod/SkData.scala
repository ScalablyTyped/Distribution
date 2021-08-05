package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkData
  extends StObject
     with EmbindObject[SkData] {
  
  /**
    * Return the number of bytes in this container.
    */
  def size(): Double
}
object SkData {
  
  inline def apply(
    delete: () => Unit,
    deleteAfter: () => Unit,
    isAliasOf: js.Any => Boolean,
    isDeleted: () => Boolean,
    size: () => Double
  ): SkData = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), deleteAfter = js.Any.fromFunction0(deleteAfter), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted), size = js.Any.fromFunction0(size))
    __obj.asInstanceOf[SkData]
  }
  
  extension [Self <: SkData](x: Self) {
    
    inline def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
  }
}
