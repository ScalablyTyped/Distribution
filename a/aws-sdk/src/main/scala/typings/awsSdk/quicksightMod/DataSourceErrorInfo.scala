package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceErrorInfo extends StObject {
  
  /**
    * Error message.
    */
  var Message: js.UndefOr[String] = js.native
  
  /**
    * Error type.
    */
  var Type: js.UndefOr[DataSourceErrorInfoType] = js.native
}
object DataSourceErrorInfo {
  
  @scala.inline
  def apply(): DataSourceErrorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceErrorInfo]
  }
  
  @scala.inline
  implicit class DataSourceErrorInfoMutableBuilder[Self <: DataSourceErrorInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setType(value: DataSourceErrorInfoType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
