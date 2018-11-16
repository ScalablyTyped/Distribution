package typings
package cronDashParserLib.cronDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CronExpression extends js.Object {
  /** Check if next suitable date exists */
  def hasNext(): scala.Boolean = js.native
  /** Check if previous suitable date exists */
  def hasPrev(): scala.Boolean = js.native
  /** Iterate over expression iterator */
  def iterate(steps: scala.Double): js.Array[CronDate] = js.native
  /** Iterate over expression iterator */
  def iterate(steps: scala.Double, callback: js.Function2[/* item */ CronDate, /* i */ scala.Double, _]): js.Array[CronDate] = js.native
  /** Find next suitable date */
  def next(): CronDate = js.native
  /** Parse input expression (async) */
  def parse(expression: java.lang.String): CronExpression = js.native
  /** Parse input expression (async) */
  def parse(expression: java.lang.String, options: ParserOptions): CronExpression = js.native
  /** Parse input expression (async) */
  def parse(expression: java.lang.String, options: ParserOptions, callback: js.Function0[_]): CronExpression = js.native
  /** Find previous suitable date */
  def prev(): CronDate = js.native
  /** Reset expression iterator state */
  def reset(): scala.Unit = js.native
}

