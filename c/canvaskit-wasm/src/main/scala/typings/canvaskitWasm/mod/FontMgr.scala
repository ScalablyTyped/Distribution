package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontMgr
  extends StObject
     with EmbindObject[FontMgr] {
  
  /**
    * Return the number of font families loaded in this manager. Useful for debugging.
    */
  def countFamilies(): Double
  
  /**
    * Return the nth family name. Useful for debugging.
    * @param index
    */
  def getFamilyName(index: Double): String
}
object FontMgr {
  
  inline def apply(
    countFamilies: () => Double,
    delete: () => Unit,
    deleteLater: () => Unit,
    getFamilyName: Double => String,
    isAliasOf: Any => Boolean,
    isDeleted: () => Boolean
  ): FontMgr = {
    val __obj = js.Dynamic.literal(countFamilies = js.Any.fromFunction0(countFamilies), delete = js.Any.fromFunction0(delete), deleteLater = js.Any.fromFunction0(deleteLater), getFamilyName = js.Any.fromFunction1(getFamilyName), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted))
    __obj.asInstanceOf[FontMgr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontMgr] (val x: Self) extends AnyVal {
    
    inline def setCountFamilies(value: () => Double): Self = StObject.set(x, "countFamilies", js.Any.fromFunction0(value))
    
    inline def setGetFamilyName(value: Double => String): Self = StObject.set(x, "getFamilyName", js.Any.fromFunction1(value))
  }
}
