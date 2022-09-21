package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Project extends StObject {
  
  /**
    * The number of ongoing experiments currently in the project.
    */
  var activeExperimentCount: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of ongoing launches currently in the project.
    */
  var activeLaunchCount: js.UndefOr[Long] = js.undefined
  
  /**
    * This structure defines the configuration of how your application integrates with AppConfig to run client-side evaluation.
    */
  var appConfigResource: js.UndefOr[ProjectAppConfigResource] = js.undefined
  
  /**
    * The name or ARN of the project.
    */
  var arn: ProjectArn
  
  /**
    * The date and time that the project is created.
    */
  var createdTime: js.Date
  
  /**
    * A structure that contains information about where Evidently is to store evaluation events for longer term storage.
    */
  var dataDelivery: js.UndefOr[ProjectDataDelivery] = js.undefined
  
  /**
    * The user-entered description of the project.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The number of experiments currently in the project. This includes all experiments that have been created and not deleted, whether they are ongoing or not.
    */
  var experimentCount: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of features currently in the project.
    */
  var featureCount: js.UndefOr[Long] = js.undefined
  
  /**
    * The date and time that the project was most recently updated.
    */
  var lastUpdatedTime: js.Date
  
  /**
    * The number of launches currently in the project. This includes all launches that have been created and not deleted, whether they are ongoing or not.
    */
  var launchCount: js.UndefOr[Long] = js.undefined
  
  /**
    * The name of the project.
    */
  var name: ProjectName
  
  /**
    * The current state of the project.
    */
  var status: ProjectStatus
  
  /**
    * The list of tag keys and values associated with this project.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object Project {
  
  inline def apply(
    arn: ProjectArn,
    createdTime: js.Date,
    lastUpdatedTime: js.Date,
    name: ProjectName,
    status: ProjectStatus
  ): Project = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdTime = createdTime.asInstanceOf[js.Any], lastUpdatedTime = lastUpdatedTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Project]
  }
  
  extension [Self <: Project](x: Self) {
    
    inline def setActiveExperimentCount(value: Long): Self = StObject.set(x, "activeExperimentCount", value.asInstanceOf[js.Any])
    
    inline def setActiveExperimentCountUndefined: Self = StObject.set(x, "activeExperimentCount", js.undefined)
    
    inline def setActiveLaunchCount(value: Long): Self = StObject.set(x, "activeLaunchCount", value.asInstanceOf[js.Any])
    
    inline def setActiveLaunchCountUndefined: Self = StObject.set(x, "activeLaunchCount", js.undefined)
    
    inline def setAppConfigResource(value: ProjectAppConfigResource): Self = StObject.set(x, "appConfigResource", value.asInstanceOf[js.Any])
    
    inline def setAppConfigResourceUndefined: Self = StObject.set(x, "appConfigResource", js.undefined)
    
    inline def setArn(value: ProjectArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    inline def setDataDelivery(value: ProjectDataDelivery): Self = StObject.set(x, "dataDelivery", value.asInstanceOf[js.Any])
    
    inline def setDataDeliveryUndefined: Self = StObject.set(x, "dataDelivery", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExperimentCount(value: Long): Self = StObject.set(x, "experimentCount", value.asInstanceOf[js.Any])
    
    inline def setExperimentCountUndefined: Self = StObject.set(x, "experimentCount", js.undefined)
    
    inline def setFeatureCount(value: Long): Self = StObject.set(x, "featureCount", value.asInstanceOf[js.Any])
    
    inline def setFeatureCountUndefined: Self = StObject.set(x, "featureCount", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLaunchCount(value: Long): Self = StObject.set(x, "launchCount", value.asInstanceOf[js.Any])
    
    inline def setLaunchCountUndefined: Self = StObject.set(x, "launchCount", js.undefined)
    
    inline def setName(value: ProjectName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ProjectStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
