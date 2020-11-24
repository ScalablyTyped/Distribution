package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeApplicableIndividualAssessmentsMessage extends js.Object {
  
  /**
    * Optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * Maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * Name of the migration type that each provided individual assessment must support.
    */
  var MigrationType: js.UndefOr[MigrationTypeValue] = js.native
  
  /**
    * ARN of a replication instance on which you want to base the default list of individual assessments.
    */
  var ReplicationInstanceArn: js.UndefOr[String] = js.native
  
  /**
    * Amazon Resource Name (ARN) of a migration task on which you want to base the default list of individual assessments.
    */
  var ReplicationTaskArn: js.UndefOr[String] = js.native
  
  /**
    * Name of a database engine that the specified replication instance supports as a source.
    */
  var SourceEngineName: js.UndefOr[String] = js.native
  
  /**
    * Name of a database engine that the specified replication instance supports as a target.
    */
  var TargetEngineName: js.UndefOr[String] = js.native
}
object DescribeApplicableIndividualAssessmentsMessage {
  
  @scala.inline
  def apply(): DescribeApplicableIndividualAssessmentsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeApplicableIndividualAssessmentsMessage]
  }
  
  @scala.inline
  implicit class DescribeApplicableIndividualAssessmentsMessageOps[Self <: DescribeApplicableIndividualAssessmentsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = this.set("MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRecords: Self = this.set("MaxRecords", js.undefined)
    
    @scala.inline
    def setMigrationType(value: MigrationTypeValue): Self = this.set("MigrationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMigrationType: Self = this.set("MigrationType", js.undefined)
    
    @scala.inline
    def setReplicationInstanceArn(value: String): Self = this.set("ReplicationInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationInstanceArn: Self = this.set("ReplicationInstanceArn", js.undefined)
    
    @scala.inline
    def setReplicationTaskArn(value: String): Self = this.set("ReplicationTaskArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationTaskArn: Self = this.set("ReplicationTaskArn", js.undefined)
    
    @scala.inline
    def setSourceEngineName(value: String): Self = this.set("SourceEngineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceEngineName: Self = this.set("SourceEngineName", js.undefined)
    
    @scala.inline
    def setTargetEngineName(value: String): Self = this.set("TargetEngineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetEngineName: Self = this.set("TargetEngineName", js.undefined)
  }
}
