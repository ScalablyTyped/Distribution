package typings.cqrsDomain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// endregion
// region defineAggregate
@js.native
trait DefineAggregateOptions extends js.Object {
  
  /**
    * optional, default false
    * only optionally needed when skipHistory is set to true, only the last event will be loaded and applyed
    */
  var applyLastEvent: js.UndefOr[Boolean] = js.native
  
  /**
    * optional, default ''
    */
  var defaultCommandPayload: js.UndefOr[String] = js.native
  
  /**
    * optional, default ''
    */
  var defaultEventPayload: js.UndefOr[String] = js.native
  
  /**
    * optional, default ''
    */
  var defaultPreConditionPayload: js.UndefOr[String] = js.native
  
  /**
    * optional, default false
    * will publish the events but will not commit them to the eventstore
    */
  var disablePersistence: js.UndefOr[Boolean] = js.native
  
  /**
    * optional, default is last part of path name
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * optional, default false
    * by skipping the history, only the last event will be loaded and defaultly not applyed (just to ensure the revision number increment)
    */
  var skipHistory: js.UndefOr[Boolean] = js.native
  
  /**
    * optional, default 0
    */
  var version: js.UndefOr[Double] = js.native
}
object DefineAggregateOptions {
  
  @scala.inline
  def apply(): DefineAggregateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefineAggregateOptions]
  }
  
  @scala.inline
  implicit class DefineAggregateOptionsOps[Self <: DefineAggregateOptions] (val x: Self) extends AnyVal {
    
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
    def setApplyLastEvent(value: Boolean): Self = this.set("applyLastEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyLastEvent: Self = this.set("applyLastEvent", js.undefined)
    
    @scala.inline
    def setDefaultCommandPayload(value: String): Self = this.set("defaultCommandPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultCommandPayload: Self = this.set("defaultCommandPayload", js.undefined)
    
    @scala.inline
    def setDefaultEventPayload(value: String): Self = this.set("defaultEventPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultEventPayload: Self = this.set("defaultEventPayload", js.undefined)
    
    @scala.inline
    def setDefaultPreConditionPayload(value: String): Self = this.set("defaultPreConditionPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPreConditionPayload: Self = this.set("defaultPreConditionPayload", js.undefined)
    
    @scala.inline
    def setDisablePersistence(value: Boolean): Self = this.set("disablePersistence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisablePersistence: Self = this.set("disablePersistence", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSkipHistory(value: Boolean): Self = this.set("skipHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipHistory: Self = this.set("skipHistory", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
