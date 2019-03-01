package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CrossOrigin extends js.Object {
  var crossOrigin: java.lang.String | scala.Null
}

object Anon_CrossOrigin {
  @scala.inline
  def apply(crossOrigin: java.lang.String = null): Anon_CrossOrigin = {
    val __obj = js.Dynamic.literal()
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    __obj.asInstanceOf[Anon_CrossOrigin]
  }
}

