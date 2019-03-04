package typings
package cronDashParserLib.cronDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringResult extends js.Object {
  var errors: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var expressions: js.Array[CronExpression]
  var variables: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object StringResult {
  @scala.inline
  def apply(
    errors: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    expressions: js.Array[CronExpression],
    variables: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): StringResult = {
    val __obj = js.Dynamic.literal(errors = errors, expressions = expressions, variables = variables)
  
    __obj.asInstanceOf[StringResult]
  }
}

