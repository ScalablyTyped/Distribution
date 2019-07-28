package typings.baiduDashApp.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * initCloudOptions 的 env 参数，可以指定各个服务的默认环境
	 */
trait InitCloudEnvOptions extends js.Object {
  /**
  		 * 数据库 API 默认环境配置
  		 * 默认值： default
  		 */
  var database: js.UndefOr[String] = js.undefined
  /**
  		 * 云函数 API 默认环境配置
  		 * 默认值： default
  		 */
  var functions: js.UndefOr[String] = js.undefined
  /**
  		 * 存储 API 默认环境配置
  		 * 默认值： default
  		 */
  var storage: js.UndefOr[String] = js.undefined
}

object InitCloudEnvOptions {
  @scala.inline
  def apply(database: String = null, functions: String = null, storage: String = null): InitCloudEnvOptions = {
    val __obj = js.Dynamic.literal()
    if (database != null) __obj.updateDynamic("database")(database)
    if (functions != null) __obj.updateDynamic("functions")(functions)
    if (storage != null) __obj.updateDynamic("storage")(storage)
    __obj.asInstanceOf[InitCloudEnvOptions]
  }
}

