package typings.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutLifecycleConfigurationRequest extends StObject {
  
  /**
    * The ID of the file system for which you are creating the LifecycleConfiguration object (String).
    */
  var FileSystemId: typings.awsSdk.efsMod.FileSystemId
  
  /**
    * An array of LifecyclePolicy objects that define the file system's LifecycleConfiguration object. A LifecycleConfiguration object tells lifecycle management when to transition files from the Standard storage class to the Infrequent Access storage class.
    */
  var LifecyclePolicies: typings.awsSdk.efsMod.LifecyclePolicies
}
object PutLifecycleConfigurationRequest {
  
  @scala.inline
  def apply(FileSystemId: FileSystemId, LifecyclePolicies: LifecyclePolicies): PutLifecycleConfigurationRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any], LifecyclePolicies = LifecyclePolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutLifecycleConfigurationRequest]
  }
  
  @scala.inline
  implicit class PutLifecycleConfigurationRequestMutableBuilder[Self <: PutLifecycleConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecyclePolicies(value: LifecyclePolicies): Self = StObject.set(x, "LifecyclePolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecyclePoliciesVarargs(value: LifecyclePolicy*): Self = StObject.set(x, "LifecyclePolicies", js.Array(value :_*))
  }
}
