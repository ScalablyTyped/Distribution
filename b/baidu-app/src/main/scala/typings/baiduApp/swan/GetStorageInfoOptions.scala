package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStorageInfoOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  def success_MGetStorageInfoOptions(res: StorageInfo): Unit
}
object GetStorageInfoOptions {
  
  @scala.inline
  def apply(success: StorageInfo => Unit): GetStorageInfoOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetStorageInfoOptions]
  }
  
  @scala.inline
  implicit class GetStorageInfoOptionsMutableBuilder[Self <: GetStorageInfoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: StorageInfo => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
