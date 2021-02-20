package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecentCaseCommunications extends StObject {
  
  /**
    * The five most recent communications associated with the case.
    */
  var communications: js.UndefOr[CommunicationList] = js.native
  
  /**
    * A resumption point for pagination.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object RecentCaseCommunications {
  
  @scala.inline
  def apply(): RecentCaseCommunications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecentCaseCommunications]
  }
  
  @scala.inline
  implicit class RecentCaseCommunicationsMutableBuilder[Self <: RecentCaseCommunications] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommunications(value: CommunicationList): Self = StObject.set(x, "communications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommunicationsUndefined: Self = StObject.set(x, "communications", js.undefined)
    
    @scala.inline
    def setCommunicationsVarargs(value: Communication*): Self = StObject.set(x, "communications", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
