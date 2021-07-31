package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configurations extends StObject {
  
  /**
    * The current configuration of the broker.
    */
  var Current: js.UndefOr[ConfigurationId] = js.undefined
  
  /**
    * The history of configurations applied to the broker.
    */
  var History: js.UndefOr[listOfConfigurationId] = js.undefined
  
  /**
    * The pending configuration of the broker.
    */
  var Pending: js.UndefOr[ConfigurationId] = js.undefined
}
object Configurations {
  
  @scala.inline
  def apply(): Configurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configurations]
  }
  
  @scala.inline
  implicit class ConfigurationsMutableBuilder[Self <: Configurations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrent(value: ConfigurationId): Self = StObject.set(x, "Current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentUndefined: Self = StObject.set(x, "Current", js.undefined)
    
    @scala.inline
    def setHistory(value: listOfConfigurationId): Self = StObject.set(x, "History", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryUndefined: Self = StObject.set(x, "History", js.undefined)
    
    @scala.inline
    def setHistoryVarargs(value: ConfigurationId*): Self = StObject.set(x, "History", js.Array(value :_*))
    
    @scala.inline
    def setPending(value: ConfigurationId): Self = StObject.set(x, "Pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingUndefined: Self = StObject.set(x, "Pending", js.undefined)
  }
}
