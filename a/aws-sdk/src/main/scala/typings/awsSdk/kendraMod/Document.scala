package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document extends js.Object {
  /**
    * Information to use for user context filtering.
    */
  var AccessControlList: js.UndefOr[PrincipalList] = js.native
  /**
    * Custom attributes to apply to the document. Use the custom attributes to provide additional information for searching, to provide facets for refining searches, and to provide additional information in the query response.
    */
  var Attributes: js.UndefOr[DocumentAttributeList] = js.native
  /**
    * The contents of the document as a base-64 encoded string.
    */
  var Blob: js.UndefOr[_Blob] = js.native
  /**
    * The file type of the document in the Blob field.
    */
  var ContentType: js.UndefOr[typings.awsSdk.kendraMod.ContentType] = js.native
  /**
    * A unique identifier of the document in the index.
    */
  var Id: DocumentId = js.native
  var S3Path: js.UndefOr[typings.awsSdk.kendraMod.S3Path] = js.native
  /**
    * The title of the document.
    */
  var Title: js.UndefOr[typings.awsSdk.kendraMod.Title] = js.native
}

object Document {
  @scala.inline
  def apply(
    Id: DocumentId,
    AccessControlList: PrincipalList = null,
    Attributes: DocumentAttributeList = null,
    Blob: _Blob = null,
    ContentType: ContentType = null,
    S3Path: S3Path = null,
    Title: Title = null
  ): Document = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    if (AccessControlList != null) __obj.updateDynamic("AccessControlList")(AccessControlList.asInstanceOf[js.Any])
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (Blob != null) __obj.updateDynamic("Blob")(Blob.asInstanceOf[js.Any])
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType.asInstanceOf[js.Any])
    if (S3Path != null) __obj.updateDynamic("S3Path")(S3Path.asInstanceOf[js.Any])
    if (Title != null) __obj.updateDynamic("Title")(Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
}

