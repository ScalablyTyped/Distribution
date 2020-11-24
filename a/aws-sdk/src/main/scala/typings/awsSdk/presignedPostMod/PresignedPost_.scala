package typings.awsSdk.presignedPostMod

import typings.awsSdk.presignedPostMod.PresignedPost.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/lib/s3/presigned_post", "PresignedPost")
@js.native
class PresignedPost_ () extends js.Object {
  
  /**
    * The fields that must be included as hidden inputs on the form.
    */
  var fields: Fields = js.native
  
  /**
    * The URL that should be used as the action of the form.
    */
  var url: String = js.native
}
