package typings
package cordovaDashPluginDashAppDashVersionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetAppName extends js.Object {
  def getAppName(): js.Promise[java.lang.String]
  def getPackageName(): js.Promise[java.lang.String]
  def getVersionCode(): js.Promise[java.lang.String]
  def getVersionNumber(): js.Promise[java.lang.String]
}

object Anon_GetAppName {
  @scala.inline
  def apply(
    getAppName: js.Function0[js.Promise[java.lang.String]],
    getPackageName: js.Function0[js.Promise[java.lang.String]],
    getVersionCode: js.Function0[js.Promise[java.lang.String]],
    getVersionNumber: js.Function0[js.Promise[java.lang.String]]
  ): Anon_GetAppName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAppName")(getAppName)
    __obj.updateDynamic("getPackageName")(getPackageName)
    __obj.updateDynamic("getVersionCode")(getVersionCode)
    __obj.updateDynamic("getVersionNumber")(getVersionNumber)
    __obj.asInstanceOf[Anon_GetAppName]
  }
}

