package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyOptionGroupMessage extends StObject {
  
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
  implicit class CopyOptionGroupMessageMutableBuilder[Self <: CopyOptionGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceOptionGroupIdentifier(value: String): Self = StObject.set(x, "SourceOptionGroupIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTargetOptionGroupDescription(value: String): Self = StObject.set(x, "TargetOptionGroupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetOptionGroupIdentifier(value: String): Self = StObject.set(x, "TargetOptionGroupIdentifier", value.asInstanceOf[js.Any])
  }
}
