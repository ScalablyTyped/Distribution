package typings.cypress.Cypress

import typings.cypress.cypressStrings.`drag-drop`
import typings.cypress.cypressStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectFileOptions
  extends StObject
     with Loggable
     with Timeoutable
     with ActionableOptions {
  
  /**
    * Which user action to perform. `select` matches selecting a file while
    * `drag-drop` matches dragging files from the operating system into the
    * document.
    *
    * @default 'select'
    */
  var action: select | `drag-drop`
}
object SelectFileOptions {
  
  inline def apply(
    action: select | `drag-drop`,
    animationDistanceThreshold: Double,
    force: Boolean,
    log: Boolean,
    scrollBehavior: scrollBehaviorOptions,
    timeout: Double,
    waitForAnimations: Boolean
  ): SelectFileOptions = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], animationDistanceThreshold = animationDistanceThreshold.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], scrollBehavior = scrollBehavior.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], waitForAnimations = waitForAnimations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectFileOptions]
  }
  
  extension [Self <: SelectFileOptions](x: Self) {
    
    inline def setAction(value: select | `drag-drop`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
