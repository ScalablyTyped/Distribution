package typings.awsSdkClientCodecommitNode.typesGetCommentsForComparedCommitOutputMod

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesCommentsForComparedCommitMod.UnmarshalledCommentsForComparedCommit
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCommentsForComparedCommitOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>A list of comment objects on the compared commit.</p>
    */
  var commentsForComparedCommitData: js.UndefOr[js.Array[UnmarshalledCommentsForComparedCommit]] = js.undefined
  /**
    * <p>An enumeration token that can be used in a request to return the next batch of the results.</p>
    */
  var nextToken: js.UndefOr[String] = js.undefined
}

object GetCommentsForComparedCommitOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    commentsForComparedCommitData: js.Array[UnmarshalledCommentsForComparedCommit] = null,
    nextToken: String = null
  ): GetCommentsForComparedCommitOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (commentsForComparedCommitData != null) __obj.updateDynamic("commentsForComparedCommitData")(commentsForComparedCommitData.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCommentsForComparedCommitOutput]
  }
}

