package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheParameterGroupNameMessage extends StObject {
  
  /**
    * The name of the cache parameter group.
    */
  var CacheParameterGroupName: js.UndefOr[String] = js.native
}
object CacheParameterGroupNameMessage {
  
  @scala.inline
  def apply(): CacheParameterGroupNameMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheParameterGroupNameMessage]
  }
  
  @scala.inline
  implicit class CacheParameterGroupNameMessageMutableBuilder[Self <: CacheParameterGroupNameMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheParameterGroupName(value: String): Self = StObject.set(x, "CacheParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheParameterGroupNameUndefined: Self = StObject.set(x, "CacheParameterGroupName", js.undefined)
  }
}
