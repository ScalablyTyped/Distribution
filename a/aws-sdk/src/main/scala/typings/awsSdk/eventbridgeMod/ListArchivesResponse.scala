package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListArchivesResponse extends StObject {
  
  /**
    * An array of Archive objects that include details about an archive.
    */
  var Archives: js.UndefOr[ArchiveResponseList] = js.native
  
  /**
    * The token returned by a previous call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.eventbridgeMod.NextToken] = js.native
}
object ListArchivesResponse {
  
  @scala.inline
  def apply(): ListArchivesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListArchivesResponse]
  }
  
  @scala.inline
  implicit class ListArchivesResponseMutableBuilder[Self <: ListArchivesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchives(value: ArchiveResponseList): Self = StObject.set(x, "Archives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchivesUndefined: Self = StObject.set(x, "Archives", js.undefined)
    
    @scala.inline
    def setArchivesVarargs(value: Archive*): Self = StObject.set(x, "Archives", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
