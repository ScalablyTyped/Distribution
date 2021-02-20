package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadBlobOptions extends GetBlobPropertiesOptions {
  
  var disableContentMD5Validation: js.UndefOr[Boolean] = js.native
  
  var rangeEnd: js.UndefOr[String] = js.native
  
  var rangeStart: js.UndefOr[String] = js.native
  
  var useTransactionalMD5: js.UndefOr[Boolean] = js.native
}
object ReadBlobOptions {
  
  @scala.inline
  def apply(): ReadBlobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadBlobOptions]
  }
  
  @scala.inline
  implicit class ReadBlobOptionsMutableBuilder[Self <: ReadBlobOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableContentMD5Validation(value: Boolean): Self = StObject.set(x, "disableContentMD5Validation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableContentMD5ValidationUndefined: Self = StObject.set(x, "disableContentMD5Validation", js.undefined)
    
    @scala.inline
    def setRangeEnd(value: String): Self = StObject.set(x, "rangeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeEndUndefined: Self = StObject.set(x, "rangeEnd", js.undefined)
    
    @scala.inline
    def setRangeStart(value: String): Self = StObject.set(x, "rangeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeStartUndefined: Self = StObject.set(x, "rangeStart", js.undefined)
    
    @scala.inline
    def setUseTransactionalMD5(value: Boolean): Self = StObject.set(x, "useTransactionalMD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTransactionalMD5Undefined: Self = StObject.set(x, "useTransactionalMD5", js.undefined)
  }
}
