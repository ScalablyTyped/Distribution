package typings.dateFormatJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @scala.inline
    def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
    @scala.inline
    def apply(date: js.Any): String = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def apply(date: js.Any, mask: String): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def apply(date: js.Any, mask: String, utc: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def apply(date: js.Any, mask: Unit, utc: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def apply(date: Unit, mask: String): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def apply(date: Unit, mask: String, utc: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def apply(date: Unit, mask: Unit, utc: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[String]
    
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
