package typings.awsSdkClientXrayNode.typesAliasMod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alias extends js.Object {
  /**
    * <p>The canonical name of the alias.</p>
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * <p>A list of names for the alias, including the canonical name.</p>
    */
  var Names: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
  /**
    * <p>The type of the alias.</p>
    */
  var Type: js.UndefOr[String] = js.undefined
}

object Alias {
  @scala.inline
  def apply(Name: String = null, Names: js.Array[String] | Iterable[String] = null, Type: String = null): Alias = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Names != null) __obj.updateDynamic("Names")(Names.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alias]
  }
}

