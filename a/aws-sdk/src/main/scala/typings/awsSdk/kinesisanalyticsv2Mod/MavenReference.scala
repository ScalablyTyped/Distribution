package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MavenReference extends StObject {
  
  /**
    * The artifact ID of the Maven reference.
    */
  var ArtifactId: MavenArtifactId
  
  /**
    * The group ID of the Maven reference.
    */
  var GroupId: MavenGroupId
  
  /**
    * The version of the Maven reference.
    */
  var Version: MavenVersion
}
object MavenReference {
  
  inline def apply(ArtifactId: MavenArtifactId, GroupId: MavenGroupId, Version: MavenVersion): MavenReference = {
    val __obj = js.Dynamic.literal(ArtifactId = ArtifactId.asInstanceOf[js.Any], GroupId = GroupId.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[MavenReference]
  }
  
  extension [Self <: MavenReference](x: Self) {
    
    inline def setArtifactId(value: MavenArtifactId): Self = StObject.set(x, "ArtifactId", value.asInstanceOf[js.Any])
    
    inline def setGroupId(value: MavenGroupId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: MavenVersion): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
