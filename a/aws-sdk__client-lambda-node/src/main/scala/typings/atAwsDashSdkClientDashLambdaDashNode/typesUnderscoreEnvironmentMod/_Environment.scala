package typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreEnvironmentMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Environment extends js.Object {
  /**
    * <p>Environment variable key-value pairs.</p>
    */
  var Variables: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.undefined
}

object _Environment {
  @scala.inline
  def apply(Variables: StringDictionary[String] | (Iterable[js.Tuple2[String, String]]) = null): _Environment = {
    val __obj = js.Dynamic.literal()
    if (Variables != null) __obj.updateDynamic("Variables")(Variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Environment]
  }
}

