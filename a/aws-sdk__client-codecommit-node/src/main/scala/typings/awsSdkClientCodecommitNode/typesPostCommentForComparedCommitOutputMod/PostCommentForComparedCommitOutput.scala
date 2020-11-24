package typings.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitOutputMod

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesCommentMod.UnmarshalledComment
import typings.awsSdkClientCodecommitNode.typesLocationMod.UnmarshalledLocation
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostCommentForComparedCommitOutput extends OutputTypesUnion {
  
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  
  /**
    * <p>In the directionality you established, the blob ID of the 'after' blob.</p>
    */
  var afterBlobId: js.UndefOr[String] = js.native
  
  /**
    * <p>In the directionality you established, the full commit ID of the 'after' commit.</p>
    */
  var afterCommitId: js.UndefOr[String] = js.native
  
  /**
    * <p>In the directionality you established, the blob ID of the 'before' blob.</p>
    */
  var beforeBlobId: js.UndefOr[String] = js.native
  
  /**
    * <p>In the directionality you established, the full commit ID of the 'before' commit.</p>
    */
  var beforeCommitId: js.UndefOr[String] = js.native
  
  /**
    * <p>The content of the comment you posted.</p>
    */
  var comment: js.UndefOr[UnmarshalledComment] = js.native
  
  /**
    * <p>The location of the comment in the comparison between the two commits.</p>
    */
  var location: js.UndefOr[UnmarshalledLocation] = js.native
  
  /**
    * <p>The name of the repository where you posted a comment on the comparison between commits.</p>
    */
  var repositoryName: js.UndefOr[String] = js.native
}
object PostCommentForComparedCommitOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): PostCommentForComparedCommitOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostCommentForComparedCommitOutput]
  }
  
  @scala.inline
  implicit class PostCommentForComparedCommitOutputOps[Self <: PostCommentForComparedCommitOutput] (val x: Self) extends AnyVal {
    
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
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterBlobId(value: String): Self = this.set("afterBlobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterBlobId: Self = this.set("afterBlobId", js.undefined)
    
    @scala.inline
    def setAfterCommitId(value: String): Self = this.set("afterCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterCommitId: Self = this.set("afterCommitId", js.undefined)
    
    @scala.inline
    def setBeforeBlobId(value: String): Self = this.set("beforeBlobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeBlobId: Self = this.set("beforeBlobId", js.undefined)
    
    @scala.inline
    def setBeforeCommitId(value: String): Self = this.set("beforeCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeCommitId: Self = this.set("beforeCommitId", js.undefined)
    
    @scala.inline
    def setComment(value: UnmarshalledComment): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setLocation(value: UnmarshalledLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: String): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryName: Self = this.set("repositoryName", js.undefined)
  }
}
