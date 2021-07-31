package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserStorageMetadata extends StObject {
  
  /**
    * The storage for a user.
    */
  var StorageRule: js.UndefOr[StorageRuleType] = js.undefined
  
  /**
    * The amount of storage used, in bytes.
    */
  var StorageUtilizedInBytes: js.UndefOr[SizeType] = js.undefined
}
object UserStorageMetadata {
  
  @scala.inline
  def apply(): UserStorageMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserStorageMetadata]
  }
  
  @scala.inline
  implicit class UserStorageMetadataMutableBuilder[Self <: UserStorageMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStorageRule(value: StorageRuleType): Self = StObject.set(x, "StorageRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageRuleUndefined: Self = StObject.set(x, "StorageRule", js.undefined)
    
    @scala.inline
    def setStorageUtilizedInBytes(value: SizeType): Self = StObject.set(x, "StorageUtilizedInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageUtilizedInBytesUndefined: Self = StObject.set(x, "StorageUtilizedInBytes", js.undefined)
  }
}
