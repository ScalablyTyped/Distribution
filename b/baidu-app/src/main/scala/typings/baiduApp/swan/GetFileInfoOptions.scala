package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFileInfoOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /** 计算文件摘要的算法，默认值 md5，有效值：md5，sha1 */
  var digestAlgorithm: js.UndefOr[String] = js.undefined
  
  /** 本地文件路径 */
  var filePath: String
  
  @JSName("success")
  var success_GetFileInfoOptions: js.UndefOr[js.Function1[/* options */ GetFileInfoSuccess, Unit]] = js.undefined
}
object GetFileInfoOptions {
  
  @scala.inline
  def apply(filePath: String): GetFileInfoOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFileInfoOptions]
  }
  
  @scala.inline
  implicit class GetFileInfoOptionsMutableBuilder[Self <: GetFileInfoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDigestAlgorithm(value: String): Self = StObject.set(x, "digestAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestAlgorithmUndefined: Self = StObject.set(x, "digestAlgorithm", js.undefined)
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* options */ GetFileInfoSuccess => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
