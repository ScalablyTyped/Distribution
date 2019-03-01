package typings
package blocksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/////////////////////////////////////////
// App.View
/////////////////////////////////////////
trait ViewPrototype
  extends /* propertyName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Override the init method to perform actions when the View is first created and shown on the page
  	 */
  var init: js.UndefOr[js.Function] = js.undefined
  /**
  	 * Determines if the view is visible
  	 */
  var isActive: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  var navigateTo: js.UndefOr[js.Function] = js.undefined
  var options: js.UndefOr[Anon_Route] = js.undefined
  var parentView: js.UndefOr[js.Any] = js.undefined
  /**
    * Override the ready method to perform actions when the DOM is ready and
    * all data-query have been executed.
  	 */
  var ready: js.UndefOr[js.Function] = js.undefined
  /**
  	 * Routes to a specific URL and actives the appropriate views associated with the URL
  	 * 
  	 * @param name Name of the route
  	 */
  var route: js.UndefOr[js.Function1[/* name */ java.lang.String, this.type]] = js.undefined
  /**
  	 * Override the routed method to perform actions when the View have routing and routing mechanism actives it.
  	 */
  var routed: js.UndefOr[js.Function] = js.undefined
}

object ViewPrototype {
  @scala.inline
  def apply(
    StringDictionary: /* propertyName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    init: js.Function = null,
    isActive: js.Function0[scala.Boolean] = null,
    navigateTo: js.Function = null,
    options: Anon_Route = null,
    parentView: js.Any = null,
    ready: js.Function = null,
    route: js.Function1[/* name */ java.lang.String, ViewPrototype] = null,
    routed: js.Function = null
  ): ViewPrototype = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (init != null) __obj.updateDynamic("init")(init)
    if (isActive != null) __obj.updateDynamic("isActive")(isActive)
    if (navigateTo != null) __obj.updateDynamic("navigateTo")(navigateTo)
    if (options != null) __obj.updateDynamic("options")(options)
    if (parentView != null) __obj.updateDynamic("parentView")(parentView)
    if (ready != null) __obj.updateDynamic("ready")(ready)
    if (route != null) __obj.updateDynamic("route")(route)
    if (routed != null) __obj.updateDynamic("routed")(routed)
    __obj.asInstanceOf[ViewPrototype]
  }
}

