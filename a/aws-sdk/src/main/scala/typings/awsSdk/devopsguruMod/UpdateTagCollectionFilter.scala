package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTagCollectionFilter extends StObject {
  
  /**
    * An Amazon Web Services tag key that is used to identify the Amazon Web Services resources that DevOps Guru analyzes. All Amazon Web Services resources in your account and Region tagged with this key make up your DevOps Guru application and analysis boundary.  The string used for a key in a tag that you use to define your resource coverage must begin with the prefix Devops-guru-. The tag key might be Devops-guru-deployment-application or Devops-guru-rds-application. While keys are case-sensitive, the case of key characters don't matter to DevOps Guru. For example, DevOps Guru works with a key named devops-guru-rds and a key named DevOps-Guru-RDS. Possible key/value pairs in your application might be Devops-Guru-production-application/RDS or Devops-Guru-production-application/containers. 
    */
  var AppBoundaryKey: typings.awsSdk.devopsguruMod.AppBoundaryKey
  
  /**
    * The values in an Amazon Web Services tag collection. The tag's value is an optional field used to associate a string with the tag key (for example, 111122223333, Production, or a team name). The key and value are the tag's key pair. Omitting the tag value is the same as using an empty string. Like tag keys, tag values are case-sensitive. You can specify a maximum of 256 characters for a tag value.
    */
  var TagValues: UpdateTagValues
}
object UpdateTagCollectionFilter {
  
  inline def apply(AppBoundaryKey: AppBoundaryKey, TagValues: UpdateTagValues): UpdateTagCollectionFilter = {
    val __obj = js.Dynamic.literal(AppBoundaryKey = AppBoundaryKey.asInstanceOf[js.Any], TagValues = TagValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTagCollectionFilter]
  }
  
  extension [Self <: UpdateTagCollectionFilter](x: Self) {
    
    inline def setAppBoundaryKey(value: AppBoundaryKey): Self = StObject.set(x, "AppBoundaryKey", value.asInstanceOf[js.Any])
    
    inline def setTagValues(value: UpdateTagValues): Self = StObject.set(x, "TagValues", value.asInstanceOf[js.Any])
    
    inline def setTagValuesVarargs(value: TagValue*): Self = StObject.set(x, "TagValues", js.Array(value*))
  }
}
