package typings.coinbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAccountOpts extends StObject {
  
  /**
    * Account name
    */
  var name: js.UndefOr[String] = js.undefined
}
object UpdateAccountOpts {
  
  @scala.inline
  def apply(): UpdateAccountOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAccountOpts]
  }
  
  @scala.inline
  implicit class UpdateAccountOptsMutableBuilder[Self <: UpdateAccountOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
