package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListConfigsResponse extends StObject {
  
  /**
    * List of Config items.
    */
  var configList: js.UndefOr[ConfigList] = js.native
  
  /**
    * Next token returned in the response of a previous ListConfigs call. Used to get the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.native
}
object ListConfigsResponse {
  
  @scala.inline
  def apply(): ListConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConfigsResponse]
  }
  
  @scala.inline
  implicit class ListConfigsResponseMutableBuilder[Self <: ListConfigsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigList(value: ConfigList): Self = StObject.set(x, "configList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigListUndefined: Self = StObject.set(x, "configList", js.undefined)
    
    @scala.inline
    def setConfigListVarargs(value: ConfigListItem*): Self = StObject.set(x, "configList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
