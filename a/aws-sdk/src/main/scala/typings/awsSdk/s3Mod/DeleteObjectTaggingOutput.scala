package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteObjectTaggingOutput extends StObject {
  
  /**
    * The versionId of the object the tag-set was removed from.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}
object DeleteObjectTaggingOutput {
  
  inline def apply(): DeleteObjectTaggingOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteObjectTaggingOutput]
  }
  
  extension [Self <: DeleteObjectTaggingOutput](x: Self) {
    
    inline def setVersionId(value: ObjectVersionId): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
