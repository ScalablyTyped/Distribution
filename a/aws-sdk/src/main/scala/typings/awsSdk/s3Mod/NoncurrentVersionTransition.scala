package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoncurrentVersionTransition extends js.Object {
  
  /**
    * Specifies the number of days an object is noncurrent before Amazon S3 can perform the associated action. For information about the noncurrent days calculations, see How Amazon S3 Calculates How Long an Object Has Been Noncurrent in the Amazon Simple Storage Service Developer Guide.
    */
  var NoncurrentDays: js.UndefOr[Days] = js.native
  
  /**
    * The class of storage used to store the object.
    */
  var StorageClass: js.UndefOr[TransitionStorageClass] = js.native
}
object NoncurrentVersionTransition {
  
  @scala.inline
  def apply(): NoncurrentVersionTransition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoncurrentVersionTransition]
  }
  
  @scala.inline
  implicit class NoncurrentVersionTransitionOps[Self <: NoncurrentVersionTransition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNoncurrentDays(value: Days): Self = this.set("NoncurrentDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoncurrentDays: Self = this.set("NoncurrentDays", js.undefined)
    
    @scala.inline
    def setStorageClass(value: TransitionStorageClass): Self = this.set("StorageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageClass: Self = this.set("StorageClass", js.undefined)
  }
}
