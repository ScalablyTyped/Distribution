package typings.cronParser.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CronDate extends js.Object {
  
  def addDay(): Unit = js.native
  
  def addHour(): Unit = js.native
  
  def addMinute(): Unit = js.native
  
  def addMonth(): Unit = js.native
  
  def addSecond(): Unit = js.native
  
  def addYear(): Unit = js.native
  
  def getDate(): Double = js.native
  
  def getDay(): Double = js.native
  
  def getFullYear(): Double = js.native
  
  def getHours(): Double = js.native
  
  def getMilliseconds(): Double = js.native
  
  def getMinutes(): Double = js.native
  
  def getMonth(): Double = js.native
  
  def getSeconds(): Double = js.native
  
  def getTime(): Double = js.native
  
  def getUTCDate(): Double = js.native
  
  def getUTCDay(): Double = js.native
  
  def getUTCFullYear(): Double = js.native
  
  def getUTCHours(): Double = js.native
  
  def getUTCMinutes(): Double = js.native
  
  def getUTCMonth(): Double = js.native
  
  def getUTCSeconds(): Double = js.native
  
  def setDate(d: Double): Unit = js.native
  
  def setDay(d: Double): Unit = js.native
  
  def setFullYear(y: Double): Unit = js.native
  
  def setHours(h: Double): Unit = js.native
  
  def setMilliseconds(s: Double): Unit = js.native
  
  def setMinutes(m: Double): Unit = js.native
  
  def setMonth(m: Double): Unit = js.native
  
  def setSeconds(s: Double): Unit = js.native
  
  def subtractDay(): Unit = js.native
  
  def subtractHour(): Unit = js.native
  
  def subtractMinute(): Unit = js.native
  
  def subtractMonth(): Unit = js.native
  
  def subtractSecond(): Unit = js.native
  
  def subtractYear(): Unit = js.native
  
  def toDate(): Date = js.native
  
  def toISOString(): String = js.native
  
  def toJSON(): String = js.native
}
object CronDate {
  
