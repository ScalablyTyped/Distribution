package typings.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCorsPolicyOutput extends js.Object {
  /**
    * The CORS policy assigned to the container.
    */
  var CorsPolicy: typings.awsSdk.mediastoreMod.CorsPolicy = js.native
}

object GetCorsPolicyOutput {
  @scala.inline
  def apply(CorsPolicy: CorsPolicy): GetCorsPolicyOutput = {
    val __obj = js.Dynamic.literal(CorsPolicy = CorsPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCorsPolicyOutput]
  }
}

