package typings.awsSdkClientGlacierNode.typesListTagsForVaultOutputMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForVaultOutput extends _OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The tags attached to the vault. Each tag is composed of a key and a value.</p>
    */
  var Tags: js.UndefOr[StringDictionary[String]] = js.undefined
}

object ListTagsForVaultOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, Tags: StringDictionary[String] = null): ListTagsForVaultOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForVaultOutput]
  }
}

