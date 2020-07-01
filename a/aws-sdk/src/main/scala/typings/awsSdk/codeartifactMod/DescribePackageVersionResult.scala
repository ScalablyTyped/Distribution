package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePackageVersionResult extends js.Object {
  /**
    *  A  PackageVersionDescription  object that contains information about the requested package version. 
    */
  var packageVersion: PackageVersionDescription = js.native
}

object DescribePackageVersionResult {
  @scala.inline
  def apply(packageVersion: PackageVersionDescription): DescribePackageVersionResult = {
    val __obj = js.Dynamic.literal(packageVersion = packageVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePackageVersionResult]
  }
}

