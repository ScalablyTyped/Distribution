package typings.dayjs.isSameOrAfterMod

import typings.dayjs.esmMod.ConfigType
import typings.dayjs.esmMod.OpUnitType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("dayjs/esm", JSImport.Namespace)
@js.native
object dayjsEsmAugmentingMod extends js.Object {
  
  @js.native
  trait Dayjs extends js.Object {
    
    def isSameOrAfter(date: ConfigType): Boolean = js.native
    def isSameOrAfter(date: ConfigType, unit: OpUnitType): Boolean = js.native
  }
}
