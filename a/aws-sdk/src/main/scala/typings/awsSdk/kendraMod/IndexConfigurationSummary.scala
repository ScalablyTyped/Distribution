package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexConfigurationSummary extends js.Object {
  
  /**
    * The Unix timestamp when the index was created.
    */
  var CreatedAt: Timestamp = js.native
  
  /**
    * Indicates whether the index is a enterprise edition index or a developer edition index. 
    */
  var Edition: js.UndefOr[IndexEdition] = js.native
  
  /**
    * A unique identifier for the index. Use this to identify the index when you are using operations such as Query, DescribeIndex, UpdateIndex, and DeleteIndex.
    */
  var Id: js.UndefOr[IndexId] = js.native
  
  /**
    * The name of the index.
    */
  var Name: js.UndefOr[IndexName] = js.native
  
  /**
    * The current status of the index. When the status is ACTIVE, the index is ready to search.
    */
  var Status: IndexStatus = js.native
  
  /**
    * The Unix timestamp when the index was last updated by the UpdateIndex operation.
    */
  var UpdatedAt: Timestamp = js.native
}
object IndexConfigurationSummary {
  
  @scala.inline
  def apply(CreatedAt: Timestamp, Status: IndexStatus, UpdatedAt: Timestamp): IndexConfigurationSummary = {
    val __obj = js.Dynamic.literal(CreatedAt = CreatedAt.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexConfigurationSummary]
  }
  
  @scala.inline
  implicit class IndexConfigurationSummaryOps[Self <: IndexConfigurationSummary] (val x: Self) extends AnyVal {
    
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
    def setCreatedAt(value: Timestamp): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: IndexStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAt(value: Timestamp): Self = this.set("UpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdition(value: IndexEdition): Self = this.set("Edition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdition: Self = this.set("Edition", js.undefined)
    
    @scala.inline
    def setId(value: IndexId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setName(value: IndexName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
