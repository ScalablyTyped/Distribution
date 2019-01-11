package typings
package baiduDashAppLib.swanNs.aiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("swan.ai")
@js.native
object ^ extends js.Object {
  /**
  		 * 通用物体及场景识别，即对于输入的一张图片（可正常解码，且长宽比适宜），输出图片中的多个物体及场景标签。
  		 */
  def advancedGeneralIdentify(options: baiduDashAppLib.swanNs.aiNs.GeneralIdentifyOptions): scala.Unit = js.native
  /**
  		 * 用于检测和识别图片中的动物信息
  		 */
  def animalClassify(options: baiduDashAppLib.swanNs.aiNs.animalClassifyOptions): scala.Unit = js.native
  /**
  		 * 用于检测一张车辆图片的具体车型，即对于输入的一张图片（可正常解码，且长
  		 * 宽比适宜），输出图片的车辆品牌及型号、颜色及年份、位置信息。
  		 */
  def carClassify(options: baiduDashAppLib.swanNs.aiNs.carClassifyOptions): scala.Unit = js.native
  /**
  		 * 用于菜品识别，即对于输入的一张图片（可正常解码，且长宽比适宜），输出图
  		 * 片的菜品名称、卡路里信息、置信度。
  		 */
  def dishClassify(options: baiduDashAppLib.swanNs.aiNs.dishClassifyOptions): scala.Unit = js.native
  /**
  		 * 获取全局唯一的语音识别器voiceRecognizer。
  		 */
  def getVoiceRecognizer(): baiduDashAppLib.swanNs.aiNs.VoiceRecognizerTask = js.native
  /**
  		 * 自定义图像审核。
  		 */
  def imageAudit(options: baiduDashAppLib.swanNs.aiNs.imageAuditOptions): scala.Unit = js.native
  /**
  		 * 用于检测和识别图片中的品牌 LOGO 信息
  		 */
  def logoClassify(options: baiduDashAppLib.swanNs.aiNs.logoClassifyOptions): scala.Unit = js.native
  /**
  		 * 用户向服务请求检测图像中的主体位置。
  		 */
  def objectDetectIdentify(options: baiduDashAppLib.swanNs.aiNs.DetectIdentifyOptions): scala.Unit = js.native
  /**
  		 * 识别银行卡并返回卡号、发卡行和卡片类型。
  		 */
  def ocrBankCard(options: baiduDashAppLib.swanNs.aiNs.ocrBankCardOptions): scala.Unit = js.native
  /**
  		 * 对机动车驾驶证所有关键字段进行识别。
  		 */
  def ocrDrivingLicense(options: baiduDashAppLib.swanNs.aiNs.ocrDrivingLicenseOptions): scala.Unit = js.native
  /**
  		 * 用户向服务请求识别身份证，身份证识别包括正面和背面。
  		 */
  def ocrIdCard(options: baiduDashAppLib.swanNs.aiNs.ocrIdCardOptions): scala.Unit = js.native
  /**
  		 * 对机动车行驶证正本所有关键字段进行识别
  		 */
  def ocrVehicleLicense(options: baiduDashAppLib.swanNs.aiNs.ocrVehicleLicenseOptions): scala.Unit = js.native
  /**
  		 * 用于检测和识别图片中的植物信息
  		 */
  def plantClassify(options: baiduDashAppLib.swanNs.aiNs.plantClassifyOptions): scala.Unit = js.native
  /**
  		 * 运用业界领先的深度学习技术，判断一段文本内容是否符合网络发文规范，实现
  		 * 自动化、智能化的文本审核。
  		 */
  def textReview(options: baiduDashAppLib.swanNs.aiNs.textReviewOptions): scala.Unit = js.native
  /**
  		 * 将文本转换为可以播放的mp3文件。
  		 */
  def textToAudio(options: baiduDashAppLib.swanNs.aiNs.textToAudioOptions): scala.Unit = js.native
}

