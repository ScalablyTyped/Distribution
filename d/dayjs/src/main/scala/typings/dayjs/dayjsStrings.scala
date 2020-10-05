package typings.dayjs

import typings.dayjs.isoWeekMod.ISOUnitType
import typings.dayjs.mod.OpUnitType
import typings.dayjs.mod.QUnitType
import typings.dayjs.mod.UnitType
import typings.dayjs.mod.UnitTypeShort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dayjsStrings {
  @js.native
  sealed trait M
    extends ISOUnitType
       with OpUnitType
       with QUnitType
       with UnitType
       with UnitTypeShort
  
  @js.native
  sealed trait Q extends QUnitType
  
  @js.native
  sealed trait d
    extends ISOUnitType
       with OpUnitType
       with QUnitType
       with UnitType
       with UnitTypeShort
  
  @js.native
  sealed trait date
    extends ISOUnitType
       with OpUnitType
       with QUnitType
       with UnitType
  
  @js.native
  sealed trait day
    extends ISOUnitType
       with OpUnitType
       with QUnitType
       with UnitType
  
  @js.native
  sealed trait h
    extends ISOUnitType
       with OpUnitType
       with QUnitType
       with UnitType
       with UnitTypeShort
  
  @js.native
  sealed trait hour
    extends ISOUnitType
       with OpUnitType
       with QUnitType
       with UnitType
  
  @js.native
  sealed trait isoWeek extends ISOUnitType
  
  @js.native
  sealed trait m_
    extends ISOUnitType
       with OpUnitType
       with QUnitType
       with UnitType
       with UnitTypeShort
  
  @js.native
  sealed trait millisecond
    extends ISOUnitType
       with OpUnitType
       with QUnitType
       with UnitType
  
  @js.native
  sealed trait minute
    extends ISOUnitType
       with OpUnitType
       with QUnitType
       with UnitType
  
  @js.native
  sealed trait month
    extends ISOUnitType
       with OpUnitType
       with QUnitType
       with UnitType
  
  @js.native
  sealed trait ms
    extends ISOUnitType
       with OpUnitType
       with QUnitType
       with UnitType
       with UnitTypeShort
  
  @js.native
  sealed trait quarter extends QUnitType
  
  @js.native
  sealed trait s
    extends ISOUnitType
       with OpUnitType
       with QUnitType
       with UnitType
       with UnitTypeShort
  
  @js.native
  sealed trait second
    extends ISOUnitType
       with OpUnitType
       with QUnitType
       with UnitType
  
  @js.native
  sealed trait w extends OpUnitType
  
  @js.native
  sealed trait week extends OpUnitType
  
  @js.native
  sealed trait y
    extends ISOUnitType
       with OpUnitType
       with QUnitType
       with UnitType
       with UnitTypeShort
  
  @js.native
  sealed trait year
    extends ISOUnitType
       with OpUnitType
       with QUnitType
       with UnitType
  
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
  def isoWeek: isoWeek = "isoWeek".asInstanceOf[isoWeek]
  @scala.inline
  def m_ : m_ = "m".asInstanceOf[m_]
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

