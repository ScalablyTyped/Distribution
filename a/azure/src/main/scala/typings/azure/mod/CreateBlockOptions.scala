package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBlockOptions extends LeaseAccessConditionsOptions {
  
  var contentMD5: js.UndefOr[String] = js.native
  
  var useTransactionalMD5: js.UndefOr[Boolean] = js.native
}
object CreateBlockOptions {
  
  @scala.inline
  def apply(): CreateBlockOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBlockOptions]
  }
  
  @scala.inline
  implicit class CreateBlockOptionsMutableBuilder[Self <: CreateBlockOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentMD5(value: String): Self = StObject.set(x, "contentMD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentMD5Undefined: Self = StObject.set(x, "contentMD5", js.undefined)
    
    @scala.inline
    def setUseTransactionalMD5(value: Boolean): Self = StObject.set(x, "useTransactionalMD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTransactionalMD5Undefined: Self = StObject.set(x, "useTransactionalMD5", js.undefined)
  }
}
