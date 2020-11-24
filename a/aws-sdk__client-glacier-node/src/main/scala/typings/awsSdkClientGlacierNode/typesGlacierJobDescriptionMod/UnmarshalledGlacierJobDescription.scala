package typings.awsSdkClientGlacierNode.typesGlacierJobDescriptionMod

import typings.awsSdkClientGlacierNode.typesInventoryRetrievalJobDescriptionMod.UnmarshalledInventoryRetrievalJobDescription
import typings.awsSdkClientGlacierNode.typesOutputLocationMod.UnmarshalledOutputLocation
import typings.awsSdkClientGlacierNode.typesSelectParametersMod.UnmarshalledSelectParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledGlacierJobDescription extends GlacierJobDescription {
  
  /**
    * <p>Parameters used for range inventory retrieval.</p>
    */
  @JSName("InventoryRetrievalParameters")
  var InventoryRetrievalParameters_UnmarshalledGlacierJobDescription: js.UndefOr[UnmarshalledInventoryRetrievalJobDescription] = js.native
  
  /**
    * <p>Contains the location where the data from the select job is stored.</p>
    */
  @JSName("OutputLocation")
  var OutputLocation_UnmarshalledGlacierJobDescription: js.UndefOr[UnmarshalledOutputLocation] = js.native
  
  /**
    * <p>Contains the parameters used for a select.</p>
    */
  @JSName("SelectParameters")
  var SelectParameters_UnmarshalledGlacierJobDescription: js.UndefOr[UnmarshalledSelectParameters] = js.native
}
object UnmarshalledGlacierJobDescription {
  
  @scala.inline
  def apply(): UnmarshalledGlacierJobDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledGlacierJobDescription]
  }
  
  @scala.inline
  implicit class UnmarshalledGlacierJobDescriptionOps[Self <: UnmarshalledGlacierJobDescription] (val x: Self) extends AnyVal {
    
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
    def setInventoryRetrievalParameters(value: UnmarshalledInventoryRetrievalJobDescription): Self = this.set("InventoryRetrievalParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInventoryRetrievalParameters: Self = this.set("InventoryRetrievalParameters", js.undefined)
    
    @scala.inline
    def setOutputLocation(value: UnmarshalledOutputLocation): Self = this.set("OutputLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputLocation: Self = this.set("OutputLocation", js.undefined)
    
    @scala.inline
    def setSelectParameters(value: UnmarshalledSelectParameters): Self = this.set("SelectParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectParameters: Self = this.set("SelectParameters", js.undefined)
  }
}
