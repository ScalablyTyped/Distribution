package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class DescribePackageVersionResultOps[Self <: DescribePackageVersionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPackageVersion(value: PackageVersionDescription): Self = this.set("packageVersion", value.asInstanceOf[js.Any])
  }
}
