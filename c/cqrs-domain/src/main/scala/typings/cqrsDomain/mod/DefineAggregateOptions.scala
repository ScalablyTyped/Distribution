package typings.cqrsDomain.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// endregion
// region defineAggregate
trait DefineAggregateOptions extends StObject {
  
  /**
    * optional, default false
    * only optionally needed when skipHistory is set to true, only the last event will be loaded and applyed
    */
  var applyLastEvent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * optional, default ''
    */
  var defaultCommandPayload: js.UndefOr[String] = js.undefined
  
  /**
    * optional, default ''
    */
  var defaultEventPayload: js.UndefOr[String] = js.undefined
  
  /**
    * optional, default ''
    */
  var defaultPreConditionPayload: js.UndefOr[String] = js.undefined
  
  /**
    * optional, default false
    * will publish the events but will not commit them to the eventstore
    */
  var disablePersistence: js.UndefOr[Boolean] = js.undefined
  
  /**
    * optional, default is last part of path name
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * optional, default false
    * by skipping the history, only the last event will be loaded and defaultly not applyed (just to ensure the revision number increment)
    */
  var skipHistory: js.UndefOr[Boolean] = js.undefined
  
  /**
    * optional, default 0
    */
  var version: js.UndefOr[Double] = js.undefined
}
object DefineAggregateOptions {
  
  @scala.inline
  def apply(): DefineAggregateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefineAggregateOptions]
  }
  
  @scala.inline
  implicit class DefineAggregateOptionsMutableBuilder[Self <: DefineAggregateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyLastEvent(value: Boolean): Self = StObject.set(x, "applyLastEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyLastEventUndefined: Self = StObject.set(x, "applyLastEvent", js.undefined)
    
    @scala.inline
    def setDefaultCommandPayload(value: String): Self = StObject.set(x, "defaultCommandPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCommandPayloadUndefined: Self = StObject.set(x, "defaultCommandPayload", js.undefined)
    
    @scala.inline
    def setDefaultEventPayload(value: String): Self = StObject.set(x, "defaultEventPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultEventPayloadUndefined: Self = StObject.set(x, "defaultEventPayload", js.undefined)
    
    @scala.inline
    def setDefaultPreConditionPayload(value: String): Self = StObject.set(x, "defaultPreConditionPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPreConditionPayloadUndefined: Self = StObject.set(x, "defaultPreConditionPayload", js.undefined)
    
    @scala.inline
    def setDisablePersistence(value: Boolean): Self = StObject.set(x, "disablePersistence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisablePersistenceUndefined: Self = StObject.set(x, "disablePersistence", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSkipHistory(value: Boolean): Self = StObject.set(x, "skipHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipHistoryUndefined: Self = StObject.set(x, "skipHistory", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
