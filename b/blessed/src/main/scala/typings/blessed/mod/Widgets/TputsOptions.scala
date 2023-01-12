package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TputsOptions
  extends StObject
     with IOptions {
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var extended: js.UndefOr[Boolean] = js.undefined
  
  var termcap: js.UndefOr[String] = js.undefined
  
  var termcapFile: js.UndefOr[String] = js.undefined
  
  var terminal: js.UndefOr[String] = js.undefined
  
  var terminfoFile: js.UndefOr[String] = js.undefined
  
  var terminfoPrefix: js.UndefOr[String] = js.undefined
}
object TputsOptions {
  
  inline def apply(): TputsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TputsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TputsOptions] (val x: Self) extends AnyVal {
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setExtended(value: Boolean): Self = StObject.set(x, "extended", value.asInstanceOf[js.Any])
    
    inline def setExtendedUndefined: Self = StObject.set(x, "extended", js.undefined)
    
    inline def setTermcap(value: String): Self = StObject.set(x, "termcap", value.asInstanceOf[js.Any])
    
    inline def setTermcapFile(value: String): Self = StObject.set(x, "termcapFile", value.asInstanceOf[js.Any])
    
    inline def setTermcapFileUndefined: Self = StObject.set(x, "termcapFile", js.undefined)
    
    inline def setTermcapUndefined: Self = StObject.set(x, "termcap", js.undefined)
    
    inline def setTerminal(value: String): Self = StObject.set(x, "terminal", value.asInstanceOf[js.Any])
    
    inline def setTerminalUndefined: Self = StObject.set(x, "terminal", js.undefined)
    
    inline def setTerminfoFile(value: String): Self = StObject.set(x, "terminfoFile", value.asInstanceOf[js.Any])
    
    inline def setTerminfoFileUndefined: Self = StObject.set(x, "terminfoFile", js.undefined)
    
    inline def setTerminfoPrefix(value: String): Self = StObject.set(x, "terminfoPrefix", value.asInstanceOf[js.Any])
    
    inline def setTerminfoPrefixUndefined: Self = StObject.set(x, "terminfoPrefix", js.undefined)
  }
}
