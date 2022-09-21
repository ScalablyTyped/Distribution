package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProjectRequest extends StObject {
  
  /**
    * Use this parameter if the project will use client-side evaluation powered by AppConfig. Client-side evaluation allows your application to assign variations to user sessions locally instead of by calling the EvaluateFeature operation. This mitigates the latency and availability risks that come with an API call. allows you to This parameter is a structure that contains information about the AppConfig application that will be used for client-side evaluation.
    */
  var appConfigResource: js.UndefOr[ProjectAppConfigResourceConfig] = js.undefined
  
  /**
    * An optional description of the project.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The name or ARN of the project to update.
    */
  var project: ProjectRef
}
object UpdateProjectRequest {
  
  inline def apply(project: ProjectRef): UpdateProjectRequest = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProjectRequest]
  }
  
  extension [Self <: UpdateProjectRequest](x: Self) {
    
    inline def setAppConfigResource(value: ProjectAppConfigResourceConfig): Self = StObject.set(x, "appConfigResource", value.asInstanceOf[js.Any])
    
    inline def setAppConfigResourceUndefined: Self = StObject.set(x, "appConfigResource", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setProject(value: ProjectRef): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}
