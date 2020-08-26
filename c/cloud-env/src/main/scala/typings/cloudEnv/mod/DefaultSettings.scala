package typings.cloudEnv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultSettings extends js.Object {
  var APP_NAME: js.UndefOr[String] = js.native
  var HOSTNAME: js.UndefOr[String] = js.native
  var IP: js.UndefOr[String] = js.native
  var MONGODB_DB_HOST: js.UndefOr[String] = js.native
  var MONGODB_DB_PASSWORD: js.UndefOr[String] = js.native
  var MONGODB_DB_PORT: js.UndefOr[Double] = js.native
  var MONGODB_DB_URL: js.UndefOr[String] = js.native
  var MONGODB_DB_USERNAME: js.UndefOr[String] = js.native
  var MYSQL_DB_HOST: js.UndefOr[String] = js.native
  var MYSQL_DB_PASSWORD: js.UndefOr[String] = js.native
  var MYSQL_DB_PORT: js.UndefOr[Double] = js.native
  var MYSQL_DB_URL: js.UndefOr[String] = js.native
  var MYSQL_DB_USERNAME: js.UndefOr[String] = js.native
  var PORT: js.UndefOr[Double] = js.native
  var POSTGRESQL_DB_HOST: js.UndefOr[String] = js.native
  var POSTGRESQL_DB_PASSWORD: js.UndefOr[String] = js.native
  var POSTGRESQL_DB_PORT: js.UndefOr[Double] = js.native
  var POSTGRESQL_DB_URL: js.UndefOr[String] = js.native
  var POSTGRESQL_DB_USERNAME: js.UndefOr[String] = js.native
}

object DefaultSettings {
  @scala.inline
  def apply(): DefaultSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultSettings]
  }
  @scala.inline
  implicit class DefaultSettingsOps[Self <: DefaultSettings] (val x: Self) extends AnyVal {
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
    def setAPP_NAME(value: String): Self = this.set("APP_NAME", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAPP_NAME: Self = this.set("APP_NAME", js.undefined)
    @scala.inline
    def setHOSTNAME(value: String): Self = this.set("HOSTNAME", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHOSTNAME: Self = this.set("HOSTNAME", js.undefined)
    @scala.inline
    def setIP(value: String): Self = this.set("IP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIP: Self = this.set("IP", js.undefined)
    @scala.inline
    def setMONGODB_DB_HOST(value: String): Self = this.set("MONGODB_DB_HOST", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMONGODB_DB_HOST: Self = this.set("MONGODB_DB_HOST", js.undefined)
    @scala.inline
    def setMONGODB_DB_PASSWORD(value: String): Self = this.set("MONGODB_DB_PASSWORD", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMONGODB_DB_PASSWORD: Self = this.set("MONGODB_DB_PASSWORD", js.undefined)
    @scala.inline
    def setMONGODB_DB_PORT(value: Double): Self = this.set("MONGODB_DB_PORT", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMONGODB_DB_PORT: Self = this.set("MONGODB_DB_PORT", js.undefined)
    @scala.inline
    def setMONGODB_DB_URL(value: String): Self = this.set("MONGODB_DB_URL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMONGODB_DB_URL: Self = this.set("MONGODB_DB_URL", js.undefined)
    @scala.inline
    def setMONGODB_DB_USERNAME(value: String): Self = this.set("MONGODB_DB_USERNAME", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMONGODB_DB_USERNAME: Self = this.set("MONGODB_DB_USERNAME", js.undefined)
    @scala.inline
    def setMYSQL_DB_HOST(value: String): Self = this.set("MYSQL_DB_HOST", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMYSQL_DB_HOST: Self = this.set("MYSQL_DB_HOST", js.undefined)
    @scala.inline
    def setMYSQL_DB_PASSWORD(value: String): Self = this.set("MYSQL_DB_PASSWORD", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMYSQL_DB_PASSWORD: Self = this.set("MYSQL_DB_PASSWORD", js.undefined)
    @scala.inline
    def setMYSQL_DB_PORT(value: Double): Self = this.set("MYSQL_DB_PORT", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMYSQL_DB_PORT: Self = this.set("MYSQL_DB_PORT", js.undefined)
    @scala.inline
    def setMYSQL_DB_URL(value: String): Self = this.set("MYSQL_DB_URL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMYSQL_DB_URL: Self = this.set("MYSQL_DB_URL", js.undefined)
    @scala.inline
    def setMYSQL_DB_USERNAME(value: String): Self = this.set("MYSQL_DB_USERNAME", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMYSQL_DB_USERNAME: Self = this.set("MYSQL_DB_USERNAME", js.undefined)
    @scala.inline
    def setPORT(value: Double): Self = this.set("PORT", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePORT: Self = this.set("PORT", js.undefined)
    @scala.inline
    def setPOSTGRESQL_DB_HOST(value: String): Self = this.set("POSTGRESQL_DB_HOST", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePOSTGRESQL_DB_HOST: Self = this.set("POSTGRESQL_DB_HOST", js.undefined)
    @scala.inline
    def setPOSTGRESQL_DB_PASSWORD(value: String): Self = this.set("POSTGRESQL_DB_PASSWORD", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePOSTGRESQL_DB_PASSWORD: Self = this.set("POSTGRESQL_DB_PASSWORD", js.undefined)
    @scala.inline
    def setPOSTGRESQL_DB_PORT(value: Double): Self = this.set("POSTGRESQL_DB_PORT", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePOSTGRESQL_DB_PORT: Self = this.set("POSTGRESQL_DB_PORT", js.undefined)
    @scala.inline
    def setPOSTGRESQL_DB_URL(value: String): Self = this.set("POSTGRESQL_DB_URL", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePOSTGRESQL_DB_URL: Self = this.set("POSTGRESQL_DB_URL", js.undefined)
    @scala.inline
    def setPOSTGRESQL_DB_USERNAME(value: String): Self = this.set("POSTGRESQL_DB_USERNAME", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePOSTGRESQL_DB_USERNAME: Self = this.set("POSTGRESQL_DB_USERNAME", js.undefined)
  }
  
}

