package typings.datejs.sugarpak

import typings.datejs.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOrientation extends IAddOrientation {
  
  def apr(): Date = js.native
  
  def april(): Date = js.native
  
  def aug(): Date = js.native
  
  def august(): Date = js.native
  
  def dec(): Date = js.native
  
  def december(): Date = js.native
  
  def feb(): Date = js.native
  
  def february(): Date = js.native
  
  def fri(): Date = js.native
  
  def friday(): Date = js.native
  
  def jan(): Date = js.native
  
  def january(): Date = js.native
  
  def jul(): Date = js.native
  
  def july(): Date = js.native
  
  // may
  def jun(): Date = js.native
  
  def june(): Date = js.native
  
  def mar(): Date = js.native
  
  def march(): Date = js.native
  
  def may(): Date = js.native
  
  def mon(): Date = js.native
  
  def monday(): Date = js.native
  
  def nov(): Date = js.native
  
  def november(): Date = js.native
  
  def oct(): Date = js.native
  
  def october(): Date = js.native
  
  def sat(): Date = js.native
  
  def saturday(): Date = js.native
  
  def sep(): Date = js.native
  
  def september(): Date = js.native
  
  def sun(): Date = js.native
  
  def sunday(): Date = js.native
  
  def thu(): Date = js.native
  
  def thursday(): Date = js.native
  
  def tue(): Date = js.native
  
  def tuesday(): Date = js.native
  
  def wed(): Date = js.native
  
  def wednesday(): Date = js.native
}
object IOrientation {
  
  @scala.inline
  def apply(
    apr: () => Date,
    april: () => Date,
    aug: () => Date,
    august: () => Date,
    day: () => Date,
    days: () => Date,
    dec: () => Date,
    december: () => Date,
    feb: () => Date,
    february: () => Date,
    fri: () => Date,
    friday: () => Date,
    hour: () => Date,
    hours: () => Date,
    jan: () => Date,
    january: () => Date,
    jul: () => Date,
    july: () => Date,
    jun: () => Date,
    june: () => Date,
    mar: () => Date,
    march: () => Date,
    may: () => Date,
    millisecond: () => Date,
    milliseconds: () => Date,
    minute: () => Date,
    minutes: () => Date,
    mon: () => Date,
    monday: () => Date,
    month: () => Date,
    months: () => Date,
    nov: () => Date,
    november: () => Date,
    oct: () => Date,
    october: () => Date,
    sat: () => Date,
    saturday: () => Date,
    second: () => Date,
    seconds: () => Date,
    sep: () => Date,
    september: () => Date,
    sun: () => Date,
    sunday: () => Date,
    thu: () => Date,
    thursday: () => Date,
    tue: () => Date,
    tuesday: () => Date,
    wed: () => Date,
    wednesday: () => Date,
    week: () => Date,
    weeks: () => Date,
    year: () => Date,
    years: () => Date
  ): IOrientation = {
    val __obj = js.Dynamic.literal(apr = js.Any.fromFunction0(apr), april = js.Any.fromFunction0(april), aug = js.Any.fromFunction0(aug), august = js.Any.fromFunction0(august), day = js.Any.fromFunction0(day), days = js.Any.fromFunction0(days), dec = js.Any.fromFunction0(dec), december = js.Any.fromFunction0(december), feb = js.Any.fromFunction0(feb), february = js.Any.fromFunction0(february), fri = js.Any.fromFunction0(fri), friday = js.Any.fromFunction0(friday), hour = js.Any.fromFunction0(hour), hours = js.Any.fromFunction0(hours), jan = js.Any.fromFunction0(jan), january = js.Any.fromFunction0(january), jul = js.Any.fromFunction0(jul), july = js.Any.fromFunction0(july), jun = js.Any.fromFunction0(jun), june = js.Any.fromFunction0(june), mar = js.Any.fromFunction0(mar), march = js.Any.fromFunction0(march), may = js.Any.fromFunction0(may), millisecond = js.Any.fromFunction0(millisecond), milliseconds = js.Any.fromFunction0(milliseconds), minute = js.Any.fromFunction0(minute), minutes = js.Any.fromFunction0(minutes), mon = js.Any.fromFunction0(mon), monday = js.Any.fromFunction0(monday), month = js.Any.fromFunction0(month), months = js.Any.fromFunction0(months), nov = js.Any.fromFunction0(nov), november = js.Any.fromFunction0(november), oct = js.Any.fromFunction0(oct), october = js.Any.fromFunction0(october), sat = js.Any.fromFunction0(sat), saturday = js.Any.fromFunction0(saturday), second = js.Any.fromFunction0(second), seconds = js.Any.fromFunction0(seconds), sep = js.Any.fromFunction0(sep), september = js.Any.fromFunction0(september), sun = js.Any.fromFunction0(sun), sunday = js.Any.fromFunction0(sunday), thu = js.Any.fromFunction0(thu), thursday = js.Any.fromFunction0(thursday), tue = js.Any.fromFunction0(tue), tuesday = js.Any.fromFunction0(tuesday), wed = js.Any.fromFunction0(wed), wednesday = js.Any.fromFunction0(wednesday), week = js.Any.fromFunction0(week), weeks = js.Any.fromFunction0(weeks), year = js.Any.fromFunction0(year), years = js.Any.fromFunction0(years))
    __obj.asInstanceOf[IOrientation]
  }
  
