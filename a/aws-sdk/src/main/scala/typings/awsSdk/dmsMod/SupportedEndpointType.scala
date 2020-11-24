package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SupportedEndpointType extends js.Object {
  
  /**
    * The type of endpoint. Valid values are source and target.
    */
  var EndpointType: js.UndefOr[ReplicationEndpointTypeValue] = js.native
  
  /**
    * The expanded name for the engine name. For example, if the EngineName parameter is "aurora," this value would be "Amazon Aurora MySQL."
    */
  var EngineDisplayName: js.UndefOr[String] = js.native
  
  /**
    * The database engine name. Valid values, depending on the EndpointType, include "mysql", "oracle", "postgres", "mariadb", "aurora", "aurora-postgresql", "redshift", "s3", "db2", "azuredb", "sybase", "dynamodb", "mongodb", "kinesis", "kafka", "elasticsearch", "documentdb", "sqlserver", and "neptune".
    */
  var EngineName: js.UndefOr[String] = js.native
  
  /**
    * The earliest AWS DMS engine version that supports this endpoint engine. Note that endpoint engines released with AWS DMS versions earlier than 3.1.1 do not return a value for this parameter.
    */
  var ReplicationInstanceEngineMinimumVersion: js.UndefOr[String] = js.native
  
  /**
    * Indicates if Change Data Capture (CDC) is supported.
    */
  var SupportsCDC: js.UndefOr[Boolean] = js.native
}
object SupportedEndpointType {
  
  @scala.inline
  def apply(): SupportedEndpointType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupportedEndpointType]
  }
  
  @scala.inline
  implicit class SupportedEndpointTypeOps[Self <: SupportedEndpointType] (val x: Self) extends AnyVal {
    
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
    def setEndpointType(value: ReplicationEndpointTypeValue): Self = this.set("EndpointType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointType: Self = this.set("EndpointType", js.undefined)
    
    @scala.inline
    def setEngineDisplayName(value: String): Self = this.set("EngineDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineDisplayName: Self = this.set("EngineDisplayName", js.undefined)
    
    @scala.inline
    def setEngineName(value: String): Self = this.set("EngineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineName: Self = this.set("EngineName", js.undefined)
    
    @scala.inline
    def setReplicationInstanceEngineMinimumVersion(value: String): Self = this.set("ReplicationInstanceEngineMinimumVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationInstanceEngineMinimumVersion: Self = this.set("ReplicationInstanceEngineMinimumVersion", js.undefined)
    
    @scala.inline
    def setSupportsCDC(value: Boolean): Self = this.set("SupportsCDC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsCDC: Self = this.set("SupportsCDC", js.undefined)
  }
}
