package typings.cronParser.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CronExpression extends js.Object {
  
  /** Check if next suitable date exists */
  def hasNext(): Boolean = js.native
  
  /** Check if previous suitable date exists */
  def hasPrev(): Boolean = js.native
  
  /** Iterate over expression iterator */
  def iterate(steps: Double): js.Array[CronDate] = js.native
  def iterate(steps: Double, callback: js.Function2[/* item */ CronDate, /* i */ Double, _]): js.Array[CronDate] = js.native
  
  /** Find next suitable date */
  def next(): CronDate = js.native
  
  /** Parse input expression (async) */
  def parse(expression: String): CronExpression = js.native
  def parse(expression: String, options: js.UndefOr[scala.Nothing], callback: js.Function0[_]): CronExpression = js.native
  def parse(expression: String, options: ParserOptions): CronExpression = js.native
  def parse(expression: String, options: ParserOptions, callback: js.Function0[_]): CronExpression = js.native
  
  /** Find previous suitable date */
  def prev(): CronDate = js.native
  
  /** Reset expression iterator state */
  def reset(): Unit = js.native
  def reset(resetDate: String): Unit = js.native
  def reset(resetDate: Double): Unit = js.native
  def reset(resetDate: Date): Unit = js.native
}
