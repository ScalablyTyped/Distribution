package typings.death

import typings.death.deathBooleans.`false`
import typings.death.deathBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Debug extends StObject {
    
    var SIGINT: js.UndefOr[Boolean] = js.undefined
    
    var SIGQUIT: js.UndefOr[Boolean] = js.undefined
    
    var SIGTERM: js.UndefOr[Boolean] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var uncaughtException: `true`
  }
  object Debug {
    
    inline def apply(): Debug = {
      val __obj = js.Dynamic.literal(uncaughtException = true)
      __obj.asInstanceOf[Debug]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Debug] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setSIGINT(value: Boolean): Self = StObject.set(x, "SIGINT", value.asInstanceOf[js.Any])
      
      inline def setSIGINTUndefined: Self = StObject.set(x, "SIGINT", js.undefined)
      
      inline def setSIGQUIT(value: Boolean): Self = StObject.set(x, "SIGQUIT", value.asInstanceOf[js.Any])
      
      inline def setSIGQUITUndefined: Self = StObject.set(x, "SIGQUIT", js.undefined)
      
      inline def setSIGTERM(value: Boolean): Self = StObject.set(x, "SIGTERM", value.asInstanceOf[js.Any])
      
      inline def setSIGTERMUndefined: Self = StObject.set(x, "SIGTERM", js.undefined)
      
      inline def setUncaughtException(value: `true`): Self = StObject.set(x, "uncaughtException", value.asInstanceOf[js.Any])
    }
  }
  
  trait SIGINT extends StObject {
    
    var SIGINT: js.UndefOr[Boolean] = js.undefined
    
    var SIGQUIT: js.UndefOr[Boolean] = js.undefined
    
    var SIGTERM: js.UndefOr[Boolean] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var uncaughtException: js.UndefOr[`false`] = js.undefined
  }
  object SIGINT {
    
    inline def apply(): SIGINT = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SIGINT]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SIGINT] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setSIGINT(value: Boolean): Self = StObject.set(x, "SIGINT", value.asInstanceOf[js.Any])
      
      inline def setSIGINTUndefined: Self = StObject.set(x, "SIGINT", js.undefined)
      
      inline def setSIGQUIT(value: Boolean): Self = StObject.set(x, "SIGQUIT", value.asInstanceOf[js.Any])
      
      inline def setSIGQUITUndefined: Self = StObject.set(x, "SIGQUIT", js.undefined)
      
      inline def setSIGTERM(value: Boolean): Self = StObject.set(x, "SIGTERM", value.asInstanceOf[js.Any])
      
      inline def setSIGTERMUndefined: Self = StObject.set(x, "SIGTERM", js.undefined)
      
      inline def setUncaughtException(value: `false`): Self = StObject.set(x, "uncaughtException", value.asInstanceOf[js.Any])
      
      inline def setUncaughtExceptionUndefined: Self = StObject.set(x, "uncaughtException", js.undefined)
    }
  }
}
