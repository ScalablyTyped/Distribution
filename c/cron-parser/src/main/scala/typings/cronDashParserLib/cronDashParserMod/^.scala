package typings
package cronDashParserLib.cronDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cron-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /** Wrapper for CronExpression.parse method */
  def parseExpression(expression: java.lang.String): cronDashParserLib.cronDashParserMod.CronExpression = js.native
  def parseExpression(expression: java.lang.String, options: cronDashParserLib.cronDashParserMod.ParserOptions): cronDashParserLib.cronDashParserMod.CronExpression = js.native
  /** Parse crontab file */
  def parseFile(
    filePath: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* data */ cronDashParserLib.cronDashParserMod.StringResult, _]
  ): scala.Unit = js.native
  /** Parse content string */
  def parseString(data: java.lang.String): cronDashParserLib.cronDashParserMod.StringResult = js.native
}

