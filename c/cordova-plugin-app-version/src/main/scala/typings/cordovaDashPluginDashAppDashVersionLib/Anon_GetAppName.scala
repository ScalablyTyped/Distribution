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
    getAppName: () => js.Promise[java.lang.String],
    getPackageName: () => js.Promise[java.lang.String],
    getVersionCode: () => js.Promise[java.lang.String],
    getVersionNumber: () => js.Promise[java.lang.String]
  ): Anon_GetAppName = {
    val __obj = js.Dynamic.literal(getAppName = js.Any.fromFunction0(getAppName), getPackageName = js.Any.fromFunction0(getPackageName), getVersionCode = js.Any.fromFunction0(getVersionCode), getVersionNumber = js.Any.fromFunction0(getVersionNumber))
  
    __obj.asInstanceOf[Anon_GetAppName]
  }
}

