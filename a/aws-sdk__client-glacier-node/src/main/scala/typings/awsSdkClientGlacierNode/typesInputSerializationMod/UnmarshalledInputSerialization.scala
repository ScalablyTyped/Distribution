package typings.awsSdkClientGlacierNode.typesInputSerializationMod

import typings.awsSdkClientGlacierNode.typesCsvinputMod.UnmarshalledCSVInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledInputSerialization extends InputSerialization {
  
  /**
    * <p>Describes the serialization of a CSV-encoded object.</p>
    */
  @JSName("csv")
  var csv_UnmarshalledInputSerialization: js.UndefOr[UnmarshalledCSVInput] = js.native
}
object UnmarshalledInputSerialization {
  
  @scala.inline
  def apply(): UnmarshalledInputSerialization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledInputSerialization]
  }
  
  @scala.inline
  implicit class UnmarshalledInputSerializationOps[Self <: UnmarshalledInputSerialization] (val x: Self) extends AnyVal {
    
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
    def setCsv(value: UnmarshalledCSVInput): Self = this.set("csv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsv: Self = this.set("csv", js.undefined)
  }
}
