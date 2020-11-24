package typings.canvaskitWasm.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkFontMgr extends EmbindObject[SkFontMgr] {
  
  /**
    * Return the number of font families loaded in this manager. Useful for debugging.
    */
  def countFamilies(): Double = js.native
  
  /**
    * Return the nth family name. Useful for debugging.
    * @param index
    */
  def getFamilyName(index: Double): String = js.native
  
  /**
    * Create a typeface for the specified bytes and return it.
    * @param fontData
    */
  def makeTypefaceFromData(fontData: ArrayBuffer): SkTypeface = js.native
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
  implicit class SkFontMgrOps[Self <: SkFontMgr] (val x: Self) extends AnyVal {
    
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
    def setCountFamilies(value: () => Double): Self = this.set("countFamilies", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFamilyName(value: Double => String): Self = this.set("getFamilyName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMakeTypefaceFromData(value: ArrayBuffer => SkTypeface): Self = this.set("makeTypefaceFromData", js.Any.fromFunction1(value))
  }
}
