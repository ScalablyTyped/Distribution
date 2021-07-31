package typings.cqrsDomain.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// endregion
// region defineCommandHandler
trait DefineCommandHandlerOptions extends StObject {
  
  /**
    * optional, default is file name without extension
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * optional, if not defined it will pass the whole command...
    */
  var payload: js.UndefOr[String] = js.undefined
  
  /**
    * optional, default 0
    */
  var version: js.UndefOr[Double] = js.undefined
}
object DefineCommandHandlerOptions {
  
  @scala.inline
  def apply(): DefineCommandHandlerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefineCommandHandlerOptions]
  }
  
  @scala.inline
  implicit class DefineCommandHandlerOptionsMutableBuilder[Self <: DefineCommandHandlerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
