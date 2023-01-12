package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object to change the default behavior of .click().
  */
trait ClickOptions
  extends StObject
     with Loggable
     with Timeoutable
     with ActionableOptions {
  
  /**
    * Activates the alt key (option key for Mac) during click
    *
    * @default false
    */
  var altKey: Boolean
  
  /**
    * Activates the meta key (Windows key or command key for Mac) during click
    *
    * @default false
    */
  var cmdKey: Boolean
  
  /**
    * Activates the meta key (Windows key or command key for Mac) during click
    *
    * @default false
    */
  var commandKey: Boolean
  
  /**
    * Activates the control key during click
    *
    * @default false
    */
  var controlKey: Boolean
  
  /**
    * Activates the control key during click
    *
    * @default false
    */
  var ctrlKey: Boolean
  
  /**
    * Activates the meta key (Windows key or command key for Mac) during click
    *
    * @default false
    */
  var metaKey: Boolean
  
  /**
    * Serially click multiple elements
    *
    * @default false
    */
  var multiple: Boolean
  
  /**
    * Activates the alt key (option key for Mac) during click
    *
    * @default false
    */
  var optionKey: Boolean
  
  /**
    * Activates the shift key during click
    *
    * @default false
    */
  var shiftKey: Boolean
}
object ClickOptions {
  
  inline def apply(
    altKey: Boolean,
    animationDistanceThreshold: Double,
    cmdKey: Boolean,
    commandKey: Boolean,
    controlKey: Boolean,
    ctrlKey: Boolean,
    force: Boolean,
    log: Boolean,
    metaKey: Boolean,
    multiple: Boolean,
    optionKey: Boolean,
    scrollBehavior: scrollBehaviorOptions,
    shiftKey: Boolean,
    timeout: Double,
    waitForAnimations: Boolean
  ): ClickOptions = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], animationDistanceThreshold = animationDistanceThreshold.asInstanceOf[js.Any], cmdKey = cmdKey.asInstanceOf[js.Any], commandKey = commandKey.asInstanceOf[js.Any], controlKey = controlKey.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], optionKey = optionKey.asInstanceOf[js.Any], scrollBehavior = scrollBehavior.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], waitForAnimations = waitForAnimations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClickOptions] (val x: Self) extends AnyVal {
    
    inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    inline def setCmdKey(value: Boolean): Self = StObject.set(x, "cmdKey", value.asInstanceOf[js.Any])
    
    inline def setCommandKey(value: Boolean): Self = StObject.set(x, "commandKey", value.asInstanceOf[js.Any])
    
    inline def setControlKey(value: Boolean): Self = StObject.set(x, "controlKey", value.asInstanceOf[js.Any])
    
    inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setOptionKey(value: Boolean): Self = StObject.set(x, "optionKey", value.asInstanceOf[js.Any])
    
    inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
  }
}
