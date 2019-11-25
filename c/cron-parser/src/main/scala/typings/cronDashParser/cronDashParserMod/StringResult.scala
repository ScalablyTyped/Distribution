package typings.cronDashParser.cronDashParserMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringResult extends js.Object {
  var errors: StringDictionary[String]
  var expressions: js.Array[CronExpression]
  var variables: StringDictionary[String]
}

object StringResult {
  @scala.inline
  def apply(
    errors: StringDictionary[String],
    expressions: js.Array[CronExpression],
    variables: StringDictionary[String]
  ): StringResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], expressions = expressions.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StringResult]
  }
}

