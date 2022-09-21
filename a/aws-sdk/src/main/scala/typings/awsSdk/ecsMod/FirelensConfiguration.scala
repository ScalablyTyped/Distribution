package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirelensConfiguration extends StObject {
  
  /**
    * The options to use when configuring the log router. This field is optional and can be used to specify a custom configuration file or to add additional metadata, such as the task, task definition, cluster, and container instance details to the log event. If specified, the syntax to use is "options":{"enable-ecs-log-metadata":"true|false","config-file-type:"s3|file","config-file-value":"arn:aws:s3:::mybucket/fluent.conf|filepath"}. For more information, see Creating a task definition that uses a FireLens configuration in the Amazon Elastic Container Service Developer Guide.  Tasks hosted on Fargate only support the file configuration file type. 
    */
  var options: js.UndefOr[FirelensConfigurationOptionsMap] = js.undefined
  
  /**
    * The log router to use. The valid values are fluentd or fluentbit.
    */
  var `type`: FirelensConfigurationType
}
object FirelensConfiguration {
  
  inline def apply(`type`: FirelensConfigurationType): FirelensConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirelensConfiguration]
  }
  
  extension [Self <: FirelensConfiguration](x: Self) {
    
    inline def setOptions(value: FirelensConfigurationOptionsMap): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setType(value: FirelensConfigurationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
