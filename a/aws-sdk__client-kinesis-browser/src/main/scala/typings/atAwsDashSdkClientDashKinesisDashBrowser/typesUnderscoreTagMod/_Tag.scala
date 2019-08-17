package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreTagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Tag extends js.Object {
  /**
    * <p>A unique identifier for the tag. Maximum length: 128 characters. Valid characters: Unicode letters, digits, white space, _ . / = + - % @</p>
    */
  var Key: String
  /**
    * <p>An optional string, typically used to describe or define the tag. Maximum length: 256 characters. Valid characters: Unicode letters, digits, white space, _ . / = + - % @</p>
    */
  var Value: js.UndefOr[String] = js.undefined
}

object _Tag {
  @scala.inline
  def apply(Key: String, Value: String = null): _Tag = {
    val __obj = js.Dynamic.literal(Key = Key)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[_Tag]
  }
}

