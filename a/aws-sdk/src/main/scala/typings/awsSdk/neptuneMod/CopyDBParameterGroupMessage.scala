package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyDBParameterGroupMessage extends StObject {
  
  /**
    * The identifier or ARN for the source DB parameter group. For information about creating an ARN, see  Constructing an Amazon Resource Name (ARN). Constraints:   Must specify a valid DB parameter group.   Must specify a valid DB parameter group identifier, for example my-db-param-group, or a valid ARN.  
    */
  var SourceDBParameterGroupIdentifier: String = js.native
  
  /**
    * The tags to be assigned to the copied DB parameter group.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * A description for the copied DB parameter group.
    */
  var TargetDBParameterGroupDescription: String = js.native
  
  /**
    * The identifier for the copied DB parameter group. Constraints:   Cannot be null, empty, or blank.   Must contain from 1 to 255 letters, numbers, or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: my-db-parameter-group 
    */
  var TargetDBParameterGroupIdentifier: String = js.native
}
object CopyDBParameterGroupMessage {
  
  @scala.inline
  def apply(
    SourceDBParameterGroupIdentifier: String,
    TargetDBParameterGroupDescription: String,
    TargetDBParameterGroupIdentifier: String
  ): CopyDBParameterGroupMessage = {
    val __obj = js.Dynamic.literal(SourceDBParameterGroupIdentifier = SourceDBParameterGroupIdentifier.asInstanceOf[js.Any], TargetDBParameterGroupDescription = TargetDBParameterGroupDescription.asInstanceOf[js.Any], TargetDBParameterGroupIdentifier = TargetDBParameterGroupIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyDBParameterGroupMessage]
  }
  
  @scala.inline
  implicit class CopyDBParameterGroupMessageMutableBuilder[Self <: CopyDBParameterGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceDBParameterGroupIdentifier(value: String): Self = StObject.set(x, "SourceDBParameterGroupIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTargetDBParameterGroupDescription(value: String): Self = StObject.set(x, "TargetDBParameterGroupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDBParameterGroupIdentifier(value: String): Self = StObject.set(x, "TargetDBParameterGroupIdentifier", value.asInstanceOf[js.Any])
  }
}
