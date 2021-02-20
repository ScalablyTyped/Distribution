package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectIdentifier extends StObject {
  
  /**
    * Key name of the object to delete.
    */
  var Key: ObjectKey = js.native
  
  /**
    * VersionId for the specific version of the object to delete.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}
object ObjectIdentifier {
  
  @scala.inline
  def apply(Key: ObjectKey): ObjectIdentifier = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectIdentifier]
  }
  
  @scala.inline
  implicit class ObjectIdentifierMutableBuilder[Self <: ObjectIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: ObjectKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionId(value: ObjectVersionId): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
