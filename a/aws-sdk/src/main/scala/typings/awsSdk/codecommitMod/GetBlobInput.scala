package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBlobInput extends js.Object {
  /**
    * The ID of the blob, which is its SHA-1 pointer.
    */
  var blobId: ObjectId = js.native
  /**
    * The name of the repository that contains the blob.
    */
  var repositoryName: RepositoryName = js.native
}

object GetBlobInput {
  @scala.inline
  def apply(blobId: ObjectId, repositoryName: RepositoryName): GetBlobInput = {
    val __obj = js.Dynamic.literal(blobId = blobId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBlobInput]
  }
}

