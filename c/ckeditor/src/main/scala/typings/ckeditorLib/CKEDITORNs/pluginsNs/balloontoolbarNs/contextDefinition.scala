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

