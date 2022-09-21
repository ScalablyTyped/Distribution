package typings.awsSdk.iottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneSummary extends StObject {
  
  /**
    * The ARN of the scene.
    */
  var arn: TwinMakerArn
  
  /**
    * The relative path that specifies the location of the content definition file.
    */
  var contentLocation: S3Url
  
  /**
    * The date and time when the scene was created.
    */
  var creationDateTime: js.Date
  
  /**
    * The scene description.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The ID of the scene.
    */
  var sceneId: Id
  
  /**
    * The date and time when the scene was last updated.
    */
  var updateDateTime: js.Date
}
object SceneSummary {
  
  inline def apply(
    arn: TwinMakerArn,
    contentLocation: S3Url,
    creationDateTime: js.Date,
    sceneId: Id,
    updateDateTime: js.Date
  ): SceneSummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], contentLocation = contentLocation.asInstanceOf[js.Any], creationDateTime = creationDateTime.asInstanceOf[js.Any], sceneId = sceneId.asInstanceOf[js.Any], updateDateTime = updateDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneSummary]
  }
  
  extension [Self <: SceneSummary](x: Self) {
    
    inline def setArn(value: TwinMakerArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setContentLocation(value: S3Url): Self = StObject.set(x, "contentLocation", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setSceneId(value: Id): Self = StObject.set(x, "sceneId", value.asInstanceOf[js.Any])
    
    inline def setUpdateDateTime(value: js.Date): Self = StObject.set(x, "updateDateTime", value.asInstanceOf[js.Any])
  }
}
