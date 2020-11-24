package typings.dayjs.utcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("dayjs/esm", JSImport.Namespace)
@js.native
object dayjsEsmAugmentingMod extends js.Object {
  
  @js.native
  trait Dayjs extends js.Object {
    
    def isUTC(): Boolean = js.native
    
    def local(): Dayjs = js.native
    
    def utc(): Dayjs = js.native
    def utc(keepLocalTime: Boolean): Dayjs = js.native
    
    def utcOffset(offset: Double): Dayjs = js.native
    def utcOffset(offset: Double, keepLocalTime: Boolean): Dayjs = js.native
  }
}
