package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerSideEncryptionConfiguration extends js.Object {
  /**
    * Container for information about a particular server-side encryption configuration rule.
    */
  var Rules: ServerSideEncryptionRules = js.native
}

object ServerSideEncryptionConfiguration {
  @scala.inline
  def apply(Rules: ServerSideEncryptionRules): ServerSideEncryptionConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerSideEncryptionConfiguration]
  }
}

