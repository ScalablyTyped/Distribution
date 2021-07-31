package typings.canvaskitWasm.mod

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkFontMgr
  extends StObject
     with EmbindObject[SkFontMgr] {
  
  /**
    * Return the number of font families loaded in this manager. Useful for debugging.
    */
  def countFamilies(): Double
  
  /**
    * Return the nth family name. Useful for debugging.
    * @param index
    */
  def getFamilyName(index: Double): String
  
  /**
    * Create a typeface for the specified bytes and return it.
    * @param fontData
    */
  def makeTypefaceFromData(fontData: ArrayBuffer): SkTypeface
}
object SkFontMgr {
  
  @scala.inline
  def apply(
    countFamilies: () => Double,
    delete: () => Unit,
    deleteAfter: () => Unit,
    getFamilyName: Double => String,
    isAliasOf: js.Any => Boolean,
    isDeleted: () => Boolean,
    makeTypefaceFromData: ArrayBuffer => SkTypeface
  ): SkFontMgr = {
    val __obj = js.Dynamic.literal(countFamilies = js.Any.fromFunction0(countFamilies), delete = js.Any.fromFunction0(delete), deleteAfter = js.Any.fromFunction0(deleteAfter), getFamilyName = js.Any.fromFunction1(getFamilyName), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted), makeTypefaceFromData = js.Any.fromFunction1(makeTypefaceFromData))
    __obj.asInstanceOf[SkFontMgr]
  }
  
  @scala.inline
  implicit class SkFontMgrMutableBuilder[Self <: SkFontMgr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountFamilies(value: () => Double): Self = StObject.set(x, "countFamilies", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFamilyName(value: Double => String): Self = StObject.set(x, "getFamilyName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMakeTypefaceFromData(value: ArrayBuffer => SkTypeface): Self = StObject.set(x, "makeTypefaceFromData", js.Any.fromFunction1(value))
  }
}
