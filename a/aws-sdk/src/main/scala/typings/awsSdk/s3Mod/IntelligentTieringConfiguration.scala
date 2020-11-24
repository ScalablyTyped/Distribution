package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntelligentTieringConfiguration extends js.Object {
  
  /**
    * Specifies a bucket filter. The configuration only includes objects that meet the filter's criteria.
    */
  var Filter: js.UndefOr[IntelligentTieringFilter] = js.native
  
  /**
    * The ID used to identify the S3 Intelligent-Tiering configuration.
    */
  var Id: IntelligentTieringId = js.native
  
  /**
    * Specifies the status of the configuration.
    */
  var Status: IntelligentTieringStatus = js.native
  
  /**
    * Specifies the S3 Intelligent-Tiering storage class tier of the configuration.
    */
  var Tierings: TieringList = js.native
}
object IntelligentTieringConfiguration {
  
  @scala.inline
  def apply(Id: IntelligentTieringId, Status: IntelligentTieringStatus, Tierings: TieringList): IntelligentTieringConfiguration = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tierings = Tierings.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntelligentTieringConfiguration]
  }
  
  @scala.inline
  implicit class IntelligentTieringConfigurationOps[Self <: IntelligentTieringConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: IntelligentTieringId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: IntelligentTieringStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTieringsVarargs(value: Tiering*): Self = this.set("Tierings", js.Array(value :_*))
    
    @scala.inline
    def setTierings(value: TieringList): Self = this.set("Tierings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: IntelligentTieringFilter): Self = this.set("Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("Filter", js.undefined)
  }
}
