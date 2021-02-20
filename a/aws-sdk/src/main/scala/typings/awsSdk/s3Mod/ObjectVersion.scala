package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectVersion extends StObject {
  
  /**
    * The entity tag is an MD5 hash of that version of the object.
    */
  var ETag: js.UndefOr[typings.awsSdk.s3Mod.ETag] = js.native
  
  /**
    * Specifies whether the object is (true) or is not (false) the latest version of an object.
    */
  var IsLatest: js.UndefOr[typings.awsSdk.s3Mod.IsLatest] = js.native
  
  /**
    * The object key.
    */
  var Key: js.UndefOr[ObjectKey] = js.native
  
  /**
    * Date and time the object was last modified.
    */
  var LastModified: js.UndefOr[typings.awsSdk.s3Mod.LastModified] = js.native
  
  /**
    * Specifies the owner of the object.
    */
  var Owner: js.UndefOr[typings.awsSdk.s3Mod.Owner] = js.native
  
  /**
    * Size in bytes of the object.
    */
  var Size: js.UndefOr[typings.awsSdk.s3Mod.Size] = js.native
  
  /**
    * The class of storage used to store the object.
    */
  var StorageClass: js.UndefOr[ObjectVersionStorageClass] = js.native
  
  /**
    * Version ID of an object.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}
object ObjectVersion {
  
  @scala.inline
  def apply(): ObjectVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectVersion]
  }
  
  @scala.inline
  implicit class ObjectVersionMutableBuilder[Self <: ObjectVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setETag(value: ETag): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    @scala.inline
    def setIsLatest(value: IsLatest): Self = StObject.set(x, "IsLatest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLatestUndefined: Self = StObject.set(x, "IsLatest", js.undefined)
    
    @scala.inline
    def setKey(value: ObjectKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setLastModified(value: LastModified): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    
    @scala.inline
    def setOwner(value: Owner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    @scala.inline
    def setSize(value: Size): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
    
    @scala.inline
    def setStorageClass(value: ObjectVersionStorageClass): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
    
    @scala.inline
    def setVersionId(value: ObjectVersionId): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
