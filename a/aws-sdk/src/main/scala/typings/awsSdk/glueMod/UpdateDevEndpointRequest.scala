package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDevEndpointRequest extends js.Object {
  
  /**
    * The map of arguments to add the map of arguments used to configure the DevEndpoint. Valid arguments are:    "--enable-glue-datacatalog": ""     "GLUE_PYTHON_VERSION": "3"     "GLUE_PYTHON_VERSION": "2"    You can specify a version of Python support for development endpoints by using the Arguments parameter in the CreateDevEndpoint or UpdateDevEndpoint APIs. If no arguments are provided, the version defaults to Python 2.
    */
  var AddArguments: js.UndefOr[MapValue] = js.native
  
  /**
    * The list of public keys for the DevEndpoint to use.
    */
  var AddPublicKeys: js.UndefOr[PublicKeysList] = js.native
  
  /**
    * Custom Python or Java libraries to be loaded in the DevEndpoint.
    */
  var CustomLibraries: js.UndefOr[DevEndpointCustomLibraries] = js.native
  
  /**
    * The list of argument keys to be deleted from the map of arguments used to configure the DevEndpoint.
    */
  var DeleteArguments: js.UndefOr[StringList] = js.native
  
  /**
    * The list of public keys to be deleted from the DevEndpoint.
    */
  var DeletePublicKeys: js.UndefOr[PublicKeysList] = js.native
  
  /**
    * The name of the DevEndpoint to be updated.
    */
  var EndpointName: GenericString = js.native
  
  /**
    * The public key for the DevEndpoint to use.
    */
  var PublicKey: js.UndefOr[GenericString] = js.native
  
  /**
    *  True if the list of custom libraries to be loaded in the development endpoint needs to be updated, or False if otherwise.
    */
  var UpdateEtlLibraries: js.UndefOr[BooleanValue] = js.native
}
object UpdateDevEndpointRequest {
  
  @scala.inline
  def apply(EndpointName: GenericString): UpdateDevEndpointRequest = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDevEndpointRequest]
  }
  
  @scala.inline
  implicit class UpdateDevEndpointRequestOps[Self <: UpdateDevEndpointRequest] (val x: Self) extends AnyVal {
    
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
    def setEndpointName(value: GenericString): Self = this.set("EndpointName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddArguments(value: MapValue): Self = this.set("AddArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddArguments: Self = this.set("AddArguments", js.undefined)
    
    @scala.inline
    def setAddPublicKeysVarargs(value: GenericString*): Self = this.set("AddPublicKeys", js.Array(value :_*))
    
    @scala.inline
    def setAddPublicKeys(value: PublicKeysList): Self = this.set("AddPublicKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddPublicKeys: Self = this.set("AddPublicKeys", js.undefined)
    
    @scala.inline
    def setCustomLibraries(value: DevEndpointCustomLibraries): Self = this.set("CustomLibraries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomLibraries: Self = this.set("CustomLibraries", js.undefined)
    
    @scala.inline
    def setDeleteArgumentsVarargs(value: GenericString*): Self = this.set("DeleteArguments", js.Array(value :_*))
    
    @scala.inline
    def setDeleteArguments(value: StringList): Self = this.set("DeleteArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteArguments: Self = this.set("DeleteArguments", js.undefined)
    
    @scala.inline
    def setDeletePublicKeysVarargs(value: GenericString*): Self = this.set("DeletePublicKeys", js.Array(value :_*))
    
    @scala.inline
    def setDeletePublicKeys(value: PublicKeysList): Self = this.set("DeletePublicKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletePublicKeys: Self = this.set("DeletePublicKeys", js.undefined)
    
    @scala.inline
    def setPublicKey(value: GenericString): Self = this.set("PublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicKey: Self = this.set("PublicKey", js.undefined)
    
    @scala.inline
    def setUpdateEtlLibraries(value: BooleanValue): Self = this.set("UpdateEtlLibraries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateEtlLibraries: Self = this.set("UpdateEtlLibraries", js.undefined)
  }
}
