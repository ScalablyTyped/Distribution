package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightImpactGraphService extends js.Object {
  
  /**
    * Identifier of the AWS account in which the service runs.
    */
  var AccountId: js.UndefOr[String] = js.native
  
  /**
    * Connections to downstream services.
    */
  var Edges: js.UndefOr[InsightImpactGraphEdgeList] = js.native
  
  /**
    * The canonical name of the service.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * A list of names for the service, including the canonical name.
    */
  var Names: js.UndefOr[ServiceNames] = js.native
  
  /**
    * Identifier for the service. Unique within the service map.
    */
  var ReferenceId: js.UndefOr[NullableInteger] = js.native
  
  /**
    * Identifier for the service. Unique within the service map.   AWS Resource - The type of an AWS resource. For example, AWS::EC2::Instance for an application running on Amazon EC2 or AWS::DynamoDB::Table for an Amazon DynamoDB table that the application used.    AWS Service - The type of an AWS service. For example, AWS::DynamoDB for downstream calls to Amazon DynamoDB that didn't target a specific table.    AWS Service - The type of an AWS service. For example, AWS::DynamoDB for downstream calls to Amazon DynamoDB that didn't target a specific table.    remote - A downstream service of indeterminate type.  
    */
  var Type: js.UndefOr[String] = js.native
}
object InsightImpactGraphService {
  
  @scala.inline
  def apply(): InsightImpactGraphService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsightImpactGraphService]
  }
  
  @scala.inline
  implicit class InsightImpactGraphServiceOps[Self <: InsightImpactGraphService] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("AccountId", js.undefined)
    
    @scala.inline
    def setEdgesVarargs(value: InsightImpactGraphEdge*): Self = this.set("Edges", js.Array(value :_*))
    
    @scala.inline
    def setEdges(value: InsightImpactGraphEdgeList): Self = this.set("Edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdges: Self = this.set("Edges", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = this.set("Names", js.Array(value :_*))
    
    @scala.inline
    def setNames(value: ServiceNames): Self = this.set("Names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNames: Self = this.set("Names", js.undefined)
    
    @scala.inline
    def setReferenceId(value: NullableInteger): Self = this.set("ReferenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceId: Self = this.set("ReferenceId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
