package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOutpostInstanceTypesOutput extends StObject {
  
  var InstanceTypes: js.UndefOr[InstanceTypeListDefinition] = js.native
  
  var NextToken: js.UndefOr[Token] = js.native
  
  var OutpostArn: js.UndefOr[typings.awsSdk.outpostsMod.OutpostArn] = js.native
  
  var OutpostId: js.UndefOr[typings.awsSdk.outpostsMod.OutpostId] = js.native
}
object GetOutpostInstanceTypesOutput {
  
  @scala.inline
  def apply(): GetOutpostInstanceTypesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOutpostInstanceTypesOutput]
  }
  
  @scala.inline
  implicit class GetOutpostInstanceTypesOutputMutableBuilder[Self <: GetOutpostInstanceTypesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceTypes(value: InstanceTypeListDefinition): Self = StObject.set(x, "InstanceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypesUndefined: Self = StObject.set(x, "InstanceTypes", js.undefined)
    
    @scala.inline
    def setInstanceTypesVarargs(value: InstanceTypeItem*): Self = StObject.set(x, "InstanceTypes", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setOutpostArn(value: OutpostArn): Self = StObject.set(x, "OutpostArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutpostArnUndefined: Self = StObject.set(x, "OutpostArn", js.undefined)
    
    @scala.inline
    def setOutpostId(value: OutpostId): Self = StObject.set(x, "OutpostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutpostIdUndefined: Self = StObject.set(x, "OutpostId", js.undefined)
  }
}
