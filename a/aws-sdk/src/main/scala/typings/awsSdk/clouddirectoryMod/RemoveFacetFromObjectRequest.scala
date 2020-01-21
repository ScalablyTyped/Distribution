package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveFacetFromObjectRequest extends js.Object {
  /**
    * The ARN of the directory in which the object resides.
    */
  var DirectoryArn: Arn = js.native
  /**
    * A reference to the object to remove the facet from.
    */
  var ObjectReference: typings.awsSdk.clouddirectoryMod.ObjectReference = js.native
  /**
    * The facet to remove. See SchemaFacet for details.
    */
  var SchemaFacet: typings.awsSdk.clouddirectoryMod.SchemaFacet = js.native
}

object RemoveFacetFromObjectRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, ObjectReference: ObjectReference, SchemaFacet: SchemaFacet): RemoveFacetFromObjectRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], ObjectReference = ObjectReference.asInstanceOf[js.Any], SchemaFacet = SchemaFacet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoveFacetFromObjectRequest]
  }
}

