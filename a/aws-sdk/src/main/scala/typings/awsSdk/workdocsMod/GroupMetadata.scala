package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupMetadata extends StObject {
  
  /**
    * The ID of the user group.
    */
  var Id: js.UndefOr[IdType] = js.native
  
  /**
    * The name of the group.
    */
  var Name: js.UndefOr[GroupNameType] = js.native
}
object GroupMetadata {
  
  @scala.inline
  def apply(): GroupMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupMetadata]
  }
  
  @scala.inline
  implicit class GroupMetadataMutableBuilder[Self <: GroupMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: IdType): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: GroupNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
