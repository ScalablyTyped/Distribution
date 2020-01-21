package typings.awsSdk.simpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Item extends js.Object {
  /**
    * 
    */
  var AlternateNameEncoding: js.UndefOr[String] = js.native
  /**
    * A list of attributes.
    */
  var Attributes: AttributeList = js.native
  /**
    * The name of the item.
    */
  var Name: String = js.native
}

object Item {
  @scala.inline
  def apply(Attributes: AttributeList, Name: String, AlternateNameEncoding: String = null): Item = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (AlternateNameEncoding != null) __obj.updateDynamic("AlternateNameEncoding")(AlternateNameEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
}