  @scala.inline
  def apply(
    addDay: () => Unit,
    addHour: () => Unit,
    addMinute: () => Unit,
    addMonth: () => Unit,
    addSecond: () => Unit,
    addYear: () => Unit,
    getDate: () => Double,
    getDay: () => Double,
    getFullYear: () => Double,
    getHours: () => Double,
    getMilliseconds: () => Double,
    getMinutes: () => Double,
    getMonth: () => Double,
    getSeconds: () => Double,
    getTime: () => Double,
    getUTCDate: () => Double,
    getUTCDay: () => Double,
    getUTCFullYear: () => Double,
    getUTCHours: () => Double,
    getUTCMinutes: () => Double,
    getUTCMonth: () => Double,
    getUTCSeconds: () => Double,
    setDate: Double => Unit,
    setDay: Double => Unit,
    setFullYear: Double => Unit,
    setHours: Double => Unit,
    setMilliseconds: Double => Unit,
    setMinutes: Double => Unit,
    setMonth: Double => Unit,
    setSeconds: Double => Unit,
    subtractDay: () => Unit,
    subtractHour: () => Unit,
    subtractMinute: () => Unit,
    subtractMonth: () => Unit,
    subtractSecond: () => Unit,
    subtractYear: () => Unit,
    toDate: () => Date,
    toISOString: () => String,
    toJSON: () => String
  ): CronDate = {
    val __obj = js.Dynamic.literal(addDay = js.Any.fromFunction0(addDay), addHour = js.Any.fromFunction0(addHour), addMinute = js.Any.fromFunction0(addMinute), addMonth = js.Any.fromFunction0(addMonth), addSecond = js.Any.fromFunction0(addSecond), addYear = js.Any.fromFunction0(addYear), getDate = js.Any.fromFunction0(getDate), getDay = js.Any.fromFunction0(getDay), getFullYear = js.Any.fromFunction0(getFullYear), getHours = js.Any.fromFunction0(getHours), getMilliseconds = js.Any.fromFunction0(getMilliseconds), getMinutes = js.Any.fromFunction0(getMinutes), getMonth = js.Any.fromFunction0(getMonth), getSeconds = js.Any.fromFunction0(getSeconds), getTime = js.Any.fromFunction0(getTime), getUTCDate = js.Any.fromFunction0(getUTCDate), getUTCDay = js.Any.fromFunction0(getUTCDay), getUTCFullYear = js.Any.fromFunction0(getUTCFullYear), getUTCHours = js.Any.fromFunction0(getUTCHours), getUTCMinutes = js.Any.fromFunction0(getUTCMinutes), getUTCMonth = js.Any.fromFunction0(getUTCMonth), getUTCSeconds = js.Any.fromFunction0(getUTCSeconds), setDate = js.Any.fromFunction1(setDate), setDay = js.Any.fromFunction1(setDay), setFullYear = js.Any.fromFunction1(setFullYear), setHours = js.Any.fromFunction1(setHours), setMilliseconds = js.Any.fromFunction1(setMilliseconds), setMinutes = js.Any.fromFunction1(setMinutes), setMonth = js.Any.fromFunction1(setMonth), setSeconds = js.Any.fromFunction1(setSeconds), subtractDay = js.Any.fromFunction0(subtractDay), subtractHour = js.Any.fromFunction0(subtractHour), subtractMinute = js.Any.fromFunction0(subtractMinute), subtractMonth = js.Any.fromFunction0(subtractMonth), subtractSecond = js.Any.fromFunction0(subtractSecond), subtractYear = js.Any.fromFunction0(subtractYear), toDate = js.Any.fromFunction0(toDate), toISOString = js.Any.fromFunction0(toISOString), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[CronDate]
  }
  
  @scala.inline
  implicit class CronDateOps[Self <: CronDate] (val x: Self) extends AnyVal {
    
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
    def setAddDay(value: () => Unit): Self = this.set("addDay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAddHour(value: () => Unit): Self = this.set("addHour", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAddMinute(value: () => Unit): Self = this.set("addMinute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAddMonth(value: () => Unit): Self = this.set("addMonth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAddSecond(value: () => Unit): Self = this.set("addSecond", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAddYear(value: () => Unit): Self = this.set("addYear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDate(value: () => Double): Self = this.set("getDate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDay(value: () => Double): Self = this.set("getDay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFullYear(value: () => Double): Self = this.set("getFullYear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHours(value: () => Double): Self = this.set("getHours", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMilliseconds(value: () => Double): Self = this.set("getMilliseconds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMinutes(value: () => Double): Self = this.set("getMinutes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMonth(value: () => Double): Self = this.set("getMonth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSeconds(value: () => Double): Self = this.set("getSeconds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTime(value: () => Double): Self = this.set("getTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUTCDate(value: () => Double): Self = this.set("getUTCDate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUTCDay(value: () => Double): Self = this.set("getUTCDay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUTCFullYear(value: () => Double): Self = this.set("getUTCFullYear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUTCHours(value: () => Double): Self = this.set("getUTCHours", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUTCMinutes(value: () => Double): Self = this.set("getUTCMinutes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUTCMonth(value: () => Double): Self = this.set("getUTCMonth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUTCSeconds(value: () => Double): Self = this.set("getUTCSeconds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDate(value: Double => Unit): Self = this.set("setDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDay(value: Double => Unit): Self = this.set("setDay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFullYear(value: Double => Unit): Self = this.set("setFullYear", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHours(value: Double => Unit): Self = this.set("setHours", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMilliseconds(value: Double => Unit): Self = this.set("setMilliseconds", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMinutes(value: Double => Unit): Self = this.set("setMinutes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMonth(value: Double => Unit): Self = this.set("setMonth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSeconds(value: Double => Unit): Self = this.set("setSeconds", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubtractDay(value: () => Unit): Self = this.set("subtractDay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSubtractHour(value: () => Unit): Self = this.set("subtractHour", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSubtractMinute(value: () => Unit): Self = this.set("subtractMinute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSubtractMonth(value: () => Unit): Self = this.set("subtractMonth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSubtractSecond(value: () => Unit): Self = this.set("subtractSecond", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSubtractYear(value: () => Unit): Self = this.set("subtractYear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToDate(value: () => Date): Self = this.set("toDate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToISOString(value: () => String): Self = this.set("toISOString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToJSON(value: () => String): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
}
