package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyOptionGroupMessage extends js.Object {
  
  /**
    * The identifier for the source option group.  Constraints:   Must specify a valid option group.  
    */
  var SourceOptionGroupIdentifier: String = js.native
  
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The description for the copied option group.
    */
  var TargetOptionGroupDescription: String = js.native
  
  /**
    * The identifier for the copied option group. Constraints:   Can't be null, empty, or blank   Must contain from 1 to 255 letters, numbers, or hyphens   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: my-option-group 
    */
  var TargetOptionGroupIdentifier: String = js.native
}
object CopyOptionGroupMessage {
  
  @scala.inline
  def apply(
    SourceOptionGroupIdentifier: String,
    TargetOptionGroupDescription: String,
    TargetOptionGroupIdentifier: String
  ): CopyOptionGroupMessage = {
    val __obj = js.Dynamic.literal(SourceOptionGroupIdentifier = SourceOptionGroupIdentifier.asInstanceOf[js.Any], TargetOptionGroupDescription = TargetOptionGroupDescription.asInstanceOf[js.Any], TargetOptionGroupIdentifier = TargetOptionGroupIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyOptionGroupMessage]
  }
  
  @scala.inline
  implicit class CopyOptionGroupMessageOps[Self <: CopyOptionGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSourceOptionGroupIdentifier(value: String): Self = this.set("SourceOptionGroupIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetOptionGroupDescription(value: String): Self = this.set("TargetOptionGroupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetOptionGroupIdentifier(value: String): Self = this.set("TargetOptionGroupIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
