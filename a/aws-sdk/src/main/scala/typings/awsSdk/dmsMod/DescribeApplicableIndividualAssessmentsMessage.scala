package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeApplicableIndividualAssessmentsMessage extends StObject {
  
  /**
    * Optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Name of the migration type that each provided individual assessment must support.
    */
  var MigrationType: js.UndefOr[MigrationTypeValue] = js.undefined
  
  /**
    * ARN of a replication instance on which you want to base the default list of individual assessments.
    */
  var ReplicationInstanceArn: js.UndefOr[String] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of a migration task on which you want to base the default list of individual assessments.
    */
  var ReplicationTaskArn: js.UndefOr[String] = js.undefined
  
  /**
    * Name of a database engine that the specified replication instance supports as a source.
    */
  var SourceEngineName: js.UndefOr[String] = js.undefined
  
  /**
    * Name of a database engine that the specified replication instance supports as a target.
    */
  var TargetEngineName: js.UndefOr[String] = js.undefined
}
object DescribeApplicableIndividualAssessmentsMessage {
  
  @scala.inline
  def apply(): DescribeApplicableIndividualAssessmentsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeApplicableIndividualAssessmentsMessage]
  }
  
  @scala.inline
  implicit class DescribeApplicableIndividualAssessmentsMessageMutableBuilder[Self <: DescribeApplicableIndividualAssessmentsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    @scala.inline
    def setMigrationType(value: MigrationTypeValue): Self = StObject.set(x, "MigrationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMigrationTypeUndefined: Self = StObject.set(x, "MigrationType", js.undefined)
    
    @scala.inline
    def setReplicationInstanceArn(value: String): Self = StObject.set(x, "ReplicationInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationInstanceArnUndefined: Self = StObject.set(x, "ReplicationInstanceArn", js.undefined)
    
    @scala.inline
    def setReplicationTaskArn(value: String): Self = StObject.set(x, "ReplicationTaskArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationTaskArnUndefined: Self = StObject.set(x, "ReplicationTaskArn", js.undefined)
    
    @scala.inline
    def setSourceEngineName(value: String): Self = StObject.set(x, "SourceEngineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceEngineNameUndefined: Self = StObject.set(x, "SourceEngineName", js.undefined)
    
    @scala.inline
    def setTargetEngineName(value: String): Self = StObject.set(x, "TargetEngineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetEngineNameUndefined: Self = StObject.set(x, "TargetEngineName", js.undefined)
  }
}
