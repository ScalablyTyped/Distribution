package typings
package baiduDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CityName extends js.Object {
  /**
  			 * 国标收货地址第二级地址
  			 *
  			 */
  var cityName: java.lang.String
  /**
  			 * 国标收货地址第三级地址
  			 *
  			 */
  var countyName: java.lang.String
  /**
  			 * 详细收货地址信息
  			 *
  			 */
  var detailInfo: java.lang.String
  /**
  			 * 调用结果
  			 *
  			 */
  var errMsg: java.lang.String
  /**
  			 * 收货地址国家码
  			 *
  			 */
  var nationalCode: java.lang.String
  /**
  			 * 邮编
  			 *
  			 */
  var postalCode: java.lang.String
  /**
  			 * 国标收货地址第一级地址
  			 *
  			 */
  var provinceName: java.lang.String
  /**
  			 * 收货人手机号码
  			 *
  			 */
  var telNumber: java.lang.String
  /**
  			 * 收货人姓名
  			 *
  			 */
  var userName: java.lang.String
}

object Anon_CityName {
  @scala.inline
  def apply(
    cityName: java.lang.String,
    countyName: java.lang.String,
    detailInfo: java.lang.String,
    errMsg: java.lang.String,
    nationalCode: java.lang.String,
    postalCode: java.lang.String,
    provinceName: java.lang.String,
    telNumber: java.lang.String,
    userName: java.lang.String
  ): Anon_CityName = {
    val __obj = js.Dynamic.literal(cityName = cityName, countyName = countyName, detailInfo = detailInfo, errMsg = errMsg, nationalCode = nationalCode, postalCode = postalCode, provinceName = provinceName, telNumber = telNumber, userName = userName)
  
    __obj.asInstanceOf[Anon_CityName]
  }
}

