package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightImpactGraphService extends StObject {
  
  /**
    * Identifier of the AWS account in which the service runs.
    */
  var AccountId: js.UndefOr[String] = js.undefined
  
  /**
    * Connections to downstream services.
    */
  var Edges: js.UndefOr[InsightImpactGraphEdgeList] = js.undefined
  
  /**
    * The canonical name of the service.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * A list of names for the service, including the canonical name.
    */
  var Names: js.UndefOr[ServiceNames] = js.undefined
  
  /**
    * Identifier for the service. Unique within the service map.
    */
  var ReferenceId: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * Identifier for the service. Unique within the service map.   AWS Resource - The type of an AWS resource. For example, AWS::EC2::Instance for an application running on Amazon EC2 or AWS::DynamoDB::Table for an Amazon DynamoDB table that the application used.    AWS Service - The type of an AWS service. For example, AWS::DynamoDB for downstream calls to Amazon DynamoDB that didn't target a specific table.    AWS Service - The type of an AWS service. For example, AWS::DynamoDB for downstream calls to Amazon DynamoDB that didn't target a specific table.    remote - A downstream service of indeterminate type.  
    */
  var Type: js.UndefOr[String] = js.undefined
}
object InsightImpactGraphService {
  
  @scala.inline
  def apply(): InsightImpactGraphService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsightImpactGraphService]
  }
  
  @scala.inline
  implicit class InsightImpactGraphServiceMutableBuilder[Self <: InsightImpactGraphService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    @scala.inline
    def setEdges(value: InsightImpactGraphEdgeList): Self = StObject.set(x, "Edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgesUndefined: Self = StObject.set(x, "Edges", js.undefined)
    
    @scala.inline
    def setEdgesVarargs(value: InsightImpactGraphEdge*): Self = StObject.set(x, "Edges", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setNames(value: ServiceNames): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesUndefined: Self = StObject.set(x, "Names", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = StObject.set(x, "Names", js.Array(value :_*))
    
    @scala.inline
    def setReferenceId(value: NullableInteger): Self = StObject.set(x, "ReferenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceIdUndefined: Self = StObject.set(x, "ReferenceId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
