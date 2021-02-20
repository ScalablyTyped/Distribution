package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListConfigurationRevisionsResponse extends StObject {
  
  /**
    * 
    Paginated results marker.
    
    */
  var NextToken: js.UndefOr[string] = js.native
  
  /**
    * 
    List of ConfigurationRevision objects.
    
    */
  var Revisions: js.UndefOr[listOfConfigurationRevision] = js.native
}
object ListConfigurationRevisionsResponse {
  
  @scala.inline
  def apply(): ListConfigurationRevisionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConfigurationRevisionsResponse]
  }
  
  @scala.inline
  implicit class ListConfigurationRevisionsResponseMutableBuilder[Self <: ListConfigurationRevisionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRevisions(value: listOfConfigurationRevision): Self = StObject.set(x, "Revisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionsUndefined: Self = StObject.set(x, "Revisions", js.undefined)
    
    @scala.inline
    def setRevisionsVarargs(value: ConfigurationRevision*): Self = StObject.set(x, "Revisions", js.Array(value :_*))
  }
}
