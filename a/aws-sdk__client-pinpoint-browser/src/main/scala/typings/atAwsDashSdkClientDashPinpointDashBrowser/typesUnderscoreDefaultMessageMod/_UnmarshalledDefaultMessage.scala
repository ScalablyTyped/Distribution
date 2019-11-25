package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreDefaultMessageMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledDefaultMessage extends _DefaultMessage {
  /**
    * Default message substitutions. Can be overridden by individual address substitutions.
    */
  @JSName("Substitutions")
  var Substitutions__UnmarshalledDefaultMessage: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
}

object _UnmarshalledDefaultMessage {
  @scala.inline
  def apply(Body: String = null, Substitutions: StringDictionary[js.Array[String]] = null): _UnmarshalledDefaultMessage = {
    val __obj = js.Dynamic.literal()
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (Substitutions != null) __obj.updateDynamic("Substitutions")(Substitutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledDefaultMessage]
  }
}

