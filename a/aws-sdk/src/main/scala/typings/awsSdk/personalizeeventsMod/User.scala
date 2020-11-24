package typings.awsSdk.personalizeeventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User extends js.Object {
  
  /**
    * A string map of user-specific metadata. Each element in the map consists of a key-value pair. For example,   {"numberOfVideosWatched": "45"}  The keys use camel case names that match the fields in the Users schema. In the above example, the numberOfVideosWatched would match the 'NUMBER_OF_VIDEOS_WATCHED' field defined in the Users schema.
    */
  var properties: js.UndefOr[UserProperties] = js.native
  
  /**
    * The ID associated with the user.
    */
  var userId: StringType = js.native
}
object User {
  
  @scala.inline
  def apply(userId: StringType): User = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    
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
    def setUserId(value: StringType): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: UserProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
}
