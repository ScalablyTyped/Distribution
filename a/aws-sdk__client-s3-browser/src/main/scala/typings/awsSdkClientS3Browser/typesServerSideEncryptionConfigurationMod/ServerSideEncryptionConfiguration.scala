package typings.awsSdkClientS3Browser.typesServerSideEncryptionConfigurationMod

import typings.awsSdkClientS3Browser.typesServerSideEncryptionRuleMod.ServerSideEncryptionRule
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerSideEncryptionConfiguration extends js.Object {
  /**
    * <p>Container for information about a particular server-side encryption configuration rule.</p>
    */
  var Rules: js.Array[ServerSideEncryptionRule] | Iterable[ServerSideEncryptionRule]
}

object ServerSideEncryptionConfiguration {
  @scala.inline
  def apply(Rules: js.Array[ServerSideEncryptionRule] | Iterable[ServerSideEncryptionRule]): ServerSideEncryptionConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerSideEncryptionConfiguration]
  }
}

