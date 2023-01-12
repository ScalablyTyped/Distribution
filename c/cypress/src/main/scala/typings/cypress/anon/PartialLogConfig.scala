package typings.cypress.anon

import typings.cypress.Cypress.ObjectLike
import typings.cypress.JQuery
import typings.cypress.cypressStrings.child
import typings.cypress.cypressStrings.parent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<cypress.Cypress.LogConfig> */
trait PartialLogConfig extends StObject {
  
  @JSName("$el")
  var $el: js.UndefOr[JQuery[HTMLElement]] = js.undefined
  
  var autoEnd: js.UndefOr[Boolean] = js.undefined
  
  var consoleProps: js.UndefOr[js.Function0[ObjectLike]] = js.undefined
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var end: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var message: js.UndefOr[Any] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[parent | child] = js.undefined
}
object PartialLogConfig {
  
  inline def apply(): PartialLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLogConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialLogConfig] (val x: Self) extends AnyVal {
    
    inline def set$el(value: JQuery[HTMLElement]): Self = StObject.set(x, "$el", value.asInstanceOf[js.Any])
    
    inline def set$elUndefined: Self = StObject.set(x, "$el", js.undefined)
    
    inline def setAutoEnd(value: Boolean): Self = StObject.set(x, "autoEnd", value.asInstanceOf[js.Any])
    
    inline def setAutoEndUndefined: Self = StObject.set(x, "autoEnd", js.undefined)
    
    inline def setConsoleProps(value: () => ObjectLike): Self = StObject.set(x, "consoleProps", js.Any.fromFunction0(value))
    
    inline def setConsolePropsUndefined: Self = StObject.set(x, "consoleProps", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMessage(value: Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setType(value: parent | child): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
