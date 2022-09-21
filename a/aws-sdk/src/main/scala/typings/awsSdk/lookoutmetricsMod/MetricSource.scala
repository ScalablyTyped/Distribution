package typings.awsSdk.lookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricSource extends StObject {
  
  /**
    * Details about an AppFlow datasource.
    */
  var AppFlowConfig: js.UndefOr[typings.awsSdk.lookoutmetricsMod.AppFlowConfig] = js.undefined
  
  /**
    * Details about an Amazon Athena datasource.
    */
  var AthenaSourceConfig: js.UndefOr[typings.awsSdk.lookoutmetricsMod.AthenaSourceConfig] = js.undefined
  
  /**
    * Details about an Amazon CloudWatch monitoring datasource.
    */
  var CloudWatchConfig: js.UndefOr[typings.awsSdk.lookoutmetricsMod.CloudWatchConfig] = js.undefined
  
  /**
    * Details about an Amazon Relational Database Service (RDS) datasource.
    */
  var RDSSourceConfig: js.UndefOr[typings.awsSdk.lookoutmetricsMod.RDSSourceConfig] = js.undefined
  
  /**
    * Details about an Amazon Redshift database datasource.
    */
  var RedshiftSourceConfig: js.UndefOr[typings.awsSdk.lookoutmetricsMod.RedshiftSourceConfig] = js.undefined
  
  var S3SourceConfig: js.UndefOr[typings.awsSdk.lookoutmetricsMod.S3SourceConfig] = js.undefined
}
object MetricSource {
  
  inline def apply(): MetricSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricSource]
  }
  
  extension [Self <: MetricSource](x: Self) {
    
    inline def setAppFlowConfig(value: AppFlowConfig): Self = StObject.set(x, "AppFlowConfig", value.asInstanceOf[js.Any])
    
    inline def setAppFlowConfigUndefined: Self = StObject.set(x, "AppFlowConfig", js.undefined)
    
    inline def setAthenaSourceConfig(value: AthenaSourceConfig): Self = StObject.set(x, "AthenaSourceConfig", value.asInstanceOf[js.Any])
    
    inline def setAthenaSourceConfigUndefined: Self = StObject.set(x, "AthenaSourceConfig", js.undefined)
    
    inline def setCloudWatchConfig(value: CloudWatchConfig): Self = StObject.set(x, "CloudWatchConfig", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchConfigUndefined: Self = StObject.set(x, "CloudWatchConfig", js.undefined)
    
    inline def setRDSSourceConfig(value: RDSSourceConfig): Self = StObject.set(x, "RDSSourceConfig", value.asInstanceOf[js.Any])
    
    inline def setRDSSourceConfigUndefined: Self = StObject.set(x, "RDSSourceConfig", js.undefined)
    
    inline def setRedshiftSourceConfig(value: RedshiftSourceConfig): Self = StObject.set(x, "RedshiftSourceConfig", value.asInstanceOf[js.Any])
    
    inline def setRedshiftSourceConfigUndefined: Self = StObject.set(x, "RedshiftSourceConfig", js.undefined)
    
    inline def setS3SourceConfig(value: S3SourceConfig): Self = StObject.set(x, "S3SourceConfig", value.asInstanceOf[js.Any])
    
    inline def setS3SourceConfigUndefined: Self = StObject.set(x, "S3SourceConfig", js.undefined)
  }
}
