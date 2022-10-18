package typings.blueprintjsDatetime

import typings.blueprintjsDatetime.blueprintjsDatetimeBooleans.`false`
import typings.blueprintjsDatetime.libEsmDateFormatMod.DateFormatProps
import typings.blueprintjsDatetime.libEsmDatePickerCoreMod.DatePickerBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmDatePickerUtilsMod {
  
  object DatePickerUtils {
    
    @JSImport("@blueprintjs/datetime/lib/esm/datePickerUtils", "DatePickerUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/datetime/lib/esm/datePickerUtils", "DatePickerUtils.getDefaultMaxDate")
    @js.native
    def getDefaultMaxDate: js.Function0[js.Date] = js.native
    inline def getDefaultMaxDate_=(x: js.Function0[js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDefaultMaxDate")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime/lib/esm/datePickerUtils", "DatePickerUtils.getDefaultMinDate")
    @js.native
    def getDefaultMinDate: js.Function0[js.Date] = js.native
    inline def getDefaultMinDate_=(x: js.Function0[js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDefaultMinDate")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime/lib/esm/datePickerUtils", "DatePickerUtils.getFormattedDateString")
    @js.native
    def getFormattedDateString: js.Function3[
        /* date */ js.UndefOr[js.Date | `false` | Null], 
        /* props */ DateFormatProps & DatePickerBaseProps, 
        /* ignoreRange */ js.UndefOr[Boolean], 
        String
      ] = js.native
    inline def getFormattedDateString_=(
      x: js.Function3[
          /* date */ js.UndefOr[js.Date | `false` | Null], 
          /* props */ DateFormatProps & DatePickerBaseProps, 
          /* ignoreRange */ js.UndefOr[Boolean], 
          String
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getFormattedDateString")(x.asInstanceOf[js.Any])
  }
}
