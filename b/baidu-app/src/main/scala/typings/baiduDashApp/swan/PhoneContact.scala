package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 设备-----手机联系人
trait PhoneContact
  extends BaseOptions[js.Any, js.Any] {
  /** 联系地址城市 */
  var addressCity: js.UndefOr[String] = js.undefined
  /** 联系地址国家 */
  var addressCountry: js.UndefOr[String] = js.undefined
  /** 联系地址邮政编码 */
  var addressPostalCode: js.UndefOr[String] = js.undefined
  /** 联系地址省份 */
  var addressState: js.UndefOr[String] = js.undefined
  /** 联系地址街道 */
  var addressStreet: js.UndefOr[String] = js.undefined
  /** 电子邮件 */
  var email: js.UndefOr[String] = js.undefined
  /** 名字 */
  var firstName: String
  /** 住宅地址城市 */
  var homeAddressCity: js.UndefOr[String] = js.undefined
  /** 住宅地址国家 */
  var homeAddressCountry: js.UndefOr[String] = js.undefined
  /** 住宅地址邮政编码 */
  var homeAddressPostalCode: js.UndefOr[String] = js.undefined
  /** 住宅地址省份 */
  var homeAddressState: js.UndefOr[String] = js.undefined
  /** 住宅地址街道 */
  var homeAddressStreet: js.UndefOr[String] = js.undefined
  /** 住宅传真 */
  var homeFaxNumber: js.UndefOr[String] = js.undefined
  /** 住宅电话 */
  var homePhoneNumber: js.UndefOr[String] = js.undefined
  /** 公司电话 */
  var hostNumber: js.UndefOr[String] = js.undefined
  /** 姓氏 */
  var lastName: js.UndefOr[String] = js.undefined
  /** 中间名 */
  var middleName: js.UndefOr[String] = js.undefined
  /** 手机号 */
  var mobilePhoneNumber: js.UndefOr[String] = js.undefined
  /** 昵称 */
  var nickName: js.UndefOr[String] = js.undefined
  /** 公司 */
  var organization: js.UndefOr[String] = js.undefined
  /** 头像本地文件路径 */
  var photoFilePath: js.UndefOr[String] = js.undefined
  /** 备注 */
  var remark: js.UndefOr[String] = js.undefined
  /** 职位 */
  var title: js.UndefOr[String] = js.undefined
  /** 网站 */
  var url: js.UndefOr[String] = js.undefined
  /** 微信号 */
  var weChatNumber: js.UndefOr[String] = js.undefined
  /** 工作地址城市 */
  var workAddressCity: js.UndefOr[String] = js.undefined
  /** 工作地址国家 */
  var workAddressCountry: js.UndefOr[String] = js.undefined
  /** 工作地址邮政编码 */
  var workAddressPostalCode: js.UndefOr[String] = js.undefined
  /** 工作地址省份 */
  var workAddressState: js.UndefOr[String] = js.undefined
  /** 工作地址街道 */
  var workAddressStreet: js.UndefOr[String] = js.undefined
  /** 工作传真 */
  var workFaxNumber: js.UndefOr[String] = js.undefined
  /** 工作电话 */
  var workPhoneNumber: js.UndefOr[String] = js.undefined
}

