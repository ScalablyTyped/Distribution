package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateModelPackageOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the new model package.
    */
  var ModelPackageArn: typings.awsSdk.sagemakerMod.ModelPackageArn = js.native
}

object CreateModelPackageOutput {
  @scala.inline
  def apply(ModelPackageArn: ModelPackageArn): CreateModelPackageOutput = {
    val __obj = js.Dynamic.literal(ModelPackageArn = ModelPackageArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelPackageOutput]
  }
}

