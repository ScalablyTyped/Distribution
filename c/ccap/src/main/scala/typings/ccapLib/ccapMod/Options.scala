package typings
package ccapLib.ccapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  	// set pic quality,default is 50
  var fontsize: js.UndefOr[scala.Double] = js.undefined
  	// set font size,default is 57
  // Custom the function to generate captcha text
  var generate: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  	// set width,default is 256
  var height: js.UndefOr[scala.Double] = js.undefined
  	// set height,default is 60
  var offset: js.UndefOr[scala.Double] = js.undefined
  	// set text spacing,default is 40
  var quality: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

