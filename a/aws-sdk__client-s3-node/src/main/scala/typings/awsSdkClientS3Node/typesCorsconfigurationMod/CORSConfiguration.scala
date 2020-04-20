package typings.awsSdkClientS3Node.typesCorsconfigurationMod

import typings.awsSdkClientS3Node.typesCorsruleMod.CORSRule
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CORSConfiguration extends js.Object {
  /**
    * _CORSRules shape
    */
  var CORSRules: js.Array[CORSRule] | Iterable[CORSRule]
}

object CORSConfiguration {
  @scala.inline
  def apply(CORSRules: js.Array[CORSRule] | Iterable[CORSRule]): CORSConfiguration = {
    val __obj = js.Dynamic.literal(CORSRules = CORSRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[CORSConfiguration]
  }
}

