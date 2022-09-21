package typings.typescriptNn5FuAjk.Intl

import typings.typescriptNn5FuAjk.Array
import typings.typescriptNn5FuAjk.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateTimeFormat extends StObject {
  
  def format(): String = js.native
  def format(date: Double): String = js.native
  def format(date: Date): String = js.native
  
  def formatRange(startDate: js.BigInt, endDate: js.BigInt): String = js.native
  def formatRange(startDate: js.BigInt, endDate: Double): String = js.native
  def formatRange(startDate: js.BigInt, endDate: Date): String = js.native
  def formatRange(startDate: Double, endDate: js.BigInt): String = js.native
  def formatRange(startDate: Double, endDate: Double): String = js.native
  def formatRange(startDate: Double, endDate: Date): String = js.native
  def formatRange(startDate: Date, endDate: js.BigInt): String = js.native
  def formatRange(startDate: Date, endDate: Double): String = js.native
  def formatRange(startDate: Date, endDate: Date): String = js.native
  
  def formatRangeToParts(startDate: js.BigInt, endDate: js.BigInt): Array[DateTimeFormatPart] = js.native
  def formatRangeToParts(startDate: js.BigInt, endDate: Double): Array[DateTimeFormatPart] = js.native
  def formatRangeToParts(startDate: js.BigInt, endDate: Date): Array[DateTimeFormatPart] = js.native
  def formatRangeToParts(startDate: Double, endDate: js.BigInt): Array[DateTimeFormatPart] = js.native
  def formatRangeToParts(startDate: Double, endDate: Double): Array[DateTimeFormatPart] = js.native
  def formatRangeToParts(startDate: Double, endDate: Date): Array[DateTimeFormatPart] = js.native
  def formatRangeToParts(startDate: Date, endDate: js.BigInt): Array[DateTimeFormatPart] = js.native
  def formatRangeToParts(startDate: Date, endDate: Double): Array[DateTimeFormatPart] = js.native
  def formatRangeToParts(startDate: Date, endDate: Date): Array[DateTimeFormatPart] = js.native
  
  def formatToParts(): Array[DateTimeFormatPart] = js.native
  def formatToParts(date: Double): Array[DateTimeFormatPart] = js.native
  def formatToParts(date: Date): Array[DateTimeFormatPart] = js.native
  
  def resolvedOptions(): ResolvedDateTimeFormatOptions = js.native
}
