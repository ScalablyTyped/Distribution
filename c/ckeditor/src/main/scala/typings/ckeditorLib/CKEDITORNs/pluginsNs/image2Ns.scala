package typings
package ckeditorLib.CKEDITORNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.image2")
@js.native
object image2Ns extends js.Object {
  def checkHasNaturalRatio(image: ckeditorLib.CKEDITORNs.domNs.element): scala.Boolean = js.native
  def getLinkAttributesGetter(): js.Function2[
    /* editor */ ckeditorLib.CKEDITORNs.editor, 
    /* data */ ScalablyTyped.runtime.StringDictionary[java.lang.String], 
    ckeditorLib.Anon_SetTag
  ] = js.native
  def getLinkAttributesParser(): js.Function2[
    /* editor */ ckeditorLib.CKEDITORNs.editor, 
    /* element */ ckeditorLib.CKEDITORNs.domNs.element, 
    ScalablyTyped.runtime.StringDictionary[java.lang.String]
  ] = js.native
  def getNatural(image: ckeditorLib.CKEDITORNs.domNs.element): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
}

