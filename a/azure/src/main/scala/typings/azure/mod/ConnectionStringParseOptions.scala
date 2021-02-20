package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionStringParseOptions extends StObject {
  
  var skipLowerCase: Boolean = js.native
}
object ConnectionStringParseOptions {
  
  @scala.inline
  def apply(skipLowerCase: Boolean): ConnectionStringParseOptions = {
    val __obj = js.Dynamic.literal(skipLowerCase = skipLowerCase.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionStringParseOptions]
  }
  
  @scala.inline
  implicit class ConnectionStringParseOptionsMutableBuilder[Self <: ConnectionStringParseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSkipLowerCase(value: Boolean): Self = StObject.set(x, "skipLowerCase", value.asInstanceOf[js.Any])
  }
}
