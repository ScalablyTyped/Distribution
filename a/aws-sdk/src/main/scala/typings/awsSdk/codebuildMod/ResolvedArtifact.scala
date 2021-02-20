package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolvedArtifact extends StObject {
  
  /**
    * The identifier of the artifact.
    */
  var identifier: js.UndefOr[String] = js.native
  
  /**
    * The location of the artifact.
    */
  var location: js.UndefOr[String] = js.native
  
  /**
    * Specifies the type of artifact.
    */
  var `type`: js.UndefOr[ArtifactsType] = js.native
}
object ResolvedArtifact {
  
  @scala.inline
  def apply(): ResolvedArtifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolvedArtifact]
  }
  
  @scala.inline
  implicit class ResolvedArtifactMutableBuilder[Self <: ResolvedArtifact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setType(value: ArtifactsType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
