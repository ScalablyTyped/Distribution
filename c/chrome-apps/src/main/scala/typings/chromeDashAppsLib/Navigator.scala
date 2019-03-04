package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigator extends js.Object {
  /**
    * If you provide the 'geolocation' in your Chrome app it will allow the app to
    * use the proposed HTML5 geolocation API without prompting the user for permission.
    * @see Permissions: 'geolocation'
    */
  val geolocation: stdLib.Geolocation
}

object Navigator {
  @scala.inline
  def apply(geolocation: stdLib.Geolocation): Navigator = {
    val __obj = js.Dynamic.literal(geolocation = geolocation)
  
    __obj.asInstanceOf[Navigator]
  }
}

