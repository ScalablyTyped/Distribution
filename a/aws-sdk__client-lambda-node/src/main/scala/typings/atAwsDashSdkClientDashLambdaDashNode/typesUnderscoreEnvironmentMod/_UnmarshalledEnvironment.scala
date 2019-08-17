package typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreEnvironmentMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledEnvironment extends _Environment {
  /**
    * <p>Environment variable key-value pairs.</p>
    */
  @JSName("Variables")
  var Variables__UnmarshalledEnvironment: js.UndefOr[StringDictionary[String]] = js.undefined
}

object _UnmarshalledEnvironment {
  @scala.inline
  def apply(Variables: StringDictionary[String] = null): _UnmarshalledEnvironment = {
    val __obj = js.Dynamic.literal()
    if (Variables != null) __obj.updateDynamic("Variables")(Variables)
    __obj.asInstanceOf[_UnmarshalledEnvironment]
  }
}

