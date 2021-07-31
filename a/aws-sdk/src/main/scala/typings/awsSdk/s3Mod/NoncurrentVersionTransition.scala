package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoncurrentVersionTransition extends StObject {
  
  /**
    * Specifies the number of days an object is noncurrent before Amazon S3 can perform the associated action. For information about the noncurrent days calculations, see How Amazon S3 Calculates How Long an Object Has Been Noncurrent in the Amazon Simple Storage Service Developer Guide.
    */
  var NoncurrentDays: js.UndefOr[Days] = js.undefined
  
  /**
    * The class of storage used to store the object.
    */
  var StorageClass: js.UndefOr[TransitionStorageClass] = js.undefined
}
object NoncurrentVersionTransition {
  
  @scala.inline
  def apply(): NoncurrentVersionTransition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoncurrentVersionTransition]
  }
  
  @scala.inline
  implicit class NoncurrentVersionTransitionMutableBuilder[Self <: NoncurrentVersionTransition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNoncurrentDays(value: Days): Self = StObject.set(x, "NoncurrentDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoncurrentDaysUndefined: Self = StObject.set(x, "NoncurrentDays", js.undefined)
    
    @scala.inline
    def setStorageClass(value: TransitionStorageClass): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
  }
}
