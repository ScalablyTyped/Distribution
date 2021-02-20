package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteObjectTaggingOutput extends StObject {
  
  /**
    * The versionId of the object the tag-set was removed from.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}
object DeleteObjectTaggingOutput {
  
  @scala.inline
  def apply(): DeleteObjectTaggingOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteObjectTaggingOutput]
  }
  
  @scala.inline
  implicit class DeleteObjectTaggingOutputMutableBuilder[Self <: DeleteObjectTaggingOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVersionId(value: ObjectVersionId): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