  @scala.inline
  implicit class IOrientationOps[Self <: IOrientation] (val x: Self) extends AnyVal {
    
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
    def setApr(value: () => Date): Self = this.set("apr", js.Any.fromFunction0(value))
    
    @scala.inline
    def setApril(value: () => Date): Self = this.set("april", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAug(value: () => Date): Self = this.set("aug", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAugust(value: () => Date): Self = this.set("august", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDec(value: () => Date): Self = this.set("dec", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDecember(value: () => Date): Self = this.set("december", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFeb(value: () => Date): Self = this.set("feb", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFebruary(value: () => Date): Self = this.set("february", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFri(value: () => Date): Self = this.set("fri", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFriday(value: () => Date): Self = this.set("friday", js.Any.fromFunction0(value))
    
    @scala.inline
    def setJan(value: () => Date): Self = this.set("jan", js.Any.fromFunction0(value))
    
    @scala.inline
    def setJanuary(value: () => Date): Self = this.set("january", js.Any.fromFunction0(value))
    
    @scala.inline
    def setJul(value: () => Date): Self = this.set("jul", js.Any.fromFunction0(value))
    
    @scala.inline
    def setJuly(value: () => Date): Self = this.set("july", js.Any.fromFunction0(value))
    
    @scala.inline
    def setJun(value: () => Date): Self = this.set("jun", js.Any.fromFunction0(value))
    
    @scala.inline
    def setJune(value: () => Date): Self = this.set("june", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMar(value: () => Date): Self = this.set("mar", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMarch(value: () => Date): Self = this.set("march", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMay(value: () => Date): Self = this.set("may", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMon(value: () => Date): Self = this.set("mon", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMonday(value: () => Date): Self = this.set("monday", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNov(value: () => Date): Self = this.set("nov", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNovember(value: () => Date): Self = this.set("november", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOct(value: () => Date): Self = this.set("oct", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOctober(value: () => Date): Self = this.set("october", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSat(value: () => Date): Self = this.set("sat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSaturday(value: () => Date): Self = this.set("saturday", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSep(value: () => Date): Self = this.set("sep", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSeptember(value: () => Date): Self = this.set("september", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSun(value: () => Date): Self = this.set("sun", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSunday(value: () => Date): Self = this.set("sunday", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThu(value: () => Date): Self = this.set("thu", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThursday(value: () => Date): Self = this.set("thursday", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTue(value: () => Date): Self = this.set("tue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTuesday(value: () => Date): Self = this.set("tuesday", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWed(value: () => Date): Self = this.set("wed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWednesday(value: () => Date): Self = this.set("wednesday", js.Any.fromFunction0(value))
  }
}
