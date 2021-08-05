package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectIdentifier extends StObject {
  
  /**
    * Key name of the object to delete.
    */
  var Key: ObjectKey
  
  /**
    * VersionId for the specific version of the object to delete.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}
object ObjectIdentifier {
  
  inline def apply(Key: ObjectKey): ObjectIdentifier = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectIdentifier]
  }
  
  extension [Self <: ObjectIdentifier](x: Self) {
    
    inline def setKey(value: ObjectKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setVersionId(value: ObjectVersionId): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
