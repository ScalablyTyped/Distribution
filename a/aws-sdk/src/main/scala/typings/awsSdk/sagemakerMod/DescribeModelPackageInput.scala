package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeModelPackageInput extends js.Object {
  /**
    * The name of the model package to describe.
    */
  var ModelPackageName: ArnOrName = js.native
}

object DescribeModelPackageInput {
  @scala.inline
  def apply(ModelPackageName: ArnOrName): DescribeModelPackageInput = {
    val __obj = js.Dynamic.literal(ModelPackageName = ModelPackageName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeModelPackageInput]
  }
}

