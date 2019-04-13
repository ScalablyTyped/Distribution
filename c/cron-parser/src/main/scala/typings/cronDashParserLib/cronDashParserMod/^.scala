package typings
package cronDashParserLib.cronDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cron-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /** Wrapper for CronExpression.parse method */
  def parseExpression(expression: java.lang.String): CronExpression = js.native
  def parseExpression(expression: java.lang.String, options: ParserOptions): CronExpression = js.native
  /** Parse crontab file */
  def parseFile(filePath: java.lang.String, callback: js.Function2[/* err */ js.Any, /* data */ StringResult, _]): scala.Unit = js.native
  /** Parse content string */
  def parseString(data: java.lang.String): StringResult = js.native
}

