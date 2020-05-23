package typings.cloudEnv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultSettings extends js.Object {
  var APP_NAME: js.UndefOr[String] = js.undefined
  var HOSTNAME: js.UndefOr[String] = js.undefined
  var IP: js.UndefOr[String] = js.undefined
  var MONGODB_DB_HOST: js.UndefOr[String] = js.undefined
  var MONGODB_DB_PASSWORD: js.UndefOr[String] = js.undefined
  var MONGODB_DB_PORT: js.UndefOr[Double] = js.undefined
  var MONGODB_DB_URL: js.UndefOr[String] = js.undefined
  var MONGODB_DB_USERNAME: js.UndefOr[String] = js.undefined
  var MYSQL_DB_HOST: js.UndefOr[String] = js.undefined
  var MYSQL_DB_PASSWORD: js.UndefOr[String] = js.undefined
  var MYSQL_DB_PORT: js.UndefOr[Double] = js.undefined
  var MYSQL_DB_URL: js.UndefOr[String] = js.undefined
  var MYSQL_DB_USERNAME: js.UndefOr[String] = js.undefined
  var PORT: js.UndefOr[Double] = js.undefined
  var POSTGRESQL_DB_HOST: js.UndefOr[String] = js.undefined
  var POSTGRESQL_DB_PASSWORD: js.UndefOr[String] = js.undefined
  var POSTGRESQL_DB_PORT: js.UndefOr[Double] = js.undefined
  var POSTGRESQL_DB_URL: js.UndefOr[String] = js.undefined
  var POSTGRESQL_DB_USERNAME: js.UndefOr[String] = js.undefined
}

object DefaultSettings {
  @scala.inline
  def apply(
    APP_NAME: String = null,
    HOSTNAME: String = null,
    IP: String = null,
    MONGODB_DB_HOST: String = null,
    MONGODB_DB_PASSWORD: String = null,
    MONGODB_DB_PORT: js.UndefOr[Double] = js.undefined,
    MONGODB_DB_URL: String = null,
    MONGODB_DB_USERNAME: String = null,
    MYSQL_DB_HOST: String = null,
    MYSQL_DB_PASSWORD: String = null,
    MYSQL_DB_PORT: js.UndefOr[Double] = js.undefined,
    MYSQL_DB_URL: String = null,
    MYSQL_DB_USERNAME: String = null,
    PORT: js.UndefOr[Double] = js.undefined,
    POSTGRESQL_DB_HOST: String = null,
    POSTGRESQL_DB_PASSWORD: String = null,
    POSTGRESQL_DB_PORT: js.UndefOr[Double] = js.undefined,
    POSTGRESQL_DB_URL: String = null,
    POSTGRESQL_DB_USERNAME: String = null
  ): DefaultSettings = {
    val __obj = js.Dynamic.literal()
    if (APP_NAME != null) __obj.updateDynamic("APP_NAME")(APP_NAME.asInstanceOf[js.Any])
    if (HOSTNAME != null) __obj.updateDynamic("HOSTNAME")(HOSTNAME.asInstanceOf[js.Any])
    if (IP != null) __obj.updateDynamic("IP")(IP.asInstanceOf[js.Any])
    if (MONGODB_DB_HOST != null) __obj.updateDynamic("MONGODB_DB_HOST")(MONGODB_DB_HOST.asInstanceOf[js.Any])
    if (MONGODB_DB_PASSWORD != null) __obj.updateDynamic("MONGODB_DB_PASSWORD")(MONGODB_DB_PASSWORD.asInstanceOf[js.Any])
    if (!js.isUndefined(MONGODB_DB_PORT)) __obj.updateDynamic("MONGODB_DB_PORT")(MONGODB_DB_PORT.get.asInstanceOf[js.Any])
    if (MONGODB_DB_URL != null) __obj.updateDynamic("MONGODB_DB_URL")(MONGODB_DB_URL.asInstanceOf[js.Any])
    if (MONGODB_DB_USERNAME != null) __obj.updateDynamic("MONGODB_DB_USERNAME")(MONGODB_DB_USERNAME.asInstanceOf[js.Any])
    if (MYSQL_DB_HOST != null) __obj.updateDynamic("MYSQL_DB_HOST")(MYSQL_DB_HOST.asInstanceOf[js.Any])
    if (MYSQL_DB_PASSWORD != null) __obj.updateDynamic("MYSQL_DB_PASSWORD")(MYSQL_DB_PASSWORD.asInstanceOf[js.Any])
    if (!js.isUndefined(MYSQL_DB_PORT)) __obj.updateDynamic("MYSQL_DB_PORT")(MYSQL_DB_PORT.get.asInstanceOf[js.Any])
    if (MYSQL_DB_URL != null) __obj.updateDynamic("MYSQL_DB_URL")(MYSQL_DB_URL.asInstanceOf[js.Any])
    if (MYSQL_DB_USERNAME != null) __obj.updateDynamic("MYSQL_DB_USERNAME")(MYSQL_DB_USERNAME.asInstanceOf[js.Any])
    if (!js.isUndefined(PORT)) __obj.updateDynamic("PORT")(PORT.get.asInstanceOf[js.Any])
    if (POSTGRESQL_DB_HOST != null) __obj.updateDynamic("POSTGRESQL_DB_HOST")(POSTGRESQL_DB_HOST.asInstanceOf[js.Any])
    if (POSTGRESQL_DB_PASSWORD != null) __obj.updateDynamic("POSTGRESQL_DB_PASSWORD")(POSTGRESQL_DB_PASSWORD.asInstanceOf[js.Any])
    if (!js.isUndefined(POSTGRESQL_DB_PORT)) __obj.updateDynamic("POSTGRESQL_DB_PORT")(POSTGRESQL_DB_PORT.get.asInstanceOf[js.Any])
    if (POSTGRESQL_DB_URL != null) __obj.updateDynamic("POSTGRESQL_DB_URL")(POSTGRESQL_DB_URL.asInstanceOf[js.Any])
    if (POSTGRESQL_DB_USERNAME != null) __obj.updateDynamic("POSTGRESQL_DB_USERNAME")(POSTGRESQL_DB_USERNAME.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultSettings]
  }
}

