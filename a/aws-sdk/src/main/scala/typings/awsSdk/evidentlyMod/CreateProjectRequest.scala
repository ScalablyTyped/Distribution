package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProjectRequest extends StObject {
  
  /**
    * Use this parameter if the project will use client-side evaluation powered by AppConfig. Client-side evaluation allows your application to assign variations to user sessions locally instead of by calling the EvaluateFeature operation. This mitigates the latency and availability risks that come with an API call. For more information, see  Client-side evaluation - powered by AppConfig.  This parameter is a structure that contains information about the AppConfig application and environment that will be used as for client-side evaluation. To create a project that uses client-side evaluation, you must have the evidently:ExportProjectAsConfiguration permission.
    */
  var appConfigResource: js.UndefOr[ProjectAppConfigResourceConfig] = js.undefined
  
  /**
    * A structure that contains information about where Evidently is to store evaluation events for longer term storage, if you choose to do so. If you choose not to store these events, Evidently deletes them after using them to produce metrics and other experiment results that you can view.
    */
  var dataDelivery: js.UndefOr[ProjectDataDeliveryConfig] = js.undefined
  
  /**
    * An optional description of the project.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The name for the project.
    */
  var name: ProjectName
  
  /**
    * Assigns one or more tags (key-value pairs) to the project. Tags can help you organize and categorize your resources. You can also use them to scope user permissions by granting a user permission to access or change only resources with certain tag values. Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of characters.  &lt;p&gt;You can associate as many as 50 tags with a project.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html&quot;&gt;Tagging Amazon Web Services resources&lt;/a&gt;.&lt;/p&gt; 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateProjectRequest {
  
  inline def apply(name: ProjectName): CreateProjectRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectRequest]
  }
  
  extension [Self <: CreateProjectRequest](x: Self) {
    
    inline def setAppConfigResource(value: ProjectAppConfigResourceConfig): Self = StObject.set(x, "appConfigResource", value.asInstanceOf[js.Any])
    
    inline def setAppConfigResourceUndefined: Self = StObject.set(x, "appConfigResource", js.undefined)
    
    inline def setDataDelivery(value: ProjectDataDeliveryConfig): Self = StObject.set(x, "dataDelivery", value.asInstanceOf[js.Any])
    
    inline def setDataDeliveryUndefined: Self = StObject.set(x, "dataDelivery", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: ProjectName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
