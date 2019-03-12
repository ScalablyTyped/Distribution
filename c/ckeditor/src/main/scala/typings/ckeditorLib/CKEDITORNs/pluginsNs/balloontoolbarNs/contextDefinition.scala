package typings
package ckeditorLib.CKEDITORNs.pluginsNs.balloontoolbarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait contextDefinition extends js.Object {
  var cssSelector: js.UndefOr[java.lang.String] = js.undefined
  var priority: js.UndefOr[scala.Double] = js.undefined
  var refresh: js.UndefOr[
    js.Function3[
      /* editor */ ckeditorLib.CKEDITORNs.editor, 
      /* path */ ckeditorLib.CKEDITORNs.domNs.elementPath, 
      /* selection */ ckeditorLib.CKEDITORNs.domNs.selection, 
      ckeditorLib.CKEDITORNs.domNs.element
    ]
  ] = js.undefined
  var widgets: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
}

object contextDefinition {
  @scala.inline
  def apply(
    cssSelector: java.lang.String = null,
    priority: scala.Int | scala.Double = null,
    refresh: (/* editor */ ckeditorLib.CKEDITORNs.editor, /* path */ ckeditorLib.CKEDITORNs.domNs.elementPath, /* selection */ ckeditorLib.CKEDITORNs.domNs.selection) => ckeditorLib.CKEDITORNs.domNs.element = null,
    widgets: js.Array[java.lang.String] | java.lang.String = null
  ): contextDefinition = {
    val __obj = js.Dynamic.literal()
    if (cssSelector != null) __obj.updateDynamic("cssSelector")(cssSelector)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (refresh != null) __obj.updateDynamic("refresh")(js.Any.fromFunction3(refresh))
    if (widgets != null) __obj.updateDynamic("widgets")(widgets.asInstanceOf[js.Any])
    __obj.asInstanceOf[contextDefinition]
  }
}

