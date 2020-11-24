package typings.cassandraDriver.metadataMod.metadata

import typings.cassandraDriver.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Aggregate extends js.Object {
  
  var argumentTypes: js.Array[Code] = js.native
  
  var finalFunction: String = js.native
  
  var initCondition: String = js.native
  
  var keyspaceName: String = js.native
  
  var returnType: String = js.native
  
  var signature: js.Array[String] = js.native
  
  var stateFunction: String = js.native
  
  var stateType: String = js.native
}
object Aggregate {
  
  @scala.inline
  def apply(
    argumentTypes: js.Array[Code],
    finalFunction: String,
    initCondition: String,
    keyspaceName: String,
    returnType: String,
    signature: js.Array[String],
    stateFunction: String,
    stateType: String
  ): Aggregate = {
    val __obj = js.Dynamic.literal(argumentTypes = argumentTypes.asInstanceOf[js.Any], finalFunction = finalFunction.asInstanceOf[js.Any], initCondition = initCondition.asInstanceOf[js.Any], keyspaceName = keyspaceName.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], stateFunction = stateFunction.asInstanceOf[js.Any], stateType = stateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aggregate]
  }
  
  @scala.inline
  implicit class AggregateOps[Self <: Aggregate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgumentTypesVarargs(value: Code*): Self = this.set("argumentTypes", js.Array(value :_*))
    
    @scala.inline
    def setArgumentTypes(value: js.Array[Code]): Self = this.set("argumentTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalFunction(value: String): Self = this.set("finalFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitCondition(value: String): Self = this.set("initCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyspaceName(value: String): Self = this.set("keyspaceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: String): Self = this.set("returnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureVarargs(value: String*): Self = this.set("signature", js.Array(value :_*))
    
    @scala.inline
    def setSignature(value: js.Array[String]): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateFunction(value: String): Self = this.set("stateFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateType(value: String): Self = this.set("stateType", value.asInstanceOf[js.Any])
  }
}
