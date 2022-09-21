package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInstanceDescription extends StObject {
  
  var definition: js.UndefOr[DefinitionDocument] = js.undefined
  
  /**
    * The AWS Identity and Access Management (IAM) role that AWS IoT Things Graph assumes during flow execution in a cloud deployment. This role must have read and write permissionss to AWS Lambda and AWS IoT and to any other AWS services that the flow uses.
    */
  var flowActionsRoleArn: js.UndefOr[RoleArn] = js.undefined
  
  var metricsConfiguration: js.UndefOr[MetricsConfiguration] = js.undefined
  
  /**
    * The Amazon Simple Storage Service bucket where information about a system instance is stored.
    */
  var s3BucketName: js.UndefOr[S3BucketName] = js.undefined
  
  /**
    * An object that contains summary information about a system instance.
    */
  var summary: js.UndefOr[SystemInstanceSummary] = js.undefined
  
  /**
    * A list of objects that contain all of the IDs and revision numbers of workflows and systems that are used in a system instance.
    */
  var validatedDependencyRevisions: js.UndefOr[DependencyRevisions] = js.undefined
  
  /**
    * The version of the user's namespace against which the system instance was validated.
    */
  var validatedNamespaceVersion: js.UndefOr[Version] = js.undefined
}
object SystemInstanceDescription {
  
  inline def apply(): SystemInstanceDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemInstanceDescription]
  }
  
  extension [Self <: SystemInstanceDescription](x: Self) {
    
    inline def setDefinition(value: DefinitionDocument): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setFlowActionsRoleArn(value: RoleArn): Self = StObject.set(x, "flowActionsRoleArn", value.asInstanceOf[js.Any])
    
    inline def setFlowActionsRoleArnUndefined: Self = StObject.set(x, "flowActionsRoleArn", js.undefined)
    
    inline def setMetricsConfiguration(value: MetricsConfiguration): Self = StObject.set(x, "metricsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setMetricsConfigurationUndefined: Self = StObject.set(x, "metricsConfiguration", js.undefined)
    
    inline def setS3BucketName(value: S3BucketName): Self = StObject.set(x, "s3BucketName", value.asInstanceOf[js.Any])
    
    inline def setS3BucketNameUndefined: Self = StObject.set(x, "s3BucketName", js.undefined)
    
    inline def setSummary(value: SystemInstanceSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setValidatedDependencyRevisions(value: DependencyRevisions): Self = StObject.set(x, "validatedDependencyRevisions", value.asInstanceOf[js.Any])
    
    inline def setValidatedDependencyRevisionsUndefined: Self = StObject.set(x, "validatedDependencyRevisions", js.undefined)
    
    inline def setValidatedDependencyRevisionsVarargs(value: DependencyRevision*): Self = StObject.set(x, "validatedDependencyRevisions", js.Array(value*))
    
    inline def setValidatedNamespaceVersion(value: Version): Self = StObject.set(x, "validatedNamespaceVersion", value.asInstanceOf[js.Any])
    
    inline def setValidatedNamespaceVersionUndefined: Self = StObject.set(x, "validatedNamespaceVersion", js.undefined)
  }
}
