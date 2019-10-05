package typings.cypress.JQuery.Ajax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Writable properties on XMLHttpRequest
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof std.Pick<std.XMLHttpRequest, 'onreadystatechange' | 'responseType' | 'timeout' | 'withCredentials'> ]:? std.Pick<std.XMLHttpRequest, 'onreadystatechange' | 'responseType' | 'timeout' | 'withCredentials'>[P]} */ trait XHRFields extends js.Object {
  var msCaching: js.UndefOr[String] = js.undefined
}

object XHRFields {
  @scala.inline
  def apply(msCaching: String = null): XHRFields = {
    val __obj = js.Dynamic.literal()
    if (msCaching != null) __obj.updateDynamic("msCaching")(msCaching)
    __obj.asInstanceOf[XHRFields]
  }
}

