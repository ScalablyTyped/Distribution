package typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreAliasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledAlias extends _Alias {
  /**
    * <p>A list of names for the alias, including the canonical name.</p>
    */
  @JSName("Names")
  var Names__UnmarshalledAlias: js.UndefOr[js.Array[String]] = js.undefined
}

object _UnmarshalledAlias {
  @scala.inline
  def apply(Name: String = null, Names: js.Array[String] = null, Type: String = null): _UnmarshalledAlias = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Names != null) __obj.updateDynamic("Names")(Names.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledAlias]
  }
}

