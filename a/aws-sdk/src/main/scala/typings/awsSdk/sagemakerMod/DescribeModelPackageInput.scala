package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeModelPackageInput extends js.Object {
  
  /**
    * The name of the model package to describe.
    */
  var ModelPackageName: VersionedArnOrName = js.native
}
object DescribeModelPackageInput {
  
  @scala.inline
  def apply(ModelPackageName: VersionedArnOrName): DescribeModelPackageInput = {
    val __obj = js.Dynamic.literal(ModelPackageName = ModelPackageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeModelPackageInput]
  }
  
  @scala.inline
  implicit class DescribeModelPackageInputOps[Self <: DescribeModelPackageInput] (val x: Self) extends AnyVal {
    
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
    def setModelPackageName(value: VersionedArnOrName): Self = this.set("ModelPackageName", value.asInstanceOf[js.Any])
  }
}
