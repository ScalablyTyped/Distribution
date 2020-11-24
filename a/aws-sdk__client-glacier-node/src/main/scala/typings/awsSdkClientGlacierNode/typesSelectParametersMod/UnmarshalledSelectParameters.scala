package typings.awsSdkClientGlacierNode.typesSelectParametersMod

import typings.awsSdkClientGlacierNode.typesInputSerializationMod.UnmarshalledInputSerialization
import typings.awsSdkClientGlacierNode.typesOutputSerializationMod.UnmarshalledOutputSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledSelectParameters extends SelectParameters {
  
  /**
    * <p>Describes the serialization format of the object.</p>
    */
  @JSName("InputSerialization")
  var InputSerialization_UnmarshalledSelectParameters: js.UndefOr[UnmarshalledInputSerialization] = js.native
  
  /**
    * <p>Describes how the results of the select job are serialized.</p>
    */
  @JSName("OutputSerialization")
  var OutputSerialization_UnmarshalledSelectParameters: js.UndefOr[UnmarshalledOutputSerialization] = js.native
}
object UnmarshalledSelectParameters {
  
  @scala.inline
  def apply(): UnmarshalledSelectParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSelectParameters]
  }
  
  @scala.inline
  implicit class UnmarshalledSelectParametersOps[Self <: UnmarshalledSelectParameters] (val x: Self) extends AnyVal {
    
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
    def setInputSerialization(value: UnmarshalledInputSerialization): Self = this.set("InputSerialization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputSerialization: Self = this.set("InputSerialization", js.undefined)
    
    @scala.inline
    def setOutputSerialization(value: UnmarshalledOutputSerialization): Self = this.set("OutputSerialization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputSerialization: Self = this.set("OutputSerialization", js.undefined)
  }
}
