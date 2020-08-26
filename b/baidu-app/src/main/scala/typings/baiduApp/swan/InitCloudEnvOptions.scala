package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * initCloudOptions 的 env 参数，可以指定各个服务的默认环境
  */
@js.native
trait InitCloudEnvOptions extends js.Object {
  /**
    * 数据库 API 默认环境配置
    * 默认值： default
    */
  var database: js.UndefOr[String] = js.native
  /**
    * 云函数 API 默认环境配置
    * 默认值： default
    */
  var functions: js.UndefOr[String] = js.native
  /**
    * 存储 API 默认环境配置
    * 默认值： default
    */
  var storage: js.UndefOr[String] = js.native
}

object InitCloudEnvOptions {
  @scala.inline
  def apply(): InitCloudEnvOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitCloudEnvOptions]
  }
  @scala.inline
  implicit class InitCloudEnvOptionsOps[Self <: InitCloudEnvOptions] (val x: Self) extends AnyVal {
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
    def setDatabase(value: String): Self = this.set("database", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabase: Self = this.set("database", js.undefined)
    @scala.inline
    def setFunctions(value: String): Self = this.set("functions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctions: Self = this.set("functions", js.undefined)
    @scala.inline
    def setStorage(value: String): Self = this.set("storage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorage: Self = this.set("storage", js.undefined)
  }
  
}

