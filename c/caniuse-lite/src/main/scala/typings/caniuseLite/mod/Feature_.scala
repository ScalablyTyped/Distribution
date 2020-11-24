package typings.caniuseLite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Feature_ extends js.Object {
  
  /**
    * Agent support matrix for this feature.
    */
  var stats: StatsByAgentID = js.native
  
  /**
    * Specification status of the feature.
    */
  var status: FeatureStatus = js.native
  
  /**
    * Descriptive title of the feature.
    */
  var title: String = js.native
}
object Feature_ {
  
  @scala.inline
  def apply(stats: StatsByAgentID, status: FeatureStatus, title: String): Feature_ = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feature_]
  }
  
  @scala.inline
  implicit class Feature_Ops[Self <: Feature_] (val x: Self) extends AnyVal {
    
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
    def setStats(value: StatsByAgentID): Self = this.set("stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: FeatureStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
