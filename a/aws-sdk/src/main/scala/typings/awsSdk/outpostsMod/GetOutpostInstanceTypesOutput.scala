package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOutpostInstanceTypesOutput extends StObject {
  
  var InstanceTypes: js.UndefOr[InstanceTypeListDefinition] = js.undefined
  
  var NextToken: js.UndefOr[Token] = js.undefined
  
  var OutpostArn: js.UndefOr[typings.awsSdk.outpostsMod.OutpostArn] = js.undefined
  
  var OutpostId: js.UndefOr[typings.awsSdk.outpostsMod.OutpostId] = js.undefined
}
object GetOutpostInstanceTypesOutput {
  
  inline def apply(): GetOutpostInstanceTypesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOutpostInstanceTypesOutput]
  }
  
  extension [Self <: GetOutpostInstanceTypesOutput](x: Self) {
    
    inline def setInstanceTypes(value: InstanceTypeListDefinition): Self = StObject.set(x, "InstanceTypes", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypesUndefined: Self = StObject.set(x, "InstanceTypes", js.undefined)
    
    inline def setInstanceTypesVarargs(value: InstanceTypeItem*): Self = StObject.set(x, "InstanceTypes", js.Array(value :_*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOutpostArn(value: OutpostArn): Self = StObject.set(x, "OutpostArn", value.asInstanceOf[js.Any])
    
    inline def setOutpostArnUndefined: Self = StObject.set(x, "OutpostArn", js.undefined)
    
    inline def setOutpostId(value: OutpostId): Self = StObject.set(x, "OutpostId", value.asInstanceOf[js.Any])
    
    inline def setOutpostIdUndefined: Self = StObject.set(x, "OutpostId", js.undefined)
  }
}
