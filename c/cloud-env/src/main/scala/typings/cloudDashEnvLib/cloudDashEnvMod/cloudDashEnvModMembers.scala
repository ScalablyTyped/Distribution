package typings
package cloudDashEnvLib.cloudDashEnvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cloud-env", JSImport.Namespace)
@js.native
object cloudDashEnvModMembers extends js.Object {
  val APP_NAME: cloudDashEnvLib.MaybeStr = js.native
  val HOSTNAME: cloudDashEnvLib.MaybeStr = js.native
  val IP: cloudDashEnvLib.MaybeStr = js.native
  val MONGODB_DB_HOST: cloudDashEnvLib.MaybeStr = js.native
  val MONGODB_DB_PASSWORD: cloudDashEnvLib.MaybeStr = js.native
  val MONGODB_DB_PORT: cloudDashEnvLib.MaybeNum = js.native
  val MONGODB_DB_URL: cloudDashEnvLib.MaybeStr = js.native
  val MONGODB_DB_USERNAME: cloudDashEnvLib.MaybeStr = js.native
  val MYSQL_DB_HOST: cloudDashEnvLib.MaybeStr = js.native
  val MYSQL_DB_PASSWORD: cloudDashEnvLib.MaybeStr = js.native
  val MYSQL_DB_PORT: cloudDashEnvLib.MaybeNum = js.native
  val MYSQL_DB_URL: cloudDashEnvLib.MaybeStr = js.native
  val MYSQL_DB_USERNAME: cloudDashEnvLib.MaybeStr = js.native
  val PORT: cloudDashEnvLib.MaybeNum = js.native
  val POSTGRESQL_DB_HOST: cloudDashEnvLib.MaybeStr = js.native
  val POSTGRESQL_DB_PASSWORD: cloudDashEnvLib.MaybeStr = js.native
  val POSTGRESQL_DB_PORT: cloudDashEnvLib.MaybeNum = js.native
  val POSTGRESQL_DB_URL: cloudDashEnvLib.MaybeStr = js.native
  val POSTGRESQL_DB_USERNAME: cloudDashEnvLib.MaybeStr = js.native
  def get(key: java.lang.String): cloudDashEnvLib.MaybeStr = js.native
  def get(key: java.lang.String, default_key: java.lang.String): cloudDashEnvLib.MaybeStr = js.native
}

