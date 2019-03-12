package typings
package blocksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelPrototype
  extends /* propertyName */ org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Boolean | js.Object | Validator] {
  /**
  	 * Extracts the raw(non observable) dataItem object values from the Model
  	 */
  var dataItem: js.UndefOr[js.Function0[js.Object]] = js.undefined
  /**
  	 * Override the init method to perform actions on creation for each Model instance
  	 */
  var init: js.UndefOr[js.Function] = js.undefined
  /**
  	 * Determines whether the instance is new. If true when syncing the item will send for insertion instead of updating it.
  	 * The check is determined by the idAttr value specified in the options. If idAttr is not specified the item will always be considered new.
  	 * 
  	 */
  var isNew: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  var options: js.UndefOr[Anon_BaseUrl] = js.undefined
  /**
  	 * Applies new properties to the Model by providing an Object
  	 * 
  	 * @param dataItem The object from which the new values will be applied
  	 */
  var reset: js.UndefOr[js.Function1[/* dataItem */ this.type, this.type]] = js.undefined
  /**
  	 * Validates all observable properties that have validation and returns true if all values are valid otherwise returns false
  	 */
  var validate: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
}

object ModelPrototype {
  @scala.inline
  def apply(
    StringDictionary: /* propertyName */ org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Boolean | js.Object | Validator] = null,
    dataItem: () => js.Object = null,
    init: js.Function = null,
    isNew: () => scala.Boolean = null,
    options: Anon_BaseUrl = null,
    reset: ModelPrototype => ModelPrototype = null,
    validate: () => scala.Boolean = null
  ): ModelPrototype = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (dataItem != null) __obj.updateDynamic("dataItem")(js.Any.fromFunction0(dataItem))
    if (init != null) __obj.updateDynamic("init")(init)
    if (isNew != null) __obj.updateDynamic("isNew")(js.Any.fromFunction0(isNew))
    if (options != null) __obj.updateDynamic("options")(options)
    if (reset != null) __obj.updateDynamic("reset")(js.Any.fromFunction1(reset))
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction0(validate))
    __obj.asInstanceOf[ModelPrototype]
  }
}

