package typings.atAwsDashSdkClientDashKmsDashNode.typesDeleteImportedKeyMaterialOutputMod

import typings.atAwsDashSdkClientDashKmsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteImportedKeyMaterialOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
}

object DeleteImportedKeyMaterialOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteImportedKeyMaterialOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
  
    __obj.asInstanceOf[DeleteImportedKeyMaterialOutput]
  }
}

