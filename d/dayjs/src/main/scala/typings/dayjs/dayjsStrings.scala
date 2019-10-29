package typings.dayjs

import typings.dayjs.dayjsMod.OpUnitType
import typings.dayjs.dayjsMod.QUnitType
import typings.dayjs.dayjsMod.UnitType
import typings.dayjs.dayjsMod.UnitTypeShort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object dayjsStrings {
  @js.native
  sealed trait M extends UnitTypeShort
  
  @js.native
  sealed trait Q extends QUnitType
  
  @js.native
  sealed trait d extends UnitTypeShort
  
  @js.native
  sealed trait date extends UnitType
  
  @js.native
  sealed trait day extends UnitType
  
  @js.native
  sealed trait h extends UnitTypeShort
  
  @js.native
  sealed trait hour extends UnitType
  
  @js.native
  sealed trait m extends UnitTypeShort
  
  @js.native
  sealed trait millisecond extends UnitType
  
  @js.native
  sealed trait minute extends UnitType
  
  @js.native
  sealed trait month extends UnitType
  
  @js.native
  sealed trait ms extends UnitTypeShort
  
  @js.native
  sealed trait quarter extends QUnitType
  
  @js.native
  sealed trait s extends UnitTypeShort
  
  @js.native
  sealed trait second extends UnitType
  
  @js.native
  sealed trait w extends OpUnitType
  
  @js.native
  sealed trait week extends OpUnitType
  
  @js.native
  sealed trait y extends UnitTypeShort
  
  @js.native
  sealed trait year extends UnitType
  
  @scala.inline
  def M: M = "M".asInstanceOf[M]
  @scala.inline
  def Q: Q = "Q".asInstanceOf[Q]
  @scala.inline
  def d: d = "d".asInstanceOf[d]
  @scala.inline
  def date: date = "date".asInstanceOf[date]
  @scala.inline
  def day: day = "day".asInstanceOf[day]
  @scala.inline
  def h: h = "h".asInstanceOf[h]
  @scala.inline
  def hour: hour = "hour".asInstanceOf[hour]
  @scala.inline
  def m: m = "m".asInstanceOf[m]
  @scala.inline
  def millisecond: millisecond = "millisecond".asInstanceOf[millisecond]
  @scala.inline
  def minute: minute = "minute".asInstanceOf[minute]
  @scala.inline
  def month: month = "month".asInstanceOf[month]
  @scala.inline
  def ms: ms = "ms".asInstanceOf[ms]
  @scala.inline
  def quarter: quarter = "quarter".asInstanceOf[quarter]
  @scala.inline
  def s: s = "s".asInstanceOf[s]
  @scala.inline
  def second: second = "second".asInstanceOf[second]
  @scala.inline
  def w: w = "w".asInstanceOf[w]
  @scala.inline
  def week: week = "week".asInstanceOf[week]
  @scala.inline
  def y: y = "y".asInstanceOf[y]
  @scala.inline
  def year: year = "year".asInstanceOf[year]
}

