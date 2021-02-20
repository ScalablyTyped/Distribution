package typings.dateFormatJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * Accepts a date, a mask, or a date and a mask.
    * Returns a formatted version of the given date.
    * The date defaults to the current date/time.
    * The mask defaults to dateFormat.masks.default.
    * @param {Date=} date
    * @param {string=} mask
    * @param {boolean=} utc
    */
  object dateFormat {
    
    @JSGlobal("dateFormat")
    @js.native
    def apply(): String = js.native
    @JSGlobal("dateFormat")
    @js.native
    def apply(date: js.UndefOr[scala.Nothing], mask: js.UndefOr[scala.Nothing], utc: Boolean): String = js.native
    @JSGlobal("dateFormat")
    @js.native
    def apply(date: js.UndefOr[scala.Nothing], mask: String): String = js.native
    @JSGlobal("dateFormat")
    @js.native
    def apply(date: js.UndefOr[scala.Nothing], mask: String, utc: Boolean): String = js.native
    @JSGlobal("dateFormat")
    @js.native
    def apply(date: js.Any): String = js.native
    @JSGlobal("dateFormat")
    @js.native
    def apply(date: js.Any, mask: js.UndefOr[scala.Nothing], utc: Boolean): String = js.native
    @JSGlobal("dateFormat")
    @js.native
    def apply(date: js.Any, mask: String): String = js.native
    @JSGlobal("dateFormat")
    @js.native
    def apply(date: js.Any, mask: String, utc: Boolean): String = js.native
    @JSGlobal("dateFormat")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("dateFormat.i18n")
    @js.native
    def i18n: DateFormatI18n = js.native
    @scala.inline
    def i18n_=(x: DateFormatI18n): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18n")(x.asInstanceOf[js.Any])
    
    @JSGlobal("dateFormat.masks")
    @js.native
    def masks: DateFormatMasks = js.native
    @scala.inline
    def masks_=(x: DateFormatMasks): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("masks")(x.asInstanceOf[js.Any])
  }
}
