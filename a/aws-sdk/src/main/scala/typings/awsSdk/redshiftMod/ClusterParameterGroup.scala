package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterParameterGroup extends StObject {
  
  /**
    * The description of the parameter group.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The name of the cluster parameter group family that this cluster parameter group is compatible with.
    */
  var ParameterGroupFamily: js.UndefOr[String] = js.native
  
  /**
    * The name of the cluster parameter group.
    */
  var ParameterGroupName: js.UndefOr[String] = js.native
  
  /**
    * The list of tags for the cluster parameter group.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object ClusterParameterGroup {
  
  @scala.inline
  def apply(): ClusterParameterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterParameterGroup]
  }
  
  @scala.inline
  implicit class ClusterParameterGroupMutableBuilder[Self <: ClusterParameterGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setParameterGroupFamily(value: String): Self = StObject.set(x, "ParameterGroupFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterGroupFamilyUndefined: Self = StObject.set(x, "ParameterGroupFamily", js.undefined)
    
    @scala.inline
    def setParameterGroupName(value: String): Self = StObject.set(x, "ParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterGroupNameUndefined: Self = StObject.set(x, "ParameterGroupName", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
