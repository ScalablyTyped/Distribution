package typings
package cssDashFontDashLoadingDashModuleLib.cssDashFontDashLoadingDashModuleMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FontFace")
@js.native
class FontFace protected () extends js.Object {
  def this(family: java.lang.String, source: cssDashFontDashLoadingDashModuleLib.cssDashFontDashLoadingDashModuleMod.BinaryData) = this()
  def this(family: java.lang.String, source: java.lang.String) = this()
  def this(family: java.lang.String, source: cssDashFontDashLoadingDashModuleLib.cssDashFontDashLoadingDashModuleMod.BinaryData, descriptors: cssDashFontDashLoadingDashModuleLib.cssDashFontDashLoadingDashModuleMod.FontFaceDescriptors) = this()
  def this(family: java.lang.String, source: java.lang.String, descriptors: cssDashFontDashLoadingDashModuleLib.cssDashFontDashLoadingDashModuleMod.FontFaceDescriptors) = this()
  var display: java.lang.String = js.native
  var family: java.lang.String = js.native
  var featureSettings: java.lang.String = js.native
  val loaded: stdLib.Promise[FontFace] = js.native
  val status: cssDashFontDashLoadingDashModuleLib.cssDashFontDashLoadingDashModuleMod.FontFaceLoadStatus = js.native
  var stretch: java.lang.String = js.native
  var style: java.lang.String = js.native
  var unicodeRange: java.lang.String = js.native
  var variant: java.lang.String = js.native
  var variationSettings: java.lang.String = js.native
  var weight: java.lang.String = js.native
  def load(): stdLib.Promise[FontFace] = js.native
}

