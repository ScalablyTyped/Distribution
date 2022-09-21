package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoncurrentVersionTransition extends StObject {
  
  /**
    * Specifies how many noncurrent versions Amazon S3 will retain. If there are this many more recent noncurrent versions, Amazon S3 will take the associated action. For more information about noncurrent versions, see Lifecycle configuration elements in the Amazon S3 User Guide.
    */
  var NewerNoncurrentVersions: js.UndefOr[VersionCount] = js.undefined
  
  /**
    * Specifies the number of days an object is noncurrent before Amazon S3 can perform the associated action. For information about the noncurrent days calculations, see How Amazon S3 Calculates How Long an Object Has Been Noncurrent in the Amazon S3 User Guide.
    */
  var NoncurrentDays: js.UndefOr[Days] = js.undefined
  
  /**
    * The class of storage used to store the object.
    */
  var StorageClass: js.UndefOr[TransitionStorageClass] = js.undefined
}
object NoncurrentVersionTransition {
  
  inline def apply(): NoncurrentVersionTransition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoncurrentVersionTransition]
  }
  
  extension [Self <: NoncurrentVersionTransition](x: Self) {
    
    inline def setNewerNoncurrentVersions(value: VersionCount): Self = StObject.set(x, "NewerNoncurrentVersions", value.asInstanceOf[js.Any])
    
    inline def setNewerNoncurrentVersionsUndefined: Self = StObject.set(x, "NewerNoncurrentVersions", js.undefined)
    
    inline def setNoncurrentDays(value: Days): Self = StObject.set(x, "NoncurrentDays", value.asInstanceOf[js.Any])
    
    inline def setNoncurrentDaysUndefined: Self = StObject.set(x, "NoncurrentDays", js.undefined)
    
    inline def setStorageClass(value: TransitionStorageClass): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
    
    inline def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
  }
}
