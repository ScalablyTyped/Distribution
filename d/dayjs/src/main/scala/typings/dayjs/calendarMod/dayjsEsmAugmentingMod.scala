package typings.dayjs.calendarMod

import typings.dayjs.esmMod.ConfigType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("dayjs/esm", JSImport.Namespace)
@js.native
object dayjsEsmAugmentingMod extends js.Object {
  
  @js.native
  trait Dayjs extends js.Object {
    
    def calendar(): String = js.native
    def calendar(referenceTime: js.UndefOr[ConfigType], formats: js.Object): String = js.native
    def calendar(referenceTime: ConfigType): String = js.native
  }
}
