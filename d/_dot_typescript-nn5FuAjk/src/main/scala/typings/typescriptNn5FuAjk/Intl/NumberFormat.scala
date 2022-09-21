package typings.typescriptNn5FuAjk.Intl

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberFormat extends StObject {
  
  def format(value: js.BigInt): String = js.native
  def format(value: Double): String = js.native
  
  def formatRange(start: js.BigInt, end: js.BigInt): String = js.native
  def formatRange(start: js.BigInt, end: Double): String = js.native
  def formatRange(start: Double, end: js.BigInt): String = js.native
  def formatRange(start: Double, end: Double): String = js.native
  
  def formatRangeToParts(start: js.BigInt, end: js.BigInt): Array[NumberFormatPart] = js.native
  def formatRangeToParts(start: js.BigInt, end: Double): Array[NumberFormatPart] = js.native
  def formatRangeToParts(start: Double, end: js.BigInt): Array[NumberFormatPart] = js.native
  def formatRangeToParts(start: Double, end: Double): Array[NumberFormatPart] = js.native
  
  def formatToParts(): Array[NumberFormatPart] = js.native
  def formatToParts(number: js.BigInt): Array[NumberFormatPart] = js.native
  def formatToParts(number: Double): Array[NumberFormatPart] = js.native
  
  def resolvedOptions(): ResolvedNumberFormatOptions = js.native
}
