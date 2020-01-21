package typings.awsSdkClientLambdaNode.typesEnvironmentMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledEnvironment extends Environment {
  /**
    * <p>Environment variable key-value pairs.</p>
    */
  @JSName("Variables")
  var Variables_UnmarshalledEnvironment: js.UndefOr[StringDictionary[String]] = js.undefined
}

object UnmarshalledEnvironment {
  @scala.inline
  def apply(Variables: StringDictionary[String] = null): UnmarshalledEnvironment = {
    val __obj = js.Dynamic.literal()
    if (Variables != null) __obj.updateDynamic("Variables")(Variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledEnvironment]
  }
}

