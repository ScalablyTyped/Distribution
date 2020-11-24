package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListArchivesResponse extends js.Object {
  
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
  implicit class ListArchivesResponseOps[Self <: ListArchivesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArchivesVarargs(value: Archive*): Self = this.set("Archives", js.Array(value :_*))
    
    @scala.inline
    def setArchives(value: ArchiveResponseList): Self = this.set("Archives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchives: Self = this.set("Archives", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