object PhoneContact {
  @scala.inline
  def apply(
    firstName: String,
    addressCity: String = null,
    addressCountry: String = null,
    addressPostalCode: String = null,
    addressState: String = null,
    addressStreet: String = null,
    complete: /* res */ js.Any => Unit = null,
    email: String = null,
    fail: js.Any => Unit = null,
    homeAddressCity: String = null,
    homeAddressCountry: String = null,
    homeAddressPostalCode: String = null,
    homeAddressState: String = null,
    homeAddressStreet: String = null,
    homeFaxNumber: String = null,
    homePhoneNumber: String = null,
    hostNumber: String = null,
    lastName: String = null,
    middleName: String = null,
    mobilePhoneNumber: String = null,
    nickName: String = null,
    organization: String = null,
    photoFilePath: String = null,
    remark: String = null,
    success: js.Any => Unit = null,
    title: String = null,
    url: String = null,
    weChatNumber: String = null,
    workAddressCity: String = null,
    workAddressCountry: String = null,
    workAddressPostalCode: String = null,
    workAddressState: String = null,
    workAddressStreet: String = null,
    workFaxNumber: String = null,
    workPhoneNumber: String = null
  ): PhoneContact = {
    val __obj = js.Dynamic.literal(firstName = firstName.asInstanceOf[js.Any])
    if (addressCity != null) __obj.updateDynamic("addressCity")(addressCity.asInstanceOf[js.Any])
    if (addressCountry != null) __obj.updateDynamic("addressCountry")(addressCountry.asInstanceOf[js.Any])
    if (addressPostalCode != null) __obj.updateDynamic("addressPostalCode")(addressPostalCode.asInstanceOf[js.Any])
    if (addressState != null) __obj.updateDynamic("addressState")(addressState.asInstanceOf[js.Any])
    if (addressStreet != null) __obj.updateDynamic("addressStreet")(addressStreet.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (homeAddressCity != null) __obj.updateDynamic("homeAddressCity")(homeAddressCity.asInstanceOf[js.Any])
    if (homeAddressCountry != null) __obj.updateDynamic("homeAddressCountry")(homeAddressCountry.asInstanceOf[js.Any])
    if (homeAddressPostalCode != null) __obj.updateDynamic("homeAddressPostalCode")(homeAddressPostalCode.asInstanceOf[js.Any])
    if (homeAddressState != null) __obj.updateDynamic("homeAddressState")(homeAddressState.asInstanceOf[js.Any])
    if (homeAddressStreet != null) __obj.updateDynamic("homeAddressStreet")(homeAddressStreet.asInstanceOf[js.Any])
    if (homeFaxNumber != null) __obj.updateDynamic("homeFaxNumber")(homeFaxNumber.asInstanceOf[js.Any])
    if (homePhoneNumber != null) __obj.updateDynamic("homePhoneNumber")(homePhoneNumber.asInstanceOf[js.Any])
    if (hostNumber != null) __obj.updateDynamic("hostNumber")(hostNumber.asInstanceOf[js.Any])
    if (lastName != null) __obj.updateDynamic("lastName")(lastName.asInstanceOf[js.Any])
    if (middleName != null) __obj.updateDynamic("middleName")(middleName.asInstanceOf[js.Any])
    if (mobilePhoneNumber != null) __obj.updateDynamic("mobilePhoneNumber")(mobilePhoneNumber.asInstanceOf[js.Any])
    if (nickName != null) __obj.updateDynamic("nickName")(nickName.asInstanceOf[js.Any])
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    if (photoFilePath != null) __obj.updateDynamic("photoFilePath")(photoFilePath.asInstanceOf[js.Any])
    if (remark != null) __obj.updateDynamic("remark")(remark.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (weChatNumber != null) __obj.updateDynamic("weChatNumber")(weChatNumber.asInstanceOf[js.Any])
    if (workAddressCity != null) __obj.updateDynamic("workAddressCity")(workAddressCity.asInstanceOf[js.Any])
    if (workAddressCountry != null) __obj.updateDynamic("workAddressCountry")(workAddressCountry.asInstanceOf[js.Any])
    if (workAddressPostalCode != null) __obj.updateDynamic("workAddressPostalCode")(workAddressPostalCode.asInstanceOf[js.Any])
    if (workAddressState != null) __obj.updateDynamic("workAddressState")(workAddressState.asInstanceOf[js.Any])
    if (workAddressStreet != null) __obj.updateDynamic("workAddressStreet")(workAddressStreet.asInstanceOf[js.Any])
    if (workFaxNumber != null) __obj.updateDynamic("workFaxNumber")(workFaxNumber.asInstanceOf[js.Any])
    if (workPhoneNumber != null) __obj.updateDynamic("workPhoneNumber")(workPhoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneContact]
  }
}

