package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestGridSessionArtifact extends StObject {
  
  /**
    * The file name of the artifact.
    */
  var filename: js.UndefOr[String] = js.native
  
  /**
    * The kind of artifact.
    */
  var `type`: js.UndefOr[TestGridSessionArtifactType] = js.native
  
  /**
    * A semi-stable URL to the content of the object.
    */
  var url: js.UndefOr[String] = js.native
}
object TestGridSessionArtifact {
  
  @scala.inline
  def apply(): TestGridSessionArtifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestGridSessionArtifact]
  }
  
  @scala.inline
  implicit class TestGridSessionArtifactMutableBuilder[Self <: TestGridSessionArtifact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    @scala.inline
    def setType(value: TestGridSessionArtifactType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
