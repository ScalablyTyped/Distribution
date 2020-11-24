package typings.baiduApp.swan.ai

import typings.baiduApp.swan.BaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 用户向服务请求检测图像中的主体位置。
  */
@js.native
trait DetectIdentifyOptions
  extends BaseOptions[js.Any, js.Any] {
  
  var image: String = js.native
  
   // 如果检测主体是人，主体区域是否带上人脸部分，0-不带人脸区域，其他-带人脸区域，裁剪类需求推荐带人脸，检索/识别类需求推荐不带人脸。默认取1，带人脸。
  @JSName("success")
  var success_DetectIdentifyOptions: js.UndefOr[js.Function1[/* res */ DetectIdentifyResponse, Unit]] = js.native
  
   // 图像资源地址
  var with_face: js.UndefOr[Double] = js.native
}
object DetectIdentifyOptions {
  
  @scala.inline
  def apply(image: String): DetectIdentifyOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectIdentifyOptions]
  }
  
  @scala.inline
  implicit class DetectIdentifyOptionsOps[Self <: DetectIdentifyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ DetectIdentifyResponse => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setWith_face(value: Double): Self = this.set("with_face", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWith_face: Self = this.set("with_face", js.undefined)
  }
}
