package typings.awsSdkRoute53IdNormalizerMiddleware.mod

import typings.awsSdkRoute53IdNormalizerMiddleware.AnonAliasTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Change extends js.Object {
  var ResourceRecordSet: AnonAliasTarget
}

object Change {
  @scala.inline
  def apply(ResourceRecordSet: AnonAliasTarget): Change = {
    val __obj = js.Dynamic.literal(ResourceRecordSet = ResourceRecordSet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Change]
  }
}

