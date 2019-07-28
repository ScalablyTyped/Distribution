package typings.cronDashParser.cronDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cron-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /** Wrapper for CronExpression.parse method */
  def parseExpression(expression: String): CronExpression = js.native
  def parseExpression(expression: String, options: ParserOptions): CronExpression = js.native
  /** Parse crontab file */
  def parseFile(filePath: String, callback: js.Function2[/* err */ js.Any, /* data */ StringResult, _]): Unit = js.native
  /** Parse content string */
  def parseString(data: String): StringResult = js.native
}

