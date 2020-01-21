package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    EndpointName: GenericString,
    AddArguments: MapValue = null,
    AddPublicKeys: PublicKeysList = null,
    CustomLibraries: DevEndpointCustomLibraries = null,
    DeleteArguments: StringList = null,
    DeletePublicKeys: PublicKeysList = null,
    PublicKey: GenericString = null,
    UpdateEtlLibraries: js.UndefOr[scala.Boolean] = js.undefined
  ): UpdateDevEndpointRequest = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName.asInstanceOf[js.Any])
    if (AddArguments != null) __obj.updateDynamic("AddArguments")(AddArguments.asInstanceOf[js.Any])
    if (AddPublicKeys != null) __obj.updateDynamic("AddPublicKeys")(AddPublicKeys.asInstanceOf[js.Any])
    if (CustomLibraries != null) __obj.updateDynamic("CustomLibraries")(CustomLibraries.asInstanceOf[js.Any])
    if (DeleteArguments != null) __obj.updateDynamic("DeleteArguments")(DeleteArguments.asInstanceOf[js.Any])
    if (DeletePublicKeys != null) __obj.updateDynamic("DeletePublicKeys")(DeletePublicKeys.asInstanceOf[js.Any])
    if (PublicKey != null) __obj.updateDynamic("PublicKey")(PublicKey.asInstanceOf[js.Any])
    if (!js.isUndefined(UpdateEtlLibraries)) __obj.updateDynamic("UpdateEtlLibraries")(UpdateEtlLibraries.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDevEndpointRequest]
  }
}

