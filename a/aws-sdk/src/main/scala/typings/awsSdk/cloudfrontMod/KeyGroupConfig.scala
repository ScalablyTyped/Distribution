package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyGroupConfig extends StObject {
  
  /**
    * A comment to describe the key group.
    */
  var Comment: js.UndefOr[String] = js.native
  
  /**
    * A list of the identifiers of the public keys in the key group.
    */
  var Items: PublicKeyIdList = js.native
  
  /**
    * A name to identify the key group.
    */
  var Name: String = js.native
}
object KeyGroupConfig {
  
  @scala.inline
  def apply(Items: PublicKeyIdList, Name: String): KeyGroupConfig = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyGroupConfig]
  }
  
  @scala.inline
  implicit class KeyGroupConfigMutableBuilder[Self <: KeyGroupConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    @scala.inline
    def setItems(value: PublicKeyIdList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: String*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
