package typings
package cloudDashEnvLib.cloudDashEnvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultSettings extends js.Object {
  var APP_NAME: js.UndefOr[java.lang.String] = js.undefined
  var HOSTNAME: js.UndefOr[java.lang.String] = js.undefined
  var IP: js.UndefOr[java.lang.String] = js.undefined
  var MONGODB_DB_HOST: js.UndefOr[java.lang.String] = js.undefined
  var MONGODB_DB_PASSWORD: js.UndefOr[java.lang.String] = js.undefined
  var MONGODB_DB_PORT: js.UndefOr[scala.Double] = js.undefined
  var MONGODB_DB_URL: js.UndefOr[java.lang.String] = js.undefined
  var MONGODB_DB_USERNAME: js.UndefOr[java.lang.String] = js.undefined
  var MYSQL_DB_HOST: js.UndefOr[java.lang.String] = js.undefined
  var MYSQL_DB_PASSWORD: js.UndefOr[java.lang.String] = js.undefined
  var MYSQL_DB_PORT: js.UndefOr[scala.Double] = js.undefined
  var MYSQL_DB_URL: js.UndefOr[java.lang.String] = js.undefined
  var MYSQL_DB_USERNAME: js.UndefOr[java.lang.String] = js.undefined
  var PORT: js.UndefOr[scala.Double] = js.undefined
  var POSTGRESQL_DB_HOST: js.UndefOr[java.lang.String] = js.undefined
  var POSTGRESQL_DB_PASSWORD: js.UndefOr[java.lang.String] = js.undefined
  var POSTGRESQL_DB_PORT: js.UndefOr[scala.Double] = js.undefined
  var POSTGRESQL_DB_URL: js.UndefOr[java.lang.String] = js.undefined
  var POSTGRESQL_DB_USERNAME: js.UndefOr[java.lang.String] = js.undefined
}

object DefaultSettings {
  @scala.inline
  def apply(
    APP_NAME: java.lang.String = null,
    HOSTNAME: java.lang.String = null,
    IP: java.lang.String = null,
    MONGODB_DB_HOST: java.lang.String = null,
    MONGODB_DB_PASSWORD: java.lang.String = null,
    MONGODB_DB_PORT: scala.Int | scala.Double = null,
    MONGODB_DB_URL: java.lang.String = null,
    MONGODB_DB_USERNAME: java.lang.String = null,
    MYSQL_DB_HOST: java.lang.String = null,
    MYSQL_DB_PASSWORD: java.lang.String = null,
    MYSQL_DB_PORT: scala.Int | scala.Double = null,
    MYSQL_DB_URL: java.lang.String = null,
    MYSQL_DB_USERNAME: java.lang.String = null,
    PORT: scala.Int | scala.Double = null,
    POSTGRESQL_DB_HOST: java.lang.String = null,
    POSTGRESQL_DB_PASSWORD: java.lang.String = null,
    POSTGRESQL_DB_PORT: scala.Int | scala.Double = null,
    POSTGRESQL_DB_URL: java.lang.String = null,
    POSTGRESQL_DB_USERNAME: java.lang.String = null
  ): DefaultSettings = {
    val __obj = js.Dynamic.literal()
    if (APP_NAME != null) __obj.updateDynamic("APP_NAME")(APP_NAME)
    if (HOSTNAME != null) __obj.updateDynamic("HOSTNAME")(HOSTNAME)
    if (IP != null) __obj.updateDynamic("IP")(IP)
    if (MONGODB_DB_HOST != null) __obj.updateDynamic("MONGODB_DB_HOST")(MONGODB_DB_HOST)
    if (MONGODB_DB_PASSWORD != null) __obj.updateDynamic("MONGODB_DB_PASSWORD")(MONGODB_DB_PASSWORD)
    if (MONGODB_DB_PORT != null) __obj.updateDynamic("MONGODB_DB_PORT")(MONGODB_DB_PORT.asInstanceOf[js.Any])
    if (MONGODB_DB_URL != null) __obj.updateDynamic("MONGODB_DB_URL")(MONGODB_DB_URL)
    if (MONGODB_DB_USERNAME != null) __obj.updateDynamic("MONGODB_DB_USERNAME")(MONGODB_DB_USERNAME)
    if (MYSQL_DB_HOST != null) __obj.updateDynamic("MYSQL_DB_HOST")(MYSQL_DB_HOST)
    if (MYSQL_DB_PASSWORD != null) __obj.updateDynamic("MYSQL_DB_PASSWORD")(MYSQL_DB_PASSWORD)
    if (MYSQL_DB_PORT != null) __obj.updateDynamic("MYSQL_DB_PORT")(MYSQL_DB_PORT.asInstanceOf[js.Any])
    if (MYSQL_DB_URL != null) __obj.updateDynamic("MYSQL_DB_URL")(MYSQL_DB_URL)
    if (MYSQL_DB_USERNAME != null) __obj.updateDynamic("MYSQL_DB_USERNAME")(MYSQL_DB_USERNAME)
    if (PORT != null) __obj.updateDynamic("PORT")(PORT.asInstanceOf[js.Any])
    if (POSTGRESQL_DB_HOST != null) __obj.updateDynamic("POSTGRESQL_DB_HOST")(POSTGRESQL_DB_HOST)
    if (POSTGRESQL_DB_PASSWORD != null) __obj.updateDynamic("POSTGRESQL_DB_PASSWORD")(POSTGRESQL_DB_PASSWORD)
    if (POSTGRESQL_DB_PORT != null) __obj.updateDynamic("POSTGRESQL_DB_PORT")(POSTGRESQL_DB_PORT.asInstanceOf[js.Any])
    if (POSTGRESQL_DB_URL != null) __obj.updateDynamic("POSTGRESQL_DB_URL")(POSTGRESQL_DB_URL)
    if (POSTGRESQL_DB_USERNAME != null) __obj.updateDynamic("POSTGRESQL_DB_USERNAME")(POSTGRESQL_DB_USERNAME)
    __obj.asInstanceOf[DefaultSettings]
  }
}

