package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutObjectTaggingOutput extends StObject {
  
  /**
    * The versionId of the object the tag-set was added to.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}
object PutObjectTaggingOutput {
  
  @scala.inline
  def apply(): PutObjectTaggingOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutObjectTaggingOutput]
  }
  
  @scala.inline
  implicit class PutObjectTaggingOutputMutableBuilder[Self <: PutObjectTaggingOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVersionId(value: ObjectVersionId): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
