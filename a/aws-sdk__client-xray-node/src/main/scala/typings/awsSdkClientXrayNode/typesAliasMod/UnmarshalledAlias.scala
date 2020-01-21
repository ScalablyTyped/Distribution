package typings.awsSdkClientXrayNode.typesAliasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledAlias extends Alias {
  /**
    * <p>A list of names for the alias, including the canonical name.</p>
    */
  @JSName("Names")
  var Names_UnmarshalledAlias: js.UndefOr[js.Array[String]] = js.undefined
}

object UnmarshalledAlias {
  @scala.inline
  def apply(Name: String = null, Names: js.Array[String] = null, Type: String = null): UnmarshalledAlias = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Names != null) __obj.updateDynamic("Names")(Names.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledAlias]
  }
}

