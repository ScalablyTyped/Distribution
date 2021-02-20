package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TputsOptions extends IOptions {
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var extended: js.UndefOr[Boolean] = js.native
  
  var termcap: js.UndefOr[String] = js.native
  
  var termcapFile: js.UndefOr[String] = js.native
  
  var terminal: js.UndefOr[String] = js.native
  
  var terminfoFile: js.UndefOr[String] = js.native
  
  var terminfoPrefix: js.UndefOr[String] = js.native
}
object TputsOptions {
  
  @scala.inline
  def apply(): TputsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TputsOptions]
  }
  
  @scala.inline
  implicit class TputsOptionsMutableBuilder[Self <: TputsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setExtended(value: Boolean): Self = StObject.set(x, "extended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedUndefined: Self = StObject.set(x, "extended", js.undefined)
    
    @scala.inline
    def setTermcap(value: String): Self = StObject.set(x, "termcap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermcapFile(value: String): Self = StObject.set(x, "termcapFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermcapFileUndefined: Self = StObject.set(x, "termcapFile", js.undefined)
    
    @scala.inline
    def setTermcapUndefined: Self = StObject.set(x, "termcap", js.undefined)
    
    @scala.inline
    def setTerminal(value: String): Self = StObject.set(x, "terminal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminalUndefined: Self = StObject.set(x, "terminal", js.undefined)
    
    @scala.inline
    def setTerminfoFile(value: String): Self = StObject.set(x, "terminfoFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminfoFileUndefined: Self = StObject.set(x, "terminfoFile", js.undefined)
    
    @scala.inline
    def setTerminfoPrefix(value: String): Self = StObject.set(x, "terminfoPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminfoPrefixUndefined: Self = StObject.set(x, "terminfoPrefix", js.undefined)
  }
}
